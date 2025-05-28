package com.besson.arknights.block.custom.fantastic;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class UnknownSpecimens extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_N = Block.createCuboidShape(-7.66, -10.48, 14, 23.66, 31.18, 15.74);
    public static final VoxelShape SHAPE_W = Block.createCuboidShape(14, -10.48, -7.66, 15.74, 31.18, 23.66);
    public static final VoxelShape SHAPE_S = Block.createCuboidShape(-7.66, -10.48, 0.26, 23.66, 31.18, 2);
    public static final VoxelShape SHAPE_E = Block.createCuboidShape(0.26, -10.48, -7.66, 2, 31.18, 23.66);
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
