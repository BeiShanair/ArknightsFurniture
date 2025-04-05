package com.besson.arknights.block.custom.tribal;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class TropicalPottedPlant extends FurnitureHorizontalFacingBlock{
    public static final VoxelShape SHAPE = Block.createCuboidShape(1, 0, 1, 15, 17, 15);

    public TropicalPottedPlant(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
}
