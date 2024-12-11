package com.besson.arknights.block.custom.siesta;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import com.besson.arknights.block.ModSwitchableLight;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class BeachHouseFloorLamp extends ModSwitchableLight {

    public BeachHouseFloorLamp(Settings settings) {
        super(settings.luminance(state -> state.get(LIT) ? 15 : 0));
    }

    private static final VoxelShape SHAPE = Block.createCuboidShape(5, 0, 5, 11, 11, 11);

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
}
