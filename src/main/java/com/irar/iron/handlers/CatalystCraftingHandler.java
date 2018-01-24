package com.irar.iron.handlers;

import com.irar.iron.crafting.CraftingTierBiridium;
import com.irar.iron.crafting.CraftingTierDecadrium;
import com.irar.iron.crafting.CraftingTierIridium;
import com.irar.iron.crafting.CraftingTierNonadium;
import com.irar.iron.crafting.CraftingTierOctridium;
import com.irar.iron.crafting.CraftingTierQuadridium;
import com.irar.iron.crafting.CraftingTierQuintridium;
import com.irar.iron.crafting.CraftingTierSeptridium;
import com.irar.iron.crafting.CraftingTierTriridium;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class CatalystCraftingHandler {
	public static void init(){
		CraftingTierIridium.getInstance().addRecipe(new ItemStack(Items.APPLE), new Object[]{ItemStack.EMPTY, ItemStack.EMPTY, ItemStack.EMPTY, ItemStack.EMPTY, new ItemStack(Blocks.DIRT), ItemStack.EMPTY, ItemStack.EMPTY, ItemStack.EMPTY, ItemStack.EMPTY});
		CraftingTierIridium.getInstance().addRecipe(new ItemStack(Blocks.CLAY, 2), new Object[]{ItemStack.EMPTY, Blocks.SAND, ItemStack.EMPTY, Blocks.SAND, ItemHandler.IrON, Blocks.SAND, ItemStack.EMPTY, Blocks.SAND, ItemStack.EMPTY});
		CraftingTierIridium.getInstance().addRecipe(new ItemStack(BlockHandler.IridiumBrick, 32), new Object[]{ItemStack.EMPTY, new ItemStack(ItemHandler.IridiumIngot), ItemStack.EMPTY, new ItemStack(ItemHandler.IridiumIngot), ItemStack.EMPTY, new ItemStack(ItemHandler.IridiumIngot), ItemStack.EMPTY, new ItemStack(ItemHandler.IridiumIngot), ItemStack.EMPTY});
		CraftingTierIridium.getInstance().addRecipe(new ItemStack(BlockHandler.GlowIridiumBrick, 8), new Object[]{new ItemStack(BlockHandler.IridiumBrick), new ItemStack(BlockHandler.IridiumBrick), new ItemStack(BlockHandler.IridiumBrick), new ItemStack(BlockHandler.IridiumBrick), new ItemStack(Items.GLOWSTONE_DUST), new ItemStack(BlockHandler.IridiumBrick), new ItemStack(BlockHandler.IridiumBrick), new ItemStack(BlockHandler.IridiumBrick), new ItemStack(BlockHandler.IridiumBrick)});
		CraftingTierIridium.getInstance().addRecipe(new ItemStack(Blocks.STONE, 4, 1), new Object[]{ItemStack.EMPTY, new ItemStack(Blocks.STONE, 1, 0), ItemStack.EMPTY, new ItemStack(Blocks.STONE, 1, 0), ItemStack.EMPTY, new ItemStack(Blocks.STONE, 1, 0), ItemStack.EMPTY, new ItemStack(Blocks.STONE, 1, 0), ItemStack.EMPTY});
		CraftingTierIridium.getInstance().addRecipe(new ItemStack(Blocks.STONE, 4, 3), new Object[]{new ItemStack(Blocks.STONE, 1, 0), ItemStack.EMPTY, new ItemStack(Blocks.STONE, 1, 0), ItemStack.EMPTY, ItemStack.EMPTY, ItemStack.EMPTY, new ItemStack(Blocks.STONE, 1, 0), ItemStack.EMPTY, new ItemStack(Blocks.STONE, 1, 0)});
		CraftingTierIridium.getInstance().addRecipe(new ItemStack(Blocks.STONE, 6, 5), new Object[]{new ItemStack(Blocks.STONE, 1, 0), ItemStack.EMPTY, new ItemStack(Blocks.STONE, 1, 0), new ItemStack(Blocks.STONE, 1, 0), ItemStack.EMPTY, new ItemStack(Blocks.STONE, 1, 0), new ItemStack(Blocks.STONE, 1, 0), ItemStack.EMPTY, new ItemStack(Blocks.STONE, 1, 0)});
		CraftingTierIridium.getInstance().addRecipe(new ItemStack(com.irar.ironmetal.handlers.BlockHandler.DyeGenBlock), new Object[]{"dye", "dye", "dye", "dye", ItemHandler.IridiumIngotP2, "dye", "dye", "dye", "dye"});

		CraftingTierBiridium.getInstance().addRecipe(new ItemStack(Items.GOLD_INGOT), new Object[]{Items.IRON_INGOT, Items.IRON_INGOT, Items.IRON_INGOT, Items.IRON_INGOT, ItemHandler.IrON, Items.IRON_INGOT, Items.IRON_INGOT, Items.IRON_INGOT, Items.IRON_INGOT});
		CraftingTierBiridium.getInstance().addRecipe(new ItemStack(Items.REDSTONE), new Object[]{ItemStack.EMPTY, Blocks.COBBLESTONE, ItemStack.EMPTY, Blocks.COBBLESTONE, ItemHandler.IrON, Blocks.COBBLESTONE, ItemStack.EMPTY, Blocks.COBBLESTONE, ItemStack.EMPTY});
		CraftingTierBiridium.getInstance().addRecipe(new ItemStack(Items.REDSTONE), new Object[]{Blocks.NETHERRACK, Blocks.NETHERRACK, Blocks.NETHERRACK, Blocks.NETHERRACK, ItemHandler.IrON, Blocks.NETHERRACK, Blocks.NETHERRACK, Blocks.NETHERRACK, Blocks.NETHERRACK});
		CraftingTierBiridium.getInstance().addRecipe(new ItemStack(ItemHandler.TinIngot, 8), new Object[]{ItemHandler.IrON, Items.IRON_INGOT, ItemHandler.IrON, Items.IRON_INGOT, ItemHandler.IridiumIngotP2, Items.IRON_INGOT, ItemHandler.IrON, Items.IRON_INGOT, ItemHandler.IrON});
		CraftingTierBiridium.getInstance().addRecipe(new ItemStack(ItemHandler.LeadIngot, 4), new Object[]{ItemHandler.IrON, "ingotSilver", ItemHandler.IrON, "dyePink", Blocks.OBSIDIAN, "dyePink", ItemHandler.IrON, "ingotSilver", ItemHandler.IrON});
		CraftingTierBiridium.getInstance().addRecipe(new ItemStack(com.irar.ironmetal.handlers.ItemHandler.SilvadriumIngot, 5), new Object[]{ItemHandler.IrON, ItemHandler.IridiumIngotP3, ItemHandler.IrON, "ingotSilver", ItemHandler.IridiumIngotP3, "ingotLead", ItemHandler.IrON, ItemHandler.IridiumIngotP3, ItemHandler.IrON});
		CraftingTierBiridium.getInstance().addRecipe(new ItemStack(Blocks.MOSSY_COBBLESTONE, 4), new Object[]{Blocks.COBBLESTONE, Blocks.TALLGRASS, Blocks.COBBLESTONE, Blocks.TALLGRASS, ItemHandler.IrON, Blocks.TALLGRASS, Blocks.COBBLESTONE, Blocks.TALLGRASS, Blocks.COBBLESTONE});
		CraftingTierBiridium.getInstance().addRecipe(new ItemStack(com.irar.ironmetal.handlers.ItemHandler.IQuartz, 3), new Object[]{ItemHandler.IrON, Items.REDSTONE, ItemStack.EMPTY, Items.REDSTONE, Items.QUARTZ, Items.REDSTONE, ItemStack.EMPTY, Items.REDSTONE, ItemHandler.IrON});
		
		CraftingTierTriridium.getInstance().addRecipe(new ItemStack(Items.DIAMOND), new Object[]{ItemHandler.IrON, Items.GOLD_INGOT, ItemHandler.IrON, Items.GOLD_INGOT, Blocks.COAL_BLOCK, Items.GOLD_INGOT, ItemHandler.IrON, Items.GOLD_INGOT, ItemHandler.IrON});
		CraftingTierTriridium.getInstance().addRecipe(new ItemStack(ItemHandler.CopperIngot, 4), new Object[]{ItemHandler.IrON, Items.IRON_INGOT, ItemHandler.IrON, Items.REDSTONE, ItemHandler.IridiumIngot, Items.REDSTONE, ItemHandler.IrON, Items.IRON_INGOT, ItemHandler.IrON});
		CraftingTierTriridium.getInstance().addRecipe(new ItemStack(ItemHandler.CopperIngot, 4), new Object[]{ItemHandler.IrON, Items.REDSTONE, ItemHandler.IrON, Items.IRON_INGOT, ItemHandler.IridiumIngot, Items.IRON_INGOT, ItemHandler.IrON, Items.REDSTONE, ItemHandler.IrON});
		CraftingTierTriridium.getInstance().addRecipe(new ItemStack(ItemHandler.SilverIngot, 4), new Object[]{ItemHandler.IrON, "ingotCopper", ItemHandler.IrON, "dyeBlue", Items.GOLD_INGOT, "dyeBlue", ItemHandler.IrON, "ingotCopper", ItemHandler.IrON});
		CraftingTierTriridium.getInstance().addRecipe(new ItemStack(ItemHandler.NickelIngot, 4), new Object[]{ItemHandler.IrON, Items.IRON_INGOT, ItemHandler.IrON, "dyeYellow", Items.IRON_INGOT, "dyeYellow", ItemHandler.IrON, Items.IRON_INGOT, ItemHandler.IrON});
		CraftingTierTriridium.getInstance().addRecipe(new ItemStack(com.irar.ironmetal.handlers.ItemHandler.AluminumIngot, 2), new Object[]{ItemStack.EMPTY, Items.GLOWSTONE_DUST, ItemStack.EMPTY, Items.IRON_INGOT, ItemHandler.IrON, Items.IRON_INGOT, ItemStack.EMPTY, Items.GLOWSTONE_DUST, ItemStack.EMPTY});
		CraftingTierTriridium.getInstance().addRecipe(new ItemStack(com.irar.ironmetal.handlers.ItemHandler.ShroomiteIngot, 4), new Object[]{ItemHandler.IrON, Blocks.RED_MUSHROOM, ItemHandler.IrON, "dyeBlue", ItemHandler.IridiumIngotP4, "dyeBlue", ItemHandler.IrON, Blocks.BROWN_MUSHROOM, ItemHandler.IrON});
		
		CraftingTierQuadridium.getInstance().addRecipe(new ItemStack(Items.DIAMOND), new Object[]{ItemStack.EMPTY, Items.GOLD_INGOT, ItemStack.EMPTY, Items.GOLD_INGOT, ItemHandler.IrON, Items.GOLD_INGOT, ItemStack.EMPTY, Items.GOLD_INGOT, ItemStack.EMPTY});
		
		CraftingTierQuintridium.getInstance().addRecipe(new ItemStack(Blocks.END_PORTAL_FRAME, 2), new Object[]{ItemStack.EMPTY, new ItemStack(Items.ENDER_EYE), ItemStack.EMPTY, ItemStack.EMPTY, new ItemStack(BlockHandler.IridiumBrick), ItemStack.EMPTY, ItemStack.EMPTY, new ItemStack(Items.DIAMOND), ItemStack.EMPTY});
		CraftingTierQuintridium.getInstance().addRecipe(new ItemStack(com.irar.ironmetal.handlers.BlockHandler.OreGenBlock), new Object[]{"ingotCopper", "ingotSilver", "ingotTin", "ingotLead", ItemHandler.IridiumIngotP5, "ingotNickel", "ingotAluminum", "ingotSilvadrium", "ingotShroomite"});
		
		CraftingTierSeptridium.getInstance().addRecipe(new ItemStack(ItemHandler.FlightChestplate), new Object[]{"crystalCertusQuartz", "gemQuartzBlack", "crystalCertusQuartz", "crystalCertusQuartz", ItemHandler.IridiumIngotP5, "crystalCertusQuartz", "gemQuartzBlack", "crystalCertusQuartz", "gemQuartzBlack"});
		
		CraftingTierDecadrium.getInstance().addRecipe(new ItemStack(Items.NETHER_STAR, 2), new Object[]{ItemStack.EMPTY, ItemStack.EMPTY, ItemStack.EMPTY, ItemStack.EMPTY, Items.NETHER_STAR, ItemStack.EMPTY, ItemStack.EMPTY, ItemStack.EMPTY, ItemStack.EMPTY});

		if(Loader.isModLoaded("mores")){
			CraftingTierOctridium.getInstance().addRecipe(new ItemStack(Blocks.BEACON), new Object[]{ItemHandler.IridiumIngotP2, "ingotCopper", ItemHandler.IridiumIngotP2, "ingotCopper", "oreBlackHole", "ingotCopper", ItemHandler.IridiumIngotP2, "ingotCopper", ItemHandler.IridiumIngotP2});
			CraftingTierQuadridium.getInstance().addRecipe(new ItemStack(Items.ENDER_PEARL), new Object[]{ItemStack.EMPTY, Items.EMERALD, ItemStack.EMPTY, ItemStack.EMPTY, ItemHandler.IrON, ItemStack.EMPTY, ItemStack.EMPTY, "oreBlackHole", ItemStack.EMPTY});
			CraftingTierNonadium.getInstance().addRecipe(new ItemStack(com.irar.ironmetal.handlers.ItemHandler.DetriminiumIngot, 1), new Object[]{"ingotIsaxiwukou", "ingotEninaz", "ingotEniri", "ingotIvio", ItemHandler.IridiumIngotP6, "ingotEterixud", ItemStack.EMPTY, "ingotNowyvio", ItemStack.EMPTY});
			Item blackHoleOre = OreDictionary.getOres("oreBlackHole").get(0).getItem();
			if(Loader.isModLoaded("arcrops")){
				CraftingTierQuadridium.getInstance().addRecipe(new ItemStack(blackHoleOre), new Object[]{ItemStack.EMPTY, Items.GOLD_INGOT, ItemStack.EMPTY, Items.EMERALD, ItemHandler.IridiumIngotP2, "oreMagmite", ItemStack.EMPTY, Items.GOLD_INGOT, ItemStack.EMPTY});
			}else{
				CraftingTierQuadridium.getInstance().addRecipe(new ItemStack(blackHoleOre), new Object[]{"fiberWood", Items.GOLD_INGOT, "fiberWood", Items.EMERALD, ItemHandler.IridiumIngotP2, "oreMagmite", "fiberWood", Items.GOLD_INGOT, "fiberWood"});
			}
		}else{
			CraftingTierOctridium.getInstance().addRecipe(new ItemStack(Blocks.BEACON), new Object[]{ItemHandler.IridiumIngotP2, "ingotCopper", ItemHandler.IridiumIngotP2, "ingotCopper", Blocks.DIAMOND_BLOCK, "ingotCopper", ItemHandler.IridiumIngotP2, "ingotCopper", ItemHandler.IridiumIngotP2});
			CraftingTierQuadridium.getInstance().addRecipe(new ItemStack(Items.ENDER_PEARL), new Object[]{ItemStack.EMPTY, Items.EMERALD, ItemStack.EMPTY, ItemStack.EMPTY, ItemHandler.IrON, ItemStack.EMPTY, ItemStack.EMPTY, "oreMagmite", ItemStack.EMPTY});
		}
		
		if(Loader.isModLoaded("arcrops")){
			CraftingTierQuadridium.getInstance().addRecipe(new ItemStack(Items.EMERALD), new Object[]{ItemStack.EMPTY, "fruitSavilior", ItemStack.EMPTY, "fruitLimarion", ItemHandler.IrON, "fruitInstis", ItemStack.EMPTY, "fiberWood", ItemStack.EMPTY});
			CraftingTierIridium.getInstance().addRecipe(new ItemStack(Items.DYE, 5, 4), new Object[]{ItemStack.EMPTY, Items.REDSTONE, ItemStack.EMPTY, "fiberWood", "fiberWood", "fiberWood", ItemStack.EMPTY, Items.REDSTONE, ItemStack.EMPTY});
		}else{
			CraftingTierQuadridium.getInstance().addRecipe(new ItemStack(Items.EMERALD), new Object[]{Items.REDSTONE, "gemQuartzBlack", Items.REDSTONE, "gemQuartzBlack", ItemHandler.IrON, "gemQuartzBlack", Items.REDSTONE, "gemQuartzBlack", Items.REDSTONE});
			CraftingTierIridium.getInstance().addRecipe(new ItemStack(Items.DYE, 5, 4), new Object[]{ItemStack.EMPTY, Items.REDSTONE, ItemStack.EMPTY, "dyeWhite", "dyeWhite", "dyeWhite", ItemStack.EMPTY, Items.REDSTONE, ItemStack.EMPTY});
		}

	}
}
