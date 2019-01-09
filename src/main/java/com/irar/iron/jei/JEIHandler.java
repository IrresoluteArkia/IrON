package com.irar.iron.jei;

import com.irar.iron.crafting.CraftingTierBiridium;
import com.irar.iron.crafting.CraftingTierDecadrium;
import com.irar.iron.crafting.CraftingTierIridium;
import com.irar.iron.crafting.CraftingTierNonadium;
import com.irar.iron.crafting.CraftingTierOctridium;
import com.irar.iron.crafting.CraftingTierQuadridium;
import com.irar.iron.crafting.CraftingTierQuintridium;
import com.irar.iron.crafting.CraftingTierSeptridium;
import com.irar.iron.crafting.CraftingTierSextridium;
import com.irar.iron.crafting.CraftingTierTriridium;
import com.irar.iron.crafting.RecipeCatalyst;
import com.irar.iron.gui.client.GuiCatalystTierBiridium;
import com.irar.iron.gui.client.GuiCatalystTierDecadrium;
import com.irar.iron.gui.client.GuiCatalystTierIridium;
import com.irar.iron.gui.client.GuiCatalystTierNonadium;
import com.irar.iron.gui.client.GuiCatalystTierOctridium;
import com.irar.iron.gui.client.GuiCatalystTierQuadridium;
import com.irar.iron.gui.client.GuiCatalystTierQuintridium;
import com.irar.iron.gui.client.GuiCatalystTierSeptridium;
import com.irar.iron.gui.client.GuiCatalystTierSextridium;
import com.irar.iron.gui.client.GuiCatalystTierTriridium;
import com.irar.iron.gui.container.ContainerCatalystTierBiridium;
import com.irar.iron.gui.container.ContainerCatalystTierDecadrium;
import com.irar.iron.gui.container.ContainerCatalystTierIridium;
import com.irar.iron.gui.container.ContainerCatalystTierNonadium;
import com.irar.iron.gui.container.ContainerCatalystTierOctridium;
import com.irar.iron.gui.container.ContainerCatalystTierQuadridium;
import com.irar.iron.gui.container.ContainerCatalystTierQuintridium;
import com.irar.iron.gui.container.ContainerCatalystTierSeptridium;
import com.irar.iron.gui.container.ContainerCatalystTierSextridium;
import com.irar.iron.gui.container.ContainerCatalystTierTriridium;
import com.irar.iron.handlers.ItemHandler;
import com.irar.iron.jei.catalyst.BiridiumUid;
import com.irar.iron.jei.catalyst.DecadriumUid;
import com.irar.iron.jei.catalyst.IridiumUid;
import com.irar.iron.jei.catalyst.IridiumWrapper;
import com.irar.iron.jei.catalyst.NonadiumUid;
import com.irar.iron.jei.catalyst.OctridiumUid;
import com.irar.iron.jei.catalyst.QuadridiumUid;
import com.irar.iron.jei.catalyst.QuintridiumUid;
import com.irar.iron.jei.catalyst.SeptridiumUid;
import com.irar.iron.jei.catalyst.SextridiumUid;
import com.irar.iron.jei.catalyst.TriridiumUid;

import mezz.jei.api.IGuiHelper;
import mezz.jei.api.IJeiHelpers;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.IModRegistry;
import mezz.jei.api.JEIPlugin;
import mezz.jei.api.ingredients.IIngredientBlacklist;
import mezz.jei.api.ingredients.IIngredientRegistry;
import mezz.jei.api.recipe.IRecipeCategoryRegistration;
import mezz.jei.api.recipe.VanillaRecipeCategoryUid;
import mezz.jei.api.recipe.transfer.IRecipeTransferRegistry;
import net.minecraft.client.gui.GuiRepair;
import net.minecraft.client.gui.inventory.GuiBrewingStand;
import net.minecraft.client.gui.inventory.GuiCrafting;
import net.minecraft.client.gui.inventory.GuiFurnace;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.ContainerBrewingStand;
import net.minecraft.inventory.ContainerFurnace;
import net.minecraft.inventory.ContainerRepair;
import net.minecraft.inventory.ContainerWorkbench;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

@JEIPlugin
public class JEIHandler implements IModPlugin{
	@Override
	public void registerCategories(IRecipeCategoryRegistration registry) {
		final IJeiHelpers jeiHelpers = registry.getJeiHelpers();
		final IGuiHelper guiHelper = jeiHelpers.getGuiHelper();
		registry.addRecipeCategories(
				new IridiumUid(guiHelper),
				new BiridiumUid(guiHelper),
				new TriridiumUid(guiHelper),
				new QuadridiumUid(guiHelper),
				new QuintridiumUid(guiHelper),
				new SextridiumUid(guiHelper),
				new SeptridiumUid(guiHelper),
				new OctridiumUid(guiHelper),
				new NonadiumUid(guiHelper),
				new DecadriumUid(guiHelper)
		);
	}

	@Override
	public void register(IModRegistry registry) {
		final IIngredientRegistry ingredientRegistry = registry.getIngredientRegistry();
		final IJeiHelpers jeiHelpers = registry.getJeiHelpers();
		final IRecipeTransferRegistry transferRegistry = registry.getRecipeTransferRegistry();

		registry.addRecipes(CraftingTierIridium.getInstance().recipes, IrONCategoryUid.CATALYSTIRIDIUM);
		registry.addRecipes(CraftingTierBiridium.getInstance().recipes, IrONCategoryUid.CATALYSTBIRIDIUM);
		registry.addRecipes(CraftingTierTriridium.getInstance().recipes, IrONCategoryUid.CATALYSTTRIRIDIUM);
		registry.addRecipes(CraftingTierQuadridium.getInstance().recipes, IrONCategoryUid.CATALYSTQUADRIDIUM);
		registry.addRecipes(CraftingTierQuintridium.getInstance().recipes, IrONCategoryUid.CATALYSTQUINTRIDIUM);
		registry.addRecipes(CraftingTierSextridium.getInstance().recipes, IrONCategoryUid.CATALYSTSEXTRIDIUM);
		registry.addRecipes(CraftingTierSeptridium.getInstance().recipes, IrONCategoryUid.CATALYSTSEPTRIDIUM);
		registry.addRecipes(CraftingTierOctridium.getInstance().recipes, IrONCategoryUid.CATALYSTOCTRIDIUM);
		registry.addRecipes(CraftingTierNonadium.getInstance().recipes, IrONCategoryUid.CATALYSTNONADIUM);
		registry.addRecipes(CraftingTierDecadrium.getInstance().recipes, IrONCategoryUid.CATALYSTDECADRIUM);

		registry.handleRecipes(RecipeCatalyst.class, recipe -> new IridiumWrapper(jeiHelpers, recipe), IrONCategoryUid.CATALYSTIRIDIUM);
		registry.handleRecipes(RecipeCatalyst.class, recipe -> new IridiumWrapper(jeiHelpers, recipe), IrONCategoryUid.CATALYSTBIRIDIUM);
		registry.handleRecipes(RecipeCatalyst.class, recipe -> new IridiumWrapper(jeiHelpers, recipe), IrONCategoryUid.CATALYSTTRIRIDIUM);
		registry.handleRecipes(RecipeCatalyst.class, recipe -> new IridiumWrapper(jeiHelpers, recipe), IrONCategoryUid.CATALYSTQUADRIDIUM);
		registry.handleRecipes(RecipeCatalyst.class, recipe -> new IridiumWrapper(jeiHelpers, recipe), IrONCategoryUid.CATALYSTQUINTRIDIUM);
		registry.handleRecipes(RecipeCatalyst.class, recipe -> new IridiumWrapper(jeiHelpers, recipe), IrONCategoryUid.CATALYSTSEXTRIDIUM);
		registry.handleRecipes(RecipeCatalyst.class, recipe -> new IridiumWrapper(jeiHelpers, recipe), IrONCategoryUid.CATALYSTSEPTRIDIUM);
		registry.handleRecipes(RecipeCatalyst.class, recipe -> new IridiumWrapper(jeiHelpers, recipe), IrONCategoryUid.CATALYSTOCTRIDIUM);
		registry.handleRecipes(RecipeCatalyst.class, recipe -> new IridiumWrapper(jeiHelpers, recipe), IrONCategoryUid.CATALYSTNONADIUM);
		registry.handleRecipes(RecipeCatalyst.class, recipe -> new IridiumWrapper(jeiHelpers, recipe), IrONCategoryUid.CATALYSTDECADRIUM);

		transferRegistry.addRecipeTransferHandler(ContainerCatalystTierIridium.class, IrONCategoryUid.CATALYSTIRIDIUM, 0, 9, 10, 36);
		transferRegistry.addRecipeTransferHandler(ContainerCatalystTierBiridium.class, IrONCategoryUid.CATALYSTIRIDIUM, 0, 9, 10, 36);
		transferRegistry.addRecipeTransferHandler(ContainerCatalystTierTriridium.class, IrONCategoryUid.CATALYSTIRIDIUM, 0, 9, 10, 36);
		transferRegistry.addRecipeTransferHandler(ContainerCatalystTierQuadridium.class, IrONCategoryUid.CATALYSTIRIDIUM, 0, 9, 10, 36);
		transferRegistry.addRecipeTransferHandler(ContainerCatalystTierQuintridium.class, IrONCategoryUid.CATALYSTIRIDIUM, 0, 9, 10, 36);
		transferRegistry.addRecipeTransferHandler(ContainerCatalystTierSextridium.class, IrONCategoryUid.CATALYSTIRIDIUM, 0, 9, 10, 36);
		transferRegistry.addRecipeTransferHandler(ContainerCatalystTierSeptridium.class, IrONCategoryUid.CATALYSTIRIDIUM, 0, 9, 10, 36);
		transferRegistry.addRecipeTransferHandler(ContainerCatalystTierOctridium.class, IrONCategoryUid.CATALYSTIRIDIUM, 0, 9, 10, 36);
		transferRegistry.addRecipeTransferHandler(ContainerCatalystTierNonadium.class, IrONCategoryUid.CATALYSTIRIDIUM, 0, 9, 10, 36);
		transferRegistry.addRecipeTransferHandler(ContainerCatalystTierDecadrium.class, IrONCategoryUid.CATALYSTIRIDIUM, 0, 9, 10, 36);

		transferRegistry.addRecipeTransferHandler(ContainerCatalystTierBiridium.class, IrONCategoryUid.CATALYSTBIRIDIUM, 0, 9, 10, 36);
		transferRegistry.addRecipeTransferHandler(ContainerCatalystTierTriridium.class, IrONCategoryUid.CATALYSTBIRIDIUM, 0, 9, 10, 36);
		transferRegistry.addRecipeTransferHandler(ContainerCatalystTierQuadridium.class, IrONCategoryUid.CATALYSTBIRIDIUM, 0, 9, 10, 36);
		transferRegistry.addRecipeTransferHandler(ContainerCatalystTierQuintridium.class, IrONCategoryUid.CATALYSTBIRIDIUM, 0, 9, 10, 36);
		transferRegistry.addRecipeTransferHandler(ContainerCatalystTierSextridium.class, IrONCategoryUid.CATALYSTBIRIDIUM, 0, 9, 10, 36);
		transferRegistry.addRecipeTransferHandler(ContainerCatalystTierSeptridium.class, IrONCategoryUid.CATALYSTBIRIDIUM, 0, 9, 10, 36);
		transferRegistry.addRecipeTransferHandler(ContainerCatalystTierOctridium.class, IrONCategoryUid.CATALYSTBIRIDIUM, 0, 9, 10, 36);
		transferRegistry.addRecipeTransferHandler(ContainerCatalystTierNonadium.class, IrONCategoryUid.CATALYSTBIRIDIUM, 0, 9, 10, 36);
		transferRegistry.addRecipeTransferHandler(ContainerCatalystTierDecadrium.class, IrONCategoryUid.CATALYSTBIRIDIUM, 0, 9, 10, 36);

		transferRegistry.addRecipeTransferHandler(ContainerCatalystTierTriridium.class, IrONCategoryUid.CATALYSTTRIRIDIUM, 0, 9, 10, 36);
		transferRegistry.addRecipeTransferHandler(ContainerCatalystTierQuadridium.class, IrONCategoryUid.CATALYSTTRIRIDIUM, 0, 9, 10, 36);
		transferRegistry.addRecipeTransferHandler(ContainerCatalystTierQuintridium.class, IrONCategoryUid.CATALYSTTRIRIDIUM, 0, 9, 10, 36);
		transferRegistry.addRecipeTransferHandler(ContainerCatalystTierSextridium.class, IrONCategoryUid.CATALYSTTRIRIDIUM, 0, 9, 10, 36);
		transferRegistry.addRecipeTransferHandler(ContainerCatalystTierSeptridium.class, IrONCategoryUid.CATALYSTTRIRIDIUM, 0, 9, 10, 36);
		transferRegistry.addRecipeTransferHandler(ContainerCatalystTierOctridium.class, IrONCategoryUid.CATALYSTTRIRIDIUM, 0, 9, 10, 36);
		transferRegistry.addRecipeTransferHandler(ContainerCatalystTierNonadium.class, IrONCategoryUid.CATALYSTTRIRIDIUM, 0, 9, 10, 36);
		transferRegistry.addRecipeTransferHandler(ContainerCatalystTierDecadrium.class, IrONCategoryUid.CATALYSTTRIRIDIUM, 0, 9, 10, 36);

		transferRegistry.addRecipeTransferHandler(ContainerCatalystTierQuadridium.class, IrONCategoryUid.CATALYSTQUADRIDIUM, 0, 9, 10, 36);
		transferRegistry.addRecipeTransferHandler(ContainerCatalystTierQuintridium.class, IrONCategoryUid.CATALYSTQUADRIDIUM, 0, 9, 10, 36);
		transferRegistry.addRecipeTransferHandler(ContainerCatalystTierSextridium.class, IrONCategoryUid.CATALYSTQUADRIDIUM, 0, 9, 10, 36);
		transferRegistry.addRecipeTransferHandler(ContainerCatalystTierSeptridium.class, IrONCategoryUid.CATALYSTQUADRIDIUM, 0, 9, 10, 36);
		transferRegistry.addRecipeTransferHandler(ContainerCatalystTierOctridium.class, IrONCategoryUid.CATALYSTQUADRIDIUM, 0, 9, 10, 36);
		transferRegistry.addRecipeTransferHandler(ContainerCatalystTierNonadium.class, IrONCategoryUid.CATALYSTQUADRIDIUM, 0, 9, 10, 36);
		transferRegistry.addRecipeTransferHandler(ContainerCatalystTierDecadrium.class, IrONCategoryUid.CATALYSTQUADRIDIUM, 0, 9, 10, 36);

		transferRegistry.addRecipeTransferHandler(ContainerCatalystTierQuintridium.class, IrONCategoryUid.CATALYSTQUINTRIDIUM, 0, 9, 10, 36);
		transferRegistry.addRecipeTransferHandler(ContainerCatalystTierSextridium.class, IrONCategoryUid.CATALYSTQUINTRIDIUM, 0, 9, 10, 36);
		transferRegistry.addRecipeTransferHandler(ContainerCatalystTierSeptridium.class, IrONCategoryUid.CATALYSTQUINTRIDIUM, 0, 9, 10, 36);
		transferRegistry.addRecipeTransferHandler(ContainerCatalystTierOctridium.class, IrONCategoryUid.CATALYSTQUINTRIDIUM, 0, 9, 10, 36);
		transferRegistry.addRecipeTransferHandler(ContainerCatalystTierNonadium.class, IrONCategoryUid.CATALYSTQUINTRIDIUM, 0, 9, 10, 36);
		transferRegistry.addRecipeTransferHandler(ContainerCatalystTierDecadrium.class, IrONCategoryUid.CATALYSTQUINTRIDIUM, 0, 9, 10, 36);

		transferRegistry.addRecipeTransferHandler(ContainerCatalystTierSextridium.class, IrONCategoryUid.CATALYSTSEXTRIDIUM, 0, 9, 10, 36);
		transferRegistry.addRecipeTransferHandler(ContainerCatalystTierSeptridium.class, IrONCategoryUid.CATALYSTSEXTRIDIUM, 0, 9, 10, 36);
		transferRegistry.addRecipeTransferHandler(ContainerCatalystTierOctridium.class, IrONCategoryUid.CATALYSTSEXTRIDIUM, 0, 9, 10, 36);
		transferRegistry.addRecipeTransferHandler(ContainerCatalystTierNonadium.class, IrONCategoryUid.CATALYSTSEXTRIDIUM, 0, 9, 10, 36);
		transferRegistry.addRecipeTransferHandler(ContainerCatalystTierDecadrium.class, IrONCategoryUid.CATALYSTSEXTRIDIUM, 0, 9, 10, 36);

		transferRegistry.addRecipeTransferHandler(ContainerCatalystTierSeptridium.class, IrONCategoryUid.CATALYSTSEPTRIDIUM, 0, 9, 10, 36);
		transferRegistry.addRecipeTransferHandler(ContainerCatalystTierOctridium.class, IrONCategoryUid.CATALYSTSEPTRIDIUM, 0, 9, 10, 36);
		transferRegistry.addRecipeTransferHandler(ContainerCatalystTierNonadium.class, IrONCategoryUid.CATALYSTSEPTRIDIUM, 0, 9, 10, 36);
		transferRegistry.addRecipeTransferHandler(ContainerCatalystTierDecadrium.class, IrONCategoryUid.CATALYSTSEPTRIDIUM, 0, 9, 10, 36);

		transferRegistry.addRecipeTransferHandler(ContainerCatalystTierOctridium.class, IrONCategoryUid.CATALYSTOCTRIDIUM, 0, 9, 10, 36);
		transferRegistry.addRecipeTransferHandler(ContainerCatalystTierNonadium.class, IrONCategoryUid.CATALYSTOCTRIDIUM, 0, 9, 10, 36);
		transferRegistry.addRecipeTransferHandler(ContainerCatalystTierDecadrium.class, IrONCategoryUid.CATALYSTOCTRIDIUM, 0, 9, 10, 36);

		transferRegistry.addRecipeTransferHandler(ContainerCatalystTierNonadium.class, IrONCategoryUid.CATALYSTNONADIUM, 0, 9, 10, 36);
		transferRegistry.addRecipeTransferHandler(ContainerCatalystTierDecadrium.class, IrONCategoryUid.CATALYSTNONADIUM, 0, 9, 10, 36);

		transferRegistry.addRecipeTransferHandler(ContainerCatalystTierDecadrium.class, IrONCategoryUid.CATALYSTDECADRIUM, 0, 9, 10, 36);

		registry.addRecipeClickArea(GuiCatalystTierIridium.class, 115, 44, 17, 18, IrONCategoryUid.CATALYSTIRIDIUM);
		registry.addRecipeClickArea(GuiCatalystTierBiridium.class, 115, 44, 17, 18, IrONCategoryUid.CATALYSTIRIDIUM, IrONCategoryUid.CATALYSTBIRIDIUM);
		registry.addRecipeClickArea(GuiCatalystTierTriridium.class, 115, 44, 17, 18, IrONCategoryUid.CATALYSTIRIDIUM, IrONCategoryUid.CATALYSTBIRIDIUM, IrONCategoryUid.CATALYSTTRIRIDIUM);
		registry.addRecipeClickArea(GuiCatalystTierQuadridium.class, 115, 44, 17, 18, IrONCategoryUid.CATALYSTIRIDIUM, IrONCategoryUid.CATALYSTBIRIDIUM, IrONCategoryUid.CATALYSTTRIRIDIUM, IrONCategoryUid.CATALYSTQUADRIDIUM);
		registry.addRecipeClickArea(GuiCatalystTierQuintridium.class, 115, 44, 17, 18, IrONCategoryUid.CATALYSTIRIDIUM, IrONCategoryUid.CATALYSTBIRIDIUM, IrONCategoryUid.CATALYSTTRIRIDIUM, IrONCategoryUid.CATALYSTQUADRIDIUM, IrONCategoryUid.CATALYSTQUINTRIDIUM);
		registry.addRecipeClickArea(GuiCatalystTierSextridium.class, 115, 44, 17, 18, IrONCategoryUid.CATALYSTIRIDIUM, IrONCategoryUid.CATALYSTBIRIDIUM, IrONCategoryUid.CATALYSTTRIRIDIUM, IrONCategoryUid.CATALYSTQUADRIDIUM, IrONCategoryUid.CATALYSTQUINTRIDIUM, IrONCategoryUid.CATALYSTSEXTRIDIUM);
		registry.addRecipeClickArea(GuiCatalystTierSeptridium.class, 115, 44, 17, 18, IrONCategoryUid.CATALYSTIRIDIUM, IrONCategoryUid.CATALYSTBIRIDIUM, IrONCategoryUid.CATALYSTTRIRIDIUM, IrONCategoryUid.CATALYSTQUADRIDIUM, IrONCategoryUid.CATALYSTQUINTRIDIUM, IrONCategoryUid.CATALYSTSEXTRIDIUM, IrONCategoryUid.CATALYSTSEPTRIDIUM);
		registry.addRecipeClickArea(GuiCatalystTierOctridium.class, 115, 44, 17, 18, IrONCategoryUid.CATALYSTIRIDIUM, IrONCategoryUid.CATALYSTBIRIDIUM, IrONCategoryUid.CATALYSTTRIRIDIUM, IrONCategoryUid.CATALYSTQUADRIDIUM, IrONCategoryUid.CATALYSTQUINTRIDIUM, IrONCategoryUid.CATALYSTSEXTRIDIUM, IrONCategoryUid.CATALYSTSEPTRIDIUM, IrONCategoryUid.CATALYSTOCTRIDIUM);
		registry.addRecipeClickArea(GuiCatalystTierNonadium.class, 115, 44, 17, 18, IrONCategoryUid.CATALYSTIRIDIUM, IrONCategoryUid.CATALYSTBIRIDIUM, IrONCategoryUid.CATALYSTTRIRIDIUM, IrONCategoryUid.CATALYSTQUADRIDIUM, IrONCategoryUid.CATALYSTQUINTRIDIUM, IrONCategoryUid.CATALYSTSEXTRIDIUM, IrONCategoryUid.CATALYSTSEPTRIDIUM, IrONCategoryUid.CATALYSTOCTRIDIUM, IrONCategoryUid.CATALYSTNONADIUM);
		registry.addRecipeClickArea(GuiCatalystTierDecadrium.class, 115, 44, 17, 18, IrONCategoryUid.CATALYSTIRIDIUM, IrONCategoryUid.CATALYSTBIRIDIUM, IrONCategoryUid.CATALYSTTRIRIDIUM, IrONCategoryUid.CATALYSTQUADRIDIUM, IrONCategoryUid.CATALYSTQUINTRIDIUM, IrONCategoryUid.CATALYSTSEXTRIDIUM, IrONCategoryUid.CATALYSTSEPTRIDIUM, IrONCategoryUid.CATALYSTOCTRIDIUM, IrONCategoryUid.CATALYSTNONADIUM, IrONCategoryUid.CATALYSTDECADRIUM);
		
		registry.addRecipeCatalyst(new ItemStack(ItemHandler.IridiumC), IrONCategoryUid.CATALYSTIRIDIUM);
		registry.addRecipeCatalyst(new ItemStack(ItemHandler.BiridiumC), IrONCategoryUid.CATALYSTIRIDIUM);
		registry.addRecipeCatalyst(new ItemStack(ItemHandler.TriridiumC), IrONCategoryUid.CATALYSTIRIDIUM);
		registry.addRecipeCatalyst(new ItemStack(ItemHandler.QuadridiumC), IrONCategoryUid.CATALYSTIRIDIUM);
		registry.addRecipeCatalyst(new ItemStack(ItemHandler.QuintridiumC), IrONCategoryUid.CATALYSTIRIDIUM);
		registry.addRecipeCatalyst(new ItemStack(ItemHandler.SextridiumC), IrONCategoryUid.CATALYSTIRIDIUM);
		registry.addRecipeCatalyst(new ItemStack(ItemHandler.SeptridiumC), IrONCategoryUid.CATALYSTIRIDIUM);
		registry.addRecipeCatalyst(new ItemStack(ItemHandler.OctridiumC), IrONCategoryUid.CATALYSTIRIDIUM);
		registry.addRecipeCatalyst(new ItemStack(ItemHandler.NonadiumC), IrONCategoryUid.CATALYSTIRIDIUM);
		registry.addRecipeCatalyst(new ItemStack(ItemHandler.DecadriumC), IrONCategoryUid.CATALYSTIRIDIUM);

		registry.addRecipeCatalyst(new ItemStack(ItemHandler.BiridiumC), IrONCategoryUid.CATALYSTBIRIDIUM);
		registry.addRecipeCatalyst(new ItemStack(ItemHandler.TriridiumC), IrONCategoryUid.CATALYSTBIRIDIUM);
		registry.addRecipeCatalyst(new ItemStack(ItemHandler.QuadridiumC), IrONCategoryUid.CATALYSTBIRIDIUM);
		registry.addRecipeCatalyst(new ItemStack(ItemHandler.QuintridiumC), IrONCategoryUid.CATALYSTBIRIDIUM);
		registry.addRecipeCatalyst(new ItemStack(ItemHandler.SextridiumC), IrONCategoryUid.CATALYSTBIRIDIUM);
		registry.addRecipeCatalyst(new ItemStack(ItemHandler.SeptridiumC), IrONCategoryUid.CATALYSTBIRIDIUM);
		registry.addRecipeCatalyst(new ItemStack(ItemHandler.OctridiumC), IrONCategoryUid.CATALYSTBIRIDIUM);
		registry.addRecipeCatalyst(new ItemStack(ItemHandler.NonadiumC), IrONCategoryUid.CATALYSTBIRIDIUM);
		registry.addRecipeCatalyst(new ItemStack(ItemHandler.DecadriumC), IrONCategoryUid.CATALYSTBIRIDIUM);

		registry.addRecipeCatalyst(new ItemStack(ItemHandler.TriridiumC), IrONCategoryUid.CATALYSTTRIRIDIUM);
		registry.addRecipeCatalyst(new ItemStack(ItemHandler.QuadridiumC), IrONCategoryUid.CATALYSTTRIRIDIUM);
		registry.addRecipeCatalyst(new ItemStack(ItemHandler.QuintridiumC), IrONCategoryUid.CATALYSTTRIRIDIUM);
		registry.addRecipeCatalyst(new ItemStack(ItemHandler.SextridiumC), IrONCategoryUid.CATALYSTTRIRIDIUM);
		registry.addRecipeCatalyst(new ItemStack(ItemHandler.SeptridiumC), IrONCategoryUid.CATALYSTTRIRIDIUM);
		registry.addRecipeCatalyst(new ItemStack(ItemHandler.OctridiumC), IrONCategoryUid.CATALYSTTRIRIDIUM);
		registry.addRecipeCatalyst(new ItemStack(ItemHandler.NonadiumC), IrONCategoryUid.CATALYSTTRIRIDIUM);
		registry.addRecipeCatalyst(new ItemStack(ItemHandler.DecadriumC), IrONCategoryUid.CATALYSTTRIRIDIUM);

		registry.addRecipeCatalyst(new ItemStack(ItemHandler.QuadridiumC), IrONCategoryUid.CATALYSTQUADRIDIUM);
		registry.addRecipeCatalyst(new ItemStack(ItemHandler.QuintridiumC), IrONCategoryUid.CATALYSTQUADRIDIUM);
		registry.addRecipeCatalyst(new ItemStack(ItemHandler.SextridiumC), IrONCategoryUid.CATALYSTQUADRIDIUM);
		registry.addRecipeCatalyst(new ItemStack(ItemHandler.SeptridiumC), IrONCategoryUid.CATALYSTQUADRIDIUM);
		registry.addRecipeCatalyst(new ItemStack(ItemHandler.OctridiumC), IrONCategoryUid.CATALYSTQUADRIDIUM);
		registry.addRecipeCatalyst(new ItemStack(ItemHandler.NonadiumC), IrONCategoryUid.CATALYSTQUADRIDIUM);
		registry.addRecipeCatalyst(new ItemStack(ItemHandler.DecadriumC), IrONCategoryUid.CATALYSTQUADRIDIUM);

		registry.addRecipeCatalyst(new ItemStack(ItemHandler.QuintridiumC), IrONCategoryUid.CATALYSTQUINTRIDIUM);
		registry.addRecipeCatalyst(new ItemStack(ItemHandler.SextridiumC), IrONCategoryUid.CATALYSTQUINTRIDIUM);
		registry.addRecipeCatalyst(new ItemStack(ItemHandler.SeptridiumC), IrONCategoryUid.CATALYSTQUINTRIDIUM);
		registry.addRecipeCatalyst(new ItemStack(ItemHandler.OctridiumC), IrONCategoryUid.CATALYSTQUINTRIDIUM);
		registry.addRecipeCatalyst(new ItemStack(ItemHandler.NonadiumC), IrONCategoryUid.CATALYSTQUINTRIDIUM);
		registry.addRecipeCatalyst(new ItemStack(ItemHandler.DecadriumC), IrONCategoryUid.CATALYSTQUINTRIDIUM);

		registry.addRecipeCatalyst(new ItemStack(ItemHandler.SextridiumC), IrONCategoryUid.CATALYSTSEXTRIDIUM);
		registry.addRecipeCatalyst(new ItemStack(ItemHandler.SeptridiumC), IrONCategoryUid.CATALYSTSEXTRIDIUM);
		registry.addRecipeCatalyst(new ItemStack(ItemHandler.OctridiumC), IrONCategoryUid.CATALYSTSEXTRIDIUM);
		registry.addRecipeCatalyst(new ItemStack(ItemHandler.NonadiumC), IrONCategoryUid.CATALYSTSEXTRIDIUM);
		registry.addRecipeCatalyst(new ItemStack(ItemHandler.DecadriumC), IrONCategoryUid.CATALYSTSEXTRIDIUM);

		registry.addRecipeCatalyst(new ItemStack(ItemHandler.SeptridiumC), IrONCategoryUid.CATALYSTSEPTRIDIUM);
		registry.addRecipeCatalyst(new ItemStack(ItemHandler.OctridiumC), IrONCategoryUid.CATALYSTSEPTRIDIUM);
		registry.addRecipeCatalyst(new ItemStack(ItemHandler.NonadiumC), IrONCategoryUid.CATALYSTSEPTRIDIUM);
		registry.addRecipeCatalyst(new ItemStack(ItemHandler.DecadriumC), IrONCategoryUid.CATALYSTSEPTRIDIUM);

		registry.addRecipeCatalyst(new ItemStack(ItemHandler.OctridiumC), IrONCategoryUid.CATALYSTOCTRIDIUM);
		registry.addRecipeCatalyst(new ItemStack(ItemHandler.NonadiumC), IrONCategoryUid.CATALYSTOCTRIDIUM);
		registry.addRecipeCatalyst(new ItemStack(ItemHandler.DecadriumC), IrONCategoryUid.CATALYSTOCTRIDIUM);

		registry.addRecipeCatalyst(new ItemStack(ItemHandler.NonadiumC), IrONCategoryUid.CATALYSTNONADIUM);
		registry.addRecipeCatalyst(new ItemStack(ItemHandler.DecadriumC), IrONCategoryUid.CATALYSTNONADIUM);

		registry.addRecipeCatalyst(new ItemStack(ItemHandler.DecadriumC), IrONCategoryUid.CATALYSTDECADRIUM);

		IIngredientBlacklist ingredientBlacklist = registry.getJeiHelpers().getIngredientBlacklist();
	}}
