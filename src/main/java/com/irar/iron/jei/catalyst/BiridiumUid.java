package com.irar.iron.jei.catalyst;

import java.util.List;

import com.irar.iron.Ref;
import com.irar.iron.gui.container.slot.SlotResult;
import com.irar.iron.jei.IrONCategoryUid;

import mezz.jei.api.IGuiHelper;
import mezz.jei.api.gui.ICraftingGridHelper;
import mezz.jei.api.gui.IDrawable;
import mezz.jei.api.gui.IGuiIngredientGroup;
import mezz.jei.api.gui.IGuiItemStackGroup;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.IRecipeCategory;
import mezz.jei.api.recipe.IRecipeWrapper;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class BiridiumUid extends IridiumUid{

	public BiridiumUid(IGuiHelper guiHelper) {
		super(guiHelper);
	}

	@Override
	public String getUid() {
		return IrONCategoryUid.CATALYSTBIRIDIUM;
	}

	@Override
	public String getTitle() {
		return "Biridium Catalyst";
	}

}
