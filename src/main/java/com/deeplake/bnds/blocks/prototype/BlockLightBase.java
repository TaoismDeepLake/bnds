package com.deeplake.bnds.blocks.prototype;

import com.deeplake.bnds.blocks.BlockBase;
import net.minecraft.block.material.Material;

public class BlockLightBase extends BlockBase {
    public BlockLightBase(String name, Material materialIn) {
        super(name, materialIn);
        setLightLevel(1.0f);
        setLightOpacity(0);
        setHardness(10);
    }
}
