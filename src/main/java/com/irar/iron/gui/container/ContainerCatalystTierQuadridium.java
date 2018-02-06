package com.irar.iron.gui.container;

import javax.annotation.Nullable;

import com.irar.iron.gui.container.slot.SlotResult;
import com.irar.iron.items.ItemCatalyst;
import com.irar.iron.tileentity.TileEntityOreGen;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerCatalystTierQuadridium extends Container{

	private ItemCatalyst.CatalystCraftingInventory cci;
	
	public ContainerCatalystTierQuadridium(InventoryPlayer playerInv, ItemCatalyst.CatalystCraftingInventory cci){
		
		this.cci = cci;
		
		 // Tile Entity, Slot 0-8, Slot IDs 0-8
/*	    for (int y = 0; y < 3; ++y) {
	        for (int x = 0; x < 3; ++x) {
	            this.addSlotToContainer(new Slot(cci, x + y * 3, 62 + x * 18, 17 + y * 18));
	        }
	    }*/
	    
	    this.addSlotToContainer(new Slot(cci, 0, 31, 18));
	    this.addSlotToContainer(new Slot(cci, 1, 58, 14));
	    this.addSlotToContainer(new Slot(cci, 2, 87, 18));
	    this.addSlotToContainer(new Slot(cci, 3, 23, 45));
	    this.addSlotToContainer(new Slot(cci, 4, 58, 45));
	    this.addSlotToContainer(new Slot(cci, 5, 95, 45));
	    this.addSlotToContainer(new Slot(cci, 6, 31, 71));
	    this.addSlotToContainer(new Slot(cci, 7, 58, 75));
	    this.addSlotToContainer(new Slot(cci, 8, 87, 71));
	    this.addSlotToContainer(new SlotResult(cci, 9, 138, 45, playerInv.player));
	    

	    // Player Inventory, Slot 9-35, Slot IDs 9-35
	    for (int y = 0; y < 3; ++y) {
	        for (int x = 0; x < 9; ++x) {
	            this.addSlotToContainer(new Slot(playerInv, x + y * 9 + 9, 8 + x * 18, 104 + y * 18));
	        }
	    }

	    // Player Inventory, Slot 0-8, Slot IDs 36-44
	    for (int x = 0; x < 9; ++x) {
	        this.addSlotToContainer(new Slot(playerInv, x, 8 + x * 18, 162));
	    }
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer playerIn) {
		return true;
	}

	@Override
    public ItemStack transferStackInSlot(EntityPlayer playerIn, int index)
    {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.inventorySlots.get(index);

        if (slot != null && slot.getHasStack())
        {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (index == 9)
            {

                if (!this.mergeItemStack(itemstack1, 10, 46, true))
                {
                    return ItemStack.EMPTY;
                }

                slot.onSlotChange(itemstack1, itemstack);
            }
            else if (index >= 10 && index < 37)
            {
                if (!this.mergeItemStack(itemstack1, 37, 46, false))
                {
                    return ItemStack.EMPTY;
                }
            }
            else if (index >= 37 && index < 46)
            {
                if (!this.mergeItemStack(itemstack1, 10, 37, false))
                {
                    return ItemStack.EMPTY;
                }
            }
            else if (!this.mergeItemStack(itemstack1, 10, 46, false))
            {
                return ItemStack.EMPTY;
            }

            if (itemstack1.isEmpty())
            {
                slot.putStack(ItemStack.EMPTY);
            }
            else
            {
                slot.onSlotChanged();
            }

            if (itemstack1.getCount() == itemstack.getCount())
            {
                return ItemStack.EMPTY;
            }

            ItemStack itemstack2 = slot.onTake(playerIn, itemstack1);

            if (index == 9)
            {
                playerIn.dropItem(itemstack2, false);
            }
        }

        return itemstack;
    }
	
	@Override
	public void onContainerClosed(EntityPlayer playerIn){
		if(!cci.isTileEntity){
			for(int i = 0; i < this.cci.getSizeInventory() - 1; i++){
				if(!playerIn.world.isRemote && !this.getSlotFromInventory(this.cci, i).getStack().isEmpty()){
					playerIn.world.spawnEntity(new EntityItem(playerIn.world, playerIn.posX, playerIn.posY, playerIn.posZ, this.getSlotFromInventory(this.cci, i).getStack()));
				}
			}
		}
	}
	
}
