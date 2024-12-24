package com.besson.arknights.block.custom.seven;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class GourmetFoodWarmer extends FurnitureHorizontalFacingBlock{
    public GourmetFoodWarmer(Settings settings) {
        super(settings);
    }

    private static final VoxelShape SHAPE_NS = Block.createCuboidShape(-8, 0, 0, 24, 24, 16);
    private static final VoxelShape SHAPE_WE = Block.createCuboidShape(0, 0, -8, 16, 24, 24);

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)){
            case WEST,EAST -> SHAPE_WE;
            default -> SHAPE_NS;
        };
    }
}
