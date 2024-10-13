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

public class SquareTable extends FurnitureHorizontalFacingBlock {
    public SquareTable(Settings settings) {
        super(settings);
    }
    private static final VoxelShape SHAPE_NS = Stream.of(
            Block.createCuboidShape(-16, 14, 0, 32, 16, 16),
            Block.createCuboidShape(-16, 0, 0, 32, 2, 16),
            Block.createCuboidShape(-16, 2, 0, -14, 14, 16),
            Block.createCuboidShape(30, 2, 0, 32, 14, 16)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    private static final VoxelShape SHAPE_WE = Stream.of(
            Block.createCuboidShape(0, 14, -16, 16, 16, 32),
            Block.createCuboidShape(0, 0, -16, 16, 2, 32),
            Block.createCuboidShape(0, 2, 30, 16, 14, 32),
            Block.createCuboidShape(0, 2, -16, 16, 14, -14)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)) {
            case EAST, WEST -> SHAPE_WE;
            default -> SHAPE_NS;
        };
    }
}
