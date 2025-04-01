package com.besson.arknights.block.custom.warehouse;

import com.besson.arknights.block.ModSwitchableLight;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class CeilingRowLight extends ModSwitchableLight {

    public static final VoxelShape SHAPE_N = Block.createCuboidShape(-15.75, 14, 14, 15.75, 16, 15.95);

    public static final VoxelShape SHAPE_W = Block.createCuboidShape(14, 14, 0.25, 15.95, 16, 31.75);

    public static final VoxelShape SHAPE_S = Block.createCuboidShape(0.25, 14, 0.05, 31.75, 16, 2);

    public static final VoxelShape SHAPE_E = Block.createCuboidShape(0.05, 14, -15.75, 2, 16, 15.75);
    public CeilingRowLight(Settings settings) {
        super(settings.luminance(state -> state.get(LIT) ? 15 : 0));
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)) {
            case WEST -> SHAPE_W;
            case EAST -> SHAPE_E;
            case SOUTH -> SHAPE_S;
            default -> SHAPE_N;
        };
    }
}
