package com.irar.iron.blocks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.irar.iron.IrON;
import com.irar.iron.handlers.CreativeTabHandler;
import com.irar.iron.network.GuiHandler;
import com.irar.iron.tileentity.TileEntityOreGen;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;

public class BlockOreGen extends Block implements IOreGen, ITileEntityProvider{
	
	public BlockOreGen(Material mat, String name, float hardness, float resistance){
		super(mat);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabHandler.IRON_STUFF);
		setHardness(hardness);
		setResistance(resistance);
	}

	@Override
	public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient) {
		return true;
	}

	@Override
	public boolean canUseIron(World worldIn, Random rand, BlockPos pos, IBlockState state) {
		return true;
	}

	@Override
	public void grow(World worldIn, Random rand, BlockPos pos, IBlockState state) {
		String[] names = OreDictionary.getOreNames();
		ArrayList<String> orenames = new ArrayList<String>();
		ArrayList<ItemStack> allores = new ArrayList<ItemStack>();
		for(int i = 0; i < names.length; i++){
			if(names[i].startsWith("ore")){
				orenames.add(names[i]);
				NonNullList<ItemStack> ores = OreDictionary.getOres(names[i]);
				for(int j = 0; j < ores.size(); j++){
					allores.add(ores.get(j));
				}
			}
		}
		ItemStack randore = allores.get(rand.nextInt(allores.size()));
		spawnAsEntity(worldIn, pos, new ItemStack(randore.getItem(), 1, randore.getMetadata()));
	}
	
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn){
		
		tooltip.add("Feed me IrON!!!");
		
		super.addInformation(stack, worldIn, tooltip, flagIn);
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntityOreGen();
	}

	@Override
	public TileEntity createTileEntity(World worldIn, IBlockState state) {
		return new TileEntityOreGen();
	}
	
	@Override
	public boolean hasTileEntity(){
		return true;
	}

	@Override
	public void breakBlock(World world, BlockPos pos, IBlockState blockstate) {
	    TileEntityOreGen te = (TileEntityOreGen) world.getTileEntity(pos);
	    InventoryHelper.dropInventoryItems(world, pos, te);
	    super.breakBlock(world, pos, blockstate);
	}

	@Override
	public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
	    if (stack.hasDisplayName()) {
	        ((TileEntityOreGen) worldIn.getTileEntity(pos)).setCustomName(stack.getDisplayName());
	    }
	}
	@Override
	public EnumBlockRenderType getRenderType(IBlockState state) {
	    return EnumBlockRenderType.MODEL;
	}
	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ) {
	    if (!world.isRemote) {
	        player.openGui(IrON.instance, GuiHandler.TILE_ENTITY_ORE_GEN_GUI, world, pos.getX(), pos.getY(), pos.getZ());
	    }
	    return true;
	}
	
}
