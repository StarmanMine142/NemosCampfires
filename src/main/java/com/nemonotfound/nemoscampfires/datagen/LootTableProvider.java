package com.nemonotfound.nemoscampfires.datagen;

import com.nemonotfound.nemoscampfires.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

public class LootTableProvider extends FabricBlockLootTableProvider {

    public LootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        this.add(ModBlocks.ACACIA_CAMPFIRE, (Block block) -> createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.CHARCOAL)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0f))))));
        this.add(ModBlocks.BIRCH_CAMPFIRE, (Block block) -> createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.CHARCOAL)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0f))))));
        this.add(ModBlocks.CHERRY_CAMPFIRE, (Block block) -> createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.CHARCOAL)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0f))))));
        this.add(ModBlocks.CRIMSON_CAMPFIRE, (Block block) -> createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.CHARCOAL)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0f))))));
        this.add(ModBlocks.DARK_OAK_CAMPFIRE, (Block block) -> createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.CHARCOAL)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0f))))));
        this.add(ModBlocks.JUNGLE_CAMPFIRE, (Block block) -> createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.CHARCOAL)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0f))))));
        this.add(ModBlocks.MANGROVE_CAMPFIRE, (Block block) -> createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.CHARCOAL)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0f))))));
        this.add(ModBlocks.SPRUCE_CAMPFIRE, (Block block) -> createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.CHARCOAL)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0f))))));
        this.add(ModBlocks.WARPED_CAMPFIRE, (Block block) -> createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.CHARCOAL)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0f))))));
        this.add(ModBlocks.ACACIA_SOUL_CAMPFIRE, (Block block) -> createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.SOUL_SOIL)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f))))));
        this.add(ModBlocks.BIRCH_SOUL_CAMPFIRE, (Block block) -> createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.SOUL_SOIL)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f))))));
        this.add(ModBlocks.CHERRY_SOUL_CAMPFIRE, (Block block) -> createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.SOUL_SOIL)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f))))));
        this.add(ModBlocks.CRIMSON_SOUL_CAMPFIRE, (Block block) -> createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.SOUL_SOIL)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f))))));
        this.add(ModBlocks.DARK_OAK_SOUL_CAMPFIRE, (Block block) -> createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.SOUL_SOIL)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f))))));
        this.add(ModBlocks.JUNGLE_SOUL_CAMPFIRE, (Block block) -> createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.SOUL_SOIL)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f))))));
        this.add(ModBlocks.MANGROVE_SOUL_CAMPFIRE, (Block block) -> createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.SOUL_SOIL)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f))))));
        this.add(ModBlocks.SPRUCE_SOUL_CAMPFIRE, (Block block) -> createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.SOUL_SOIL)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f))))));
        this.add(ModBlocks.WARPED_SOUL_CAMPFIRE, (Block block) -> createSilkTouchDispatchTable(block,
                this.applyExplosionCondition(block, LootItem.lootTableItem(Items.SOUL_SOIL)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0f))))));
    }
}
