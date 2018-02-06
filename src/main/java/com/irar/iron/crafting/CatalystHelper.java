package com.irar.iron.crafting;

import com.irar.iron.items.ItemCatalyst.CatalystCraftingInventory;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.NonNullList;
import net.minecraft.world.World;

public class CatalystHelper {

	public static NonNullList<ItemStack> getRemainingItems(CatalystCraftingInventory cm, World world) {
        RecipeCatalyst recipeUsed = (RecipeCatalyst) cm.getRecipeUsed();
        if(recipeUsed != null) {
            return recipeUsed.getRemainingItems(cm);
        }
            

        NonNullList<ItemStack> nonnulllist = NonNullList.<ItemStack>withSize(cm.getSizeInventory() - 1, ItemStack.EMPTY);

        for (int i = 0; i < nonnulllist.size(); ++i)
        {
            nonnulllist.set(i, cm.getStackInSlot(i));
        }

        return nonnulllist;
	}

}
