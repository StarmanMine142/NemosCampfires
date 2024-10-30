package com.nemonotfound.nemoscampfires.entity;

import com.nemonotfound.nemoscampfires.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;

import static com.nemonotfound.nemoscampfires.NemosCampfires.LOGGER;

public class ModBlockEntityTypes {

    public static void registerEntities() {
        LOGGER.info("Registering block entity types");

        BlockEntityType.CAMPFIRE.nemo_sCampfires$addSupportedBlock(ModBlocks.ACACIA_CAMPFIRE);
        BlockEntityType.CAMPFIRE.nemo_sCampfires$addSupportedBlock(ModBlocks.BIRCH_CAMPFIRE);
        BlockEntityType.CAMPFIRE.nemo_sCampfires$addSupportedBlock(ModBlocks.CHERRY_CAMPFIRE);
        BlockEntityType.CAMPFIRE.nemo_sCampfires$addSupportedBlock(ModBlocks.CRIMSON_CAMPFIRE);
        BlockEntityType.CAMPFIRE.nemo_sCampfires$addSupportedBlock(ModBlocks.DARK_OAK_CAMPFIRE);
        BlockEntityType.CAMPFIRE.nemo_sCampfires$addSupportedBlock(ModBlocks.JUNGLE_CAMPFIRE);
        BlockEntityType.CAMPFIRE.nemo_sCampfires$addSupportedBlock(ModBlocks.MANGROVE_CAMPFIRE);
        BlockEntityType.CAMPFIRE.nemo_sCampfires$addSupportedBlock(ModBlocks.SPRUCE_CAMPFIRE);
        BlockEntityType.CAMPFIRE.nemo_sCampfires$addSupportedBlock(ModBlocks.WARPED_CAMPFIRE);
        BlockEntityType.CAMPFIRE.nemo_sCampfires$addSupportedBlock(ModBlocks.ACACIA_SOUL_CAMPFIRE);
        BlockEntityType.CAMPFIRE.nemo_sCampfires$addSupportedBlock(ModBlocks.BIRCH_SOUL_CAMPFIRE);
        BlockEntityType.CAMPFIRE.nemo_sCampfires$addSupportedBlock(ModBlocks.CHERRY_SOUL_CAMPFIRE);
        BlockEntityType.CAMPFIRE.nemo_sCampfires$addSupportedBlock(ModBlocks.CRIMSON_SOUL_CAMPFIRE);
        BlockEntityType.CAMPFIRE.nemo_sCampfires$addSupportedBlock(ModBlocks.DARK_OAK_SOUL_CAMPFIRE);
        BlockEntityType.CAMPFIRE.nemo_sCampfires$addSupportedBlock(ModBlocks.JUNGLE_SOUL_CAMPFIRE);
        BlockEntityType.CAMPFIRE.nemo_sCampfires$addSupportedBlock(ModBlocks.MANGROVE_SOUL_CAMPFIRE);
        BlockEntityType.CAMPFIRE.nemo_sCampfires$addSupportedBlock(ModBlocks.SPRUCE_SOUL_CAMPFIRE);
        BlockEntityType.CAMPFIRE.nemo_sCampfires$addSupportedBlock(ModBlocks.WARPED_SOUL_CAMPFIRE);
    }
}
