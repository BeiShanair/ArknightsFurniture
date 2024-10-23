package com.besson.arknights.block.custom.sideline;

import com.besson.arknights.block.ModBedBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.DyeColor;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class SimpleBed extends ModBedBlock {

    private static final VoxelShape SHAPE = Block.createCuboidShape(0, 0, 0, 16, 8, 16);

    public SimpleBed(DyeColor color, Settings settings) {
        super(color, settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
}
