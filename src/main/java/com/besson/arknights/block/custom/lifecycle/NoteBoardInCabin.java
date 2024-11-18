package com.besson.arknights.block.custom.lifecycle;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class NoteBoardInCabin extends FurnitureHorizontalFacingBlock {
    public NoteBoardInCabin(Settings settings) {
        super(settings);
    }
    private static final VoxelShape SHAPE_N = Block.createCuboidShape(-9, 0, 15, 19, 22, 16);
    private static final VoxelShape SHAPE_S = Block.createCuboidShape(-3, 0, 0, 25, 22, 1);
    private static final VoxelShape SHAPE_W = Block.createCuboidShape(15, 0, -3, 16, 22, 25);
    private static final VoxelShape SHAPE_E = Block.createCuboidShape(0, 0, -9, 1, 22, 19);

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)) {
            case SOUTH -> SHAPE_S;
            case WEST -> SHAPE_W;
            case EAST -> SHAPE_E;
            default -> SHAPE_N;
        };
    }
}
