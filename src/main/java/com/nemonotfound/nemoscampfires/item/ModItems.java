package com.nemonotfound.nemoscampfires.item;

import com.nemonotfound.nemoscampfires.block.ModBlocks;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.ItemContainerContents;
import net.minecraft.world.level.block.Block;

import static com.nemonotfound.nemoscampfires.NemosCampfires.LOGGER;

public class ModItems {

    public static final Item ACACIA_CAMPFIRE = registerCampfireBlockItem(ModBlocks.ACACIA_CAMPFIRE);
    public static final Item BIRCH_CAMPFIRE = registerCampfireBlockItem(ModBlocks.BIRCH_CAMPFIRE);
    public static final Item CHERRY_CAMPFIRE = registerCampfireBlockItem(ModBlocks.CHERRY_CAMPFIRE);
    public static final Item PALE_OAK_CAMPFIRE = registerCampfireBlockItem(ModBlocks.PALE_OAK_CAMPFIRE);
    public static final Item CRIMSON_CAMPFIRE = registerCampfireBlockItem(ModBlocks.CRIMSON_CAMPFIRE);
    public static final Item DARK_OAK_CAMPFIRE = registerCampfireBlockItem(ModBlocks.DARK_OAK_CAMPFIRE);
    public static final Item JUNGLE_CAMPFIRE = registerCampfireBlockItem(ModBlocks.JUNGLE_CAMPFIRE);
    public static final Item MANGROVE_CAMPFIRE = registerCampfireBlockItem(ModBlocks.MANGROVE_CAMPFIRE);
    public static final Item SPRUCE_CAMPFIRE = registerCampfireBlockItem(ModBlocks.SPRUCE_CAMPFIRE);
    public static final Item WARPED_CAMPFIRE = registerCampfireBlockItem(ModBlocks.WARPED_CAMPFIRE);
    public static final Item ACACIA_SOUL_CAMPFIRE = registerCampfireBlockItem(ModBlocks.ACACIA_SOUL_CAMPFIRE);
    public static final Item BIRCH_SOUL_CAMPFIRE = registerCampfireBlockItem(ModBlocks.BIRCH_SOUL_CAMPFIRE);
    public static final Item CHERRY_SOUL_CAMPFIRE = registerCampfireBlockItem(ModBlocks.CHERRY_SOUL_CAMPFIRE);
    public static final Item PALE_OAK_SOUL_CAMPFIRE = registerCampfireBlockItem(ModBlocks.PALE_OAK_SOUL_CAMPFIRE);
    public static final Item CRIMSON_SOUL_CAMPFIRE = registerCampfireBlockItem(ModBlocks.CRIMSON_SOUL_CAMPFIRE);
    public static final Item DARK_OAK_SOUL_CAMPFIRE = registerCampfireBlockItem(ModBlocks.DARK_OAK_SOUL_CAMPFIRE);
    public static final Item JUNGLE_SOUL_CAMPFIRE = registerCampfireBlockItem(ModBlocks.JUNGLE_SOUL_CAMPFIRE);
    public static final Item MANGROVE_SOUL_CAMPFIRE = registerCampfireBlockItem(ModBlocks.MANGROVE_SOUL_CAMPFIRE);
    public static final Item SPRUCE_SOUL_CAMPFIRE = registerCampfireBlockItem(ModBlocks.SPRUCE_SOUL_CAMPFIRE);
    public static final Item WARPED_SOUL_CAMPFIRE = registerCampfireBlockItem(ModBlocks.WARPED_SOUL_CAMPFIRE);

    public static void registerItems() {
        LOGGER.info("Registering items");
    }

    private static Item registerCampfireBlockItem(Block block) {
        return Items.registerBlock(block, properties -> properties.component(DataComponents.CONTAINER, ItemContainerContents.EMPTY));
    }
}
