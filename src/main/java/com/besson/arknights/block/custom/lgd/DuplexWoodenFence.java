package com.besson.arknights.block.custom.lgd;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class DuplexWoodenFence extends FurnitureHorizontalFacingBlock {
    public DuplexWoodenFence(Settings settings) {
        super(settings);
    }
    private static final VoxelShape SHAPE_NS = Block.createCuboidShape(0, 0, 7, 16, 16, 9);
    private static final VoxelShape SHAPE_WE = Block.createCuboidShape(7, 0, 0, 9, 16, 16);

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)){
            case WEST,EAST -> SHAPE_WE;
            default -> SHAPE_NS;
        };
    }
}
