package com.besson.arknights.block.custom.sideline;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import com.besson.arknights.block.SofaBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class LowSofa extends SofaBlock {
    public LowSofa(Settings settings) {
        super(settings);
    }
    private static final VoxelShape SHAPE_NS = Block.createCuboidShape(0, 0, 2, 16, 14, 14);

    private static final VoxelShape SHAPE_WE = Block.createCuboidShape(2, 0, 0, 14, 14, 16);

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)) {
            case EAST, WEST -> SHAPE_WE;
            default -> SHAPE_NS;
        };
    }
}
