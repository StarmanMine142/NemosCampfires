package com.nemonotfound.nemoscampfires.block;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

import static com.nemonotfound.nemoscampfires.NemosCampfires.LOGGER;
import static com.nemonotfound.nemoscampfires.NemosCampfires.MOD_ID;
import static net.minecraft.world.level.block.Blocks.*;

public class ModBlocks {

    public static final Block ACACIA_CAMPFIRE = registerBlock("acacia_campfire", new CustomCampfireBlock(true, 1, createCampfireProperties(ACACIA_LOG.defaultMapColor(), 15)));
    public static final Block BIRCH_CAMPFIRE = registerBlock("birch_campfire", new CustomCampfireBlock(true, 1, createCampfireProperties(BIRCH_LOG.defaultMapColor(), 15)));
    public static final Block CHERRY_CAMPFIRE = registerBlock("cherry_campfire", new CustomCampfireBlock(true, 1, createCampfireProperties(CHERRY_LOG.defaultMapColor(), 15)));
    public static final Block CRIMSON_CAMPFIRE = registerBlock("crimson_campfire", new CustomCampfireBlock(true, 1, createCampfireProperties(CRIMSON_STEM.defaultMapColor(), 15)));
    public static final Block DARK_OAK_CAMPFIRE = registerBlock("dark_oak_campfire", new CustomCampfireBlock(true, 1, createCampfireProperties(DARK_OAK_LOG.defaultMapColor(), 15)));
    public static final Block JUNGLE_CAMPFIRE = registerBlock("jungle_campfire", new CustomCampfireBlock(true, 1, createCampfireProperties(JUNGLE_LOG.defaultMapColor(), 15)));
    public static final Block MANGROVE_CAMPFIRE = registerBlock("mangrove_campfire", new CustomCampfireBlock(true, 1, createCampfireProperties(MANGROVE_LOG.defaultMapColor(), 15)));
    public static final Block SPRUCE_CAMPFIRE = registerBlock("spruce_campfire", new CustomCampfireBlock(true, 1, createCampfireProperties(SPRUCE_LOG.defaultMapColor(), 15)));
    public static final Block WARPED_CAMPFIRE = registerBlock("warped_campfire", new CustomCampfireBlock(true, 1, createCampfireProperties(WARPED_STEM.defaultMapColor(), 15)));
    public static final Block ACACIA_SOUL_CAMPFIRE = registerBlock("acacia_soul_campfire", new CustomCampfireBlock(false, 2, createCampfireProperties(ACACIA_LOG.defaultMapColor(), 10)));
    public static final Block BIRCH_SOUL_CAMPFIRE = registerBlock("birch_soul_campfire", new CustomCampfireBlock(false, 2, createCampfireProperties(BIRCH_LOG.defaultMapColor(), 10)));
    public static final Block CHERRY_SOUL_CAMPFIRE = registerBlock("cherry_soul_campfire", new CustomCampfireBlock(false, 2, createCampfireProperties(CHERRY_LOG.defaultMapColor(), 10)));
    public static final Block CRIMSON_SOUL_CAMPFIRE = registerBlock("crimson_soul_campfire", new CustomCampfireBlock(false, 2, createCampfireProperties(CRIMSON_STEM.defaultMapColor(), 10)));
    public static final Block DARK_OAK_SOUL_CAMPFIRE = registerBlock("dark_oak_soul_campfire", new CustomCampfireBlock(false, 2, createCampfireProperties(DARK_OAK_LOG.defaultMapColor(), 10)));
    public static final Block JUNGLE_SOUL_CAMPFIRE = registerBlock("jungle_soul_campfire", new CustomCampfireBlock(false, 2, createCampfireProperties(JUNGLE_LOG.defaultMapColor(), 10)));
    public static final Block MANGROVE_SOUL_CAMPFIRE = registerBlock("mangrove_soul_campfire", new CustomCampfireBlock(false, 2, createCampfireProperties(MANGROVE_LOG.defaultMapColor(), 10)));
    public static final Block SPRUCE_SOUL_CAMPFIRE = registerBlock("spruce_soul_campfire", new CustomCampfireBlock(false, 2, createCampfireProperties(SPRUCE_LOG.defaultMapColor(), 10)));
    public static final Block WARPED_SOUL_CAMPFIRE = registerBlock("warped_soul_campfire", new CustomCampfireBlock(false, 2, createCampfireProperties(WARPED_STEM.defaultMapColor(), 10)));

    public static void registerBlocks() {
        LOGGER.info("Registering blocks");
    }

    private static BlockBehaviour.Properties createCampfireProperties(MapColor mapColor, int lightLevel) {
        return BlockBehaviour.Properties.of()
                .mapColor(mapColor)
                .instrument(NoteBlockInstrument.BASS)
                .strength(2.0F)
                .sound(SoundType.WOOD)
                .lightLevel(litBlockEmission(lightLevel))
                .noOcclusion()
                .ignitedByLava();
    }

    private static Block registerBlock(String path, Block block) {
        return Registry.register(BuiltInRegistries.BLOCK, ResourceLocation.fromNamespaceAndPath(MOD_ID, path), block);
    }
}
