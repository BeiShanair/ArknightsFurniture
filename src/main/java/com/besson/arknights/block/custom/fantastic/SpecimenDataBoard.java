package com.besson.arknights.block.custom.fantastic;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class SpecimenDataBoard extends FurnitureHorizontalFacingBlock {
    public SpecimenDataBoard(Settings settings) {
        super(settings);
    }
    private static final VoxelShape SHAPE_N = Block.createCuboidShape(-16, 5, 14, 32, 32, 16);
    private static final VoxelShape SHAPE_S = Block.createCuboidShape(-16, 5, 0, 32, 32, 2);
    private static final VoxelShape SHAPE_W = Block.createCuboidShape(14, 5, -16, 16, 32, 32);
    private static final VoxelShape SHAPE_E = Block.createCuboidShape(0, 5, -16, 2, 32, 32);

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
