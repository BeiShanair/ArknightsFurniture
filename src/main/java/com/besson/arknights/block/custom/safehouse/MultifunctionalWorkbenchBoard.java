package com.besson.arknights.block.custom.safehouse;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class MultifunctionalWorkbenchBoard extends FurnitureHorizontalFacingBlock{

    public MultifunctionalWorkbenchBoard(Settings settings) {
        super(settings);
    }

    private static final VoxelShape SHAPE_N = Block.createCuboidShape(-8, 0, 15, 24, 16, 16);
    private static final VoxelShape SHAPE_W = Block.createCuboidShape(15, 0, -8, 16, 16, 24);
    private static final VoxelShape SHAPE_S = Block.createCuboidShape(-8, 0, 0, 24, 16, 1);
    private static final VoxelShape SHAPE_E = Block.createCuboidShape(0, 0, -8, 1, 16, 24);

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
