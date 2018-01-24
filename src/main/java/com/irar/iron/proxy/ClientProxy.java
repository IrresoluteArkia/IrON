package com.irar.iron.proxy;

import com.irar.iron.handlers.BlockHandler;
import com.irar.iron.handlers.ItemHandler;
import com.irar.iron.handlers.OreDictHandler;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;

public class ClientProxy extends CommonProxy{
	public void init(FMLInitializationEvent event){
		ItemHandler.registerRenders();
		BlockHandler.registerRenders();
		OreDictHandler.init();
	}
}
