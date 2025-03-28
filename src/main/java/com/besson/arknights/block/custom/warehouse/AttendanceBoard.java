package com.besson.arknights.block.custom.warehouse;

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

public class AttendanceBoard extends FurnitureHorizontalFacingBlock {
    public AttendanceBoard(Settings settings) {
        super(settings.nonOpaque());
    }
    private static final VoxelShape SHAPE_N = Stream.of(
            Block.createCuboidShape(21, 0, 15, 22, 15, 16),
            Block.createCuboidShape(-5, 0, 15.5, 21, 14, 15.75),
            Block.createCuboidShape(-5, 0, 15, 21, 1, 16),
            Block.createCuboidShape(-5, 14, 15, 21, 15, 16),
            Block.createCuboidShape(-6, 0, 15, -5, 15, 16)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SHAPE_S = Stream.of(
            Block.createCuboidShape(15, 0, -6, 16, 15, -5),
            Block.createCuboidShape(15.5, 0, -5, 15.75, 14, 21),
            Block.createCuboidShape(15, 0, -5, 16, 1, 21),
            Block.createCuboidShape(15, 14, -5, 16, 15, 21),
            Block.createCuboidShape(15, 0, 21, 16, 15, 22)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SHAPE_W = Stream.of(
            Block.createCuboidShape(-6, 0, 0, -5, 15, 1),
            Block.createCuboidShape(-5, 0, 0.25, 21, 14, 0.5),
            Block.createCuboidShape(-5, 0, 0, 21, 1, 1),
            Block.createCuboidShape(-5, 14, 0, 21, 15, 1),
            Block.createCuboidShape(21, 0, 0, 22, 15, 1)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SHAPE_E = Stream.of(
            Block.createCuboidShape(0, 0, 21, 1, 15, 22),
            Block.createCuboidShape(0.25, 0, -5, 0.5, 14, 21),
            Block.createCuboidShape(0, 0, -5, 1, 1, 21),
            Block.createCuboidShape(0, 14, -5, 1, 15, 21),
            Block.createCuboidShape(0, 0, -6, 1, 15, -5)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

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
