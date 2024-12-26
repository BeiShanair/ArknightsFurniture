package com.besson.arknights.block.custom.ursus;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import com.besson.arknights.block.ModSwitchableLight;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class CeilingDiskLight extends ModSwitchableLight {
    public static final VoxelShape SHAPE = Block.createCuboidShape(3, 7, 3, 13, 16, 13);

    public CeilingDiskLight(Settings settings) {
        super(settings.luminance(state -> state.get(LIT) ? 15 : 0));
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
}
