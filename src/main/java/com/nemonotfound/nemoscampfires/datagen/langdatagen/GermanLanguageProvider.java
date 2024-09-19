package com.nemonotfound.nemoscampfires.datagen.langdatagen;

import com.nemonotfound.nemoscampfires.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class GermanLanguageProvider extends FabricLanguageProvider {

    public GermanLanguageProvider(FabricDataOutput dataOutput) {
        super(dataOutput, "de_de");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(ModBlocks.ACACIA_CAMPFIRE, "Akazienlagerfeuer");
        translationBuilder.add(ModBlocks.ACACIA_SOUL_CAMPFIRE, "Akazienseelenlagerfeuer");
        translationBuilder.add(ModBlocks.BIRCH_CAMPFIRE, "Birkenlagerfeuer");
        translationBuilder.add(ModBlocks.BIRCH_SOUL_CAMPFIRE, "Birkenseelenlagerfeuer");
        translationBuilder.add(ModBlocks.CHERRY_CAMPFIRE, "Kirschlagerfeuer");
        translationBuilder.add(ModBlocks.CHERRY_SOUL_CAMPFIRE, "Kirschseelenlagerfeuer");
        translationBuilder.add(ModBlocks.CRIMSON_CAMPFIRE, "Karmesinlagerfeuer");
        translationBuilder.add(ModBlocks.CRIMSON_SOUL_CAMPFIRE, "Karmesinseelenlagerfeuer");
        translationBuilder.add(ModBlocks.DARK_OAK_CAMPFIRE, "Schwarzeichenlagerfeuer");
        translationBuilder.add(ModBlocks.DARK_OAK_SOUL_CAMPFIRE, "Schwarzeichenseelenlagerfeuer");
        translationBuilder.add(ModBlocks.JUNGLE_CAMPFIRE, "Tropenlagerfeuer");
        translationBuilder.add(ModBlocks.JUNGLE_SOUL_CAMPFIRE, "Tropenseelenlagerfeuer");
        translationBuilder.add(ModBlocks.MANGROVE_CAMPFIRE, "Mangrovenlagerfeuer");
        translationBuilder.add(ModBlocks.MANGROVE_SOUL_CAMPFIRE, "Mangrovenseelenlagerfeuer");
        translationBuilder.add(ModBlocks.SPRUCE_CAMPFIRE, "Fichtenlagerfeuer");
        translationBuilder.add(ModBlocks.SPRUCE_SOUL_CAMPFIRE, "Fichtenseelenlagerfeuer");
        translationBuilder.add(ModBlocks.WARPED_CAMPFIRE, "Wirrlagerfeuer");
        translationBuilder.add(ModBlocks.WARPED_SOUL_CAMPFIRE, "Wirrseelenlagerfeuer");
    }
}
