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
    private static final VoxelShape SHAPE_N = Stream.of(
            Block.createCuboidShape(-16, 1, 14, 32, 32, 16),
            Block.createCuboidShape(-16, 1, 12, 32, 2, 14),
            Block.createCuboidShape(-11, 0, 14, -9, 1, 16),
            Block.createCuboidShape(25, 0, 14, 27, 1, 16)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SHAPE_S = Stream.of(
            Block.createCuboidShape(-16, 1, 0, 32, 32, 2),
            Block.createCuboidShape(-16, 1, 2, 32, 2, 4),
            Block.createCuboidShape(25, 0, 0, 27, 1, 2),
            Block.createCuboidShape(-11, 0, 0, -9, 1, 2)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SHAPE_W = Stream.of(
            Block.createCuboidShape(14, 1, -16, 16, 32, 32),
            Block.createCuboidShape(12, 1, -16, 14, 2, 32),
            Block.createCuboidShape(14, 0, 25, 16, 1, 27),
            Block.createCuboidShape(14, 0, -11, 16, 1, -9)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SHAPE_E = Stream.of(
            Block.createCuboidShape(0, 1, -16, 2, 32, 32),
            Block.createCuboidShape(2, 1, -16, 4, 2, 32),
            Block.createCuboidShape(0, 0, -11, 2, 1, -9),
            Block.createCuboidShape(0, 0, 25, 2, 1, 27)
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
