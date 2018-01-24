package com.irar.ironmetal.handlers;


import java.util.ArrayList;
import java.util.Random;

import com.irar.ironmetal.items.ModItem;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.storage.loot.functions.EnchantRandomly;
import net.minecraft.world.storage.loot.functions.EnchantWithLevels;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemHandler {
	public static ArrayList<Item> allItems = new ArrayList<Item>();
	public static Item AluminumIngot;
	public static Item SilvadriumIngot;
	public static Item ShroomiteIngot;
	public static Item SilvadriumHammer;
	public static Item ShroomiteHammer;
	public static Item IrONDust;
	public static Item IQuartz;
	public static Item DarkQuartz;
	
	public static Item DetriminiumIngot;
	
	public static void init(){
		AluminumIngot = new ModItem("aluminum_ingot");
		SilvadriumIngot = new ModItem("silvadrium_ingot");
		ShroomiteIngot = new ModItem("shroomite_ingot");
		SilvadriumHammer = new ModItem("silvadrium_hammer");
		ShroomiteHammer = new ModItem("shroomite_hammer");
		IrONDust = new ModItem("iron_dust");
		IQuartz = new ModItem("industrial_quartz");
		DarkQuartz = new ModItem("dark_quartz");

		SilvadriumHammer.setContainerItem(SilvadriumHammer);
		ShroomiteHammer.setContainerItem(ShroomiteHammer);
		
		
		allItems.add(AluminumIngot);
		allItems.add(SilvadriumIngot);
		allItems.add(ShroomiteIngot);
		allItems.add(SilvadriumHammer);
		allItems.add(ShroomiteHammer);
		allItems.add(IrONDust);
		allItems.add(IQuartz);
		allItems.add(DarkQuartz);
		
		if(Loader.isModLoaded("mores")){
			DetriminiumIngot = new ModItem("detriminium_ingot");
			allItems.add(DetriminiumIngot);
		}
		
	}
	
	public static void register(){
		 for(int i = 0; i < allItems.size(); i++){
			 ForgeRegistries.ITEMS.register(allItems.get(i));
		 }
	}
	
	public static void registerRenders(){
		 for(int i = 0; i < allItems.size(); i++){
			 registerRender(allItems.get(i));
		 }
	}
	
	public static void registerRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
