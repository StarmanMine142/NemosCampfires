package com.nemonotfound.nemoscampfires.interfaces;

import net.minecraft.world.level.block.Block;

public interface BlockEntityTypeSupportedBlockAdder {

    default void nemo_sCampfires$addSupportedBlock(Block block) {}
}
