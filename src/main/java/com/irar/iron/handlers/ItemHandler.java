package com.irar.iron.handlers;

import java.util.ArrayList;

import com.irar.iron.items.ItemCatalyst;
import com.irar.iron.items.ItemFlyChestplate;
import com.irar.iron.items.ItemHammer;
import com.irar.iron.items.ItemIrON;
import com.irar.iron.items.ItemIridiumIngot;
import com.irar.iron.items.ItemODIngot;
import com.irar.iron.items.ModItem;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemHandler {
	public static Item IrON;
	public static Item IridiumIngot;
	public static Item IridiumIngotP2;
	public static Item IridiumIngotP3;
	public static Item IridiumIngotP4;
	public static Item IridiumIngotP5;
	public static Item IridiumIngotP6;
	public static Item IridiumIngotP7;
	public static Item IridiumIngotP8;
	public static Item IridiumIngotP9;
	public static Item IridiumIngotP10;
	public static Item IridiumC;
	public static Item BiridiumC;
	public static Item TriridiumC;
	public static Item QuadridiumC;
	public static Item QuintridiumC;
	public static Item SextridiumC;
	public static Item SeptridiumC;
	public static Item OctridiumC;
	public static Item NonadiumC;
	public static Item DecadriumC;
	public static Item CopperIngot;
	public static Item SilverIngot;
	public static Item TinIngot;
	public static Item LeadIngot;
	public static Item NickelIngot;
	public static Item StoneHammer;
	public static Item CoalFragment;
	public static Item FlightChestplate;
	private boolean test;
	
	public static ArrayList<Item> allItems = new ArrayList<Item>();
	public static void init(){
		IrON = new ItemIrON("IrON");
		IridiumIngot = new ItemIridiumIngot("IridiumIngot", 0);
		IridiumIngotP2 = new ItemIridiumIngot("IridiumIngot", 1);
		IridiumIngotP3 = new ItemIridiumIngot("IridiumIngot", 2);
		IridiumIngotP4 = new ItemIridiumIngot("IridiumIngot", 3);
		IridiumIngotP5 = new ItemIridiumIngot("IridiumIngot", 4);
		IridiumIngotP6 = new ItemIridiumIngot("IridiumIngot", 5);
		IridiumIngotP7 = new ItemIridiumIngot("IridiumIngot", 6);
		IridiumIngotP8 = new ItemIridiumIngot("IridiumIngot", 7);
		IridiumIngotP9 = new ItemIridiumIngot("IridiumIngot", 8);
		IridiumIngotP10 = new ItemIridiumIngot("IridiumIngot", 9);
		IridiumC = new ItemCatalyst("iridium_catalyst");
		BiridiumC = new ItemCatalyst("biridium_catalyst");
		TriridiumC = new ItemCatalyst("triridium_catalyst");
		QuadridiumC = new ItemCatalyst("quadridium_catalyst");
		QuintridiumC = new ItemCatalyst("quintridium_catalyst");
		SextridiumC = new ItemCatalyst("sextridium_catalyst");
		SeptridiumC = new ItemCatalyst("septridium_catalyst");
		OctridiumC = new ItemCatalyst("octridium_catalyst");
		NonadiumC = new ItemCatalyst("nonadium_catalyst");
		DecadriumC = new ItemCatalyst("decadrium_catalyst");
		CopperIngot = new ItemODIngot("copper_ingot");
		SilverIngot = new ItemODIngot("silver_ingot");
		TinIngot = new ItemODIngot("tin_ingot");
		LeadIngot = new ItemODIngot("lead_ingot");
		NickelIngot = new ItemODIngot("nickel_ingot");
		StoneHammer = new ItemHammer("stone_hammer", 1);
		CoalFragment = new ModItem("coal_fragment");
		FlightChestplate = new ItemFlyChestplate("flight_chestplate");
		
		IridiumC.setContainerItem(IridiumC);
		BiridiumC.setContainerItem(BiridiumC);
		TriridiumC.setContainerItem(TriridiumC);
		QuadridiumC.setContainerItem(QuadridiumC);
		QuintridiumC.setContainerItem(QuintridiumC);
		SextridiumC.setContainerItem(SextridiumC);
		SeptridiumC.setContainerItem(SeptridiumC);
		OctridiumC.setContainerItem(OctridiumC);
		NonadiumC.setContainerItem(NonadiumC);
		DecadriumC.setContainerItem(DecadriumC);
		StoneHammer.setContainerItem(StoneHammer);
		
		allItems.add(IrON);
		allItems.add(IridiumIngot);
		allItems.add(IridiumIngotP2);
		allItems.add(IridiumIngotP3);
		allItems.add(IridiumIngotP4);
		allItems.add(IridiumIngotP5);
		allItems.add(IridiumIngotP6);
		allItems.add(IridiumIngotP7);
		allItems.add(IridiumIngotP8);
		allItems.add(IridiumIngotP9);
		allItems.add(IridiumIngotP10);
		allItems.add(IridiumC);
		allItems.add(BiridiumC);
		allItems.add(TriridiumC);
		allItems.add(QuadridiumC);
		allItems.add(QuintridiumC);
		allItems.add(SextridiumC);
		allItems.add(SeptridiumC);
		allItems.add(OctridiumC);
		allItems.add(NonadiumC);
		allItems.add(DecadriumC);
		allItems.add(CopperIngot);
		allItems.add(SilverIngot);
		allItems.add(TinIngot);
		allItems.add(LeadIngot);
		allItems.add(NickelIngot);
		allItems.add(StoneHammer);
		allItems.add(CoalFragment);
		allItems.add(FlightChestplate);
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
