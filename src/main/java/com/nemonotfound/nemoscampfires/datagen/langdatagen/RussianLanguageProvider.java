package com.nemonotfound.nemoscampfires.datagen.langdatagen;

import com.nemonotfound.nemoscampfires.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class RussianLanguageProvider extends FabricLanguageProvider {

    public RussianLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, "ru_ru", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModBlocks.ACACIA_CAMPFIRE, "Акациевый костёр");
        translationBuilder.add(ModBlocks.ACACIA_SOUL_CAMPFIRE, "Акациевый костёр душ");
        translationBuilder.add(ModBlocks.BIRCH_CAMPFIRE, "Берёзовый костёр");
        translationBuilder.add(ModBlocks.BIRCH_SOUL_CAMPFIRE, "Берёзовый костёр душ");
        translationBuilder.add(ModBlocks.CHERRY_CAMPFIRE, "Вишнёвый костёр");
        translationBuilder.add(ModBlocks.CHERRY_SOUL_CAMPFIRE, "Вишнёвый костёр душ");
        translationBuilder.add(ModBlocks.PALE_OAK_CAMPFIRE, "Костёр из бледного дуба");
        translationBuilder.add(ModBlocks.PALE_OAK_SOUL_CAMPFIRE, "Костёр душ из бледного дуба");
        translationBuilder.add(ModBlocks.CRIMSON_CAMPFIRE, "Багровый костёр");
        translationBuilder.add(ModBlocks.CRIMSON_SOUL_CAMPFIRE, "Багровый костёр душ");
        translationBuilder.add(ModBlocks.DARK_OAK_CAMPFIRE, "Костёр из тёмного дуба");
        translationBuilder.add(ModBlocks.DARK_OAK_SOUL_CAMPFIRE, "Костёр душ из тёмного дуба");
        translationBuilder.add(ModBlocks.JUNGLE_CAMPFIRE, "Костёр из тропического дерева");
        translationBuilder.add(ModBlocks.JUNGLE_SOUL_CAMPFIRE, "Костёр душ из тропического дерева");
        translationBuilder.add(ModBlocks.MANGROVE_CAMPFIRE, "Мангровый костёр");
        translationBuilder.add(ModBlocks.MANGROVE_SOUL_CAMPFIRE, "Мангровый костёр душ");
        translationBuilder.add(ModBlocks.SPRUCE_CAMPFIRE, "Еловый костёр");
        translationBuilder.add(ModBlocks.SPRUCE_SOUL_CAMPFIRE, "Еловый костёр душ");
        translationBuilder.add(ModBlocks.WARPED_CAMPFIRE, "Искажённый костёр");
        translationBuilder.add(ModBlocks.WARPED_SOUL_CAMPFIRE, "Искажённый костёр душ");
    }
}
