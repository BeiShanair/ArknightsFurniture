package com.besson.arknights.block.custom.columbian;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class ColumbianStreetViewPhoto extends FurnitureHorizontalFacingBlock {
    public ColumbianStreetViewPhoto(Settings settings) {
        super(settings);
    }
    private static final VoxelShape SHAPE_N = Block.createCuboidShape(-7, -5, 15, 23, 22, 16);
    private static final VoxelShape SHAPE_W = Block.createCuboidShape(15, -5, -7, 16, 22, 23);
    private static final VoxelShape SHAPE_S = Block.createCuboidShape(-7, -5, 0, 23, 22, 1);
    private static final VoxelShape SHAPE_E = Block.createCuboidShape(0, -5, -7, 1, 22, 23);

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
