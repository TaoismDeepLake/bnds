package com.deeplake.examplemod.blocks;

import com.deeplake.examplemod.Idealland;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(modid = Idealland.MODID)
public class RegisterBlocks {

    public static final List<Block> BLOCK_LIST = new ArrayList<>();

    public static final Block BLOCK_1 = new BlockBase("block_1",Material.ROCK);


    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        event.getRegistry().registerAll(BLOCK_LIST.toArray(new Block[0]));
    }
}
