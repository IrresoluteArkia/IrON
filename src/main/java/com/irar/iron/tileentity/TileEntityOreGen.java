package com.irar.iron.tileentity;

import java.util.ArrayList;
import java.util.Random;

import com.irar.iron.handlers.ItemHandler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.datafix.walkers.ItemStackData;
import net.minecraft.util.datafix.walkers.ItemStackDataLists;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.oredict.OreDictionary;

public class TileEntityOreGen extends TileEntity implements ITickable, IInventory{
	
	private Random rand = new Random();
	private int tickNum = 0;
    private NonNullList<ItemStack> inventory = NonNullList.<ItemStack>withSize(27, ItemStack.EMPTY);
    private String customName = "Ore Generator";
    
    public TileEntityOreGen(){

    }

    public String getCustomName() {
        return this.customName;
    }

    public void setCustomName(String customName) {
        this.customName = customName;
    }
    
	@Override
	public void update() {
//		this.tickNum++;
//		if(this.tickNum >= 20){
//			this.tickNum = 0;
			if(this.getStackInSlot(0).getItem().equals(ItemHandler.IrON)){
				if(!(this.getStackInSlot(0).equals(ItemStack.EMPTY)) && this.genOre()){
					this.decrStackSize(0, 1);
				}
			}
//		}
	}
	
	public boolean genOre(){
		String[] names = OreDictionary.getOreNames();
		ArrayList<String> orenames = new ArrayList<String>();
		ArrayList<ItemStack> allores = new ArrayList<ItemStack>();
		for(int i = 0; i < names.length; i++){
			if(names[i].startsWith("ore")){
				orenames.add(names[i]);
				NonNullList<ItemStack> ores = OreDictionary.getOres(names[i]);
				for(int j = 0; j < ores.size(); j++){
					allores.add(ores.get(j));
				}
			}
		}
		ItemStack randore = allores.get(rand.nextInt(allores.size()));
		for(int i = 0; i < this.getSizeInventory(); i++){
			if(this.getStackInSlot(i).equals(ItemStack.EMPTY)){
				this.setInventorySlotContents(i, new ItemStack(randore.getItem(), 1, randore.getMetadata()));
				return true;
			}
			if(this.getStackInSlot(i).getItem().equals(randore.getItem())){
				ItemStack tempStack = this.getStackInSlot(i);
				if(tempStack.getCount() < this.getInventoryStackLimit()){
					tempStack.setCount(tempStack.getCount() + 1);
					this.setInventorySlotContents(i, tempStack);
					return true;
				}
			}
		}
        this.markDirty();
		return false;
	}

	@Override
	public String getName() {
	    return this.hasCustomName() ? this.customName : "container.tile_entity_ore_gen";
	}
	
	@Override
	public boolean hasCustomName() {
	    return this.customName != null && !this.customName.equals("");
	}

	@Override
	public int getSizeInventory() {
		return 9;
	}

	public static int getSizeInventory(int i) {
		return 9;
	}

	@Override
    public boolean isEmpty()
    {
        for (ItemStack itemstack : this.inventory)
        {
            if (!itemstack.isEmpty())
            {
                return false;
            }
        }

        return true;
    }

	@Override
	public ItemStack getStackInSlot(int index) {
	    if (index < 0 || index >= this.getSizeInventory())
	        return null;
	    return this.inventory.get(index);
	}
	
	@Override
	public ItemStack decrStackSize(int index, int count) {
        ItemStack itemstack = ItemStackHelper.getAndSplit(this.inventory, index, count);

        if (!itemstack.isEmpty())
        {
            this.markDirty();
        }

        return itemstack;

	}
	
	@Override
	public ItemStack removeStackFromSlot(int index) {
	    ItemStack stack = this.getStackInSlot(index);
	    this.setInventorySlotContents(index, null);
        this.markDirty();
	    return stack;
	}
	
	@Override
	public void setInventorySlotContents(int index, ItemStack stack) {
        this.inventory.set(index, stack);

        if (stack.getCount() > this.getInventoryStackLimit())
        {
            stack.setCount(this.getInventoryStackLimit());
        }

        this.markDirty();
	}

	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	@Override
	public boolean isUsableByPlayer(EntityPlayer player) {
//	    return this.worldObj.getTileEntity(this.getPos()) == this && player.getDistanceSq(this.pos.add(0.5, 0.5, 0.5)) <= 64;
		return true;
	}
	
	@Override
	public void openInventory(EntityPlayer player) {
		
	}

	@Override
	public void closeInventory(EntityPlayer player) {
		
	}

	@Override
	public boolean isItemValidForSlot(int index, ItemStack stack) {
		return true;
	}

	@Override
	public int getField(int id) {
		return 0;
	}

	@Override
	public void setField(int id, int value) {
		
	}

	@Override
	public int getFieldCount() {
		return 0;
	}

	@Override
	public void clear() {
		for (int i = 0; i < this.getSizeInventory(); i++)
	        this.setInventorySlotContents(i, null);
	}

    public void readFromNBT(NBTTagCompound compound)
    {
        super.readFromNBT(compound);
        this.inventory = NonNullList.<ItemStack>withSize(this.getSizeInventory(), ItemStack.EMPTY);

        ItemStackHelper.loadAllItems(compound, this.inventory);

        if (compound.hasKey("CustomName", 8))
        {
            this.customName = compound.getString("CustomName");
        }
    }

    public NBTTagCompound writeToNBT(NBTTagCompound compound)
    {
        super.writeToNBT(compound);

        ItemStackHelper.saveAllItems(compound, this.inventory);

        if (this.hasCustomName())
        {
            compound.setString("CustomName", this.customName);
        }

        return compound;
    }
    
	@Override
	public ITextComponent getDisplayName() {
        return (ITextComponent)(this.hasCustomName() ? new TextComponentString(this.getName()) : new TextComponentTranslation(this.getName(), new Object[0]));
	}

    
}
