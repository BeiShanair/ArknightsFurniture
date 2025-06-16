package com.besson.arknights.block.custom.lifecycle;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class NoteBoardInCabinSign extends FurnitureHorizontalFacingBlock {
    public NoteBoardInCabinSign(Settings settings) {
        super(settings);
    }
    private static final VoxelShape SHAPE_N = Block.createCuboidShape(3, 3, 15, 13, 13, 16);
    private static final VoxelShape SHAPE_S = Block.createCuboidShape(3, 3, 0, 13, 13, 1);
    private static final VoxelShape SHAPE_W = Block.createCuboidShape(15, 3, 3, 16, 13, 13);
    private static final VoxelShape SHAPE_E = Block.createCuboidShape(0, 3, 3, 1, 13, 13);

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
