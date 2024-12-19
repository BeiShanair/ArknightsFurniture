package com.besson.arknights.block.custom.eatery;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import com.besson.arknights.block.ModSwitchableLight;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class SmallSpotlight extends ModSwitchableLight {

    public SmallSpotlight(Settings settings) {
        super(settings.luminance(state -> state.get(LIT)? 15 : 0));
    }

    private static final VoxelShape SHAPE_N = Block.createCuboidShape(7, 7, 14, 9, 10, 16);
    private static final VoxelShape SHAPE_S = Block.createCuboidShape(7, 7, 0, 9, 10, 2);
    private static final VoxelShape SHAPE_W = Block.createCuboidShape(14, 7, 7, 16, 10, 9);
    private static final VoxelShape SHAPE_E = Block.createCuboidShape(0, 7, 7, 2, 10, 9);

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
