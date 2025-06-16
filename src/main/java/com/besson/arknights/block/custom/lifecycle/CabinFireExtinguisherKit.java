package com.besson.arknights.block.custom.lifecycle;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class CabinFireExtinguisherKit extends FurnitureHorizontalFacingBlock {
    public CabinFireExtinguisherKit(Settings settings) {
        super(settings);
    }
    private static final VoxelShape SHAPE_N = Block.createCuboidShape(1, 0, 9, 15, 21, 16);
    private static final VoxelShape SHAPE_W = Block.createCuboidShape(9, 0, 1, 16, 21, 15);
    private static final VoxelShape SHAPE_S = Block.createCuboidShape(1, 0, 0, 15, 21, 7);
    private static final VoxelShape SHAPE_E = Block.createCuboidShape(0, 0, 1, 7, 21, 15);

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
