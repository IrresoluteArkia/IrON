package com.irar.ironmetal.blocks;


import com.irar.ironmetal.handlers.CreativeTabHandler;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ModBlock extends Block{
	public ModBlock(Material mat, String name, float hardness, float resistance, int harvest, String tool){
		super(mat);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabHandler.IRON_METAL_STUFF);
		setHardness(hardness);
		setResistance(resistance);
		setHarvestLevel(tool, harvest);
	}

	public ModBlock(Material mat, String name, float hardness, float resistance){
		super(mat);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabHandler.IRON_METAL_STUFF);
		setHardness(hardness);
		setResistance(resistance);
	}
}
