package com.besson.arknights.block.custom.lifecycle;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

import java.util.stream.Stream;

public class ControlDisplay extends FurnitureHorizontalFacingBlock {
    public ControlDisplay(Settings settings) {
        super(settings);
    }
    private static final VoxelShape SHAPE_N = Block.createCuboidShape(-14, 9, 13.5, 30, 32, 15.5);
    private static final VoxelShape SHAPE_S = Block.createCuboidShape(-14, 9, 0.5, 30, 32, 2.5);
    private static final VoxelShape SHAPE_W = Block.createCuboidShape(13.5, 9, -14, 15.5, 32, 30);
    private static final VoxelShape SHAPE_E = Block.createCuboidShape(0.5, 9, -14, 2.5, 32, 30);

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
