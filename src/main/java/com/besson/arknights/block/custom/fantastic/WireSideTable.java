package com.besson.arknights.block.custom.fantastic;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class WireSideTable extends FurnitureHorizontalFacingBlock {
    public WireSideTable(Settings settings) {
        super(settings);
    }
    private static final VoxelShape SHAPE_N = Block.createCuboidShape(6, 0, 6, 26, 20, 26);
    private static final VoxelShape SHAPE_S = Block.createCuboidShape(-10, 0, -10, 10, 20, 10);
    private static final VoxelShape SHAPE_W = Block.createCuboidShape(6, 0, -10, 26, 20, 10);
    private static final VoxelShape SHAPE_E = Block.createCuboidShape(-10, 0, 6, 10, 20, 26);

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
