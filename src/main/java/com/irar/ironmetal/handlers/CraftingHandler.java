package com.irar.ironmetal.handlers;

import com.irar.ironmetal.handlers.ItemHandler;

import net.minecraft.init.Blocks;
import net.minecraft.init.Enchantments;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class CraftingHandler {
	public static void init(){
		ItemStack SilvHammerEnch=new ItemStack(ItemHandler.SilvadriumHammer);
		SilvHammerEnch.addEnchantment(Enchantments.SILK_TOUCH, 1);
		ItemStack ShroHammerEnch=new ItemStack(ItemHandler.ShroomiteHammer);
		ShroHammerEnch.addEnchantment(Enchantments.SILK_TOUCH, 1);
		
		GameRegistry.addShapedRecipe(new ResourceLocation("ironmetal:recipe9"), new ResourceLocation("recipes"), SilvHammerEnch, new Object[]{ "SS", " I", 'S', "ingotSilvadrium", 'I', Items.STICK});
		GameRegistry.addShapedRecipe(new ResourceLocation("ironmetal:recipe10"), new ResourceLocation("recipes"), SilvHammerEnch, new Object[]{ "SS", "I ", 'S', "ingotSilvadrium", 'I', Items.STICK});
		GameRegistry.addShapedRecipe(new ResourceLocation("ironmetal:recipe11"), new ResourceLocation("recipes"), ShroHammerEnch, new Object[]{ "SS", " I", 'S', "ingotShroomite", 'I', Items.STICK});
		GameRegistry.addShapedRecipe(new ResourceLocation("ironmetal:recipe12"), new ResourceLocation("recipes"), ShroHammerEnch, new Object[]{ "SS", "I ", 'S', "ingotShroomite", 'I', Items.STICK});
		GameRegistry.addShapedRecipe(new ResourceLocation("ironmetal:recipe13"), new ResourceLocation("recipes"), new ItemStack(BlockHandler.AluminumBlock), new Object[]{"AAA", "AAA", "AAA", 'A', "ingotAluminum"});
		GameRegistry.addShapedRecipe(new ResourceLocation("ironmetal:recipe14"), new ResourceLocation("recipes"), new ItemStack(BlockHandler.SilvadriumBlock), new Object[]{"AAA", "AAA", "AAA", 'A', "ingotSilvadrium"});
		GameRegistry.addShapedRecipe(new ResourceLocation("ironmetal:recipe15"), new ResourceLocation("recipes"), new ItemStack(BlockHandler.ShroomiteBlock), new Object[]{"AAA", "AAA", "AAA", 'A', "ingotShroomite"});

		GameRegistry.addSmelting(ItemHandler.IrONDust, new ItemStack(com.irar.iron.handlers.ItemHandler.IrON), 50.0F);
		GameRegistry.addSmelting(ItemHandler.IQuartz, new ItemStack(ItemHandler.DarkQuartz), 1.0F);
		
		makeOreDictInterchangable("gemQuartzBlack");
		makeOreDictInterchangable("crystalCertusQuartz");
		
		

	}
	public static void makeOreDictInterchangable(String oredict){
		NonNullList<ItemStack> darkQuartzes = OreDictionary.getOres(oredict);
		if(darkQuartzes.size() > 1){
			for(int i = 0; i < darkQuartzes.size(); i++){
				if(i < darkQuartzes.size() - 1){
					GameRegistry.addShapedRecipe(new ResourceLocation("ironmetal:recipe" + oredict + i), new ResourceLocation("recipes"), darkQuartzes.get(i + 1), new Object[]{"   ", " Q ", "   ", 'Q', darkQuartzes.get(i)});
				}else{
					GameRegistry.addShapedRecipe(new ResourceLocation("ironmetal:recipe" + oredict + i), new ResourceLocation("recipes"), darkQuartzes.get(0), new Object[]{"   ", " Q ", "   ", 'Q', darkQuartzes.get(i)});
				}
			}
		}
	}
}
