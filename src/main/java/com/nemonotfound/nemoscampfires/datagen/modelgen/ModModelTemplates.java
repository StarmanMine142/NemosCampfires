package com.nemonotfound.nemoscampfires.datagen.modelgen;

import net.minecraft.data.models.model.ModelTemplate;
import net.minecraft.data.models.model.TextureSlot;
import net.minecraft.resources.ResourceLocation;

import java.util.Optional;

public class ModModelTemplates {

    public static final ModelTemplate CAMPFIRE = create("template_campfire", TextureSlot.FIRE, TextureSlot.LIT_LOG, ModTextureSlot.LOG, TextureSlot.PARTICLE);
    public static final ModelTemplate CAMPFIRE_OFF = create("campfire_off", ModTextureSlot.LOG, TextureSlot.PARTICLE);

    private static ModelTemplate create(String string, TextureSlot... textureSlots) {
        return new ModelTemplate(Optional.of(ResourceLocation.withDefaultNamespace("block/" + string)), Optional.empty(), textureSlots);
    }
}
