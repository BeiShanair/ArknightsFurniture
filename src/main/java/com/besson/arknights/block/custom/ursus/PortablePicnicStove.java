package com.besson.arknights.block.custom.ursus;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class PortablePicnicStove extends FurnitureHorizontalFacingBlock{
    public static final VoxelShape SHAPE = Block.createCuboidShape(4, 0, 4, 12, 13, 12);

    public PortablePicnicStove(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
}
