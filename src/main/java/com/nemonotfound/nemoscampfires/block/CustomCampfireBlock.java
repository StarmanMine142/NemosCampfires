package com.nemonotfound.nemoscampfires.block;

import com.nemonotfound.nemoscampfires.entity.CustomCampfireBlockEntity;
import com.nemonotfound.nemoscampfires.entity.ModEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.Containers;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.CampfireCookingRecipe;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.CampfireBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class CustomCampfireBlock extends CampfireBlock {

    public CustomCampfireBlock(boolean emitsParticles, int fireDamage, BlockBehaviour.Properties properties) {
        super(emitsParticles, fireDamage, properties);
    }

    @Override
    protected @NotNull ItemInteractionResult useItemOn(ItemStack itemStack, BlockState blockState, Level level,
                                                       BlockPos blockPos, Player player, InteractionHand interactionHand,
                                                       BlockHitResult blockHitResult) {
        if (level.getBlockEntity(blockPos) instanceof CustomCampfireBlockEntity customCampfireBlockEntity) {
            ItemStack itemInHand = player.getItemInHand(interactionHand);
            Optional<RecipeHolder<CampfireCookingRecipe>> optionalRecipe = customCampfireBlockEntity
                    .getCookableRecipe(itemInHand);

            if (optionalRecipe.isPresent()) {
                if (!level.isClientSide && customCampfireBlockEntity.placeFood(player, itemInHand,
                        ((CampfireCookingRecipe)((RecipeHolder)optionalRecipe.get()).value()).getCookingTime())) {
                    player.awardStat(Stats.INTERACT_WITH_CAMPFIRE);

                    return ItemInteractionResult.SUCCESS;
                }

                return ItemInteractionResult.CONSUME;
            }
        }

        return ItemInteractionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
    }

    @Override
    protected void onRemove(BlockState blockState, Level level, BlockPos blockPos, BlockState blockState2, boolean bl) {
        if (!blockState.is(blockState2.getBlock())) {
            BlockEntity blockEntity = level.getBlockEntity(blockPos);

            if (blockEntity instanceof CustomCampfireBlockEntity) {
                Containers.dropContents(level, blockPos, ((CustomCampfireBlockEntity)blockEntity).getItems());
            }

            super.onRemove(blockState, level, blockPos, blockState2, bl);
        }
    }

    @Override
    public boolean placeLiquid(LevelAccessor levelAccessor, BlockPos blockPos, BlockState blockState, FluidState fluidState) {
        if (!(Boolean)blockState.getValue(BlockStateProperties.WATERLOGGED) && fluidState.getType() == Fluids.WATER) {
            boolean isLit = blockState.getValue(LIT);

            if (isLit) {
                if (!levelAccessor.isClientSide()) {
                    levelAccessor.playSound(null, blockPos, SoundEvents.GENERIC_EXTINGUISH_FIRE, SoundSource.BLOCKS, 1.0F, 1.0F);
                }

                dowse(null, levelAccessor, blockPos, blockState);
            }

            levelAccessor.setBlock(blockPos, blockState.setValue(WATERLOGGED, Boolean.TRUE).setValue(LIT, Boolean.FALSE), 3);
            levelAccessor.scheduleTick(blockPos, fluidState.getType(), fluidState.getType().getTickDelay(levelAccessor));

            return true;
        } else {
            return false;
        }
    }

    public static void dowse(@Nullable Entity entity, LevelAccessor levelAccessor, BlockPos blockPos, BlockState blockState) {
        if (levelAccessor.isClientSide()) {
            for (int i = 0; i < 20; i++) {
                makeParticles((Level)levelAccessor, blockPos, blockState.getValue(SIGNAL_FIRE), true);
            }
        }

        BlockEntity blockEntity = levelAccessor.getBlockEntity(blockPos);

        if (blockEntity instanceof CustomCampfireBlockEntity) {
            ((CustomCampfireBlockEntity)blockEntity).dowse();
        }

        levelAccessor.gameEvent(entity, GameEvent.BLOCK_CHANGE, blockPos);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new CustomCampfireBlockEntity(pos, state);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState blockState, BlockEntityType<T> blockEntityType) {
        if (level.isClientSide) {
            return blockState.getValue(LIT) ? createTickerHelper(blockEntityType, ModEntities.CUSTOM_CAMPFIRE_BLOCK_ENTITY, CustomCampfireBlockEntity::particleTick) : null;
        } else {
            return blockState.getValue(LIT)
                    ? createTickerHelper(blockEntityType, ModEntities.CUSTOM_CAMPFIRE_BLOCK_ENTITY, CustomCampfireBlockEntity::cookTick)
                    : createTickerHelper(blockEntityType, ModEntities.CUSTOM_CAMPFIRE_BLOCK_ENTITY, CustomCampfireBlockEntity::cooldownTick);
        }
    }
}
