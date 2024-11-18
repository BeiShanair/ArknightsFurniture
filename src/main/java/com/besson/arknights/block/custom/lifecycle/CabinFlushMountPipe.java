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
    private static final VoxelShape SHAPE_NS = Stream.of(
            Block.createCuboidShape(0, 13, 7, 16, 15, 9),
            Block.createCuboidShape(0, 8, 6, 16, 12, 10),
            Block.createCuboidShape(7, 9, 5, 9, 16, 11)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SHAPE_WE = Stream.of(
            Block.createCuboidShape(7, 13, 0, 9, 15, 16),
            Block.createCuboidShape(6, 8, 0, 10, 12, 16),
            Block.createCuboidShape(5, 9, 7, 11, 16, 9)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)) {
            case WEST,EAST -> SHAPE_WE;
            default -> SHAPE_NS;
        };
    }
}
