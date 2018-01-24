package com.irar.ironmetal.handlers;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CreativeTabHandler {
	public static CreativeTabs IRON_METAL_STUFF = new CreativeTabs("iron_metal_stuff"){

		public ItemStack getTabIconItem() {
			return new ItemStack(ItemHandler.SilvadriumIngot);
		}
		
	};
}
