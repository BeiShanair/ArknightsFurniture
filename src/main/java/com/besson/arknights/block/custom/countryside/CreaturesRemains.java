package com.besson.arknights.block.custom.countryside;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class CreaturesRemains extends FurnitureHorizontalFacingBlock {
    public CreaturesRemains(Settings settings) {
        super(settings);
    }
    private static final VoxelShape SHAPE_N = Block.createCuboidShape(-7, 4, 12, 23, 17, 16);
    private static final VoxelShape SHAPE_W = Block.createCuboidShape(12, 4, -7, 16, 17, 23);
    private static final VoxelShape SHAPE_S = Block.createCuboidShape(-7, 4, 0, 23, 17, 4);
    private static final VoxelShape SHAPE_E = Block.createCuboidShape(0, 4, -7, 4, 17, 23);

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
