package com.irar.iron.handlers;

import net.minecraftforge.oredict.OreDictionary;

public class OreDictHandler {
	
	public static void init(){
		OreDictionary.registerOre("ingotCopper", ItemHandler.CopperIngot);
		OreDictionary.registerOre("ingotSilver", ItemHandler.SilverIngot);
		OreDictionary.registerOre("ingotTin", ItemHandler.TinIngot);
		OreDictionary.registerOre("ingotLead", ItemHandler.LeadIngot);
		OreDictionary.registerOre("ingotNickel", ItemHandler.NickelIngot);
	}
	
}
