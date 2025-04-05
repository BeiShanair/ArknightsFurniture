package com.besson.arknights.block.custom.tribal;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class TribalStoneStand extends FurnitureHorizontalFacingBlock{
    public static final VoxelShape SHAPE = Block.createCuboidShape(0, 0, 0, 16, 14, 16);

    public TribalStoneStand(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
}
