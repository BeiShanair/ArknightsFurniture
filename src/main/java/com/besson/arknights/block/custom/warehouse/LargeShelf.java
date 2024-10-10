package com.besson.arknights.block.custom.warehouse;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class LargeShelf extends FurnitureHorizontalFacingBlock {
    public LargeShelf(Settings settings) {
        super(settings.nonOpaque());
    }
    private static final VoxelShape SHAPE_NS = Block.createCuboidShape(-16, 0, -4, 32, 16, 20);
    private static final VoxelShape SHAPE_WE = Block.createCuboidShape(-4, 0, -16, 20, 16, 32);

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)) {
            case EAST, WEST -> SHAPE_WE;
            default -> SHAPE_NS;
        };
    }
}
