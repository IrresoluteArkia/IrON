package com.irar.iron.crafting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.NonNullList;
import net.minecraftforge.oredict.OreDictionary;

public class CraftingTierQuintridium {

	private static final CraftingTierQuintridium instance = new CraftingTierQuintridium();
	public ArrayList<RecipeCatalyst> recipes = new ArrayList<RecipeCatalyst>();
	
	public CraftingTierQuintridium(){
		
	}
	
	public void addRecipe(ItemStack result, Object[] ingredients){
		if(ingredients.length > 9){
			Logger.getLogger("iron").log(Level.WARNING, "Error in iridium catalyst recipes: too many ingredients!!!", new Throwable());
		}else if(ingredients.length < 9){
			Logger.getLogger("iron").log(Level.WARNING, "Error in iridium catalyst recipes: too few ingredients!!!", new Throwable());
		}else{
	    	ArrayList<Ingredient> ingredientsList = new ArrayList<Ingredient>();
	    	
	    	for(Object o : ingredients){
	    		Ingredient ingredient;
	    		if(o instanceof Ingredient) {
	    			ingredient = (Ingredient) o;
	    		}else if(o instanceof ItemStack) {
	    			ItemStack stack = (ItemStack) o;
	    			if(!stack.isEmpty()) {
		    			ingredient = Ingredient.fromStacks(stack);
	    			}else {
	    				ingredient = Ingredient.EMPTY;
	    			}
	    		}else if(o instanceof Item) {
	    			ItemStack stack = new ItemStack((Item) o, 1, OreDictionary.WILDCARD_VALUE);
	    			ingredient = Ingredient.fromStacks(stack);
	    		}else if(o instanceof Block) {
	    			ItemStack stack = new ItemStack((Block) o, 1, OreDictionary.WILDCARD_VALUE);
	    			ingredient = Ingredient.fromStacks(stack);
	    		}else if(o instanceof String) {
	    			ArrayList<ItemStack> stacks = getOres((String) o);
	    			ingredient = Ingredient.fromStacks(stacks.toArray(new ItemStack[] {}));
	    		}else {
	    			ingredient = Ingredient.EMPTY;
	    		}
	    		ingredientsList.add(ingredient);
	    	}
			recipes.add(new RecipeCatalyst(ingredientsList, result));
		}
	}
	
	private ArrayList<ItemStack> getOres(String o) {
		ArrayList<ItemStack> ores = new ArrayList<ItemStack>();
		NonNullList<ItemStack> ores2 = OreDictionary.getOres(o);
		ores.addAll(ores2);
		return ores;
	}

	public static ItemStack getMatchingRecipeResult(ArrayList<ItemStack> ingredients){
		for(int i = 0; i < instance.recipes.size(); i++){
			InventoryCrafting inv = getInvCrafting(ingredients);
			if(instance.recipes.get(i).matches(inv, null)){
				return instance.recipes.get(i).getCraftingResult(inv);
			}
		}
		return CraftingTierQuadridium.getMatchingRecipeResult(ingredients);
	}
	
	private static InventoryCrafting getInvCrafting(ArrayList<ItemStack> ingredients) {
		InventoryCrafting inv = new InventoryCrafting(new Container() {
			@Override
			public boolean canInteractWith(EntityPlayer playerIn) {
				return true;
			}
		}, 3, 3);
		int i = 0;
		for(ItemStack stack : ingredients) {
			inv.setInventorySlotContents(i, stack);
			i++;
		}
		return inv;
	}

	public static CraftingTierQuintridium getInstance(){
		return instance;
	}
	
}
