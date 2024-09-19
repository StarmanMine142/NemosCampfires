package com.nemonotfound.nemoscampfires.datagen.langdatagen;

import com.nemonotfound.nemoscampfires.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class EnglishLanguageProvider extends FabricLanguageProvider {

    public EnglishLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModBlocks.ACACIA_CAMPFIRE, "Acacia Campfire");
        translationBuilder.add(ModBlocks.ACACIA_SOUL_CAMPFIRE, "Acacia Soul Campfire");
        translationBuilder.add(ModBlocks.BIRCH_CAMPFIRE, "Birch Campfire");
        translationBuilder.add(ModBlocks.BIRCH_SOUL_CAMPFIRE, "Birch Soul Campfire");
        translationBuilder.add(ModBlocks.CHERRY_CAMPFIRE, "Cherry Campfire");
        translationBuilder.add(ModBlocks.CHERRY_SOUL_CAMPFIRE, "Cherry Soul Campfire");
        translationBuilder.add(ModBlocks.CRIMSON_CAMPFIRE, "Crimson Campfire");
        translationBuilder.add(ModBlocks.CRIMSON_SOUL_CAMPFIRE, "Crimson Soul Campfire");
        translationBuilder.add(ModBlocks.DARK_OAK_CAMPFIRE, "Dark Oak Campfire");
        translationBuilder.add(ModBlocks.DARK_OAK_SOUL_CAMPFIRE, "Dark Oak Soul Campfire");
        translationBuilder.add(ModBlocks.JUNGLE_CAMPFIRE, "Jungle Campfire");
        translationBuilder.add(ModBlocks.JUNGLE_SOUL_CAMPFIRE, "Jungle Soul Campfire");
        translationBuilder.add(ModBlocks.MANGROVE_CAMPFIRE, "Mangrove Campfire");
        translationBuilder.add(ModBlocks.MANGROVE_SOUL_CAMPFIRE, "Mangrove Soul Campfire");
        translationBuilder.add(ModBlocks.SPRUCE_CAMPFIRE, "Spruce Campfire");
        translationBuilder.add(ModBlocks.SPRUCE_SOUL_CAMPFIRE, "Spruce Soul Campfire");
        translationBuilder.add(ModBlocks.WARPED_CAMPFIRE, "Warped Campfire");
        translationBuilder.add(ModBlocks.WARPED_SOUL_CAMPFIRE, "Warped Soul Campfire");
    }
}
