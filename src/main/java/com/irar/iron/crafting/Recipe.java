package com.irar.iron.crafting;

import java.util.ArrayList;
import java.util.Collection;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.oredict.OreDictionary;

public class Recipe{

		private ItemStack result;
		private ArrayList<Object> ingredients;
		
		public Recipe(ItemStack result, ArrayList<Object> ingredients) {

			this.result = result;
			this.ingredients = ingredients;
			
		}
		
		public boolean matchesRecipe(ArrayList ingredients){
			boolean oredictLoop = false;
			int loopLocation = 0;
			ArrayList<Object> ingredientsLoop = new ArrayList<Object>();
			ingredientsLoop.addAll(this.ingredients);
			ArrayList<String> itemstest = new ArrayList<String>();
			ArrayList<String> items = new ArrayList<String>();
			
			for(int i = 0; i < ingredients.size(); i++){
				itemstest.add(((ArrayList<ItemStack>) ingredients).get(i).getUnlocalizedName());
			}
			for(int i = 0; i < ingredientsLoop.size(); i++){
				if(ingredientsLoop.get(i) instanceof String){
					if(!oredictLoop){
						oredictLoop = true;
						loopLocation = i;
					}
					items.add((String) ingredientsLoop.get(i));
				}else{
					items.add(((ItemStack) ingredientsLoop.get(i)).getUnlocalizedName());
				}
			}
			if(oredictLoop){
				NonNullList<ItemStack> ores = OreDictionary.getOres((String) ingredientsLoop.get(loopLocation));
				if(!ores.get(0).isEmpty()){
					for(int i = 0; i < ores.size(); i++){
						ingredientsLoop.set(loopLocation, ores.get(i));
						boolean matches = this.matchesRecipe(ingredients, ingredientsLoop, 2);
						if(matches){
//							System.out.println("returned true at depth: 1");
//							System.out.println("");
							return true;
						}
					}
				}
			}
//			System.out.println("returned "+ itemstest.equals(items) +" at depth: 1");
//			System.out.println("");
			return itemstest.equals(items);
		}
		
		public boolean matchesRecipe(ArrayList ingredients, ArrayList ingredientsLoop, int depth){
			boolean oredictLoop = false;
			int loopLocation = 0;
			ArrayList<String> itemstest = new ArrayList<String>();
			ArrayList<String> items = new ArrayList<String>();
			
			for(int i = 0; i < ingredients.size(); i++){
				itemstest.add(((ArrayList<ItemStack>) ingredients).get(i).getUnlocalizedName());
			}
			for(int i = 0; i < ingredientsLoop.size(); i++){
				if(ingredientsLoop.get(i) instanceof String){
					if(!oredictLoop){
						oredictLoop = true;
						loopLocation = i;
					}
					items.add((String) ingredientsLoop.get(i));
				}else{
					items.add(((ItemStack) ingredientsLoop.get(i)).getUnlocalizedName());
				}
			}
			if(oredictLoop){
				NonNullList<ItemStack> ores = OreDictionary.getOres((String) ingredientsLoop.get(loopLocation));
				if(!ores.get(0).isEmpty()){
					for(int i = 0; i < ores.size(); i++){
						ingredientsLoop.set(loopLocation, ores.get(i));
						boolean matches = this.matchesRecipe(ingredients, ingredientsLoop, depth + 1);
						if(matches){
//							System.out.println("returned true at depth: " + depth);
							return true;
						}
					}
				}
			}
//			System.out.println("returned "+ itemstest.equals(items) +" at depth: " + depth);
			return itemstest.equals(items);
		}
		
		public ItemStack getResult(){
			return new ItemStack(result.getItem(), result.getCount(), result.getMetadata());
		}
		
	}