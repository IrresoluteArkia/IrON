package com.irar.ironmetal.world;

import java.util.Random;
import java.util.function.Predicate;

import com.irar.ironmetal.handlers.BlockHandler;

import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenOre implements IWorldGenerator{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.getDimension()){
		case 0:
			genSurface(world, random, chunkX*16, chunkZ*16);
			break;
		case -1:
			genNether(world, random, chunkX*16, chunkZ*16);
			break;
		}
	}
	private void genSurface(World world, Random random, int chunkX, int chunkZ){
//		addOreSpawn(BlockHandler.IrONOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16, 20, 50, 50, 60,  BlockMatcher.forBlock(Blocks.STONE));
	}
	private void genNether(World world, Random random, int chunkX, int chunkZ){
		addOreSpawn(BlockHandler.NetherMagmiteOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16, 10, 10, 30, 123,  BlockMatcher.forBlock(Blocks.NETHERRACK));
	}
	private void addOreSpawn(IBlockState block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chance, int minY, int maxY, BlockMatcher blockToSpawnIn){
		int diffMinMaxY = maxY - minY;
		for(int x = 0; x < chance; x++){
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(diffMinMaxY);
			int posZ = blockZPos + random.nextInt(maxZ);
//			System.out.println(posX+", "+posY+", "+posZ);
			(new WorldGenMinable(block, maxVeinSize, blockToSpawnIn)).generate(world, random, new BlockPos(posX, posY, posZ));
		}
	}
}
