package com.besson.arknights.block.custom.columbian;

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

public class ColumbianStreetViewPhoto extends FurnitureHorizontalFacingBlock {
    public ColumbianStreetViewPhoto(Settings settings) {
        super(settings);
    }
    private static final VoxelShape SHAPE_N = Stream.of(
            Block.createCuboidShape(6, -5, 15, 19, 2, 16),
            Block.createCuboidShape(5, 2, 15, 12, 13, 16),
            Block.createCuboidShape(4, 13, 15, 10, 22, 16),
            Block.createCuboidShape(12, 6, 15, 23, 13, 16),
            Block.createCuboidShape(-7, 12, 15, 4, 19, 16),
            Block.createCuboidShape(10, 13, 15, 21, 20, 16),
            Block.createCuboidShape(-6, 0, 15, 5, 7, 16)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();;
    private static final VoxelShape SHAPE_W = Stream.of(
            Block.createCuboidShape(15, -5, -3, 16, 2, 10),
            Block.createCuboidShape(15, 2, 4, 16, 13, 11),
            Block.createCuboidShape(15, 13, 6, 16, 22, 12),
            Block.createCuboidShape(15, 6, -7, 16, 13, 4),
            Block.createCuboidShape(15, 12, 12, 16, 19, 23),
            Block.createCuboidShape(15, 13, -5, 16, 20, 6),
            Block.createCuboidShape(15, 0, 11, 16, 7, 22)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();;
    private static final VoxelShape SHAPE_S = Stream.of(
            Block.createCuboidShape(-3, -5, 0, 10, 2, 1),
            Block.createCuboidShape(4, 2, 0, 11, 13, 1),
            Block.createCuboidShape(6, 13, 0, 12, 22, 1),
            Block.createCuboidShape(-7, 6, 0, 4, 13, 1),
            Block.createCuboidShape(12, 12, 0, 23, 19, 1),
            Block.createCuboidShape(-5, 13, 0, 6, 20, 1),
            Block.createCuboidShape(11, 0, 0, 22, 7, 1)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();;
    private static final VoxelShape SHAPE_E = Stream.of(
            Block.createCuboidShape(0, -5, 6, 1, 2, 19),
            Block.createCuboidShape(0, 2, 5, 1, 13, 12),
            Block.createCuboidShape(0, 13, 4, 1, 22, 10),
            Block.createCuboidShape(0, 6, 12, 1, 13, 23),
            Block.createCuboidShape(0, 12, -7, 1, 19, 4),
            Block.createCuboidShape(0, 13, 10, 1, 20, 21),
            Block.createCuboidShape(0, 0, -6, 1, 7, 5)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();;

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
