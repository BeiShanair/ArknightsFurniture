package com.besson.arknights.block.custom.rehearsal;

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

public class RehearsalRoomSpotlight extends ModSwitchableLight {

    public RehearsalRoomSpotlight(Settings settings) {
        super(settings.luminance(state -> state.get(LIT) ? 15 : 0));
    }

    private static final VoxelShape SHAPE_NS = Stream.of(
            Block.createCuboidShape(0, 15, 6, 16, 16, 10),
            Block.createCuboidShape(3, 11, 7, 5, 15, 9),
            Block.createCuboidShape(11, 11, 7, 13, 15, 9)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SHAPE_WE = Stream.of(
            Block.createCuboidShape(6, 15, 0, 10, 16, 16),
            Block.createCuboidShape(7, 11, 11, 9, 15, 13),
            Block.createCuboidShape(7, 11, 3, 9, 15, 5)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)){
            case WEST,EAST -> SHAPE_WE;
            default -> SHAPE_NS;
        };
    }
}
