package com.besson.arknights.block.custom.fantasticbiod;

import com.besson.arknights.block.ModSwitchableLight;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class FlushMountSquareCeilingLight extends ModSwitchableLight {
    public FlushMountSquareCeilingLight(Settings settings) {
        super(settings.luminance(state -> state.get(Properties.LIT) ? 15 : 0));
    }
    private static final VoxelShape SHAPE = Block.createCuboidShape(-8, 15, -8, 24, 16, 24);

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
}
