package com.irar.iron.handlers;

import com.irar.iron.blocks.BlockCatalyst;
import com.irar.iron.blocks.BlockFakeCobble;
import com.irar.iron.blocks.BlockIrONMixture;
import com.irar.iron.blocks.BlockIrONOre;
import com.irar.iron.blocks.BlockIridiumBlock;
import com.irar.iron.blocks.BlockIridiumBrick;

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
	public static Block IrONOre;
	public static Block NetherIrONOre;
	public static Block IrONMixture;
	public static Block IridiumBrick;
	public static Block GlowIridiumBrick;
	public static Block NGlowIridiumBrick;
	public static Block IridiumBlock;
	public static Block BiridiumBlock;
	public static Block TriridiumBlock;
	public static Block QuadridiumBlock;
	public static Block QuintridiumBlock;
	public static Block SextridiumBlock;
	public static Block SeptridiumBlock;
	public static Block OctridiumBlock;
	public static Block NonadiumBlock;
	public static Block DecadriumBlock;
	public static Block FakeCobble;
/*	public static Block IridiumCat;
	public static Block BiridiumCat;
	public static Block TriridiumCat;
	public static Block QuadridiumCat;
	public static Block QuintridiumCat;
	public static Block SextridiumCat;
	public static Block SeptridiumCat;
	public static Block OctridiumCat;
	public static Block NonadiumCat;
	public static Block DecadriumCat;*/
	public static ItemBlock ibIrONOre;
	public static ItemBlock ibNetherIrONOre;
	public static ItemBlock ibIrONMixture;
	public static ItemBlock ibIridiumBrick;
	public static ItemBlock ibGlowIridiumBrick;
	public static ItemBlock ibNGlowIridiumBrick;
	public static ItemBlock ibIridiumBlock;
	public static ItemBlock ibBiridiumBlock;
	public static ItemBlock ibTriridiumBlock;
	public static ItemBlock ibQuadridiumBlock;
	public static ItemBlock ibQuintridiumBlock;
	public static ItemBlock ibSextridiumBlock;
	public static ItemBlock ibSeptridiumBlock;
	public static ItemBlock ibOctridiumBlock;
	public static ItemBlock ibNonadiumBlock;
	public static ItemBlock ibDecadriumBlock;
	public static ItemBlock ibFakeCobble;
	public static void init(){
		IrONOre = new BlockIrONOre(Material.ROCK, "IrON_ore", 5F, 15F, 1, "pickaxe");
		NetherIrONOre = new BlockIrONOre(Material.ROCK, "nether_IrON_ore", 5F, 15F, 1, "pickaxe");
		IrONMixture = new BlockIrONMixture(Material.SAND, "IrON_mixture", 1F, 3F, 0, "shovel");
		IridiumBrick = new BlockIridiumBrick(Material.ROCK, "iridium_brick", 2F, 6F, 0, "pickaxe");
		GlowIridiumBrick = new BlockIridiumBrick(Material.ROCK, "glowing_iridium_brick", 2F, 6F, 0, "pickaxe");
		NGlowIridiumBrick = new BlockIridiumBrick(Material.ROCK, "nglowing_iridium_brick", 2F, 6F, 0, "pickaxe");
		IridiumBlock = new BlockIridiumBlock(Material.ROCK, "iridium_block", 15F, 45F, 0, "pickaxe");
		BiridiumBlock = new BlockIridiumBlock(Material.ROCK, "biridium_block", 30F, 90F, 0, "pickaxe");
		TriridiumBlock = new BlockIridiumBlock(Material.ROCK, "triridium_block", 45F, 135F, 0, "pickaxe");
		QuadridiumBlock = new BlockIridiumBlock(Material.ROCK, "quadridium_block", 60F, 180F, 0, "pickaxe");
		QuintridiumBlock = new BlockIridiumBlock(Material.ROCK, "quintridium_block", 75F, 225F, 0, "pickaxe");
		SextridiumBlock = new BlockIridiumBlock(Material.ROCK, "sextridium_block", 90F, 270F, 0, "pickaxe");
		SeptridiumBlock = new BlockIridiumBlock(Material.ROCK, "septridium_block", 105F, 315F, 0, "pickaxe");
		OctridiumBlock = new BlockIridiumBlock(Material.ROCK, "octridium_block", 120F, 360F, 0, "pickaxe");
		NonadiumBlock = new BlockIridiumBlock(Material.ROCK, "nonadium_block", 135F, 405F, 0, "pickaxe");
		DecadriumBlock = new BlockIridiumBlock(Material.ROCK, "decadrium_block", 150F, 450F, 0, "pickaxe");
		FakeCobble = new BlockFakeCobble(Material.WOOD, "fake_cobble", 1F, 3F);
/*		IridiumCat = new BlockCatalyst(Material.CLAY, "iridium_cat");
		BiridiumCat = new BlockCatalyst(Material.CLAY, "biridium_cat");
		TriridiumCat = new BlockCatalyst(Material.CLAY, "triridium_cat");
		QuadridiumCat = new BlockCatalyst(Material.CLAY, "quadridium_cat");
		QuintridiumCat = new BlockCatalyst(Material.CLAY, "quintridium_cat");
		SextridiumCat = new BlockCatalyst(Material.CLAY, "sextridium_cat");
		SeptridiumCat = new BlockCatalyst(Material.CLAY, "septridium_cat");
		OctridiumCat = new BlockCatalyst(Material.CLAY, "octridium_cat");
		NonadiumCat = new BlockCatalyst(Material.CLAY, "nonadium_cat");
		DecadriumCat = new BlockCatalyst(Material.CLAY, "decadrium_cat");*/
		ibIrONOre = (ItemBlock) new ItemBlock(IrONOre);
		ibNetherIrONOre = (ItemBlock) new ItemBlock(NetherIrONOre);
		ibIrONMixture = (ItemBlock) new ItemBlock(IrONMixture);
		ibIridiumBrick = (ItemBlock) new ItemBlock(IridiumBrick);
		ibGlowIridiumBrick = (ItemBlock) new ItemBlock(GlowIridiumBrick);
		ibNGlowIridiumBrick = (ItemBlock) new ItemBlock(NGlowIridiumBrick);
		ibIridiumBlock = (ItemBlock) new ItemBlock(IridiumBlock);
		ibBiridiumBlock = (ItemBlock) new ItemBlock(BiridiumBlock);
		ibTriridiumBlock = (ItemBlock) new ItemBlock(TriridiumBlock);
		ibQuadridiumBlock = (ItemBlock) new ItemBlock(QuadridiumBlock);
		ibQuintridiumBlock = (ItemBlock) new ItemBlock(QuintridiumBlock);
		ibSextridiumBlock = (ItemBlock) new ItemBlock(SextridiumBlock);
		ibSeptridiumBlock = (ItemBlock) new ItemBlock(SeptridiumBlock);
		ibOctridiumBlock = (ItemBlock) new ItemBlock(OctridiumBlock);
		ibNonadiumBlock = (ItemBlock) new ItemBlock(NonadiumBlock);
		ibDecadriumBlock = (ItemBlock) new ItemBlock(DecadriumBlock);
		ibFakeCobble = (ItemBlock) new ItemBlock(FakeCobble);
		
		GlowIridiumBrick.setLightLevel(1F);
		NGlowIridiumBrick.setLightLevel(1F);
	}
	
	public static void register(){
		ForgeRegistries.BLOCKS.register(IrONOre);
		ForgeRegistries.BLOCKS.register(NetherIrONOre);
		ForgeRegistries.BLOCKS.register(IrONMixture);
		ForgeRegistries.BLOCKS.register(IridiumBrick);
		ForgeRegistries.BLOCKS.register(GlowIridiumBrick);
		ForgeRegistries.BLOCKS.register(NGlowIridiumBrick);
		ForgeRegistries.BLOCKS.register(IridiumBlock);
		ForgeRegistries.BLOCKS.register(BiridiumBlock);
		ForgeRegistries.BLOCKS.register(TriridiumBlock);
		ForgeRegistries.BLOCKS.register(QuadridiumBlock);
		ForgeRegistries.BLOCKS.register(QuintridiumBlock);
		ForgeRegistries.BLOCKS.register(SextridiumBlock);
		ForgeRegistries.BLOCKS.register(SeptridiumBlock);
		ForgeRegistries.BLOCKS.register(OctridiumBlock);
		ForgeRegistries.BLOCKS.register(NonadiumBlock);
		ForgeRegistries.BLOCKS.register(DecadriumBlock);
		ForgeRegistries.BLOCKS.register(FakeCobble);
/*		ForgeRegistries.BLOCKS.register(IridiumCat);
		ForgeRegistries.BLOCKS.register(BiridiumCat);
		ForgeRegistries.BLOCKS.register(TriridiumCat);
		ForgeRegistries.BLOCKS.register(QuadridiumCat);
		ForgeRegistries.BLOCKS.register(QuintridiumCat);
		ForgeRegistries.BLOCKS.register(SextridiumCat);
		ForgeRegistries.BLOCKS.register(SeptridiumCat);
		ForgeRegistries.BLOCKS.register(OctridiumCat);
		ForgeRegistries.BLOCKS.register(NonadiumCat);
		ForgeRegistries.BLOCKS.register(DecadriumCat);*/
		
		ibIrONOre.setRegistryName(IrONOre.getRegistryName());
		ibNetherIrONOre.setRegistryName(NetherIrONOre.getRegistryName());
		ibIrONMixture.setRegistryName(IrONMixture.getRegistryName());
		ibIridiumBrick.setRegistryName(IridiumBrick.getRegistryName());
		ibGlowIridiumBrick.setRegistryName(GlowIridiumBrick.getRegistryName());
		ibNGlowIridiumBrick.setRegistryName(NGlowIridiumBrick.getRegistryName());
		ibIridiumBlock.setRegistryName(IridiumBlock.getRegistryName());
		ibBiridiumBlock.setRegistryName(BiridiumBlock.getRegistryName());
		ibTriridiumBlock.setRegistryName(TriridiumBlock.getRegistryName());
		ibQuadridiumBlock.setRegistryName(QuadridiumBlock.getRegistryName());
		ibQuintridiumBlock.setRegistryName(QuintridiumBlock.getRegistryName());
		ibSextridiumBlock.setRegistryName(SextridiumBlock.getRegistryName());
		ibSeptridiumBlock.setRegistryName(SeptridiumBlock.getRegistryName());
		ibOctridiumBlock.setRegistryName(OctridiumBlock.getRegistryName());
		ibNonadiumBlock.setRegistryName(NonadiumBlock.getRegistryName());
		ibDecadriumBlock.setRegistryName(DecadriumBlock.getRegistryName());
		ibFakeCobble.setRegistryName(FakeCobble.getRegistryName());
		
		ForgeRegistries.ITEMS.register(ibIrONOre);
		ForgeRegistries.ITEMS.register(ibNetherIrONOre);
		ForgeRegistries.ITEMS.register(ibIrONMixture);
		ForgeRegistries.ITEMS.register(ibIridiumBrick);
		ForgeRegistries.ITEMS.register(ibGlowIridiumBrick);
		ForgeRegistries.ITEMS.register(ibNGlowIridiumBrick);
		ForgeRegistries.ITEMS.register(ibIridiumBlock);
		ForgeRegistries.ITEMS.register(ibBiridiumBlock);
		ForgeRegistries.ITEMS.register(ibTriridiumBlock);
		ForgeRegistries.ITEMS.register(ibQuadridiumBlock);
		ForgeRegistries.ITEMS.register(ibQuintridiumBlock);
		ForgeRegistries.ITEMS.register(ibSextridiumBlock);
		ForgeRegistries.ITEMS.register(ibSeptridiumBlock);
		ForgeRegistries.ITEMS.register(ibOctridiumBlock);
		ForgeRegistries.ITEMS.register(ibNonadiumBlock);
		ForgeRegistries.ITEMS.register(ibDecadriumBlock);
		ForgeRegistries.ITEMS.register(ibFakeCobble);
	}
	
	public static void registerRenders(){
		registerRender(IrONOre);
		registerRender(NetherIrONOre);
		registerRender(IrONMixture);
		registerRender(IridiumBrick);
		registerRender(GlowIridiumBrick);
		registerRender(NGlowIridiumBrick);
		registerRender(IridiumBlock);
		registerRender(BiridiumBlock);
		registerRender(TriridiumBlock);
		registerRender(QuadridiumBlock);
		registerRender(QuintridiumBlock);
		registerRender(SextridiumBlock);
		registerRender(SeptridiumBlock);
		registerRender(OctridiumBlock);
		registerRender(NonadiumBlock);
		registerRender(DecadriumBlock);
		registerRender(FakeCobble);
/*		registerRender(IridiumCat);
		registerRender(BiridiumCat);
		registerRender(TriridiumCat);
		registerRender(QuadridiumCat);
		registerRender(QuintridiumCat);
		registerRender(SextridiumCat);
		registerRender(SeptridiumCat);
		registerRender(OctridiumCat);
		registerRender(NonadiumCat);
		registerRender(DecadriumCat);*/
		
		ItemHandler.registerRender(ibIrONOre);
		ItemHandler.registerRender(ibNetherIrONOre);
		ItemHandler.registerRender(ibIrONMixture);
		ItemHandler.registerRender(ibIridiumBrick);
		ItemHandler.registerRender(ibGlowIridiumBrick);
		ItemHandler.registerRender(ibNGlowIridiumBrick);
		ItemHandler.registerRender(ibIridiumBlock);
		ItemHandler.registerRender(ibBiridiumBlock);
		ItemHandler.registerRender(ibTriridiumBlock);
		ItemHandler.registerRender(ibQuadridiumBlock);
		ItemHandler.registerRender(ibQuintridiumBlock);
		ItemHandler.registerRender(ibSextridiumBlock);
		ItemHandler.registerRender(ibSeptridiumBlock);
		ItemHandler.registerRender(ibOctridiumBlock);
		ItemHandler.registerRender(ibNonadiumBlock);
		ItemHandler.registerRender(ibDecadriumBlock);
		ItemHandler.registerRender(ibFakeCobble);
	}
	
	public static void registerRender(Block block){
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
