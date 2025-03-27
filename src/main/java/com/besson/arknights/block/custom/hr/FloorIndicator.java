package com.besson.arknights.block.custom.hr;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class FloorIndicator extends FurnitureHorizontalFacingBlock{
    public static final VoxelShape SHAPE_N = Block.createCuboidShape(-8, 0, 7.5, 24, 16, 10.5);

    public static final VoxelShape SHAPE_W = Block.createCuboidShape(7.5, 0, -8, 10.5, 16, 24);

    public static final VoxelShape SHAPE_S = Block.createCuboidShape(-8, 0, 5.5, 24, 16, 8.5);

    public static final VoxelShape SHAPE_E = Block.createCuboidShape(5.5, 0, -8, 8.5, 16, 24);

    public FloorIndicator(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)){
            case EAST -> SHAPE_E;
            case SOUTH -> SHAPE_S;
            case WEST -> SHAPE_W;
            default -> SHAPE_N;
        };
    }
}
