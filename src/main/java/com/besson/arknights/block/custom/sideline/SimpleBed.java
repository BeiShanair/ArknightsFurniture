package com.besson.arknights.block.custom.sideline;

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

public class SimpleBed extends FurnitureHorizontalFacingBlock {
    public SimpleBed(Settings settings) {
        super(settings);
    }
    private static final VoxelShape SHAPE_N = Stream.of(
            Block.createCuboidShape(0, 5, 2, 1, 7, 30),
            Block.createCuboidShape(15, 5, 2, 16, 7, 30),
            Block.createCuboidShape(0, 0, 0, 16, 7, 2),
            Block.createCuboidShape(0, 0, 30, 16, 16, 32),
            Block.createCuboidShape(1, 0, 2, 15, 8, 30),
            Block.createCuboidShape(3, 8, 25, 13, 9, 30)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SHAPE_W = Stream.of(
            Block.createCuboidShape(2, 5, 15, 30, 7, 16),
            Block.createCuboidShape(2, 5, 0, 30, 7, 1),
            Block.createCuboidShape(0, 0, 0, 2, 7, 16),
            Block.createCuboidShape(30, 0, 0, 32, 16, 16),
            Block.createCuboidShape(2, 0, 1, 30, 8, 15),
            Block.createCuboidShape(25, 8, 3, 30, 9, 13)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SHAPE_S = Stream.of(
            Block.createCuboidShape(15, 5, -14, 16, 7, 14),
            Block.createCuboidShape(0, 5, -14, 1, 7, 14),
            Block.createCuboidShape(0, 0, 14, 16, 7, 16),
            Block.createCuboidShape(0, 0, -16, 16, 16, -14),
            Block.createCuboidShape(1, 0, -14, 15, 8, 14),
            Block.createCuboidShape(3, 8, -14, 13, 9, -9)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SHAPE_E = Stream.of(
            Block.createCuboidShape(-14, 5, 0, 14, 7, 1),
            Block.createCuboidShape(-14, 5, 15, 14, 7, 16),
            Block.createCuboidShape(14, 0, 0, 16, 7, 16),
            Block.createCuboidShape(-16, 0, 0, -14, 16, 16),
            Block.createCuboidShape(-14, 0, 1, 14, 8, 15),
            Block.createCuboidShape(-14, 8, 3, -9, 9, 13)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

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
