package com.besson.arknights.block.custom.diner;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import com.besson.arknights.block.ModSwitchableLight;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class HealthySpotlight extends ModSwitchableLight {
    public HealthySpotlight(Settings settings) {
        super(settings.luminance(state -> state.get(LIT)? 15 : 0));
    }

    private static final VoxelShape SHAPE_N = Block.createCuboidShape(0, 12, 13, 16, 16, 15);
    private static final VoxelShape SHAPE_S = Block.createCuboidShape(0, 12, 1, 16, 16, 3);
    private static final VoxelShape SHAPE_W = Block.createCuboidShape(13, 12, 0, 15, 16, 16);
    private static final VoxelShape SHAPE_E = Block.createCuboidShape(1, 12, 0, 3, 16, 16);

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
