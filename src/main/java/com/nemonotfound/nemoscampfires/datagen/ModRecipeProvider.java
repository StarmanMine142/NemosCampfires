package com.nemonotfound.nemoscampfires.datagen;

import com.nemonotfound.nemoscampfires.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
        return new RecipeProvider(provider, recipeOutput) {
            @Override
            public void buildRecipes() {
                createCampfireRecipe(ModBlocks.ACACIA_CAMPFIRE, ItemTags.ACACIA_LOGS);
                createCampfireRecipe(ModBlocks.BIRCH_CAMPFIRE, ItemTags.BIRCH_LOGS);
                createCampfireRecipe(ModBlocks.CHERRY_CAMPFIRE, ItemTags.CHERRY_LOGS);
                createCampfireRecipe(ModBlocks.CRIMSON_CAMPFIRE, ItemTags.CRIMSON_STEMS);
                createCampfireRecipe(ModBlocks.DARK_OAK_CAMPFIRE, ItemTags.DARK_OAK_LOGS);
                createCampfireRecipe(ModBlocks.JUNGLE_CAMPFIRE, ItemTags.JUNGLE_LOGS);
                createCampfireRecipe(ModBlocks.MANGROVE_CAMPFIRE, ItemTags.MANGROVE_LOGS);
                createCampfireRecipe(ModBlocks.SPRUCE_CAMPFIRE, ItemTags.SPRUCE_LOGS);
                createCampfireRecipe(ModBlocks.WARPED_CAMPFIRE, ItemTags.WARPED_STEMS);

                createSoulCampfireRecipe(ModBlocks.ACACIA_SOUL_CAMPFIRE, ItemTags.ACACIA_LOGS);
                createSoulCampfireRecipe(ModBlocks.BIRCH_SOUL_CAMPFIRE, ItemTags.BIRCH_LOGS);
                createSoulCampfireRecipe(ModBlocks.CHERRY_SOUL_CAMPFIRE, ItemTags.CHERRY_LOGS);
                createSoulCampfireRecipe(ModBlocks.CRIMSON_SOUL_CAMPFIRE, ItemTags.CRIMSON_STEMS);
                createSoulCampfireRecipe(ModBlocks.DARK_OAK_SOUL_CAMPFIRE, ItemTags.DARK_OAK_LOGS);
                createSoulCampfireRecipe(ModBlocks.JUNGLE_SOUL_CAMPFIRE, ItemTags.JUNGLE_LOGS);
                createSoulCampfireRecipe(ModBlocks.MANGROVE_SOUL_CAMPFIRE, ItemTags.MANGROVE_LOGS);
                createSoulCampfireRecipe(ModBlocks.SPRUCE_SOUL_CAMPFIRE, ItemTags.SPRUCE_LOGS);
                createSoulCampfireRecipe(ModBlocks.WARPED_SOUL_CAMPFIRE, ItemTags.WARPED_STEMS);
            }

            private void createCampfireRecipe(Block result, TagKey<Item> log) {
                this.shaped(RecipeCategory.DECORATIONS, result)
                        .define('L', log).define('S', Items.STICK).define('C', ItemTags.COALS)
                        .pattern(" S ").pattern("SCS").pattern("LLL")
                        .unlockedBy("has_stick", has(Items.STICK))
                        .unlockedBy("has_coal", has(ItemTags.COALS))
                        .group("campfires")
                        .save(this.output);
            }

            private void createSoulCampfireRecipe(Block result, TagKey<Item> log) {
                this.shaped(RecipeCategory.DECORATIONS, result)
                        .define('L', log).define('S', Items.STICK).define('#', ItemTags.SOUL_FIRE_BASE_BLOCKS)
                        .pattern(" S ").pattern("S#S").pattern("LLL")
                        .unlockedBy("has_soul_sand", has(ItemTags.SOUL_FIRE_BASE_BLOCKS))
                        .group("soul_campfires")
                        .save(this.output);
            }
        };
    }

    @Override
    public @NotNull String getName() {
        return "Nemo's Campfires Recipes";
    }
}
