package com.irar.iron.blocks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.irar.iron.handlers.CreativeTabHandler;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;

public class BlockDyeGen extends ModBlock implements IOreGen{
	public BlockDyeGen(Material mat, String name, float hardness, float resistance){
		super(mat, name, hardness, resistance);
	}

	@Override
	public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient) {
		return true;
	}

	@Override
	public boolean canUseIron(World worldIn, Random rand, BlockPos pos, IBlockState state) {
		return true;
	}

	@Override
	public void grow(World worldIn, Random rand, BlockPos pos, IBlockState state) {
		String[] names = OreDictionary.getOreNames();
		ArrayList<String> dyenames = new ArrayList<String>();
		ArrayList<ItemStack> alldyes = new ArrayList<ItemStack>();
		for(int i = 0; i < names.length; i++){
			if(names[i].startsWith("dye")){
				dyenames.add(names[i]);
				NonNullList<ItemStack> dyes = OreDictionary.getOres(names[i]);
				for(int j = 0; j < dyes.size(); j++){
					if(dyes.get(j).getMetadata() != OreDictionary.WILDCARD_VALUE) {
						alldyes.add(dyes.get(j));
					}
				}
			}
		}
		int num = rand.nextInt(alldyes.size());
		alldyes.get(num).setCount(1);
		spawnAsEntity(worldIn, pos, alldyes.get(num));
	}
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn){
		
		tooltip.add("Feed me IrON!!!");
		
		super.addInformation(stack, worldIn, tooltip, flagIn);
	}

}
