package com.nemonotfound.nemoscampfires.datagen.modelgen;

import com.nemonotfound.nemoscampfires.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;

import static net.minecraft.data.models.BlockModelGenerators.createBooleanModelDispatch;
import static net.minecraft.data.models.BlockModelGenerators.createHorizontalFacingDispatchAlt;

public class ModelProvider extends FabricModelProvider {

    public ModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
        createCampfires(blockStateModelGenerator, ModBlocks.ACACIA_CAMPFIRE, ModBlocks.ACACIA_SOUL_CAMPFIRE);
        createCampfires(blockStateModelGenerator, ModBlocks.BIRCH_CAMPFIRE, ModBlocks.BIRCH_SOUL_CAMPFIRE);
        createCampfires(blockStateModelGenerator, ModBlocks.CHERRY_CAMPFIRE, ModBlocks.CHERRY_SOUL_CAMPFIRE);
        createCampfires(blockStateModelGenerator, ModBlocks.CRIMSON_CAMPFIRE, ModBlocks.CRIMSON_SOUL_CAMPFIRE);
        createCampfires(blockStateModelGenerator, ModBlocks.DARK_OAK_CAMPFIRE, ModBlocks.DARK_OAK_SOUL_CAMPFIRE);
        createCampfires(blockStateModelGenerator, ModBlocks.JUNGLE_CAMPFIRE, ModBlocks.JUNGLE_SOUL_CAMPFIRE);
        createCampfires(blockStateModelGenerator, ModBlocks.MANGROVE_CAMPFIRE, ModBlocks.MANGROVE_SOUL_CAMPFIRE);
        createCampfires(blockStateModelGenerator, ModBlocks.SPRUCE_CAMPFIRE, ModBlocks.SPRUCE_SOUL_CAMPFIRE);
        createCampfires(blockStateModelGenerator, ModBlocks.WARPED_CAMPFIRE, ModBlocks.WARPED_SOUL_CAMPFIRE);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
    }

    public final void createCampfires(BlockModelGenerators blockModelGenerators, Block campfireVariant, Block soulCampfireVariant) {
        ResourceLocation campfireResourceLocation = ModModelTemplates.CAMPFIRE.create(campfireVariant, ModTextureMapping.campfire(campfireVariant, Blocks.CAMPFIRE), blockModelGenerators.modelOutput);
        ResourceLocation soulCampfireResourceLocation = ModModelTemplates.CAMPFIRE.create(soulCampfireVariant, ModTextureMapping.soulCampfire(soulCampfireVariant, campfireVariant, Blocks.SOUL_CAMPFIRE), blockModelGenerators.modelOutput);
        ResourceLocation campfireOffResourceLocation = ModModelTemplates.CAMPFIRE_OFF.createWithSuffix(campfireVariant, "_off", ModTextureMapping.campfireOff(campfireVariant), blockModelGenerators.modelOutput);

        createCampfire(blockModelGenerators, campfireVariant, campfireResourceLocation, campfireOffResourceLocation);
        createCampfire(blockModelGenerators, soulCampfireVariant, soulCampfireResourceLocation, campfireOffResourceLocation);
    }

    private static void createCampfire(BlockModelGenerators blockModelGenerators, Block campfireVariant, ResourceLocation campfireResourceLocation, ResourceLocation campfireOffResourceLocation) {
        blockModelGenerators.createSimpleFlatItemModel(campfireVariant.asItem());
        blockModelGenerators.blockStateOutput
                .accept(MultiVariantGenerator.multiVariant(campfireVariant)
                        .with(createBooleanModelDispatch(BlockStateProperties.LIT, campfireResourceLocation, campfireOffResourceLocation))
                        .with(createHorizontalFacingDispatchAlt()));
    }
}
