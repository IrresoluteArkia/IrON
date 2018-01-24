package com.irar.iron.crafting;

import java.util.ArrayList;
import java.util.Collection;

import javax.annotation.Nonnull;

import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;

public class RecipeCatalyst implements IRecipe{

	public ResourceLocation name;
	public ArrayList<Ingredient> ingredients;
	private ItemStack result;
	
	public RecipeCatalyst(ArrayList<Ingredient> ingredients, ItemStack result) {
		this.ingredients = ingredients;
		this.result = result;
	}

	@Override
	public NonNullList<Ingredient> getIngredients(){
		NonNullList<Ingredient> ingredients = NonNullList.<Ingredient>create();
		ingredients.addAll(this.ingredients);
		return ingredients;
	}
	
	@Override
	public IRecipe setRegistryName(ResourceLocation name) {
		this.name = name;
		return this;
	}

	@Override
	public ResourceLocation getRegistryName() {
		return name;
	}

	@Override
	public Class<IRecipe> getRegistryType() {
		return IRecipe.class;
	}

	@Override
	public boolean matches(InventoryCrafting inv, World worldIn) {
		for(int i = 0; i < ingredients.size(); i++) {
			Ingredient ingredient = ingredients.get(i);
			if(ingredient == null || ingredient.equals(Ingredient.EMPTY)) {
				if(inv.getStackInSlot(i) == null || inv.getStackInSlot(i).isEmpty()) {
					continue;
				}
			}else if(inv.getStackInSlot(i) != null && !inv.getStackInSlot(i).isEmpty() && ingredient.apply(inv.getStackInSlot(i))) {
				continue;
			}
			return false;
		}
		return true;
	}

	@Override
	public ItemStack getCraftingResult(InventoryCrafting inv) {
		return result.copy();
	}

	@Override
	public boolean canFit(int width, int height) {
		return true;
	}

	@Override
	public ItemStack getRecipeOutput() {
		return result.copy();
	}

}