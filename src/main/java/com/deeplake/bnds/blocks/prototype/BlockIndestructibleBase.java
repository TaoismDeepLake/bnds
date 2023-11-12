package com.deeplake.bnds.blocks.prototype;

import com.deeplake.bnds.blocks.BlockBase;
import net.minecraft.block.material.Material;

public class BlockIndestructibleBase extends BlockBase
{
    public BlockIndestructibleBase(String name, Material materialIn)
    {
        super(name, materialIn);
        setBlockUnbreakable();
    }
}
