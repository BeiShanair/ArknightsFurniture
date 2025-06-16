package com.besson.arknights.block.custom.lifecycle;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class PowerBox extends FurnitureHorizontalFacingBlock {
    public PowerBox(Settings settings) {
        super(settings);
    }
    private static final VoxelShape SHAPE_N = Block.createCuboidShape(1, 1, 15.5, 15, 32, 16);
    private static final VoxelShape SHAPE_W = Block.createCuboidShape(15.5, 1, 1, 16, 32, 15);
    private static final VoxelShape SHAPE_S = Block.createCuboidShape(1, 1, 0, 15, 32, 0.5);
    private static final VoxelShape SHAPE_E = Block.createCuboidShape(0, 1, 1, 0.5, 32, 15);

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
