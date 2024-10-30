package com.nemonotfound.nemoscampfires.datagen;

import com.nemonotfound.nemoscampfires.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;

import java.util.concurrent.CompletableFuture;

public class BlockTagProvider extends FabricTagProvider.BlockTagProvider {

    public BlockTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.ACACIA_CAMPFIRE)
                .add(ModBlocks.ACACIA_SOUL_CAMPFIRE)
                .add(ModBlocks.BIRCH_CAMPFIRE)
                .add(ModBlocks.BIRCH_SOUL_CAMPFIRE)
                .add(ModBlocks.CHERRY_CAMPFIRE)
                .add(ModBlocks.CHERRY_SOUL_CAMPFIRE)
                .add(ModBlocks.PALE_OAK_CAMPFIRE)
                .add(ModBlocks.PALE_OAK_SOUL_CAMPFIRE)
                .add(ModBlocks.CRIMSON_CAMPFIRE)
                .add(ModBlocks.CRIMSON_SOUL_CAMPFIRE)
                .add(ModBlocks.DARK_OAK_CAMPFIRE)
                .add(ModBlocks.DARK_OAK_SOUL_CAMPFIRE)
                .add(ModBlocks.JUNGLE_CAMPFIRE)
                .add(ModBlocks.JUNGLE_SOUL_CAMPFIRE)
                .add(ModBlocks.MANGROVE_CAMPFIRE)
                .add(ModBlocks.MANGROVE_SOUL_CAMPFIRE)
                .add(ModBlocks.SPRUCE_CAMPFIRE)
                .add(ModBlocks.SPRUCE_SOUL_CAMPFIRE)
                .add(ModBlocks.WARPED_CAMPFIRE)
                .add(ModBlocks.WARPED_SOUL_CAMPFIRE);

        getOrCreateTagBuilder(BlockTags.CAMPFIRES)
                .add(ModBlocks.ACACIA_CAMPFIRE)
                .add(ModBlocks.ACACIA_SOUL_CAMPFIRE)
                .add(ModBlocks.BIRCH_CAMPFIRE)
                .add(ModBlocks.BIRCH_SOUL_CAMPFIRE)
                .add(ModBlocks.CHERRY_CAMPFIRE)
                .add(ModBlocks.CHERRY_SOUL_CAMPFIRE)
                .add(ModBlocks.PALE_OAK_CAMPFIRE)
                .add(ModBlocks.PALE_OAK_SOUL_CAMPFIRE)
                .add(ModBlocks.CRIMSON_CAMPFIRE)
                .add(ModBlocks.CRIMSON_SOUL_CAMPFIRE)
                .add(ModBlocks.DARK_OAK_CAMPFIRE)
                .add(ModBlocks.DARK_OAK_SOUL_CAMPFIRE)
                .add(ModBlocks.JUNGLE_CAMPFIRE)
                .add(ModBlocks.JUNGLE_SOUL_CAMPFIRE)
                .add(ModBlocks.MANGROVE_CAMPFIRE)
                .add(ModBlocks.MANGROVE_SOUL_CAMPFIRE)
                .add(ModBlocks.SPRUCE_CAMPFIRE)
                .add(ModBlocks.SPRUCE_SOUL_CAMPFIRE)
                .add(ModBlocks.WARPED_CAMPFIRE)
                .add(ModBlocks.WARPED_SOUL_CAMPFIRE);
    }
}
