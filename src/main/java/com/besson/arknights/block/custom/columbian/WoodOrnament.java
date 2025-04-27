package com.besson.arknights.block.custom.columbian;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class WoodOrnament extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_NS = Block.createCuboidShape(5, 0, 7, 11, 2.5, 9);
    public static final VoxelShape SHAPE_WE = Block.createCuboidShape(7, 0, 5, 9, 2.5, 11);
    public WoodOrnament(Settings settings) {
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
