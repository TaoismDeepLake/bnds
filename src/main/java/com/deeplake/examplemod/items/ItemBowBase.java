package com.deeplake.examplemod.items;

import com.deeplake.examplemod.ModTabs;
import com.deeplake.examplemod.RegisterUtil;
import net.minecraft.item.ItemBow;

public class ItemBowBase extends ItemBow {
    public ItemBowBase(String name) {
        super();
        RegisterUtil.initItem(this, name);
        setCreativeTab(ModTabs.TAB1);
    }
}
