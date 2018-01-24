package com.irar.iron.blocks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.irar.iron.IrON;
import com.irar.iron.handlers.CreativeTabHandler;
import com.irar.iron.handlers.ItemHandler;
import com.irar.iron.items.ItemCatalyst;
import com.irar.iron.network.GuiHandler;
import com.irar.iron.tileentity.TileEntityOreGen;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;

public class BlockCatalyst extends Block implements ITileEntityProvider{
	
	private String name;
	
	public BlockCatalyst(Material mat, String name){
		super(mat);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabHandler.IRON_STUFF);
		this.name = name;
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune){
		switch(this.name){
		case "iridium_cat": return ItemHandler.IridiumC;
		case "biridium_cat": return ItemHandler.BiridiumC;
		case "triridium_cat": return ItemHandler.TriridiumC;
		case "quadridium_cat": return ItemHandler.QuadridiumC;
		case "quintridium_cat": return ItemHandler.QuintridiumC;
		case "sextridium_cat": return ItemHandler.SextridiumC;
		case "septridium_cat": return ItemHandler.SeptridiumC;
		case "octridium_cat": return ItemHandler.OctridiumC;
		case "nonadium_cat": return ItemHandler.NonadiumC;
		case "decadrium_cat": return ItemHandler.DecadriumC;
		}
		return ItemHandler.IridiumC;
	}
	
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn){
		
		tooltip.add("In case you like automation");
		
		super.addInformation(stack, worldIn, tooltip, flagIn);
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		switch(this.name){
		case "iridium_cat": return new ItemCatalyst.CatalystCraftingInventory(true, "iridium");
		case "biridium_cat": return new ItemCatalyst.CatalystCraftingInventory(true, "biridium");
		case "triridium_cat": return new ItemCatalyst.CatalystCraftingInventory(true, "triiridium");
		case "quadridium_cat": return new ItemCatalyst.CatalystCraftingInventory(true, "quadridium");
		case "quintridium_cat": return new ItemCatalyst.CatalystCraftingInventory(true, "quintridium");
		case "sextridium_cat": return new ItemCatalyst.CatalystCraftingInventory(true, "sextridium");
		case "septridium_cat": return new ItemCatalyst.CatalystCraftingInventory(true, "septridium");
		case "octridium_cat": return new ItemCatalyst.CatalystCraftingInventory(true, "octridium");
		case "nonadium_cat": return new ItemCatalyst.CatalystCraftingInventory(true, "nonadium");
		case "decadrium_cat": return new ItemCatalyst.CatalystCraftingInventory(true, "decadrium");
		}
		return new ItemCatalyst.CatalystCraftingInventory(true, "iridium");
	}

	@Override
	public TileEntity createTileEntity(World worldIn, IBlockState state) {
		switch(this.name){
		case "iridium_cat": return new ItemCatalyst.CatalystCraftingInventory(true, "iridium");
		case "biridium_cat": return new ItemCatalyst.CatalystCraftingInventory(true, "biridium");
		case "triridium_cat": return new ItemCatalyst.CatalystCraftingInventory(true, "triiridium");
		case "quadridium_cat": return new ItemCatalyst.CatalystCraftingInventory(true, "quadridium");
		case "quintridium_cat": return new ItemCatalyst.CatalystCraftingInventory(true, "quintridium");
		case "sextridium_cat": return new ItemCatalyst.CatalystCraftingInventory(true, "sextridium");
		case "septridium_cat": return new ItemCatalyst.CatalystCraftingInventory(true, "septridium");
		case "octridium_cat": return new ItemCatalyst.CatalystCraftingInventory(true, "octridium");
		case "nonadium_cat": return new ItemCatalyst.CatalystCraftingInventory(true, "nonadium");
		case "decadrium_cat": return new ItemCatalyst.CatalystCraftingInventory(true, "decadrium");
		}
		return new ItemCatalyst.CatalystCraftingInventory(true, "iridium");
	}
	
	@Override
	public boolean hasTileEntity(){
		return true;
	}

	@Override
	public void breakBlock(World world, BlockPos pos, IBlockState blockstate) {
		ItemCatalyst.CatalystCraftingInventory te = (ItemCatalyst.CatalystCraftingInventory) world.getTileEntity(pos);
	    InventoryHelper.dropInventoryItems(world, pos, te);
	    super.breakBlock(world, pos, blockstate);
	}

	@Override
	public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
	    if (stack.hasDisplayName()) {
	        ((ItemCatalyst.CatalystCraftingInventory) worldIn.getTileEntity(pos)).setCustomName(stack.getDisplayName());
	    }
	}
	@Override
	public EnumBlockRenderType getRenderType(IBlockState state) {
	    return EnumBlockRenderType.MODEL;
	}
	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ) {
	    if (!world.isRemote) {
	    	switch(this.name){
	    	case "iridium_cat": player.openGui(IrON.instance, GuiHandler.CATALYST_TIER_IRIDIUM, world, pos.getX(), pos.getY(), pos.getZ()); break;
	    	case "biridium_cat": player.openGui(IrON.instance, GuiHandler.CATALYST_TIER_BIRIDIUM, world, pos.getX(), pos.getY(), pos.getZ()); break;
	    	case "triridium_cat": player.openGui(IrON.instance, GuiHandler.CATALYST_TIER_TRIRIDIUM, world, pos.getX(), pos.getY(), pos.getZ()); break;
	    	case "quadridium_cat": player.openGui(IrON.instance, GuiHandler.CATALYST_TIER_QUADRIDIUM, world, pos.getX(), pos.getY(), pos.getZ()); break;
	    	case "quintridium_cat": player.openGui(IrON.instance, GuiHandler.CATALYST_TIER_QUINTRIDIUM, world, pos.getX(), pos.getY(), pos.getZ()); break;
	    	case "sextridium_cat": player.openGui(IrON.instance, GuiHandler.CATALYST_TIER_SEXTRIDIUM, world, pos.getX(), pos.getY(), pos.getZ()); break;
	    	case "septridium_cat": player.openGui(IrON.instance, GuiHandler.CATALYST_TIER_SEPTRIDIUM, world, pos.getX(), pos.getY(), pos.getZ()); break;
	    	case "octridium_cat": player.openGui(IrON.instance, GuiHandler.CATALYST_TIER_OCTRIDIUM, world, pos.getX(), pos.getY(), pos.getZ()); break;
	    	case "nonadium_cat": player.openGui(IrON.instance, GuiHandler.CATALYST_TIER_NONADIUM, world, pos.getX(), pos.getY(), pos.getZ()); break;
	    	case "decadrium_cat": player.openGui(IrON.instance, GuiHandler.CATALYST_TIER_DECADRIUM, world, pos.getX(), pos.getY(), pos.getZ()); break;
	    	}
        	player.openGui(IrON.instance, GuiHandler.CATALYST_TIER_IRIDIUM, world, pos.getX(), pos.getY(), pos.getZ());
	    }
	    return true;
	}
	
}
