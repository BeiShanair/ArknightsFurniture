package com.besson.arknights.block.custom.airtight;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class CleanroomLorry extends FurnitureHorizontalFacingBlock{

    public CleanroomLorry(Settings settings) {
        super(settings);
    }

    private static final VoxelShape SHAPE_N = Block.createCuboidShape(-1, 0, -8, 17, 25, 23);
    private static final VoxelShape SHAPE_W = Block.createCuboidShape(-8, 0, -1, 23, 25, 17);
    private static final VoxelShape SHAPE_S = Block.createCuboidShape(-1, 0, -7, 17, 25, 24);
    private static final VoxelShape SHAPE_E = Block.createCuboidShape(-7, 0, -1, 24, 25, 17);

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
