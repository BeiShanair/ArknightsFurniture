package com.besson.arknights.block.custom.ursus;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class LongWoodenTable extends FurnitureHorizontalFacingBlock{
    public static final VoxelShape SHAPE_NS = Block.createCuboidShape(-8, 0, 0, 24, 16, 16);
    public static final VoxelShape SHAPE_WE = Block.createCuboidShape(0, 0, -8, 16, 16, 24);

    public LongWoodenTable(Settings settings) {
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
