package com.besson.arknights.block.custom.warehouse;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class Carton extends FurnitureHorizontalFacingBlock {
    public Carton(Settings settings) {
        super(settings.nonOpaque());
    }
    private static final VoxelShape SHAPE = Block.createCuboidShape(-4, 0, -4, 20, 32, 20);

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
}
