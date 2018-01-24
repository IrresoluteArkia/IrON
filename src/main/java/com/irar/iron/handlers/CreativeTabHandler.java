package com.irar.iron.handlers;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTabHandler {
	public static CreativeTabs IRON_STUFF = new CreativeTabs("iron_stuff"){

		public ItemStack getTabIconItem() {
			return new ItemStack(ItemHandler.IrON);
		}
		
	};
}
