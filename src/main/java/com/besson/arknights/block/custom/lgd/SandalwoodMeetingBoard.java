package com.besson.arknights.block.custom.lgd;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class SandalwoodMeetingBoard extends FurnitureHorizontalFacingBlock {
    public SandalwoodMeetingBoard(Settings settings) {
        super(settings);
    }
    private static final VoxelShape SHAPE_N = Block.createCuboidShape(-16, 0, 14, 32, 32, 16);
    private static final VoxelShape SHAPE_W = Block.createCuboidShape(14, 0, -16, 16, 32, 32);
    private static final VoxelShape SHAPE_S = Block.createCuboidShape(-16, 0, 0, 32, 32, 2);
    private static final VoxelShape SHAPE_E = Block.createCuboidShape(0, 0, -16, 2, 32, 32);

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
