package com.besson.arknights.block.custom.reimselar;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class ReimselarMagicMirror extends FurnitureHorizontalFacingBlock{

    public ReimselarMagicMirror(Settings settings) {
        super(settings);
    }

    private static final VoxelShape SHAPE_N = Block.createCuboidShape(3, 1, 14, 13, 16, 16);
    private static final VoxelShape SHAPE_W = Block.createCuboidShape(14, 1, 3, 16, 16, 13);
    private static final VoxelShape SHAPE_S = Block.createCuboidShape(3, 1, 0, 13, 16, 2);
    private static final VoxelShape SHAPE_E = Block.createCuboidShape(0, 1, 3, 2, 16, 13);

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
