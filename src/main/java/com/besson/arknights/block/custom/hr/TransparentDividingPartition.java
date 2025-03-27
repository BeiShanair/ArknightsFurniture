package com.besson.arknights.block.custom.hr;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class TransparentDividingPartition extends FurnitureHorizontalFacingBlock{
    public static final VoxelShape SHAPE_NS = Block.createCuboidShape(-8, 0, 7, 24, 24, 9);

    public static final VoxelShape SHAPE_WE = Block.createCuboidShape(7, 0, -8, 9, 24, 24);

    public TransparentDividingPartition(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)){
            case EAST, WEST -> SHAPE_WE;
            default -> SHAPE_NS;
        };
    }
}
