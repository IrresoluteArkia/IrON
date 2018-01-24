package com.irar.iron.handlers;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class CraftingHandler {
	public static void init(){
		GameRegistry.addShapedRecipe(new ResourceLocation("iron:recipe2"), new ResourceLocation("recipes"), new ItemStack(Item.getItemFromBlock(BlockHandler.IrONMixture), 1), new Object[]{"III", "III", "III", 'I', ItemHandler.IrON});
		GameRegistry.addShapedRecipe(new ResourceLocation("iron:recipe4"), new ResourceLocation("recipes"), new ItemStack(BlockHandler.IridiumBlock), new Object[]{"III", "III", "III", 'I', new ItemStack(ItemHandler.IridiumIngot, 1, 0)});
		GameRegistry.addShapedRecipe(new ResourceLocation("iron:recipe5"), new ResourceLocation("recipes"), new ItemStack(BlockHandler.BiridiumBlock), new Object[]{"III", "III", "III", 'I', new ItemStack(ItemHandler.IridiumIngotP2, 1, 0)});
		GameRegistry.addShapedRecipe(new ResourceLocation("iron:recipe6"), new ResourceLocation("recipes"), new ItemStack(BlockHandler.TriridiumBlock), new Object[]{"III", "III", "III", 'I', new ItemStack(ItemHandler.IridiumIngotP3, 1, 0)});
		GameRegistry.addShapedRecipe(new ResourceLocation("iron:recipe7"), new ResourceLocation("recipes"), new ItemStack(BlockHandler.QuadridiumBlock), new Object[]{"III", "III", "III", 'I', new ItemStack(ItemHandler.IridiumIngotP4, 1, 0)});
		GameRegistry.addShapedRecipe(new ResourceLocation("iron:recipe8"), new ResourceLocation("recipes"), new ItemStack(BlockHandler.QuintridiumBlock), new Object[]{"III", "III", "III", 'I', new ItemStack(ItemHandler.IridiumIngotP5, 1, 0)});
		GameRegistry.addShapedRecipe(new ResourceLocation("iron:recipe9"), new ResourceLocation("recipes"), new ItemStack(BlockHandler.SextridiumBlock), new Object[]{"III", "III", "III", 'I', new ItemStack(ItemHandler.IridiumIngotP6, 1, 0)});
		GameRegistry.addShapedRecipe(new ResourceLocation("iron:recipe10"), new ResourceLocation("recipes"), new ItemStack(BlockHandler.SeptridiumBlock), new Object[]{"III", "III", "III", 'I', new ItemStack(ItemHandler.IridiumIngotP7, 1, 0)});
		GameRegistry.addShapedRecipe(new ResourceLocation("iron:recipe11"), new ResourceLocation("recipes"), new ItemStack(BlockHandler.OctridiumBlock), new Object[]{"III", "III", "III", 'I', new ItemStack(ItemHandler.IridiumIngotP8, 1, 0)});
		GameRegistry.addShapedRecipe(new ResourceLocation("iron:recipe12"), new ResourceLocation("recipes"), new ItemStack(BlockHandler.NonadiumBlock), new Object[]{"III", "III", "III", 'I', new ItemStack(ItemHandler.IridiumIngotP9, 1, 0)});
		GameRegistry.addShapedRecipe(new ResourceLocation("iron:recipe13"), new ResourceLocation("recipes"), new ItemStack(BlockHandler.DecadriumBlock), new Object[]{"III", "III", "III", 'I', new ItemStack(ItemHandler.IridiumIngotP10, 1, 0)});
		GameRegistry.addShapedRecipe(new ResourceLocation("iron:recipe14"), new ResourceLocation("recipes"), new ItemStack(Items.REEDS, 1), new Object[]{"SIS", "SIS", "SIS", 'I', ItemHandler.IrON, 'S', Items.STICK});
		GameRegistry.addShapedRecipe(new ResourceLocation("iron:recipe15"), new ResourceLocation("recipes"), new ItemStack(Items.BONE, 1), new Object[]{"  R", " R ", "R  ", 'R', Items.REEDS});
		GameRegistry.addShapedRecipe(new ResourceLocation("iron:recipe16"), new ResourceLocation("recipes"), new ItemStack(Items.BONE, 1), new Object[]{"R  ", " R ", "  R", 'R', Items.REEDS});
		GameRegistry.addShapedRecipe(new ResourceLocation("iron:recipe17"), new ResourceLocation("recipes"), new ItemStack(Item.getItemFromBlock(Blocks.COAL_BLOCK), 1), new Object[]{"CCC", "CCC", "CCC", 'C', new ItemStack(Items.COAL, 1, 1)});
		GameRegistry.addShapedRecipe(new ResourceLocation("iron:recipe20"), new ResourceLocation("recipes"), new ItemStack(ItemHandler.IridiumIngotP2, 1, 0), new Object[]{"II", "II", 'I', ItemHandler.IridiumIngot});
		GameRegistry.addShapedRecipe(new ResourceLocation("iron:recipe21"), new ResourceLocation("recipes"), new ItemStack(ItemHandler.IridiumIngotP3, 1, 0), new Object[]{"II", "II", 'I', ItemHandler.IridiumIngotP2});
		GameRegistry.addShapedRecipe(new ResourceLocation("iron:recipe22"), new ResourceLocation("recipes"), new ItemStack(ItemHandler.IridiumIngotP4, 1, 0), new Object[]{"II", "II", 'I', ItemHandler.IridiumIngotP3});
		GameRegistry.addShapedRecipe(new ResourceLocation("iron:recipe23"), new ResourceLocation("recipes"), new ItemStack(ItemHandler.IridiumIngotP5, 1, 0), new Object[]{"II", "II", 'I', ItemHandler.IridiumIngotP4});
		GameRegistry.addShapedRecipe(new ResourceLocation("iron:recipe24"), new ResourceLocation("recipes"), new ItemStack(ItemHandler.IridiumIngotP6, 1, 0), new Object[]{"II", "II", 'I', ItemHandler.IridiumIngotP5});
		GameRegistry.addShapedRecipe(new ResourceLocation("iron:recipe25"), new ResourceLocation("recipes"), new ItemStack(ItemHandler.IridiumIngotP7, 1, 0), new Object[]{"II", "II", 'I', ItemHandler.IridiumIngotP6});
		GameRegistry.addShapedRecipe(new ResourceLocation("iron:recipe26"), new ResourceLocation("recipes"), new ItemStack(ItemHandler.IridiumIngotP8, 1, 0), new Object[]{"II", "II", 'I', ItemHandler.IridiumIngotP7});
		GameRegistry.addShapedRecipe(new ResourceLocation("iron:recipe27"), new ResourceLocation("recipes"), new ItemStack(ItemHandler.IridiumIngotP9, 1, 0), new Object[]{"II", "II", 'I', ItemHandler.IridiumIngotP8});
		GameRegistry.addShapedRecipe(new ResourceLocation("iron:recipe28"), new ResourceLocation("recipes"), new ItemStack(ItemHandler.IridiumIngotP10, 1, 0), new Object[]{"II", "II", 'I', ItemHandler.IridiumIngotP9});
		GameRegistry.addShapedRecipe(new ResourceLocation("iron:recipe29"), new ResourceLocation("recipes"), new ItemStack(BlockHandler.FakeCobble, 2), new Object[]{"SSS", "SPS", "SSS", 'S', Items.STICK, 'P', Blocks.PLANKS});
		GameRegistry.addShapedRecipe(new ResourceLocation("iron:recipe30"), new ResourceLocation("recipes"), new ItemStack(Blocks.FURNACE), new Object[]{"SSS", "S S", "SSS", 'S', BlockHandler.FakeCobble});
		GameRegistry.addShapedRecipe(new ResourceLocation("iron:recipe31"), new ResourceLocation("recipes"), new ItemStack(Items.WATER_BUCKET), new Object[]{"LLL", "LBL", "III", 'L', Blocks.LEAVES, 'B', Items.BUCKET, 'I', ItemHandler.IrON});
		GameRegistry.addShapedRecipe(new ResourceLocation("iron:recipe32"), new ResourceLocation("recipes"), new ItemStack(Items.LAVA_BUCKET), new Object[]{"CCC", "CBC", "IOI", 'C', Blocks.COBBLESTONE, 'B', Items.BUCKET, 'I', ItemHandler.IrON, 'O', Blocks.COAL_BLOCK});
		GameRegistry.addShapedRecipe(new ResourceLocation("iron:recipe33"), new ResourceLocation("recipes"), new ItemStack(ItemHandler.IridiumC), new Object[]{" I ", "IBI", " I ", 'I', ItemHandler.IrON, 'B', BlockHandler.IridiumBlock});
		GameRegistry.addShapedRecipe(new ResourceLocation("iron:recipe34"), new ResourceLocation("recipes"), new ItemStack(ItemHandler.BiridiumC), new Object[]{" I ", "IBI", " I ", 'I', ItemHandler.IrON, 'B', BlockHandler.BiridiumBlock});
		GameRegistry.addShapedRecipe(new ResourceLocation("iron:recipe35"), new ResourceLocation("recipes"), new ItemStack(ItemHandler.TriridiumC), new Object[]{" I ", "IBI", " I ", 'I', ItemHandler.IrON, 'B', BlockHandler.TriridiumBlock});
		GameRegistry.addShapedRecipe(new ResourceLocation("iron:recipe36"), new ResourceLocation("recipes"), new ItemStack(ItemHandler.QuadridiumC), new Object[]{" I ", "IBI", " I ", 'I', ItemHandler.IrON, 'B', BlockHandler.QuadridiumBlock});
		GameRegistry.addShapedRecipe(new ResourceLocation("iron:recipe37"), new ResourceLocation("recipes"), new ItemStack(ItemHandler.QuintridiumC), new Object[]{" I ", "IBI", " I ", 'I', ItemHandler.IrON, 'B', BlockHandler.QuintridiumBlock});
		GameRegistry.addShapedRecipe(new ResourceLocation("iron:recipe38"), new ResourceLocation("recipes"), new ItemStack(ItemHandler.SextridiumC), new Object[]{" I ", "IBI", " I ", 'I', ItemHandler.IrON, 'B', BlockHandler.SextridiumBlock});
		GameRegistry.addShapedRecipe(new ResourceLocation("iron:recipe39"), new ResourceLocation("recipes"), new ItemStack(ItemHandler.SeptridiumC), new Object[]{" I ", "IBI", " I ", 'I', ItemHandler.IrON, 'B', BlockHandler.SeptridiumBlock});
		GameRegistry.addShapedRecipe(new ResourceLocation("iron:recipe40"), new ResourceLocation("recipes"), new ItemStack(ItemHandler.OctridiumC), new Object[]{" I ", "IBI", " I ", 'I', ItemHandler.IrON, 'B', BlockHandler.OctridiumBlock});
		GameRegistry.addShapedRecipe(new ResourceLocation("iron:recipe41"), new ResourceLocation("recipes"), new ItemStack(ItemHandler.NonadiumC), new Object[]{" I ", "IBI", " I ", 'I', ItemHandler.IrON, 'B', BlockHandler.NonadiumBlock});
		GameRegistry.addShapedRecipe(new ResourceLocation("iron:recipe42"), new ResourceLocation("recipes"), new ItemStack(ItemHandler.DecadriumC), new Object[]{" I ", "IBI", " I ", 'I', ItemHandler.IrON, 'B', BlockHandler.DecadriumBlock});
		GameRegistry.addShapedRecipe(new ResourceLocation("iron:recipe43"), new ResourceLocation("recipes"), new ItemStack(BlockHandler.BiridiumBlock), new Object[]{"II", "II", 'I', BlockHandler.IridiumBlock});
		GameRegistry.addShapedRecipe(new ResourceLocation("iron:recipe44"), new ResourceLocation("recipes"), new ItemStack(BlockHandler.TriridiumBlock), new Object[]{"II", "II", 'I', BlockHandler.BiridiumBlock});
		GameRegistry.addShapedRecipe(new ResourceLocation("iron:recipe45"), new ResourceLocation("recipes"), new ItemStack(BlockHandler.QuadridiumBlock), new Object[]{"II", "II", 'I', BlockHandler.TriridiumBlock});
		GameRegistry.addShapedRecipe(new ResourceLocation("iron:recipe46"), new ResourceLocation("recipes"), new ItemStack(BlockHandler.QuintridiumBlock), new Object[]{"II", "II", 'I', BlockHandler.QuadridiumBlock});
		GameRegistry.addShapedRecipe(new ResourceLocation("iron:recipe47"), new ResourceLocation("recipes"), new ItemStack(BlockHandler.SextridiumBlock), new Object[]{"II", "II", 'I', BlockHandler.QuintridiumBlock});
		GameRegistry.addShapedRecipe(new ResourceLocation("iron:recipe48"), new ResourceLocation("recipes"), new ItemStack(BlockHandler.SeptridiumBlock), new Object[]{"II", "II", 'I', BlockHandler.SextridiumBlock});
		GameRegistry.addShapedRecipe(new ResourceLocation("iron:recipe49"), new ResourceLocation("recipes"), new ItemStack(BlockHandler.OctridiumBlock), new Object[]{"II", "II", 'I', BlockHandler.SeptridiumBlock});
		GameRegistry.addShapedRecipe(new ResourceLocation("iron:recipe50"), new ResourceLocation("recipes"), new ItemStack(BlockHandler.NonadiumBlock), new Object[]{"II", "II", 'I', BlockHandler.OctridiumBlock});
		GameRegistry.addShapedRecipe(new ResourceLocation("iron:recipe51"), new ResourceLocation("recipes"), new ItemStack(BlockHandler.DecadriumBlock), new Object[]{"II", "II", 'I', BlockHandler.NonadiumBlock});
		GameRegistry.addShapedRecipe(new ResourceLocation("iron:recipe59"), new ResourceLocation("recipes"), new ItemStack(ItemHandler.StoneHammer), new Object[]{"CC", "S ", 'C', Blocks.COBBLESTONE, 'S', Items.STICK});
		GameRegistry.addShapedRecipe(new ResourceLocation("iron:recipe60"), new ResourceLocation("recipes"), new ItemStack(ItemHandler.StoneHammer), new Object[]{"CC", " S", 'C', Blocks.COBBLESTONE, 'S', Items.STICK});
		

		GameRegistry.addSmelting(new ItemStack(Items.DYE, 1, 15), new ItemStack(Items.DYE, 1, 4), 1.0F);
		GameRegistry.addSmelting(BlockHandler.IrONOre, new ItemStack(ItemHandler.IrON), 100.0F);
		GameRegistry.addSmelting(BlockHandler.NetherIrONOre, new ItemStack(BlockHandler.IrONOre, 2), 5.0F);
		GameRegistry.addSmelting(BlockHandler.FakeCobble, new ItemStack(Blocks.COBBLESTONE), 1.0F);
		GameRegistry.addSmelting(BlockHandler.IrONMixture, new ItemStack(Item.getItemFromBlock(Blocks.GLASS)), 1.0F);
		GameRegistry.addSmelting(ItemHandler.IrON, new ItemStack(Items.GLASS_BOTTLE), 1.0F);
		GameRegistry.addSmelting(new ItemStack(ItemHandler.IridiumIngot, 1, 0), new ItemStack(Items.IRON_INGOT), 1.0F);
		GameRegistry.addSmelting(new ItemStack(BlockHandler.IridiumBlock), new ItemStack(Items.IRON_INGOT, 9), 10.0F);
		GameRegistry.addSmelting(new ItemStack(BlockHandler.BiridiumBlock), new ItemStack(Items.IRON_INGOT, 36), 45.0F);
		
		
		CatalystCraftingHandler.init();
		
	}
}
