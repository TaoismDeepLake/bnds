package com.deeplake.examplemod.items;

import com.deeplake.examplemod.ModTabs;
import com.deeplake.examplemod.RegisterUtil;
import net.minecraft.item.Item;

public class ItemBase extends Item {

    public ItemBase(String name)
    {
        super();
        RegisterUtil.initItem(this, name);
        setCreativeTab(ModTabs.TAB1);
    }

}
