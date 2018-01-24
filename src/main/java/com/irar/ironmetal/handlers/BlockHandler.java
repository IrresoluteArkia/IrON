package com.irar.ironmetal.handlers;


import com.irar.iron.blocks.BlockDyeGen;
import com.irar.iron.blocks.BlockOreGen;
import com.irar.ironmetal.blocks.ModBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockHandler {
	public static Block NetherMagmiteOre;
	public static Block AluminumBlock;
	public static Block SilvadriumBlock;
	public static Block ShroomiteBlock;
	public static Block OreGenBlock;
	public static Block DyeGenBlock;
	public static ItemBlock ibNetherMagmiteOre;
	public static ItemBlock ibAluminumBlock;
	public static ItemBlock ibSilvadriumBlock;
	public static ItemBlock ibShroomiteBlock;
	public static ItemBlock ibOreGenBlock;
	public static ItemBlock ibDyeGenBlock;
	public static void init(){
		NetherMagmiteOre = new ModBlock(Material.ROCK, "nether_magmite_ore", 1F, 3F);
		AluminumBlock = new ModBlock(Material.ROCK, "aluminum_block", 5F, 15F);
		SilvadriumBlock = new ModBlock(Material.ROCK, "silvadrium_block", 5F, 15F);
		ShroomiteBlock = new ModBlock(Material.ROCK, "shroomite_block", 5F, 15F);
		OreGenBlock = new BlockOreGen(Material.ROCK, "ore_generator", 1F, 15F);
		DyeGenBlock = new BlockDyeGen(Material.ROCK, "dye_generator", 1F, 15F);
		
		ibNetherMagmiteOre = (ItemBlock) new ItemBlock(NetherMagmiteOre);
		ibAluminumBlock = (ItemBlock) new ItemBlock(AluminumBlock);
		ibSilvadriumBlock = (ItemBlock) new ItemBlock(SilvadriumBlock);
		ibShroomiteBlock = (ItemBlock) new ItemBlock(ShroomiteBlock);
		ibOreGenBlock = (ItemBlock) new ItemBlock(OreGenBlock);
		ibDyeGenBlock = (ItemBlock) new ItemBlock(DyeGenBlock);
	}
	
	public static void register(){
		ForgeRegistries.BLOCKS.register(NetherMagmiteOre);
		ForgeRegistries.BLOCKS.register(AluminumBlock);
		ForgeRegistries.BLOCKS.register(SilvadriumBlock);
		ForgeRegistries.BLOCKS.register(ShroomiteBlock);
		ForgeRegistries.BLOCKS.register(OreGenBlock);
		ForgeRegistries.BLOCKS.register(DyeGenBlock);
		
		ibNetherMagmiteOre.setRegistryName(NetherMagmiteOre.getRegistryName());
		ibAluminumBlock.setRegistryName(AluminumBlock.getRegistryName());
		ibSilvadriumBlock.setRegistryName(SilvadriumBlock.getRegistryName());
		ibShroomiteBlock.setRegistryName(ShroomiteBlock.getRegistryName());
		ibOreGenBlock.setRegistryName(OreGenBlock.getRegistryName());
		ibDyeGenBlock.setRegistryName(DyeGenBlock.getRegistryName());

		ForgeRegistries.ITEMS.register(ibNetherMagmiteOre);
		ForgeRegistries.ITEMS.register(ibAluminumBlock);
		ForgeRegistries.ITEMS.register(ibSilvadriumBlock);
		ForgeRegistries.ITEMS.register(ibShroomiteBlock);
		ForgeRegistries.ITEMS.register(ibOreGenBlock);
		ForgeRegistries.ITEMS.register(ibDyeGenBlock);
	}
	
	public static void registerRenders(){
		registerRender(NetherMagmiteOre);
		registerRender(AluminumBlock);
		registerRender(SilvadriumBlock);
		registerRender(ShroomiteBlock);
		registerRender(OreGenBlock);
		registerRender(DyeGenBlock);
		
		ItemHandler.registerRender(ibNetherMagmiteOre);
		ItemHandler.registerRender(ibAluminumBlock);
		ItemHandler.registerRender(ibSilvadriumBlock);
		ItemHandler.registerRender(ibShroomiteBlock);
		ItemHandler.registerRender(ibOreGenBlock);
		ItemHandler.registerRender(ibDyeGenBlock);
	}
	
	public static void registerRender(Block block){
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
