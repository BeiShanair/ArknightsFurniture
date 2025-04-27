package com.besson.arknights.block.custom.columbian;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class CoffeeBeanDisplay extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_NS = Block.createCuboidShape(2, 0, 6, 14, 6, 10);
    public static final VoxelShape SHAPE_WE = Block.createCuboidShape(6, 0, 2, 10, 6, 14);
    public CoffeeBeanDisplay(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)) {
            case WEST, EAST -> SHAPE_WE;
            default -> SHAPE_NS;
        };
    }
}
