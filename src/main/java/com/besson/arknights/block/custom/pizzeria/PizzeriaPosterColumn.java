package com.besson.arknights.block.custom.pizzeria;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class PizzeriaPosterColumn extends FurnitureHorizontalFacingBlock{

    public PizzeriaPosterColumn(Settings settings) {
        super(settings);
    }

    private static final VoxelShape SHAPE_N = Block.createCuboidShape(3, 0, 14.9, 13, 16, 15.9);
    private static final VoxelShape SHAPE_W = Block.createCuboidShape(14.9, 0, 3, 15.9, 16, 13);
    private static final VoxelShape SHAPE_S = Block.createCuboidShape(3, 0, 0.1, 13, 16, 1.1);
    private static final VoxelShape SHAPE_E = Block.createCuboidShape(0.1, 0, 3, 1.1, 16, 13);

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
