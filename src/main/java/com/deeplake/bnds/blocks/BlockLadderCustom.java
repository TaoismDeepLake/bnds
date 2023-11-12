package com.deeplake.bnds.blocks;

import com.deeplake.bnds.RegisterUtil;
import net.minecraft.block.BlockLadder;

public class BlockLadderCustom extends BlockLadder {
    public BlockLadderCustom() {
        RegisterUtil.initBlock(this, "test_ladder");
    }
}
