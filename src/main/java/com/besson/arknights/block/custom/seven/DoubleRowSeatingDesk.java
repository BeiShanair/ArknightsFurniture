package com.besson.arknights.block.custom.seven;

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

public class DoubleRowSeatingDesk extends FurnitureHorizontalFacingBlock{
    public DoubleRowSeatingDesk(Settings settings) {
        super(settings);
    }

    private static final VoxelShape SHAPE = Stream.of(
            Block.createCuboidShape(6, 0, 6, 10, 1, 10),
            Block.createCuboidShape(7, 1, 7, 9, 14, 9),
            Block.createCuboidShape(0, 14, 0, 16, 16, 16)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
}
