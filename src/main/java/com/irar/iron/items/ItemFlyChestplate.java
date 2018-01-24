package com.irar.iron.items;

import java.util.ArrayList;
import java.util.List;

import com.irar.iron.handlers.CreativeTabHandler;
import com.irar.iron.handlers.ItemHandler;
import com.mojang.authlib.GameProfile;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ItemFlyChestplate extends ItemArmor{

	public static ArrayList<EntityPlayer> playersWearing = new ArrayList<EntityPlayer>();
	
	public static ArmorMaterial FLIGHT = EnumHelper.addArmorMaterial("flight", "iron:flight", -1, new int[]{3, 6, 8, 3}, 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 80.0F);
	
	public ItemFlyChestplate(String name) {
		super(FLIGHT, 1, EntityEquipmentSlot.CHEST);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabHandler.IRON_STUFF);
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		boolean foundPlayer = false;
		for(int i = 0; i < playersWearing.size(); i++){
			if(playersWearing.get(i).getUUID(playersWearing.get(i).getGameProfile()).equals(player.getUUID(player.getGameProfile()))){
				foundPlayer = true;
			}
		}
		if(!foundPlayer){
			playersWearing.add(player);
		}
	}   

	static {
        final EventHandlerFly handler = new EventHandlerFly();
        MinecraftForge.EVENT_BUS.register((Object)handler);
        FMLCommonHandler.instance().bus().register((Object)handler);
    }
    
    public static class EventHandlerFly
    {
        @SubscribeEvent
        public void entTick(final LivingEvent.LivingUpdateEvent event) {
            if (event.getEntity().world.isRemote) {
                return;
            }
            if(event.getEntity() instanceof EntityPlayerMP){
            	final EntityPlayerMP entityPlayer = (EntityPlayerMP)event.getEntity();
            	boolean isOnList = false;
            	int index = 0;
            	
            	for(int i = 0; i < playersWearing.size(); i++){
            		if(entityPlayer.getUUID(entityPlayer.getGameProfile()).equals(playersWearing.get(i).getUUID(playersWearing.get(i).getGameProfile()))){
            			isOnList = true;
            			index = i;
            		}
            	}
            	
            	
            	if(isOnList){
	            	if(entityPlayer.inventory.armorItemInSlot(2).getItem() != ItemHandler.FlightChestplate){
	            		if(!entityPlayer.isCreative()){
		            		entityPlayer.capabilities.allowFlying = false;
		            		entityPlayer.capabilities.isFlying = false;
		            		entityPlayer.sendPlayerAbilities();
		            		playersWearing.remove(index);
	            		}
	            	}else{
	            		if(!entityPlayer.isCreative()){
		            		entityPlayer.capabilities.allowFlying = true;
		            		entityPlayer.sendPlayerAbilities();
	            		}
	            	}
            	}
            }
        }
    }
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn){
		tooltip.add("Let's You Fly!!!!!");
		tooltip.add("(Don't Even Ask How)");
		super.addInformation(stack, worldIn, tooltip, flagIn);
	}
	
}
