package com.besson.arknights.block.custom.hr;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class CubicleFloorplan extends FurnitureHorizontalFacingBlock{
    public static final VoxelShape SHAPE_NS = Block.createCuboidShape(0, 6, 7.5, 16, 16, 8.5);

    public static final VoxelShape SHAPE_WE = Block.createCuboidShape(7.5, 6, 0, 8.5, 16, 16);

    public CubicleFloorplan(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)){
            case EAST, WEST -> SHAPE_WE;
            default -> SHAPE_NS;
        };
    }
}
