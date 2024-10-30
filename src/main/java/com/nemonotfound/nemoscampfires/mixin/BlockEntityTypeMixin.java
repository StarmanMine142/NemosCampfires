package com.nemonotfound.nemoscampfires.mixin;

import com.mojang.datafixers.types.Type;
import com.nemonotfound.nemoscampfires.interfaces.BlockEntityTypeSupportedBlockAdder;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Mixin(BlockEntityType.class)
public class BlockEntityTypeMixin<T extends BlockEntity> implements BlockEntityTypeSupportedBlockAdder {

    @Mutable
    @Shadow
    @Final
    private Set<Block> validBlocks;

    @Inject(method = "<init>", at = @At("RETURN"))
    private void mutableBlocks(BlockEntityType.BlockEntitySupplier blockEntitySupplier, Set set, Type type, CallbackInfo ci) {
        this.validBlocks = new HashSet<>(this.validBlocks);
    }

    @Override
    public void addSupportedBlock(Block block) {
        Objects.requireNonNull(block, "block");
        validBlocks.add(block);
    }
}
