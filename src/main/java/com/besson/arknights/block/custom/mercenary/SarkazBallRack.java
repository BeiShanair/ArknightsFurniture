package com.besson.arknights.block.custom.mercenary;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class SarkazBallRack extends FurnitureHorizontalFacingBlock{

    public SarkazBallRack(Settings settings) {
        super(settings);
    }

    private static final VoxelShape SHAPE_N = Block.createCuboidShape(3, 3, 14, 13, 16, 16);
    private static final VoxelShape SHAPE_W = Block.createCuboidShape(0, 3, 3, 2, 16, 13);
    private static final VoxelShape SHAPE_S = Block.createCuboidShape(3, 3, 0, 13, 16, 2);
    private static final VoxelShape SHAPE_E = Block.createCuboidShape(14, 3, 3, 16, 16, 13);

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
