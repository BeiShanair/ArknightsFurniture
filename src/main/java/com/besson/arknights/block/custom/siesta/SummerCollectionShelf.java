package com.besson.arknights.block.custom.siesta;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class SummerCollectionShelf extends FurnitureHorizontalFacingBlock{

    public SummerCollectionShelf(Settings settings) {
        super(settings);
    }

    private static final VoxelShape SHAPE_N = Block.createCuboidShape(1, 0, 0, 15, 23, 32);
    private static final VoxelShape SHAPE_W = Block.createCuboidShape(0, 0, 1, 32, 23, 15);
    private static final VoxelShape SHAPE_S = Block.createCuboidShape(1, 0, -16, 15, 23, 16);
    private static final VoxelShape SHAPE_E = Block.createCuboidShape(-16, 0, 1, 16, 23, 15);

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
