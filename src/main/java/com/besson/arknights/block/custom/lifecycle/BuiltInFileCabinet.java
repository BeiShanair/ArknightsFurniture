package com.besson.arknights.block.custom.lifecycle;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class BuiltInFileCabinet extends FurnitureHorizontalFacingBlock {
    public BuiltInFileCabinet(Settings settings) {
        super(settings);
    }
    private static final VoxelShape SHAPE_NS = Block.createCuboidShape(-16, 0, 0, 32, 16, 16);
    private static final VoxelShape SHAPE_WE = Block.createCuboidShape(0, 0, -16, 16, 16, 32);

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)) {
            case WEST,EAST -> SHAPE_WE;
            default -> SHAPE_NS;
        };
    }
}
