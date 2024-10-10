package com.besson.arknights.block.custom.warehouse;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class CargoTrolley extends FurnitureHorizontalFacingBlock {
    public CargoTrolley(Settings settings) {
        super(settings.nonOpaque());
    }
    private static final VoxelShape SHAPE_NS = Block.createCuboidShape(-8, 0, -2, 24, 21, 18);

    private static final VoxelShape SHAPE_WE = Block.createCuboidShape(-2, 0, -8, 18, 21, 24);

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)) {
            case EAST, WEST -> SHAPE_WE;
            default -> SHAPE_NS;
        };
    }
}
