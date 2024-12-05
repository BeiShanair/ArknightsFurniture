package com.besson.arknights.block.custom.hotel;

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

public class ModernHotelWallLamp extends ModSwitchableLight {

    public ModernHotelWallLamp(Settings settings) {
        super(settings.luminance(state -> state.get(LIT) ? 15 : 0));
    }

    private static final VoxelShape SHAPE_N = Stream.of(
            Block.createCuboidShape(6.5, 7, 15, 9.5, 9, 16),
            Block.createCuboidShape(7.5, 6, 15, 8.5, 7, 16),
            Block.createCuboidShape(6.5, 9, 14, 9.5, 11, 16),
            Block.createCuboidShape(7.5, 7, 14, 8.5, 9, 15)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SHAPE_W = Stream.of(
            Block.createCuboidShape(15, 7, 6.5, 16, 9, 9.5),
            Block.createCuboidShape(15, 6, 7.5, 16, 7, 8.5),
            Block.createCuboidShape(14, 9, 6.5, 16, 11, 9.5),
            Block.createCuboidShape(14, 7, 7.5, 15, 9, 8.5)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SHAPE_S = Stream.of(
            Block.createCuboidShape(6.5, 7, 0, 9.5, 9, 1),
            Block.createCuboidShape(7.5, 6, 0, 8.5, 7, 1),
            Block.createCuboidShape(6.5, 9, 0, 9.5, 11, 2),
            Block.createCuboidShape(7.5, 7, 1, 8.5, 9, 2)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SHAPE_E = Stream.of(
            Block.createCuboidShape(0, 7, 6.5, 1, 9, 9.5),
            Block.createCuboidShape(0, 6, 7.5, 1, 7, 8.5),
            Block.createCuboidShape(0, 9, 6.5, 2, 11, 9.5),
            Block.createCuboidShape(1, 7, 7.5, 2, 9, 8.5)
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
