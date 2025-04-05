package com.besson.arknights.block.custom.tribal;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class TribalDecorativeChandelier extends FurnitureHorizontalFacingBlock{
    public static final VoxelShape SHAPE = Block.createCuboidShape(2, 1, 2, 14, 16, 14);

    public TribalDecorativeChandelier(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
}
