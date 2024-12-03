package com.nemonotfound.nemoscampfires.datagen.modelgen;

import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.world.level.block.Block;

import static net.minecraft.client.data.models.model.TextureMapping.getBlockTexture;


public class ModTextureMapping {

    public static TextureMapping campfire(Block campfireVariant, Block campfire) {
        return new TextureMapping()
                .put(TextureSlot.LIT_LOG, getBlockTexture(campfireVariant, "_log_lit"))
                .put(TextureSlot.FIRE, getBlockTexture(campfire, "_fire"))
                .put(ModTextureSlot.LOG, getBlockTexture(campfireVariant, "_log"))
                .put(TextureSlot.PARTICLE, getBlockTexture(campfireVariant, "_log"));
    }

    public static TextureMapping soulCampfire(Block soulCampfireVariant, Block campfireVariant, Block campfire) {
        return new TextureMapping()
                .put(TextureSlot.LIT_LOG, getBlockTexture(soulCampfireVariant, "_log_lit"))
                .put(TextureSlot.FIRE, getBlockTexture(campfire, "_fire"))
                .put(ModTextureSlot.LOG, getBlockTexture(campfireVariant, "_log"))
                .put(TextureSlot.PARTICLE, getBlockTexture(campfireVariant, "_log"));
    }

    public static TextureMapping campfireOff(Block campfireVariant) {
        return new TextureMapping()
                .put(ModTextureSlot.LOG, getBlockTexture(campfireVariant, "_log"))
                .put(TextureSlot.PARTICLE, getBlockTexture(campfireVariant, "_log"));
    }
}
