package com.irar.iron.items;

import javax.annotation.Nullable;

import com.irar.iron.blocks.IOreGen;

import net.minecraft.block.Block;
import net.minecraft.block.BlockOldLog;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.IGrowable;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.util.FakePlayerFactory;
import net.minecraftforge.event.ForgeEventFactory;

public class ItemIrON extends ModItem{

	public ItemIrON(String name) {
		super(name);
	}

    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        ItemStack itemstack = player.getHeldItem(hand);

        if (applyBonemeal(itemstack, worldIn, pos, player, hand))
        {
            if (!worldIn.isRemote)
            {
                worldIn.playEvent(2005, pos, 0);
            }

            return EnumActionResult.SUCCESS;
        }
        return EnumActionResult.FAIL;
    }

    public static boolean applyBonemeal(ItemStack stack, World worldIn, BlockPos target)
    {
        if (worldIn instanceof WorldServer)
            return applyBonemeal(stack, worldIn, target, FakePlayerFactory.getMinecraft((WorldServer)worldIn), null);
        return false;
    }

    public static boolean applyBonemeal(ItemStack stack, World worldIn, BlockPos target, EntityPlayer player, @Nullable EnumHand hand)
    {
        IBlockState iblockstate = worldIn.getBlockState(target);

        int hook = ForgeEventFactory.onApplyBonemeal(player, worldIn, target, iblockstate, stack, hand);
        if (hook != 0) return hook > 0;

        if (iblockstate.getBlock() instanceof IOreGen)
        {
            IOreGen igrowable = (IOreGen)iblockstate.getBlock();

            if (igrowable.canGrow(worldIn, target, iblockstate, worldIn.isRemote))
            {
                if (!worldIn.isRemote)
                {
                    if (igrowable.canUseIron(worldIn, worldIn.rand, target, iblockstate))
                    {
                        igrowable.grow(worldIn, worldIn.rand, target, iblockstate);
                    }

                    stack.shrink(1);
                }

                return true;
            }
        }

        return false;
    }

}
