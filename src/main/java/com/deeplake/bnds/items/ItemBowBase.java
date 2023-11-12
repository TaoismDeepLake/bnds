package com.deeplake.bnds.items;

import com.deeplake.bnds.ModTabs;
import com.deeplake.bnds.RegisterUtil;
import net.minecraft.item.ItemBow;

public class ItemBowBase extends ItemBow {
    public ItemBowBase(String name) {
        super();
        RegisterUtil.initItem(this, name);
        setCreativeTab(ModTabs.TAB1);
    }
}
