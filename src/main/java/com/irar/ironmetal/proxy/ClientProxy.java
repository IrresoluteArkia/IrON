package com.irar.ironmetal.proxy;

import com.irar.ironmetal.handlers.BlockHandler;
import com.irar.ironmetal.handlers.ItemHandler;
import com.irar.ironmetal.handlers.OreDictHandler;

public class ClientProxy extends CommonProxy{
	public void init(){
		ItemHandler.registerRenders();
		BlockHandler.registerRenders();
		OreDictHandler.init();
	}
}
