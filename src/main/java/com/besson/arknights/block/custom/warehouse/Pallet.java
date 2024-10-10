package com.besson.arknights.block.custom.warehouse;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class Pallet extends FurnitureHorizontalFacingBlock {
    public Pallet(Settings settings) {
        super(settings.nonOpaque());
    }
    private static final VoxelShape SHAPE = Block.createCuboidShape(-8, 0, -8, 24, 1, 24);

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
}
