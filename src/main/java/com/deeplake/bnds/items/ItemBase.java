package com.deeplake.bnds.items;

import com.deeplake.bnds.ModTabs;
import com.deeplake.bnds.RegisterUtil;
import net.minecraft.item.Item;

public class ItemBase extends Item {

    public ItemBase(String name)
    {
        super();
        RegisterUtil.initItem(this, name);
        setCreativeTab(ModTabs.TAB1);
    }

}
