package com.irar.ironmetal.proxy;

import com.irar.ironmetal.handlers.BlockHandler;
import com.irar.ironmetal.handlers.CraftingHandler;
import com.irar.ironmetal.handlers.ItemHandler;
import com.irar.ironmetal.handlers.OreDictHandler;
import com.irar.ironmetal.world.WorldGenOre;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInterModComms;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy implements IProxy{

	@Override
	public void preInit() {
		ItemHandler.init();
		ItemHandler.register();
		
		BlockHandler.init();
		BlockHandler.register();
		
		GameRegistry.registerWorldGenerator(new WorldGenOre(), 0);
		
		OreDictHandler.init();
	}

	@Override
	public void init() {
	}

	@Override
	public void postInit() {
		CraftingHandler.init();
	}

}
