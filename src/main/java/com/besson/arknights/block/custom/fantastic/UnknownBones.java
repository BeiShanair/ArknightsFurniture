package com.besson.arknights.block.custom.fantastic;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class UnknownBones extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_N = Block.createCuboidShape(0, 0, 14, 16, 22, 16);
    public static final VoxelShape SHAPE_W = Block.createCuboidShape(14, 0, 0, 16, 22, 16);
    public static final VoxelShape SHAPE_S = Block.createCuboidShape(0, 0, 0, 16, 22, 2);
    public static final VoxelShape SHAPE_E = Block.createCuboidShape(0, 0, 0, 2, 22, 16);

    public UnknownBones(Settings settings) {
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
