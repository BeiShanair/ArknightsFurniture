package com.besson.arknights.block.custom.lifecycle;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class DiyWorkbench extends FurnitureHorizontalFacingBlock {
    public DiyWorkbench(Settings settings) {
        super(settings);
    }
    private static final VoxelShape SHAPE_NS = Block.createCuboidShape(-16, 0, -8, 32, 18, 24);
    private static final VoxelShape SHAPE_WE = Block.createCuboidShape(-8, 0, -16, 24, 18, 32);

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)) {
            case WEST,EAST -> SHAPE_WE;
            default -> SHAPE_NS;
        };
    }
}
