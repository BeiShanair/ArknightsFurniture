package com.besson.arknights.block.custom.fantastic;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class UnknownSpecimens extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_N = Block.createCuboidShape(0, -2, 15, 18, 22, 16);
    public static final VoxelShape SHAPE_W = Block.createCuboidShape(15, -2, -2, 16, 22, 16);
    public static final VoxelShape SHAPE_S = Block.createCuboidShape(-2, -2, 0, 16, 22, 1);
    public static final VoxelShape SHAPE_E = Block.createCuboidShape(0, -2, 0, 1, 22, 18);
    public UnknownSpecimens(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)) {
            case WEST -> SHAPE_W;
            case EAST -> SHAPE_E;
            case SOUTH -> SHAPE_S;
            default -> SHAPE_N;
        };
    }
}
