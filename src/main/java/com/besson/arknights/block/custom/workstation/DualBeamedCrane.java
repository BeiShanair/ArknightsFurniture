package com.besson.arknights.block.custom.workstation;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class DualBeamedCrane extends FurnitureHorizontalFacingBlock{

    public DualBeamedCrane(Settings settings) {
        super(settings);
    }

    private static final VoxelShape SHAPE_NS = Block.createCuboidShape(-7.5, 0, 0.5, 23.5, 16, 15.5);
    private static final VoxelShape SHAPE_WE = Block.createCuboidShape(0.5, 0, -7.5, 15.5, 16, 23.5);

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)){
            case WEST ,EAST -> SHAPE_WE;
            default -> SHAPE_NS;
        };
    }
}
