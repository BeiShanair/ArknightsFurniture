package com.besson.arknights.block.custom.columbian;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class BeverageCabinetEmpty extends FurnitureHorizontalFacingBlock {
    public BeverageCabinetEmpty(Settings settings) {
        super(settings);
    }
    private static final VoxelShape SHAPE_N = Block.createCuboidShape(-1.95, 0, 5, 17.9, 19.75, 15.9);
    private static final VoxelShape SHAPE_W = Block.createCuboidShape(5, 0, -1.9, 15.9, 19.75, 17.95);
    private static final VoxelShape SHAPE_S = Block.createCuboidShape(-1.9, 0, 0.1, 17.95, 19.75, 11);
    private static final VoxelShape SHAPE_E = Block.createCuboidShape(0.1, 0, -1.95, 11, 19.75, 17.9);

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
