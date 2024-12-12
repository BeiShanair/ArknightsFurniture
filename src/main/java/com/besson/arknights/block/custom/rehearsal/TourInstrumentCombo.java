package com.besson.arknights.block.custom.rehearsal;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class TourInstrumentCombo extends FurnitureHorizontalFacingBlock{

    public TourInstrumentCombo(Settings settings) {
        super(settings);
    }

    private static final VoxelShape SHAPE_N = Block.createCuboidShape(-11, 0, 0, 27, 25, 21);
    private static final VoxelShape SHAPE_W = Block.createCuboidShape(0, 0, -11, 21, 25, 27);
    private static final VoxelShape SHAPE_S = Block.createCuboidShape(-11, 0, -5, 27, 25, 16);
    private static final VoxelShape SHAPE_E = Block.createCuboidShape(-5, 0, -11, 16, 25, 27);

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
