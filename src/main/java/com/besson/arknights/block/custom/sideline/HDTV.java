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

public class HDTV extends FurnitureHorizontalFacingBlock {
    public HDTV(Settings settings) {
        super(settings);
    }
    private static final VoxelShape SHAPE_N = Stream.of(
            Block.createCuboidShape(2, 0, 9, 14, 1, 16),
            Block.createCuboidShape(7, 1, 14, 9, 5, 16),
            Block.createCuboidShape(-10, 2, 13, 26, 19, 14)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SHAPE_W = Stream.of(
            Block.createCuboidShape(9, 0, 2, 16, 1, 14),
            Block.createCuboidShape(14, 1, 7, 16, 5, 9),
            Block.createCuboidShape(13, 2, -10, 14, 19, 26)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SHAPE_S = Stream.of(
            Block.createCuboidShape(2, 0, 0, 14, 1, 7),
            Block.createCuboidShape(7, 1, 0, 9, 5, 2),
            Block.createCuboidShape(-10, 2, 2, 26, 19, 3)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SHAPE_E = Stream.of(
            Block.createCuboidShape(0, 0, 2, 7, 1, 14),
            Block.createCuboidShape(0, 1, 7, 2, 5, 9),
            Block.createCuboidShape(2, 2, -10, 3, 19, 26)
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
