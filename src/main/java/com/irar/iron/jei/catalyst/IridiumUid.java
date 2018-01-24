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

public class IridiumUid implements IRecipeCategory<IRecipeWrapper>{

	protected IGuiHelper guiHelper;
	protected int outputSlot = 9;
	protected final ICraftingGridHelper craftingGridHelper;

	public IridiumUid(IGuiHelper guiHelper) {
		this.guiHelper = guiHelper;
		craftingGridHelper = guiHelper.createCraftingGridHelper(0, outputSlot);
	}
	
	@Override
	public String getUid() {
		return IrONCategoryUid.CATALYSTIRIDIUM;
	}

	@Override
	public String getTitle() {
		return "Iridium Catalyst";
	}

	@Override
	public String getModName() {
		return Ref.MODID;
	}

	@Override
	public IDrawable getBackground() {
		return guiHelper.createDrawable(new ResourceLocation("iron:textures/gui/container/jei_catalyst.png"), 0, 0, 176, 105);
	}

	@Override
	public void setRecipe(IRecipeLayout recipeLayout, IRecipeWrapper recipeWrapper, IIngredients ingredients) {
		IGuiIngredientGroup guiItemStacks = recipeLayout.getItemStacks();
		guiItemStacks.init(0, true, 30, 17);
		guiItemStacks.init(1, true, 57, 13);
		guiItemStacks.init(2, true, 86, 17);
		guiItemStacks.init(3, true, 22, 44);
		guiItemStacks.init(4, true, 57, 44);
		guiItemStacks.init(5, true, 94, 44);
		guiItemStacks.init(6, true, 30, 70);
		guiItemStacks.init(7, true, 57, 74);
		guiItemStacks.init(8, true, 86, 70);
		guiItemStacks.init(outputSlot, false, 137, 44);
		
		List<List<ItemStack>> inputs = ingredients.getInputs(ItemStack.class);
		List<List<ItemStack>> outputs = ingredients.getOutputs(ItemStack.class);

		craftingGridHelper.setInputs(guiItemStacks, inputs);
		guiItemStacks.set(outputSlot, outputs.get(0));
	}

}
