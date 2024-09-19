package com.nemonotfound.nemoscampfires.datagen;

import com.nemonotfound.nemoscampfires.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;

public class RecipeProvider extends FabricRecipeProvider {

    public RecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void buildRecipes(RecipeOutput exporter) {
        createCampfireRecipe(exporter, ModBlocks.ACACIA_CAMPFIRE, ItemTags.ACACIA_LOGS);
        createCampfireRecipe(exporter, ModBlocks.BIRCH_CAMPFIRE, ItemTags.BIRCH_LOGS);
        createCampfireRecipe(exporter, ModBlocks.CHERRY_CAMPFIRE, ItemTags.CHERRY_LOGS);
        createCampfireRecipe(exporter, ModBlocks.CRIMSON_CAMPFIRE, ItemTags.CRIMSON_STEMS);
        createCampfireRecipe(exporter, ModBlocks.DARK_OAK_CAMPFIRE, ItemTags.DARK_OAK_LOGS);
        createCampfireRecipe(exporter, ModBlocks.JUNGLE_CAMPFIRE, ItemTags.JUNGLE_LOGS);
        createCampfireRecipe(exporter, ModBlocks.MANGROVE_CAMPFIRE, ItemTags.MANGROVE_LOGS);
        createCampfireRecipe(exporter, ModBlocks.SPRUCE_CAMPFIRE, ItemTags.SPRUCE_LOGS);
        createCampfireRecipe(exporter, ModBlocks.WARPED_CAMPFIRE, ItemTags.WARPED_STEMS);

        createSoulCampfireRecipe(exporter, ModBlocks.ACACIA_SOUL_CAMPFIRE, ItemTags.ACACIA_LOGS);
        createSoulCampfireRecipe(exporter, ModBlocks.BIRCH_SOUL_CAMPFIRE, ItemTags.BIRCH_LOGS);
        createSoulCampfireRecipe(exporter, ModBlocks.CHERRY_SOUL_CAMPFIRE, ItemTags.CHERRY_LOGS);
        createSoulCampfireRecipe(exporter, ModBlocks.CRIMSON_SOUL_CAMPFIRE, ItemTags.CRIMSON_STEMS);
        createSoulCampfireRecipe(exporter, ModBlocks.DARK_OAK_SOUL_CAMPFIRE, ItemTags.DARK_OAK_LOGS);
        createSoulCampfireRecipe(exporter, ModBlocks.JUNGLE_SOUL_CAMPFIRE, ItemTags.JUNGLE_LOGS);
        createSoulCampfireRecipe(exporter, ModBlocks.MANGROVE_SOUL_CAMPFIRE, ItemTags.MANGROVE_LOGS);
        createSoulCampfireRecipe(exporter, ModBlocks.SPRUCE_SOUL_CAMPFIRE, ItemTags.SPRUCE_LOGS);
        createSoulCampfireRecipe(exporter, ModBlocks.WARPED_SOUL_CAMPFIRE, ItemTags.WARPED_STEMS);
    }

    private void createCampfireRecipe(RecipeOutput exporter, Block result, TagKey<Item> log) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, result)
                .define('L', log).define('S', Items.STICK).define('C', ItemTags.COALS)
                .pattern(" S ").pattern("SCS").pattern("LLL")
                .unlockedBy("has_stick", has(Items.STICK))
                .unlockedBy("has_coal", has(ItemTags.COALS))
                .save(exporter);
    }

    private void createSoulCampfireRecipe(RecipeOutput exporter, Block result, TagKey<Item> log) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, result)
                .define('L', log).define('S', Items.STICK).define('#', ItemTags.SOUL_FIRE_BASE_BLOCKS)
                .pattern(" S ").pattern("S#S").pattern("LLL")
                .unlockedBy("has_soul_sand", has(ItemTags.SOUL_FIRE_BASE_BLOCKS))
                .save(exporter);
    }
}
