package com.nemonotfound.nemoscampfires.item;

import com.nemonotfound.nemoscampfires.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import static com.nemonotfound.nemoscampfires.NemosCampfires.LOGGER;
import static com.nemonotfound.nemoscampfires.NemosCampfires.MOD_ID;

public class ModItems {

    public static final Item ACACIA_CAMPFIRE = registerBlockItem("acacia_campfire", ModBlocks.ACACIA_CAMPFIRE);
    public static final Item BIRCH_CAMPFIRE = registerBlockItem("birch_campfire", ModBlocks.BIRCH_CAMPFIRE);
    public static final Item CHERRY_CAMPFIRE = registerBlockItem("cherry_campfire", ModBlocks.CHERRY_CAMPFIRE);
    public static final Item CRIMSON_CAMPFIRE = registerBlockItem("crimson_campfire", ModBlocks.CRIMSON_CAMPFIRE);
    public static final Item DARK_OAK_CAMPFIRE = registerBlockItem("dark_oak_campfire", ModBlocks.DARK_OAK_CAMPFIRE);
    public static final Item JUNGLE_CAMPFIRE = registerBlockItem("jungle_campfire", ModBlocks.JUNGLE_CAMPFIRE);
    public static final Item MANGROVE_CAMPFIRE = registerBlockItem("mangrove_campfire", ModBlocks.MANGROVE_CAMPFIRE);
    public static final Item SPRUCE_CAMPFIRE = registerBlockItem("spruce_campfire", ModBlocks.SPRUCE_CAMPFIRE);
    public static final Item WARPED_CAMPFIRE = registerBlockItem("warped_campfire", ModBlocks.WARPED_CAMPFIRE);
    public static final Item ACACIA_SOUL_CAMPFIRE = registerBlockItem("acacia_soul_campfire", ModBlocks.ACACIA_SOUL_CAMPFIRE);
    public static final Item BIRCH_SOUL_CAMPFIRE = registerBlockItem("birch_soul_campfire", ModBlocks.BIRCH_SOUL_CAMPFIRE);
    public static final Item CHERRY_SOUL_CAMPFIRE = registerBlockItem("cherry_soul_campfire", ModBlocks.CHERRY_SOUL_CAMPFIRE);
    public static final Item CRIMSON_SOUL_CAMPFIRE = registerBlockItem("crimson_soul_campfire", ModBlocks.CRIMSON_SOUL_CAMPFIRE);
    public static final Item DARK_OAK_SOUL_CAMPFIRE = registerBlockItem("dark_oak_soul_campfire", ModBlocks.DARK_OAK_SOUL_CAMPFIRE);
    public static final Item JUNGLE_SOUL_CAMPFIRE = registerBlockItem("jungle_soul_campfire", ModBlocks.JUNGLE_SOUL_CAMPFIRE);
    public static final Item MANGROVE_SOUL_CAMPFIRE = registerBlockItem("mangrove_soul_campfire", ModBlocks.MANGROVE_SOUL_CAMPFIRE);
    public static final Item SPRUCE_SOUL_CAMPFIRE = registerBlockItem("spruce_soul_campfire", ModBlocks.SPRUCE_SOUL_CAMPFIRE);
    public static final Item WARPED_SOUL_CAMPFIRE = registerBlockItem("warped_soul_campfire", ModBlocks.WARPED_SOUL_CAMPFIRE);

    public static void registerItems() {
        LOGGER.info("Registering items");
    }

    private static Item registerBlockItem(String path, Block block) {
        BlockItem blockItem = new BlockItem(block, new Item.Properties());

        return Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, path), blockItem);
    }
}
