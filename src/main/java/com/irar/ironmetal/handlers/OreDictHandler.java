package com.irar.ironmetal.handlers;

import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictHandler {
	
	public static void init(){
		OreDictionary.registerOre("oreMagmite", BlockHandler.NetherMagmiteOre);
		OreDictionary.registerOre("ingotAluminum", ItemHandler.AluminumIngot);
		OreDictionary.registerOre("ingotSilvadrium", ItemHandler.SilvadriumIngot);
		OreDictionary.registerOre("ingotShroomite", ItemHandler.ShroomiteIngot);
		OreDictionary.registerOre("blockAluminum", BlockHandler.AluminumBlock);
		OreDictionary.registerOre("blockSilvadrium", BlockHandler.SilvadriumBlock);
		OreDictionary.registerOre("blockShroomite", BlockHandler.ShroomiteBlock);
		OreDictionary.registerOre("crystalCertusQuartz", ItemHandler.IQuartz);
		OreDictionary.registerOre("gemQuartzBlack", ItemHandler.DarkQuartz);
		
		if(Loader.isModLoaded("mores")){
			OreDictionary.registerOre("ingotDetriminium", ItemHandler.DetriminiumIngot);
		}
		
	}
	
}
