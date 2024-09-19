package com.nemonotfound.nemoscampfires;

import com.nemonotfound.nemoscampfires.block.ModBlocks;
import com.nemonotfound.nemoscampfires.entity.ModEntities;
import com.nemonotfound.nemoscampfires.entity.renderer.CustomCampfireBlockEntityRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;

public class NemosCampfiresClient implements ClientModInitializer {
    
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ACACIA_CAMPFIRE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BIRCH_CAMPFIRE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHERRY_CAMPFIRE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CRIMSON_CAMPFIRE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DARK_OAK_CAMPFIRE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.JUNGLE_CAMPFIRE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MANGROVE_CAMPFIRE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SPRUCE_CAMPFIRE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WARPED_CAMPFIRE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ACACIA_SOUL_CAMPFIRE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BIRCH_SOUL_CAMPFIRE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHERRY_SOUL_CAMPFIRE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CRIMSON_SOUL_CAMPFIRE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DARK_OAK_SOUL_CAMPFIRE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.JUNGLE_SOUL_CAMPFIRE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MANGROVE_SOUL_CAMPFIRE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SPRUCE_SOUL_CAMPFIRE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WARPED_SOUL_CAMPFIRE, RenderType.cutout());


        BlockEntityRenderers.register(ModEntities.CUSTOM_CAMPFIRE_BLOCK_ENTITY, CustomCampfireBlockEntityRenderer::new);
    }
}
