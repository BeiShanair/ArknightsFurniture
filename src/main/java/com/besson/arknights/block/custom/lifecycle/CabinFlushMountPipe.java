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

public class CabinFlushMountPipe extends FurnitureHorizontalFacingBlock {
    public CabinFlushMountPipe(Settings settings) {
        super(settings);
    }
    private static final VoxelShape SHAPE_NS = VoxelShapes.combineAndSimplify(
            Block.createCuboidShape(0, 14.35, 7.25, 16, 15.85, 8.75),
            Block.createCuboidShape(0, 11, 6.5, 16, 14, 9.5), BooleanBiFunction.OR);
    private static final VoxelShape SHAPE_WE = VoxelShapes.combineAndSimplify(
            Block.createCuboidShape(7.25, 14.35, 0, 8.75, 15.85, 16),
            Block.createCuboidShape(6.5, 11, 0, 9.5, 14, 16), BooleanBiFunction.OR);

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)) {
            case WEST,EAST -> SHAPE_WE;
            default -> SHAPE_NS;
        };
    }
}
