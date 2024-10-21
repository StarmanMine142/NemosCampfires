package com.nemonotfound.nemoscampfires;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.nemonotfound.nemoscampfires.block.ModBlocks.registerBlocks;
import static com.nemonotfound.nemoscampfires.entity.ModBlockEntityType.registerBlockEntityTypes;
import static com.nemonotfound.nemoscampfires.item.ModCreativeModeTabs.registerCreativeModeTabs;
import static com.nemonotfound.nemoscampfires.item.ModItems.registerItems;

public class NemosCampfires implements ModInitializer {

	public static final String MOD_ID = "nemos-campfires";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Thank you for using Nemo's Campfires!");

		registerBlocks();
		registerItems();
		registerCreativeModeTabs();
		registerBlockEntityTypes();
	}
}