package com.besson.arknights.block.custom.lifecycle;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class BlackHangingBasket extends FurnitureHorizontalFacingBlock {
    public BlackHangingBasket(Settings settings) {
        super(settings);
    }
    private static final VoxelShape SHAPE_N = Block.createCuboidShape(5, 0, 12.75, 11, 13, 16);
    private static final VoxelShape SHAPE_W = Block.createCuboidShape(12.75, 0, 5, 16, 13, 11);
    private static final VoxelShape SHAPE_S = Block.createCuboidShape(5, 0, 0, 11, 13, 3.25);
    private static final VoxelShape SHAPE_E = Block.createCuboidShape(0, 0, 5, 3.25, 13, 11);



    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)){
            case SOUTH -> SHAPE_S;
            case WEST -> SHAPE_W;
            case EAST -> SHAPE_E;
            default -> SHAPE_N;
        };
    }
}
