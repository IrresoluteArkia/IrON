package com.irar.iron.items;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.irar.iron.IrON;
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
import com.irar.iron.handlers.BlockHandler;
import com.irar.iron.handlers.ItemHandler;
import com.irar.iron.network.GuiHandler;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ITickable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;

public class ItemCatalyst extends ModItem{

	private String name;
	
	public ItemCatalyst(String name) {
		super(name);
		this.name = name;
	}
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn){
		
		if(this.name == "decadrium_catalyst"){
			tooltip.add("If you think you can smelt over 7 million IrON Ore, then you can dupe nether stars with this!");
		}
		
		super.addInformation(stack, worldIn, tooltip, flagIn);
	}
	
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand hand)
    {
        ItemStack itemstack = playerIn.getHeldItem(hand);

        if(!playerIn.isSneaking()){
            if(!worldIn.isRemote){
    	    	switch(this.name){
    	    	case "iridium_catalyst": playerIn.openGui(IrON.instance, GuiHandler.CATALYST_TIER_IRIDIUM, worldIn, 0, 0, 0); break;
    	    	case "biridium_catalyst": playerIn.openGui(IrON.instance, GuiHandler.CATALYST_TIER_BIRIDIUM, worldIn, 0, 0, 0); break; 
    	    	case "triridium_catalyst": playerIn.openGui(IrON.instance, GuiHandler.CATALYST_TIER_TRIRIDIUM, worldIn, 0, 0, 0);  break;
    	    	case "quadridium_catalyst": playerIn.openGui(IrON.instance, GuiHandler.CATALYST_TIER_QUADRIDIUM, worldIn, 0, 0, 0);  break;
    	    	case "quintridium_catalyst": playerIn.openGui(IrON.instance, GuiHandler.CATALYST_TIER_QUINTRIDIUM, worldIn, 0, 0, 0);  break;
    	    	case "sextridium_catalyst": playerIn.openGui(IrON.instance, GuiHandler.CATALYST_TIER_SEXTRIDIUM, worldIn, 0, 0, 0);  break;
    	    	case "septridium_catalyst": playerIn.openGui(IrON.instance, GuiHandler.CATALYST_TIER_SEPTRIDIUM, worldIn, 0, 0, 0);  break;
    	    	case "octridium_catalyst": playerIn.openGui(IrON.instance, GuiHandler.CATALYST_TIER_OCTRIDIUM, worldIn, 0, 0, 0);  break;
    	    	case "nonadium_catalyst": playerIn.openGui(IrON.instance, GuiHandler.CATALYST_TIER_NONADIUM, worldIn, 0, 0, 0);  break;
    	    	case "decadrium_catalyst": playerIn.openGui(IrON.instance, GuiHandler.CATALYST_TIER_DECADRIUM, worldIn, 0, 0, 0);  break;
    	    	default: return new ActionResult(EnumActionResult.FAIL, itemstack);
    	    	}
            }
            return new ActionResult(EnumActionResult.SUCCESS, itemstack);
        }
        return new ActionResult(EnumActionResult.FAIL, itemstack);
    }
	
	/*public EnumActionResult onItemUse(EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        ItemStack itemstack = playerIn.getHeldItem(hand);

        if(playerIn.isSneaking()){
	        if (itemstack.getItem().equals(ItemHandler.IridiumC)){
	        	if(worldIn.setBlockState(pos.offset(facing), BlockHandler.IridiumCat.getDefaultState())){
	                itemstack.shrink(1);
	        		return EnumActionResult.SUCCESS;
	        	}
	        }
	        if (itemstack.getItem().equals(ItemHandler.BiridiumC)){
	        	if(worldIn.setBlockState(pos.offset(facing), BlockHandler.BiridiumCat.getDefaultState())){
	                itemstack.shrink(1);
	        		return EnumActionResult.SUCCESS;
	        	}
	        }
	        if (itemstack.getItem().equals(ItemHandler.TriridiumC)){
	        	if(worldIn.setBlockState(pos.offset(facing), BlockHandler.TriridiumCat.getDefaultState())){
	                itemstack.shrink(1);
	        		return EnumActionResult.SUCCESS;
	        	}
	        }
	        if (itemstack.getItem().equals(ItemHandler.QuadridiumC)){
	        	if(worldIn.setBlockState(pos.offset(facing), BlockHandler.QuadridiumCat.getDefaultState())){
	                itemstack.shrink(1);
	        		return EnumActionResult.SUCCESS;
	        	}
	        }
	        if (itemstack.getItem().equals(ItemHandler.QuintridiumC)){
	        	if(worldIn.setBlockState(pos.offset(facing), BlockHandler.QuintridiumCat.getDefaultState())){
	                itemstack.shrink(1);
	        		return EnumActionResult.SUCCESS;
	        	}
	        }
	        if (itemstack.getItem().equals(ItemHandler.SextridiumC)){
	        	if(worldIn.setBlockState(pos.offset(facing), BlockHandler.SextridiumCat.getDefaultState())){
	                itemstack.shrink(1);
	        		return EnumActionResult.SUCCESS;
	        	}
	        }
	        if (itemstack.getItem().equals(ItemHandler.SeptridiumC)){
	        	if(worldIn.setBlockState(pos.offset(facing), BlockHandler.SeptridiumCat.getDefaultState())){
	                itemstack.shrink(1);
	        		return EnumActionResult.SUCCESS;
	        	}
	        }
	        if (itemstack.getItem().equals(ItemHandler.OctridiumC)){
	        	if(worldIn.setBlockState(pos.offset(facing), BlockHandler.OctridiumCat.getDefaultState())){
	                itemstack.shrink(1);
	        		return EnumActionResult.SUCCESS;
	        	}
	        }
	        if (itemstack.getItem().equals(ItemHandler.NonadiumC)){
	        	if(worldIn.setBlockState(pos.offset(facing), BlockHandler.NonadiumCat.getDefaultState())){
	                itemstack.shrink(1);
	        		return EnumActionResult.SUCCESS;
	        	}
	        }
	        if (itemstack.getItem().equals(ItemHandler.DecadriumC)){
	        	if(worldIn.setBlockState(pos.offset(facing), BlockHandler.DecadriumCat.getDefaultState())){
	                itemstack.shrink(1);
	        		return EnumActionResult.SUCCESS;
	        	}
	        }
        }
        return EnumActionResult.FAIL;
    }*/
	
	public static class CatalystCraftingInventory extends TileEntity implements IInventory, ITickable{
	    private NonNullList<ItemStack> inventory = NonNullList.<ItemStack>withSize(10, ItemStack.EMPTY);
	    private String customName;
	    public boolean isTileEntity;
	    private String tier;
	    private int tierNum;
	    
	    public CatalystCraftingInventory(boolean isTileEntity, String tier){
	    	this.isTileEntity = isTileEntity;
	    	this.tier = tier;
	    	switch(tier){
	    	case "iridium": this.tierNum = 1; break;
	    	case "biridium": this.tierNum = 2; break;
	    	case "triridium": this.tierNum = 3; break;
	    	case "quadridium": this.tierNum = 4; break;
	    	case "quintridium": this.tierNum = 5; break;
	    	case "sextridium": this.tierNum = 6; break;
	    	case "septridium": this.tierNum = 7; break;
	    	case "octridium": this.tierNum = 8; break;
	    	case "nonadium": this.tierNum = 9; break;
	    	case "decadrium": this.tierNum = 10; break;
	    	}
	    }

	    
	    @Override
		public void update() {
	    	ArrayList<ItemStack> ingredients = new ArrayList<ItemStack>();
	    	
	    	for(int i = 0; i < 9; i++){
	    		ingredients.add(inventory.get(i));
	    	}
	    	switch(tier){
	    		case "iridium": this.setInventorySlotContents(9, CraftingTierIridium.getInstance().getMatchingRecipeResult(ingredients), true); break;
	    		case "biridium": this.setInventorySlotContents(9, CraftingTierBiridium.getInstance().getMatchingRecipeResult(ingredients), true); break;
	    		case "triridium": this.setInventorySlotContents(9, CraftingTierTriridium.getInstance().getMatchingRecipeResult(ingredients), true); break;
	    		case "quadridium": this.setInventorySlotContents(9, CraftingTierQuadridium.getInstance().getMatchingRecipeResult(ingredients), true); break;
	    		case "quintridium": this.setInventorySlotContents(9, CraftingTierQuintridium.getInstance().getMatchingRecipeResult(ingredients), true); break;
	    		case "sextridium": this.setInventorySlotContents(9, CraftingTierSextridium.getInstance().getMatchingRecipeResult(ingredients), true); break;
	    		case "septridium": this.setInventorySlotContents(9, CraftingTierSeptridium.getInstance().getMatchingRecipeResult(ingredients), true); break;
	    		case "octridium": this.setInventorySlotContents(9, CraftingTierOctridium.getInstance().getMatchingRecipeResult(ingredients), true); break;
	    		case "nonadium": this.setInventorySlotContents(9, CraftingTierNonadium.getInstance().getMatchingRecipeResult(ingredients), true); break;
	    		case "decadrium": this.setInventorySlotContents(9, CraftingTierDecadrium.getInstance().getMatchingRecipeResult(ingredients), true); break;
	    	}
		}


	    public String getCustomName() {
	        return this.customName;
	    }

	    public void setCustomName(String customName) {
	        this.customName = customName;
	    }
	   

		@Override
		public String getName() {
		    return this.hasCustomName() ? this.customName : "container.catalyst_tier_" + this.tierNum;
		}
		
		@Override
		public boolean hasCustomName() {
	        return this.customName != null && !this.customName.isEmpty();
		}

		@Override
		public int getSizeInventory() {
			return 10;
		}

		public static int getSizeInventory(int i) {
			return 10;
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
//	        this.update();
		    if (index < 0 || index >= this.getSizeInventory())
		        return null;
		    return this.inventory.get(index);
		}
		
		@Override
		public ItemStack decrStackSize(int index, int count) {
	        ItemStack itemstack = ItemStackHelper.getAndSplit(this.inventory, index, count);
		    /*if(index == 9){
		    	for(int i = 0; i < 9; i++){
		    		this.decrStackSize(i, 1);
		    	}
		    }*/
	        if (!itemstack.isEmpty())
	        {
	            this.markDirty();
	        }

	        this.update();
	        return itemstack;

		}
		
		@Override
		public ItemStack removeStackFromSlot(int index) {
		    ItemStack stack = this.getStackInSlot(index);
	    	System.out.println(index);
		    this.setInventorySlotContents(index, null);
//	    	this.update();
		    return stack;
		}
		
		@Override
		public void setInventorySlotContents(int index, ItemStack stack) {
	        this.inventory.set(index, stack);

	        if (stack.getCount() > this.getInventoryStackLimit())
	        {
	            stack.setCount(this.getInventoryStackLimit());
	        }

	    	this.update();
	        this.markDirty();
		}

		public void setInventorySlotContents(int index, ItemStack stack, boolean unimportant) {
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

		@Override
		public ITextComponent getDisplayName() {
	        return (ITextComponent)(this.hasCustomName() ? new TextComponentString(this.getName()) : new TextComponentTranslation(this.getName(), new Object[0]));
		}

		@Override
		public void markDirty() {
			
		}


		public IRecipe getRecipeUsed() {
	    	ArrayList<ItemStack> ingredients = new ArrayList<ItemStack>();
	    	
	    	for(int i = 0; i < 9; i++){
	    		ingredients.add(inventory.get(i));
	    	}
	    	switch(tier){
	    		case "iridium": return CraftingTierIridium.getInstance().getMatchingRecipe(ingredients);
	    		case "biridium": return CraftingTierBiridium.getInstance().getMatchingRecipe(ingredients);
	    		case "triridium": return CraftingTierTriridium.getInstance().getMatchingRecipe(ingredients);
	    		case "quadridium": return CraftingTierQuadridium.getInstance().getMatchingRecipe(ingredients);
	    		case "quintridium": return CraftingTierQuintridium.getInstance().getMatchingRecipe(ingredients);
	    		case "sextridium": return CraftingTierSextridium.getInstance().getMatchingRecipe(ingredients);
	    		case "septridium": return CraftingTierSeptridium.getInstance().getMatchingRecipe(ingredients);
	    		case "octridium": return CraftingTierOctridium.getInstance().getMatchingRecipe(ingredients);
	    		case "nonadium": return CraftingTierNonadium.getInstance().getMatchingRecipe(ingredients);
	    		case "decadrium": return CraftingTierDecadrium.getInstance().getMatchingRecipe(ingredients);
	    	}
	    	return null;
		}


		
	}

}
