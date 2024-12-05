package com.besson.arknights.block.custom.hotel;

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

public class MountedBarCeiling1 extends FurnitureHorizontalFacingBlock{

    public MountedBarCeiling1(Settings settings) {
        super(settings);
    }

    private static final VoxelShape SHAPE_W = Stream.of(
            Block.createCuboidShape(0, 0, 0, 16, 1, 32),
            Block.createCuboidShape(1, 1, 1, 2, 16, 2),
            Block.createCuboidShape(14, 1, 1, 15, 16, 2),
            Block.createCuboidShape(14, 1, 30, 15, 16, 31),
            Block.createCuboidShape(1, 1, 30, 2, 16, 31)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SHAPE_S = Stream.of(
            Block.createCuboidShape(0, 0, 0, 32, 1, 16),
            Block.createCuboidShape(1, 1, 14, 2, 16, 15),
            Block.createCuboidShape(1, 1, 1, 2, 16, 2),
            Block.createCuboidShape(30, 1, 1, 31, 16, 2),
            Block.createCuboidShape(30, 1, 14, 31, 16, 15)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SHAPE_E = Stream.of(
            Block.createCuboidShape(0, 0, -16, 16, 1, 16),
            Block.createCuboidShape(14, 1, 14, 15, 16, 15),
            Block.createCuboidShape(1, 1, 14, 2, 16, 15),
            Block.createCuboidShape(1, 1, -15, 2, 16, -14),
            Block.createCuboidShape(14, 1, -15, 15, 16, -14)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SHAPE_N = Stream.of(
            Block.createCuboidShape(-16, 0, 0, 16, 1, 16),
            Block.createCuboidShape(14, 1, 1, 15, 16, 2),
            Block.createCuboidShape(14, 1, 14, 15, 16, 15),
            Block.createCuboidShape(-15, 1, 14, -14, 16, 15),
            Block.createCuboidShape(-15, 1, 1, -14, 16, 2)
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
