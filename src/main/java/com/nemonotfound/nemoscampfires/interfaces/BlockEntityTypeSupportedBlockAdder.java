package com.nemonotfound.nemoscampfires.interfaces;

import net.minecraft.world.level.block.Block;

public interface BlockEntityTypeSupportedBlockAdder {

    default void addSupportedBlock(Block block) {}
}
