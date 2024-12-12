package com.besson.arknights.block.custom.rehearsal;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class YarmahanDrumSet extends FurnitureHorizontalFacingBlock{

    public YarmahanDrumSet(Settings settings) {
        super(settings);
    }

    private static final VoxelShape SHAPE_NS = Block.createCuboidShape(-7, 0, -1, 23, 17, 17);
    private static final VoxelShape SHAPE_WE = Block.createCuboidShape(-1, 0, -7, 17, 17, 23);

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)){
            case WEST,EAST -> SHAPE_WE;
            default -> SHAPE_NS;
        };
    }
}
