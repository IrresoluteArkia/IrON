package com.irar.ironmetal.items;


import com.irar.ironmetal.handlers.CreativeTabHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModItem extends Item{
	public ModItem(String name){
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabHandler.IRON_METAL_STUFF);
	}
	
	public ModItem(String name, Item containerItem){
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabHandler.IRON_METAL_STUFF);
		setContainerItem(containerItem);
	}
	
	public ModItem(String name, int stacksize){
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabHandler.IRON_METAL_STUFF);
		setMaxStackSize(stacksize);
	}
}
