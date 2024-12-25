package com.besson.arknights.block.custom.mercenary;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class RedFramedFloorMirror extends FurnitureHorizontalFacingBlock{

    public RedFramedFloorMirror(Settings settings) {
        super(settings);
    }

    private static final VoxelShape SHAPE_N = Block.createCuboidShape(1, 0, 14, 15, 24, 16);
    private static final VoxelShape SHAPE_W = Block.createCuboidShape(0, 0, 1, 2, 24, 15);
    private static final VoxelShape SHAPE_S = Block.createCuboidShape(1, 0, 0, 15, 24, 2);
    private static final VoxelShape SHAPE_E = Block.createCuboidShape(0, 0, 1, 2, 24, 15);

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
