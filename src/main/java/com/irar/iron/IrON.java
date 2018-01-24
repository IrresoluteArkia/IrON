package com.irar.iron;

import com.irar.iron.proxy.IProxy;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;

@Mod(modid = Ref.MODID, version = Ref.VERSION)

public class IrON {
	@SidedProxy(clientSide=Ref.CLIENT_PROXY, serverSide=Ref.SERVER_PROXY)
	public static IProxy proxy;
	
	@Instance("iron")
    public static IrON instance = new IrON();
	
    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
    	proxy.preInit(event);
    }
	
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	proxy.init(event);
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
    	proxy.postInit(event);
    }
}
