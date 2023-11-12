package com.deeplake.bnds.blocks;

import com.deeplake.bnds.Idealland;
import com.deeplake.bnds.blocks.prototype.BlockIndestructibleBase;
import com.deeplake.bnds.blocks.prototype.BlockLightBase;
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

    public static final String[] BASE_COLOR_NAME =
            {
                    "red",
                    "green",
                    "blue",
                    "orange",
                    "gray",
                    "black"
            };

    public static final Block[] BASE_COLOR =
            {
                    new BlockBase("color_"+BASE_COLOR_NAME[1],Material.ROCK),
                    new BlockBase("color_"+BASE_COLOR_NAME[2],Material.ROCK),
                    new BlockBase("color_"+BASE_COLOR_NAME[3],Material.ROCK),
                    new BlockBase("color_"+BASE_COLOR_NAME[4],Material.ROCK),
                    new BlockBase("color_"+BASE_COLOR_NAME[5],Material.ROCK),
                    new BlockBase("color_"+BASE_COLOR_NAME[6],Material.ROCK)
            };

    public static final Block[] INDES_COLOR =
            {
                    new BlockIndestructibleBase("indes_"+BASE_COLOR_NAME[1],Material.ROCK),
                    new BlockIndestructibleBase("indes_"+BASE_COLOR_NAME[2],Material.ROCK),
                    new BlockIndestructibleBase("indes_"+BASE_COLOR_NAME[3],Material.ROCK),
                    new BlockIndestructibleBase("indes_"+BASE_COLOR_NAME[4],Material.ROCK),
                    new BlockIndestructibleBase("indes_"+BASE_COLOR_NAME[5],Material.ROCK),
                    new BlockIndestructibleBase("indes_"+BASE_COLOR_NAME[6],Material.ROCK)
            };

    public static final Block[] LIGHT_COLOR =
            {
                    new BlockLightBase("light_"+BASE_COLOR_NAME[1],Material.ROCK),
                    new BlockLightBase("light_"+BASE_COLOR_NAME[2],Material.ROCK),
                    new BlockLightBase("light_"+BASE_COLOR_NAME[3],Material.ROCK),
                    new BlockLightBase("light_"+BASE_COLOR_NAME[4],Material.ROCK),
                    new BlockLightBase("light_"+BASE_COLOR_NAME[5],Material.ROCK),
                    new BlockLightBase("light_"+BASE_COLOR_NAME[6],Material.ROCK)
            };

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        event.getRegistry().registerAll(BLOCK_LIST.toArray(new Block[0]));
    }
}
