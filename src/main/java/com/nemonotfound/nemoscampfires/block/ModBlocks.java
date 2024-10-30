package com.nemonotfound.nemoscampfires.block;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CampfireBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

import java.util.function.Function;

import static com.nemonotfound.nemoscampfires.NemosCampfires.LOGGER;
import static com.nemonotfound.nemoscampfires.NemosCampfires.MOD_ID;
import static net.minecraft.world.level.block.Blocks.*;

public class ModBlocks {

    public static final Block ACACIA_CAMPFIRE = register("acacia_campfire", properties -> new CampfireBlock(true, 1, properties), createCampfireProperties(ACACIA_LOG.defaultMapColor(), 15));
    public static final Block BIRCH_CAMPFIRE = register("birch_campfire", properties -> new CampfireBlock(true, 1, properties), createCampfireProperties(BIRCH_LOG.defaultMapColor(), 15));
    public static final Block CHERRY_CAMPFIRE = register("cherry_campfire", properties -> new CampfireBlock(true, 1, properties), createCampfireProperties(CHERRY_LOG.defaultMapColor(), 15));
    public static final Block PALE_OAK_CAMPFIRE = register("pale_oak_campfire", properties -> new CampfireBlock(true, 1, properties), createCampfireProperties(PALE_OAK_LOG.defaultMapColor(), 15));
    public static final Block CRIMSON_CAMPFIRE = register("crimson_campfire", properties -> new CampfireBlock(true, 1, properties), createCampfireProperties(CRIMSON_STEM.defaultMapColor(), 15));
    public static final Block DARK_OAK_CAMPFIRE = register("dark_oak_campfire", properties -> new CampfireBlock(true, 1, properties), createCampfireProperties(DARK_OAK_LOG.defaultMapColor(), 15));
    public static final Block JUNGLE_CAMPFIRE = register("jungle_campfire", properties -> new CampfireBlock(true, 1, properties), createCampfireProperties(JUNGLE_LOG.defaultMapColor(), 15));
    public static final Block MANGROVE_CAMPFIRE = register("mangrove_campfire", properties -> new CampfireBlock(true, 1, properties), createCampfireProperties(MANGROVE_LOG.defaultMapColor(), 15));
    public static final Block SPRUCE_CAMPFIRE = register("spruce_campfire", properties -> new CampfireBlock(true, 1, properties), createCampfireProperties(SPRUCE_LOG.defaultMapColor(), 15));
    public static final Block WARPED_CAMPFIRE = register("warped_campfire", properties -> new CampfireBlock(true, 1, properties), createCampfireProperties(WARPED_STEM.defaultMapColor(), 15));
    public static final Block ACACIA_SOUL_CAMPFIRE = register("acacia_soul_campfire", properties -> new CampfireBlock(false, 2, properties), createCampfireProperties(ACACIA_LOG.defaultMapColor(), 10));
    public static final Block BIRCH_SOUL_CAMPFIRE = register("birch_soul_campfire", properties -> new CampfireBlock(false, 2, properties), createCampfireProperties(BIRCH_LOG.defaultMapColor(), 10));
    public static final Block CHERRY_SOUL_CAMPFIRE = register("cherry_soul_campfire", properties -> new CampfireBlock(false, 2, properties), createCampfireProperties(CHERRY_LOG.defaultMapColor(), 10));
    public static final Block PALE_OAK_SOUL_CAMPFIRE = register("pale_oak_soul_campfire", properties -> new CampfireBlock(false, 2, properties), createCampfireProperties(PALE_OAK_LOG.defaultMapColor(), 10));
    public static final Block CRIMSON_SOUL_CAMPFIRE = register("crimson_soul_campfire", properties -> new CampfireBlock(false, 2, properties), createCampfireProperties(CRIMSON_STEM.defaultMapColor(), 10));
    public static final Block DARK_OAK_SOUL_CAMPFIRE = register("dark_oak_soul_campfire", properties -> new CampfireBlock(false, 2, properties), createCampfireProperties(DARK_OAK_LOG.defaultMapColor(), 10));
    public static final Block JUNGLE_SOUL_CAMPFIRE = register("jungle_soul_campfire", properties -> new CampfireBlock(false, 2, properties), createCampfireProperties(JUNGLE_LOG.defaultMapColor(), 10));
    public static final Block MANGROVE_SOUL_CAMPFIRE = register("mangrove_soul_campfire", properties -> new CampfireBlock(false, 2, properties), createCampfireProperties(MANGROVE_LOG.defaultMapColor(), 10));
    public static final Block SPRUCE_SOUL_CAMPFIRE = register("spruce_soul_campfire", properties -> new CampfireBlock(false, 2, properties), createCampfireProperties(SPRUCE_LOG.defaultMapColor(), 10));
    public static final Block WARPED_SOUL_CAMPFIRE = register("warped_soul_campfire", properties -> new CampfireBlock(false, 2, properties), createCampfireProperties(WARPED_STEM.defaultMapColor(), 10));

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

    private static Block register(String path, Function<BlockBehaviour.Properties, Block> factory, BlockBehaviour.Properties properties) {
        return Blocks.register(keyOf(path), factory, properties);
    }

    private static ResourceKey<Block> keyOf(String path) {
        return ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MOD_ID, path));
    }
}
