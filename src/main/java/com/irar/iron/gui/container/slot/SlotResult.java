package com.irar.iron.gui.container.slot;

import com.google.common.collect.Lists;
import com.irar.iron.crafting.CatalystHelper;
import com.irar.iron.items.ItemCatalyst;
import com.irar.iron.items.ItemCatalyst.CatalystCraftingInventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryCraftResult;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.NonNullList;

public class SlotResult extends Slot{

	private int amountCrafted;
	private EntityPlayer player;
	private ItemCatalyst.CatalystCraftingInventory cm;

	public SlotResult(IInventory inventoryIn, int index, int xPosition, int yPosition, EntityPlayer player) {
		super(inventoryIn, index, xPosition, yPosition);
		this.player = player;
		this.cm = (CatalystCraftingInventory) inventoryIn;
	}
	
	@Override
	public boolean isItemValid(ItemStack stack){
		return false;
	}
	
	@Override
	public void onCrafting(ItemStack stack, int amount) {
		
	}
	
    protected void onCrafting(ItemStack stack)
    {
        if (this.amountCrafted > 0)
        {
            stack.onCrafting(this.player.world, this.player, this.amountCrafted);
            net.minecraftforge.fml.common.FMLCommonHandler.instance().firePlayerCraftingEvent(this.player, stack, cm);
        }

        this.amountCrafted = 0;
        ItemCatalyst.CatalystCraftingInventory inventorycraftresult = (ItemCatalyst.CatalystCraftingInventory)this.inventory;
        IRecipe irecipe = inventorycraftresult.getRecipeUsed();

/*        if (irecipe != null && !irecipe.isHidden())
        {
            this.player.unlockRecipes(Lists.newArrayList(irecipe));
            inventorycraftresult.setRecipeUsed((IRecipe)null);
        }*/
    }
    
    @Override
    public ItemStack onTake(EntityPlayer thePlayer, ItemStack stack)
    {
        this.onCrafting(stack);
        net.minecraftforge.common.ForgeHooks.setCraftingPlayer(thePlayer);
        NonNullList<ItemStack> nonnulllist = CatalystHelper.getRemainingItems(this.cm, thePlayer.world);
        net.minecraftforge.common.ForgeHooks.setCraftingPlayer(null);

        for (int i = 0; i < nonnulllist.size(); ++i)
        {
            ItemStack itemstack = this.cm.getStackInSlot(i);
            ItemStack itemstack1 = nonnulllist.get(i);

            if (!itemstack.isEmpty())
            {
                this.cm.decrStackSize(i, 1);
                itemstack = this.cm.getStackInSlot(i);
            }

            if (!itemstack1.isEmpty())
            {
                if (itemstack.isEmpty())
                {
                    this.cm.setInventorySlotContents(i, itemstack1);
                }
                else if (ItemStack.areItemsEqual(itemstack, itemstack1) && ItemStack.areItemStackTagsEqual(itemstack, itemstack1))
                {
                    itemstack1.grow(itemstack.getCount());
                    this.cm.setInventorySlotContents(i, itemstack1);
                }
                else if (!this.player.inventory.addItemStackToInventory(itemstack1))
                {
                    this.player.dropItem(itemstack1, false);
                }
            }
        }

        return stack;
    }


}
