package com.irar.iron.items;

import java.util.List;

import com.irar.iron.handlers.CreativeTabHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MetaItem extends Item{
	
	public MetaItem(String name, int meta){
		super();
		this.setHasSubtypes(true);
		this.setUnlocalizedName(name + meta);
		this.setRegistryName(name + meta);
		this.setCreativeTab(CreativeTabHandler.IRON_STUFF);
	}
	
}
