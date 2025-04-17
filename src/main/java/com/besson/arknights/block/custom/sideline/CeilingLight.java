package com.besson.arknights.block.custom.sideline;

import com.besson.arknights.block.ModSwitchableLight;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class CeilingLight extends ModSwitchableLight {
    public CeilingLight(Settings settings) {
        super(settings.luminance(state -> state.get(LIT) ? 15 : 0));
    }
    private static final VoxelShape SHAPE = Block.createCuboidShape(6, 15.625, 6, 10, 16, 10);

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
}
