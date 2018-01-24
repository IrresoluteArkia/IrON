package com.irar.iron.proxy;

import com.irar.iron.IrON;
import com.irar.iron.handlers.BlockHandler;
import com.irar.iron.handlers.CraftingHandler;
import com.irar.iron.handlers.ItemHandler;
import com.irar.iron.handlers.OreDictHandler;
import com.irar.iron.items.ItemFlyChestplate.EventHandlerFly;
import com.irar.iron.network.GuiHandler;
import com.irar.iron.tileentity.ModTileEntities;
import com.irar.iron.world.WorldGenOre;

import net.minecraft.client.main.Main;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInterModComms;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy implements IProxy{

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		ItemHandler.init();
		ItemHandler.register();
		
		BlockHandler.init();
		BlockHandler.register();
		
		GameRegistry.registerWorldGenerator(new WorldGenOre(), 0);
		
		ModTileEntities.init();
		OreDictHandler.init();
		NetworkRegistry.INSTANCE.registerGuiHandler(IrON.instance, new GuiHandler());
		System.out.println(FMLInterModComms.sendMessage("craftmatter", "MATTER_VALUE_REGISTRATION", new ItemStack(ItemHandler.CopperIngot)));
		FMLInterModComms.sendMessage("craftmatter", "MATTER_VALUE_REGISTRATION", 10 + "");
	}

	@Override
	public void init(FMLInitializationEvent event) {
	}

	@Override
	public void postInit(FMLPostInitializationEvent event) {
		CraftingHandler.init();
        final MainEventHandler handler = new MainEventHandler();
        MinecraftForge.EVENT_BUS.register((Object)handler);
        FMLCommonHandler.instance().bus().register((Object)handler);
	}
	
	public static class MainEventHandler{
		@SubscribeEvent
		public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event){
			ITextComponent url = ForgeHooks.newChatWithLinks("https://www.planetminecraft.com/mod/iron-3925630/");//new TextComponentString("§b§lhttps://www.planetminecraft.com/mod/iron-3925630/");
			TextComponentString messagep1 = new TextComponentString("[IrON]");
			TextComponentString messagep2 = new TextComponentString(" Need help with catalyst recipes? Look in JEI!");
			messagep1.setStyle(new Style().setColor(TextFormatting.DARK_RED));
			messagep2.setStyle(new Style().setBold(true).setColor(TextFormatting.AQUA));
			messagep1.appendSibling(messagep2);
//			event.player.sendMessage(new TextComponentString("§4[IrON] §b§lNeed help with catalyst recipes? Go here: "));
			event.player.sendMessage(messagep1);
//			event.player.sendMessage(url);
		}
	}

}
