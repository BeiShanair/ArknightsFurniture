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

public class LgdFluorescentLight extends ModSwitchableLight {

    public LgdFluorescentLight(Settings settings) {
        super(settings.luminance(state -> state.get(LIT) ? 15 : 0));
    }

    private static final VoxelShape SHAPE_NS = Stream.of(
            Block.createCuboidShape(-8, 9.5, 5, 24, 10, 11),
            Block.createCuboidShape(-6, 10, 7, -4, 16, 9),
            Block.createCuboidShape(-7, 8.5, 6, 23, 9.5, 10),
            Block.createCuboidShape(20, 10, 7, 22, 16, 9)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SHAPE_WE = Stream.of(
            Block.createCuboidShape(5, 9.5, -8, 11, 10, 24),
            Block.createCuboidShape(7, 10, 20, 9, 16, 22),
            Block.createCuboidShape(6, 8.5, -7, 10, 9.5, 23),
            Block.createCuboidShape(7, 10, -6, 9, 16, -4)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)){
            case WEST, EAST -> SHAPE_WE;
            default -> SHAPE_NS;
        };
    }
}
