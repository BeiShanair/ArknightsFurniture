package com.besson.arknights.block.custom.tribal;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import com.besson.arknights.block.SofaBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class TribalStyleSofa extends SofaBlock {
    public static final VoxelShape SHAPE = Block.createCuboidShape(0,0,0,16,16,16);

    public TribalStyleSofa(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
}
