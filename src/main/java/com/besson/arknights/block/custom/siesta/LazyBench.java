package com.besson.arknights.block.custom.siesta;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import com.besson.arknights.block.SofaBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class LazyBench extends SofaBlock {

    public LazyBench(Settings settings) {
        super(settings);
    }

    private static final VoxelShape SHAPE= Block.createCuboidShape(0, 0, 0, 16, 16,16);

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
}
