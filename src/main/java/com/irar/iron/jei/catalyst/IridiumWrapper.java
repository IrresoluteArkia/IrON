package com.irar.iron.jei.catalyst;

import java.util.ArrayList;
import java.util.List;

import com.irar.iron.crafting.CraftingTierIridium;
import com.irar.iron.crafting.Recipe;
import com.irar.iron.crafting.RecipeCatalyst;

import mezz.jei.api.IJeiHelpers;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.IRecipeWrapper;
import mezz.jei.api.recipe.IStackHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;

public class IridiumWrapper<T extends IRecipe> implements IRecipeWrapper{

	private IJeiHelpers jeiHelpers;
	private T recipe;

	public IridiumWrapper(IJeiHelpers jeiHelpers, T recipe) {
		this.jeiHelpers = jeiHelpers;
		this.recipe = recipe;
	}
	
	@Override
	public void getIngredients(IIngredients ingredients) {
		ItemStack recipeOutput = recipe.getRecipeOutput();
		IStackHelper stackHelper = jeiHelpers.getStackHelper();

		try {
			List<List<ItemStack>> inputLists = stackHelper.expandRecipeItemStackInputs(recipe.getIngredients());
			ingredients.setInputLists(ItemStack.class, inputLists);
			ingredients.setOutput(ItemStack.class, recipeOutput);
		} catch (RuntimeException e) {
		}
	}

}
