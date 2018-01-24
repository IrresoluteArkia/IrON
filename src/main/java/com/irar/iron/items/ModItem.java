package com.irar.iron.items;

import com.irar.iron.handlers.CreativeTabHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModItem extends Item{
	public ModItem(String name){
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabHandler.IRON_STUFF);
	}
	
	public ModItem(String name, Item containerItem){
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabHandler.IRON_STUFF);
		setContainerItem(containerItem);
	}
	
	public ModItem(String name, int stacksize){
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabHandler.IRON_STUFF);
		setMaxStackSize(stacksize);
	}
}
