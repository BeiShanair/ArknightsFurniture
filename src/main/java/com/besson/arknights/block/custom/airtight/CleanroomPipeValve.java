package com.besson.arknights.block.custom.airtight;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class CleanroomPipeValve extends FurnitureHorizontalFacingBlock{

    public CleanroomPipeValve(Settings settings) {
        super(settings);
    }

    private static final VoxelShape SHAPE_N = Block.createCuboidShape(3, 0, 15, 13, 25, 16);
    private static final VoxelShape SHAPE_W = Block.createCuboidShape(15, 0, 3, 16, 25, 13);
    private static final VoxelShape SHAPE_S = Block.createCuboidShape(3, 0, 0, 13, 25, 1);
    private static final VoxelShape SHAPE_E = Block.createCuboidShape(0, 0, 3, 1, 25, 13);

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)){
            case WEST -> SHAPE_W;
            case SOUTH -> SHAPE_S;
            case EAST -> SHAPE_E;
            default -> SHAPE_N;
        };
    }
}
