package com.nemonotfound.nemoscampfires.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

import static com.nemonotfound.nemoscampfires.NemosCampfires.LOGGER;
import static com.nemonotfound.nemoscampfires.NemosCampfires.MOD_ID;

public class ModCreativeModeTabs {

    public static void registerCreativeModeTabs() {
        LOGGER.info("Registering creative mode tabs");

        registerNemosCampfiresCreativeModeTab();
        modifyFunctionalBlocksCreativeModeTab();
    }

    private static void registerNemosCampfiresCreativeModeTab() {
        CreativeModeTab creativeModeTab = FabricItemGroup.builder()
                .title(Component.literal("Nemo's Campfires"))
                .icon(() -> new ItemStack(ModItems.SPRUCE_CAMPFIRE))
                .displayItems(((itemDisplayParameters, output) -> {
                    output.accept(ModItems.SPRUCE_CAMPFIRE);
                    output.accept(ModItems.SPRUCE_SOUL_CAMPFIRE);
                    output.accept(ModItems.BIRCH_CAMPFIRE);
                    output.accept(ModItems.BIRCH_SOUL_CAMPFIRE);
                    output.accept(ModItems.JUNGLE_CAMPFIRE);
                    output.accept(ModItems.JUNGLE_SOUL_CAMPFIRE);
                    output.accept(ModItems.ACACIA_CAMPFIRE);
                    output.accept(ModItems.ACACIA_SOUL_CAMPFIRE);
                    output.accept(ModItems.DARK_OAK_CAMPFIRE);
                    output.accept(ModItems.DARK_OAK_SOUL_CAMPFIRE);
                    output.accept(ModItems.MANGROVE_CAMPFIRE);
                    output.accept(ModItems.MANGROVE_SOUL_CAMPFIRE);
                    output.accept(ModItems.CHERRY_CAMPFIRE);
                    output.accept(ModItems.CHERRY_SOUL_CAMPFIRE);
                    output.accept(ModItems.PALE_OAK_CAMPFIRE);
                    output.accept(ModItems.PALE_OAK_SOUL_CAMPFIRE);
                    output.accept(ModItems.CRIMSON_CAMPFIRE);
                    output.accept(ModItems.CRIMSON_SOUL_CAMPFIRE);
                    output.accept(ModItems.WARPED_CAMPFIRE);
                    output.accept(ModItems.WARPED_SOUL_CAMPFIRE);
                }))
                .build();

        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(MOD_ID, MOD_ID), creativeModeTab);
    }

    private static void modifyFunctionalBlocksCreativeModeTab() {
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(entries -> {
            entries.addAfter(Items.SOUL_CAMPFIRE, ModItems.WARPED_SOUL_CAMPFIRE);
            entries.addAfter(Items.SOUL_CAMPFIRE, ModItems.WARPED_CAMPFIRE);
            entries.addAfter(Items.SOUL_CAMPFIRE, ModItems.CRIMSON_SOUL_CAMPFIRE);
            entries.addAfter(Items.SOUL_CAMPFIRE, ModItems.CRIMSON_CAMPFIRE);
            entries.addAfter(Items.SOUL_CAMPFIRE, ModItems.PALE_OAK_SOUL_CAMPFIRE);
            entries.addAfter(Items.SOUL_CAMPFIRE, ModItems.PALE_OAK_CAMPFIRE);
            entries.addAfter(Items.SOUL_CAMPFIRE, ModItems.CHERRY_SOUL_CAMPFIRE);
            entries.addAfter(Items.SOUL_CAMPFIRE, ModItems.CHERRY_CAMPFIRE);
            entries.addAfter(Items.SOUL_CAMPFIRE, ModItems.MANGROVE_SOUL_CAMPFIRE);
            entries.addAfter(Items.SOUL_CAMPFIRE, ModItems.MANGROVE_CAMPFIRE);
            entries.addAfter(Items.SOUL_CAMPFIRE, ModItems.DARK_OAK_SOUL_CAMPFIRE);
            entries.addAfter(Items.SOUL_CAMPFIRE, ModItems.DARK_OAK_CAMPFIRE);
            entries.addAfter(Items.SOUL_CAMPFIRE, ModItems.ACACIA_SOUL_CAMPFIRE);
            entries.addAfter(Items.SOUL_CAMPFIRE, ModItems.ACACIA_CAMPFIRE);
            entries.addAfter(Items.SOUL_CAMPFIRE, ModItems.JUNGLE_SOUL_CAMPFIRE);
            entries.addAfter(Items.SOUL_CAMPFIRE, ModItems.JUNGLE_CAMPFIRE);
            entries.addAfter(Items.SOUL_CAMPFIRE, ModItems.BIRCH_SOUL_CAMPFIRE);
            entries.addAfter(Items.SOUL_CAMPFIRE, ModItems.BIRCH_CAMPFIRE);
            entries.addAfter(Items.SOUL_CAMPFIRE, ModItems.SPRUCE_SOUL_CAMPFIRE);
            entries.addAfter(Items.SOUL_CAMPFIRE, ModItems.SPRUCE_CAMPFIRE);
        });
    }
}
