package com.besson.arknights.block.custom.pizzeria;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class PizzaMenu extends FurnitureHorizontalFacingBlock{
    private static final VoxelShape SHAPE_N = Block.createCuboidShape(-16, 0, 7.8, 16, 16, 16);
    private static final VoxelShape SHAPE_W = Block.createCuboidShape(7.8, 0, 0, 16, 16, 32);
    private static final VoxelShape SHAPE_S = Block.createCuboidShape(0, 0, 0, 32, 16, 8.2);
    private static final VoxelShape SHAPE_E = Block.createCuboidShape(0, 0, -16, 8.2, 16, 16);

    public PizzaMenu(Settings settings) {
        super(settings.luminance(state -> 15));
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)){
            case EAST -> SHAPE_E;
            case SOUTH -> SHAPE_S;
            case WEST -> SHAPE_W;
            default -> SHAPE_N;
        };
    }
}
