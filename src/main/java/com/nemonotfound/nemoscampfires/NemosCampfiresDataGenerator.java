package com.nemonotfound.nemoscampfires;

import com.nemonotfound.nemoscampfires.datagen.BlockTagProvider;
import com.nemonotfound.nemoscampfires.datagen.LootTableProvider;
import com.nemonotfound.nemoscampfires.datagen.langdatagen.GermanLanguageProvider;
import com.nemonotfound.nemoscampfires.datagen.modelgen.ModelProvider;
import com.nemonotfound.nemoscampfires.datagen.RecipeProvider;
import com.nemonotfound.nemoscampfires.datagen.langdatagen.EnglishLanguageProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class NemosCampfiresDataGenerator implements DataGeneratorEntrypoint {

	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(EnglishLanguageProvider::new);
		pack.addProvider(GermanLanguageProvider::new);
		pack.addProvider(BlockTagProvider::new);
		pack.addProvider(ModelProvider::new);
		pack.addProvider(LootTableProvider::new);
		pack.addProvider(RecipeProvider::new);
	}
}
