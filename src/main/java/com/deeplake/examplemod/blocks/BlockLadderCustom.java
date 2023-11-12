package com.deeplake.examplemod.blocks;

import com.deeplake.examplemod.RegisterUtil;
import net.minecraft.block.BlockLadder;

public class BlockLadderCustom extends BlockLadder {
    public BlockLadderCustom() {
        RegisterUtil.initBlock(this, "test_ladder");
    }
}
