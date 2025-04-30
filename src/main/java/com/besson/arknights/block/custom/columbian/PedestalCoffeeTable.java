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

public class PedestalCoffeeTable extends FurnitureHorizontalFacingBlock {
    public PedestalCoffeeTable(Settings settings) {
        super(settings);
    }
    private static final VoxelShape SHAPE = Stream.of(
            Block.createCuboidShape(7, 0, 7, 9, 15, 9),
            Block.createCuboidShape(-2, 14.5, -2, 18, 16, 18),
            Block.createCuboidShape(4.05, 0, 4.35, 11.75, 0.5, 11.75)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
}
