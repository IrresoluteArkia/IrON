package com.irar.iron.network;

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
import com.irar.iron.gui.client.GuiTileEntityOreGen;
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
import com.irar.iron.gui.container.ContainerTileEntityOreGen;
import com.irar.iron.items.ItemCatalyst;
import com.irar.iron.tileentity.TileEntityOreGen;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler{

	public static final int TILE_ENTITY_ORE_GEN_GUI = 0;
	public static final int CATALYST_TIER_IRIDIUM = 1;
	public static final int CATALYST_TIER_BIRIDIUM = 2;
	public static final int CATALYST_TIER_TRIRIDIUM = 3;
	public static final int CATALYST_TIER_QUADRIDIUM = 4;
	public static final int CATALYST_TIER_QUINTRIDIUM = 5;
	public static final int CATALYST_TIER_SEXTRIDIUM = 6;
	public static final int CATALYST_TIER_SEPTRIDIUM = 7;
	public static final int CATALYST_TIER_OCTRIDIUM = 8;
	public static final int CATALYST_TIER_NONADIUM = 9;
	public static final int CATALYST_TIER_DECADRIUM = 10;
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == this.TILE_ENTITY_ORE_GEN_GUI)
			return new ContainerTileEntityOreGen(player.inventory, (TileEntityOreGen) world.getTileEntity(new BlockPos(x, y, z)));
		if(ID == this.CATALYST_TIER_IRIDIUM){
			if(x == 0 && y == 0 && z == 0){
				return new ContainerCatalystTierIridium(player.inventory, new ItemCatalyst.CatalystCraftingInventory(false, "iridium"));
			}else{
				return new ContainerCatalystTierIridium(player.inventory, (ItemCatalyst.CatalystCraftingInventory) world.getTileEntity(new BlockPos(x, y, z)));
			}
		}
		if(ID == this.CATALYST_TIER_BIRIDIUM){
			if(x == 0 && y == 0 && z == 0){
				return new ContainerCatalystTierBiridium(player.inventory, new ItemCatalyst.CatalystCraftingInventory(false, "biridium"));
			}else{
				return new ContainerCatalystTierBiridium(player.inventory, (ItemCatalyst.CatalystCraftingInventory) world.getTileEntity(new BlockPos(x, y, z)));
			}
		}
		if(ID == this.CATALYST_TIER_TRIRIDIUM){
			if(x == 0 && y == 0 && z == 0){
				return new ContainerCatalystTierTriridium(player.inventory, new ItemCatalyst.CatalystCraftingInventory(false, "triridium"));
			}else{
				return new ContainerCatalystTierTriridium(player.inventory, (ItemCatalyst.CatalystCraftingInventory) world.getTileEntity(new BlockPos(x, y, z)));
			}
		}
		if(ID == this.CATALYST_TIER_QUADRIDIUM){
			if(x == 0 && y == 0 && z == 0){
				return new ContainerCatalystTierQuadridium(player.inventory, new ItemCatalyst.CatalystCraftingInventory(false, "quadridium"));
			}else{
				return new ContainerCatalystTierQuadridium(player.inventory, (ItemCatalyst.CatalystCraftingInventory) world.getTileEntity(new BlockPos(x, y, z)));
			}
		}
		if(ID == this.CATALYST_TIER_QUINTRIDIUM){
			if(x == 0 && y == 0 && z == 0){
				return new ContainerCatalystTierQuintridium(player.inventory, new ItemCatalyst.CatalystCraftingInventory(false, "quintridium"));
			}else{
				return new ContainerCatalystTierQuintridium(player.inventory, (ItemCatalyst.CatalystCraftingInventory) world.getTileEntity(new BlockPos(x, y, z)));
			}
		}
		if(ID == this.CATALYST_TIER_SEXTRIDIUM){
			if(x == 0 && y == 0 && z == 0){
				return new ContainerCatalystTierSextridium(player.inventory, new ItemCatalyst.CatalystCraftingInventory(false, "sextridium"));
			}else{
				return new ContainerCatalystTierSextridium(player.inventory, (ItemCatalyst.CatalystCraftingInventory) world.getTileEntity(new BlockPos(x, y, z)));
			}
		}
		if(ID == this.CATALYST_TIER_SEPTRIDIUM){
			if(x == 0 && y == 0 && z == 0){
				return new ContainerCatalystTierSeptridium(player.inventory, new ItemCatalyst.CatalystCraftingInventory(false, "septridium"));
			}else{
				return new ContainerCatalystTierSeptridium(player.inventory, (ItemCatalyst.CatalystCraftingInventory) world.getTileEntity(new BlockPos(x, y, z)));
			}
		}
		if(ID == this.CATALYST_TIER_OCTRIDIUM){
			if(x == 0 && y == 0 && z == 0){
				return new ContainerCatalystTierOctridium(player.inventory, new ItemCatalyst.CatalystCraftingInventory(false, "octridium"));
			}else{
				return new ContainerCatalystTierOctridium(player.inventory, (ItemCatalyst.CatalystCraftingInventory) world.getTileEntity(new BlockPos(x, y, z)));
			}
		}
		if(ID == this.CATALYST_TIER_NONADIUM){
			if(x == 0 && y == 0 && z == 0){
				return new ContainerCatalystTierNonadium(player.inventory, new ItemCatalyst.CatalystCraftingInventory(false, "nonadium"));
			}else{
				return new ContainerCatalystTierNonadium(player.inventory, (ItemCatalyst.CatalystCraftingInventory) world.getTileEntity(new BlockPos(x, y, z)));
			}
		}
		if(ID == this.CATALYST_TIER_DECADRIUM){
			if(x == 0 && y == 0 && z == 0){
				return new ContainerCatalystTierDecadrium(player.inventory, new ItemCatalyst.CatalystCraftingInventory(false, "decadrium"));
			}else{
				return new ContainerCatalystTierDecadrium(player.inventory, (ItemCatalyst.CatalystCraftingInventory) world.getTileEntity(new BlockPos(x, y, z)));
			}
		}
		
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == this.TILE_ENTITY_ORE_GEN_GUI)
			return new GuiTileEntityOreGen(player.inventory, (TileEntityOreGen) world.getTileEntity(new BlockPos(x, y, z)));
		if(ID == this.CATALYST_TIER_IRIDIUM){
			if(x == 0 && y == 0 && z == 0){
				return new GuiCatalystTierIridium(player.inventory, new ItemCatalyst.CatalystCraftingInventory(false, "iridium"));
			}else{
				return new GuiCatalystTierIridium(player.inventory, (ItemCatalyst.CatalystCraftingInventory) world.getTileEntity(new BlockPos(x, y, z)));
			}
		}
		if(ID == this.CATALYST_TIER_BIRIDIUM){
			if(x == 0 && y == 0 && z == 0){
				return new GuiCatalystTierBiridium(player.inventory, new ItemCatalyst.CatalystCraftingInventory(false, "biridium"));
			}else{
				return new GuiCatalystTierBiridium(player.inventory, (ItemCatalyst.CatalystCraftingInventory) world.getTileEntity(new BlockPos(x, y, z)));
			}
		}
		if(ID == this.CATALYST_TIER_TRIRIDIUM){
			if(x == 0 && y == 0 && z == 0){
				return new GuiCatalystTierTriridium(player.inventory, new ItemCatalyst.CatalystCraftingInventory(false, "triridium"));
			}else{
				return new GuiCatalystTierTriridium(player.inventory, (ItemCatalyst.CatalystCraftingInventory) world.getTileEntity(new BlockPos(x, y, z)));
			}
		}
		if(ID == this.CATALYST_TIER_QUADRIDIUM){
			if(x == 0 && y == 0 && z == 0){
				return new GuiCatalystTierQuadridium(player.inventory, new ItemCatalyst.CatalystCraftingInventory(false, "quadridium"));
			}else{
				return new GuiCatalystTierQuadridium(player.inventory, (ItemCatalyst.CatalystCraftingInventory) world.getTileEntity(new BlockPos(x, y, z)));
			}
		}
		if(ID == this.CATALYST_TIER_QUINTRIDIUM){
			if(x == 0 && y == 0 && z == 0){
				return new GuiCatalystTierQuintridium(player.inventory, new ItemCatalyst.CatalystCraftingInventory(false, "quintridium"));
			}else{
				return new GuiCatalystTierQuintridium(player.inventory, (ItemCatalyst.CatalystCraftingInventory) world.getTileEntity(new BlockPos(x, y, z)));
			}
		}
		if(ID == this.CATALYST_TIER_SEXTRIDIUM){
			if(x == 0 && y == 0 && z == 0){
				return new GuiCatalystTierSextridium(player.inventory, new ItemCatalyst.CatalystCraftingInventory(false, "sextridium"));
			}else{
				return new GuiCatalystTierSextridium(player.inventory, (ItemCatalyst.CatalystCraftingInventory) world.getTileEntity(new BlockPos(x, y, z)));
			}
		}
		if(ID == this.CATALYST_TIER_SEPTRIDIUM){
			if(x == 0 && y == 0 && z == 0){
				return new GuiCatalystTierSeptridium(player.inventory, new ItemCatalyst.CatalystCraftingInventory(false, "septridium"));
			}else{
				return new GuiCatalystTierSeptridium(player.inventory, (ItemCatalyst.CatalystCraftingInventory) world.getTileEntity(new BlockPos(x, y, z)));
			}
		}
		if(ID == this.CATALYST_TIER_OCTRIDIUM){
			if(x == 0 && y == 0 && z == 0){
				return new GuiCatalystTierOctridium(player.inventory, new ItemCatalyst.CatalystCraftingInventory(false, "octridium"));
			}else{
				return new GuiCatalystTierOctridium(player.inventory, (ItemCatalyst.CatalystCraftingInventory) world.getTileEntity(new BlockPos(x, y, z)));
			}
		}
		if(ID == this.CATALYST_TIER_NONADIUM){
			if(x == 0 && y == 0 && z == 0){
				return new GuiCatalystTierNonadium(player.inventory, new ItemCatalyst.CatalystCraftingInventory(false, "nonadium"));
			}else{
				return new GuiCatalystTierNonadium(player.inventory, (ItemCatalyst.CatalystCraftingInventory) world.getTileEntity(new BlockPos(x, y, z)));
			}
		}
		if(ID == this.CATALYST_TIER_DECADRIUM){
			if(x == 0 && y == 0 && z == 0){
				return new GuiCatalystTierDecadrium(player.inventory, new ItemCatalyst.CatalystCraftingInventory(false, "decadrium"));
			}else{
				return new GuiCatalystTierDecadrium(player.inventory, (ItemCatalyst.CatalystCraftingInventory) world.getTileEntity(new BlockPos(x, y, z)));
			}
		}
		return null;
	}

}
