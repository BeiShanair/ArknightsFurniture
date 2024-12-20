package com.besson.arknights.block.custom.diner;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class SelfServiceOrderingKiosk extends FurnitureHorizontalFacingBlock{
    public SelfServiceOrderingKiosk(Settings settings) {
        super(settings);
    }

    private static final VoxelShape SHAPE_N = Block.createCuboidShape(3, 0, 8, 13, 32, 13);
    private static final VoxelShape SHAPE_S = Block.createCuboidShape(3, 0, 3, 13, 32, 8);
    private static final VoxelShape SHAPE_W = Block.createCuboidShape(8, 0, 3, 13, 32, 13);
    private static final VoxelShape SHAPE_E = Block.createCuboidShape(3, 0, 3, 8, 32, 13);

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)) {
            case SOUTH -> SHAPE_S;
            case WEST -> SHAPE_W;
            case EAST -> SHAPE_E;
            default -> SHAPE_N;
        };
    }
}
