package com.irar.iron.tileentity;

import com.irar.iron.items.ItemCatalyst;

import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModTileEntities {
	
	public static void init(){
		GameRegistry.registerTileEntity(TileEntityOreGen.class, "ore_gen_tile_entity");
		GameRegistry.registerTileEntity(ItemCatalyst.CatalystCraftingInventory.class, "cat_tile_entity");
	}
}
