package com.besson.arknights.block.custom.seven;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class UpscaleMenuDisplay extends FurnitureHorizontalFacingBlock{
    public UpscaleMenuDisplay(Settings settings) {
        super(settings);
    }

    private static final VoxelShape SHAPE_N = Block.createCuboidShape(-11, 0, 15, 26, 12, 16);
    private static final VoxelShape SHAPE_W = Block.createCuboidShape(15, 0, -10, 16, 12, 27);
    private static final VoxelShape SHAPE_S = Block.createCuboidShape(-10, 0, 0, 27, 12, 1);
    private static final VoxelShape SHAPE_E = Block.createCuboidShape(0, 0, -11, 1, 12, 26);

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)){
            case WEST -> SHAPE_W;
            case SOUTH -> SHAPE_S;
            case EAST -> SHAPE_E;
            default -> SHAPE_N;
        };
    }
}
