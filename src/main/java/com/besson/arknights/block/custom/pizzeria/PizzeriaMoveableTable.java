package com.besson.arknights.block.custom.pizzeria;

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

public class PizzeriaMoveableTable extends FurnitureHorizontalFacingBlock{

    public PizzeriaMoveableTable(Settings settings) {
        super(settings);
    }

    private static final VoxelShape SHAPE_N = Stream.of(
            Block.createCuboidShape(13, 0, 1, 15, 14, 3),
            Block.createCuboidShape(13, 0, 29, 15, 14, 31),
            Block.createCuboidShape(1, 0, 29, 3, 14, 31),
            Block.createCuboidShape(1, 0, 1, 3, 14, 3),
            Block.createCuboidShape(0, 14, 0, 16, 16, 32)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SHAPE_W = Stream.of(
            Block.createCuboidShape(1, 0, 1, 3, 14, 3),
            Block.createCuboidShape(29, 0, 1, 31, 14, 3),
            Block.createCuboidShape(29, 0, 13, 31, 14, 15),
            Block.createCuboidShape(1, 0, 13, 3, 14, 15),
            Block.createCuboidShape(0, 14, 0, 32, 16, 16)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SHAPE_S = Stream.of(
            Block.createCuboidShape(1, 0, 13, 3, 14, 15),
            Block.createCuboidShape(1, 0, -15, 3, 14, -13),
            Block.createCuboidShape(13, 0, -15, 15, 14, -13),
            Block.createCuboidShape(13, 0, 13, 15, 14, 15),
            Block.createCuboidShape(0, 14, -16, 16, 16, 16)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SHAPE_E = Stream.of(
            Block.createCuboidShape(13, 0, 13, 15, 14, 15),
            Block.createCuboidShape(-15, 0, 13, -13, 14, 15),
            Block.createCuboidShape(-15, 0, 1, -13, 14, 3),
            Block.createCuboidShape(13, 0, 1, 15, 14, 3),
            Block.createCuboidShape(-16, 14, 0, 16, 16, 16)
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
