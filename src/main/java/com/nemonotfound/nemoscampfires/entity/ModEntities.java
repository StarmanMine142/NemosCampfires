package com.nemonotfound.nemoscampfires.entity;

import com.nemonotfound.nemoscampfires.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.entity.BlockEntityType;

import static com.nemonotfound.nemoscampfires.NemosCampfires.LOGGER;

public class ModEntities {

    public static final BlockEntityType<CustomCampfireBlockEntity> CUSTOM_CAMPFIRE_BLOCK_ENTITY =
            Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, ResourceLocation.withDefaultNamespace("custom_campfire_block_entity"),
                    BlockEntityType.Builder.of(CustomCampfireBlockEntity::new, ModBlocks.ACACIA_CAMPFIRE,
                            ModBlocks.ACACIA_SOUL_CAMPFIRE, ModBlocks.BIRCH_CAMPFIRE,
                            ModBlocks.BIRCH_SOUL_CAMPFIRE, ModBlocks.CHERRY_CAMPFIRE,
                            ModBlocks.CHERRY_SOUL_CAMPFIRE, ModBlocks.CRIMSON_CAMPFIRE,
                            ModBlocks.CRIMSON_SOUL_CAMPFIRE, ModBlocks.DARK_OAK_CAMPFIRE,
                            ModBlocks.DARK_OAK_SOUL_CAMPFIRE, ModBlocks.JUNGLE_CAMPFIRE,
                            ModBlocks.JUNGLE_SOUL_CAMPFIRE, ModBlocks.MANGROVE_CAMPFIRE,
                            ModBlocks.MANGROVE_SOUL_CAMPFIRE, ModBlocks.SPRUCE_CAMPFIRE,
                            ModBlocks.SPRUCE_SOUL_CAMPFIRE, ModBlocks.WARPED_CAMPFIRE,
                            ModBlocks.WARPED_SOUL_CAMPFIRE).build());

    public static void registerEntities() {
        LOGGER.info("Registering entities");
    }
}
