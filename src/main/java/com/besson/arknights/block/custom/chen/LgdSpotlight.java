package com.besson.arknights.block.custom.chen;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import com.besson.arknights.block.ModSwitchableLight;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

import java.util.stream.Stream;

public class LgdSpotlight extends ModSwitchableLight {

    public LgdSpotlight(Settings settings) {
        super(settings.luminance(state -> state.get(LIT) ? 15 : 0));
    }

    private static final VoxelShape SHAPE_N = Stream.of(
            Block.createCuboidShape(5, 8, 0, 11, 9, 32),
            Block.createCuboidShape(7, 9, 1, 9, 16, 3),
            Block.createCuboidShape(7, 9, 29, 9, 16, 31),
            Block.createCuboidShape(7, 3, 5, 9, 8, 7),
            Block.createCuboidShape(7, 3, 25, 9, 8, 27)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SHAPE_W = Stream.of(
            Block.createCuboidShape(0, 8, 5, 32, 9, 11),
            Block.createCuboidShape(1, 9, 7, 3, 16, 9),
            Block.createCuboidShape(29, 9, 7, 31, 16, 9),
            Block.createCuboidShape(5, 3, 7, 7, 8, 9),
            Block.createCuboidShape(25, 3, 7, 27, 8, 9)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();;
    private static final VoxelShape SHAPE_S = Stream.of(
            Block.createCuboidShape(5, 8, -16, 11, 9, 16),
            Block.createCuboidShape(7, 9, 13, 9, 16, 15),
            Block.createCuboidShape(7, 9, -15, 9, 16, -13),
            Block.createCuboidShape(7, 3, 9, 9, 8, 11),
            Block.createCuboidShape(7, 3, -11, 9, 8, -9)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();;
    private static final VoxelShape SHAPE_E = Stream.of(
            Block.createCuboidShape(-16, 8, 5, 16, 9, 11),
            Block.createCuboidShape(13, 9, 7, 15, 16, 9),
            Block.createCuboidShape(-15, 9, 7, -13, 16, 9),
            Block.createCuboidShape(9, 3, 7, 11, 8, 9),
            Block.createCuboidShape(-11, 3, 7, -9, 8, 9)
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
