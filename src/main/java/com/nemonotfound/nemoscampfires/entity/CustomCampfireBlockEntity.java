package com.nemonotfound.nemoscampfires.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.NonNullList;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.*;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.CampfireCookingRecipe;
import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.CampfireBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class CustomCampfireBlockEntity extends BlockEntity implements Clearable {

    private final NonNullList<ItemStack> items = NonNullList.withSize(4, ItemStack.EMPTY);
    private final int[] cookingProgress = new int[4];
    private final int[] cookingTime = new int[4];
    private final RecipeManager.CachedCheck<Container, CampfireCookingRecipe> quickCheck = RecipeManager.createCheck(RecipeType.CAMPFIRE_COOKING);

    public CustomCampfireBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(ModEntities.CUSTOM_CAMPFIRE_BLOCK_ENTITY, blockPos, blockState);
    }

    public static void cookTick(Level level, BlockPos blockPos, BlockState blockState, CustomCampfireBlockEntity campfireBlockEntity) {
        boolean bl = false;

        for (int i = 0; i < campfireBlockEntity.items.size(); i++) {
            ItemStack itemStack = campfireBlockEntity.items.get(i);

            if (!itemStack.isEmpty()) {
                bl = true;
                campfireBlockEntity.cookingProgress[i]++;

                handleCookedItem(level, blockPos, blockState, campfireBlockEntity, i, itemStack);
            }
        }

        if (bl) {
            setChanged(level, blockPos, blockState);
        }
    }

    private static void handleCookedItem(Level level, BlockPos blockPos, BlockState blockState, CustomCampfireBlockEntity campfireBlockEntity, int i, ItemStack itemStack) {
        if (campfireBlockEntity.cookingProgress[i] >= campfireBlockEntity.cookingTime[i]) {
            Container container = new SimpleContainer(itemStack);
            ItemStack cookedItem = campfireBlockEntity.quickCheck
                    .getRecipeFor(container, level)
                    .map(recipe -> recipe.assemble(container, level.registryAccess()))
                    .orElse(itemStack);

            dropCookedItem(level, blockPos, blockState, campfireBlockEntity, cookedItem, i);
        }
    }

    private static void dropCookedItem(Level level, BlockPos blockPos, BlockState blockState, CustomCampfireBlockEntity campfireBlockEntity, ItemStack cookedItem, int i) {
        if (cookedItem.isItemEnabled(level.enabledFeatures())) {
            Containers.dropItemStack(level, blockPos.getX(), blockPos.getY(), blockPos.getZ(), cookedItem);
            campfireBlockEntity.items.set(i, ItemStack.EMPTY);
            level.sendBlockUpdated(blockPos, blockState, blockState, 3);
            level.gameEvent(GameEvent.BLOCK_CHANGE, blockPos, GameEvent.Context.of(blockState));
        }
    }

    public static void cooldownTick(Level level, BlockPos blockPos, BlockState blockState, CustomCampfireBlockEntity campfireBlockEntity) {
        boolean bl = false;

        for (int i = 0; i < campfireBlockEntity.items.size(); i++) {
            if (campfireBlockEntity.cookingProgress[i] > 0) {
                bl = true;
                campfireBlockEntity.cookingProgress[i] = Mth.clamp(campfireBlockEntity.cookingProgress[i] - 2, 0, campfireBlockEntity.cookingTime[i]);
            }
        }

        if (bl) {
            setChanged(level, blockPos, blockState);
        }
    }

    public static void particleTick(Level level, BlockPos blockPos, BlockState blockState, CustomCampfireBlockEntity campfireBlockEntity) {
        RandomSource randomSource = level.random;

        if (randomSource.nextFloat() < 0.11F) {
            for (int i = 0; i < randomSource.nextInt(2) + 2; i++) {
                CampfireBlock.makeParticles(level, blockPos, blockState.getValue(CampfireBlock.SIGNAL_FIRE), false);
            }
        }

        addSmokeParticle(level, blockPos, blockState, campfireBlockEntity, randomSource);
    }

    private static void addSmokeParticle(Level level, BlockPos blockPos, BlockState blockState, CustomCampfireBlockEntity campfireBlockEntity, RandomSource randomSource) {
        int data2d = blockState.getValue(CampfireBlock.FACING).get2DDataValue();

        for (int j = 0; j < campfireBlockEntity.items.size(); j++) {
            if (!campfireBlockEntity.items.get(j).isEmpty() && randomSource.nextFloat() < 0.2F) {
                Direction direction = Direction.from2DDataValue(Math.floorMod(j + data2d, 4));
                double d = (double) blockPos.getX() + 0.5 - (double)((float)direction.getStepX() * 0.3125F) + (double)((float)direction.getClockWise().getStepX() * 0.3125F);
                double e = (double) blockPos.getY() + 0.5;
                double g = (double) blockPos.getZ() + 0.5 - (double)((float)direction.getStepZ() * 0.3125F) + (double)((float)direction.getClockWise().getStepZ() * 0.3125F);

                for (int k = 0; k < 4; k++) {
                    level.addParticle(ParticleTypes.SMOKE, d, e, g, 0.0, 5.0E-4, 0.0);
                }
            }
        }
    }

    public NonNullList<ItemStack> getItems() {
        return this.items;
    }

    @Override
    public void load(CompoundTag compoundTag) {
        super.load(compoundTag);
        this.items.clear();
        ContainerHelper.loadAllItems(compoundTag, this.items);

        if (compoundTag.contains("CookingTimes", 11)) {
            int[] cookingTimes = compoundTag.getIntArray("CookingTimes");
            System.arraycopy(cookingTimes, 0, this.cookingProgress, 0, Math.min(this.cookingTime.length, cookingTimes.length));
        }

        if (compoundTag.contains("CookingTotalTimes", 11)) {
            int[] cookingTotalTimes = compoundTag.getIntArray("CookingTotalTimes");
            System.arraycopy(cookingTotalTimes, 0, this.cookingTime, 0, Math.min(this.cookingTime.length, cookingTotalTimes.length));
        }
    }

    @Override
    public void saveAdditional(CompoundTag compoundTag) {
        super.saveAdditional(compoundTag);
        ContainerHelper.saveAllItems(compoundTag, this.items, true);
        compoundTag.putIntArray("CookingTimes", this.cookingProgress);
        compoundTag.putIntArray("CookingTotalTimes", this.cookingTime);
    }

    public ClientboundBlockEntityDataPacket getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    @Override
    public @NotNull CompoundTag getUpdateTag() {
        CompoundTag compoundTag = new CompoundTag();
        ContainerHelper.saveAllItems(compoundTag, this.items, true);

        return compoundTag;
    }

    public Optional<CampfireCookingRecipe> getCookableRecipe(ItemStack itemStack) {
        return this.items.stream().noneMatch(ItemStack::isEmpty) ? Optional.empty() :
                this.quickCheck.getRecipeFor(new SimpleContainer(itemStack), this.level);
    }

    public boolean placeFood(@Nullable LivingEntity livingEntity, ItemStack itemStack, int cookingTime) {
        for (int j = 0; j < this.items.size(); j++) {
            ItemStack itemStack2 = this.items.get(j);

            if (itemStack2.isEmpty()) {
                this.cookingTime[j] = cookingTime;
                this.cookingProgress[j] = 0;
                this.items.set(j, itemStack.split(1));
                this.level.gameEvent(GameEvent.BLOCK_CHANGE, this.getBlockPos(), GameEvent.Context.of(livingEntity, this.getBlockState()));
                this.markUpdated();

                return true;
            }
        }

        return false;
    }

    private void markUpdated() {
        this.setChanged();
        this.getLevel().sendBlockUpdated(this.getBlockPos(), this.getBlockState(), this.getBlockState(), 3);
    }

    @Override
    public void clearContent() {
        this.items.clear();
    }

    public void dowse() {
        if (this.level != null) {
            this.markUpdated();
        }
    }
}
