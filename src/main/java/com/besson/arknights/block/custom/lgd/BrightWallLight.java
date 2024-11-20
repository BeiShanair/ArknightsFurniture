package com.besson.arknights.block.custom.lgd;

import com.besson.arknights.block.ModSwitchableLight;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class BrightWallLight extends ModSwitchableLight {
    public BrightWallLight(Settings settings) {
        super(settings.luminance(state -> state.get(LIT) ? 15 : 0));
    }
    private static final VoxelShape SHAPE_N = Block.createCuboidShape(1, 6, 12, 15, 10, 16);
    private static final VoxelShape SHAPE_W = Block.createCuboidShape(12, 6, 1, 16, 10, 15);
    private static final VoxelShape SHAPE_S = Block.createCuboidShape(1, 6, 0, 15, 10, 4);
    private static final VoxelShape SHAPE_E = Block.createCuboidShape(0, 6, 1, 4, 10, 15);

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)){
            case WEST -> SHAPE_W;
            case SOUTH -> SHAPE_S;
            case EAST -> SHAPE_E;
            default -> SHAPE_N;
        };
    }
}
