package com.besson.arknights.block.custom.mercenary;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import com.besson.arknights.block.ModSwitchableLight;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class LoungeChandelier extends ModSwitchableLight {

    public LoungeChandelier(Settings settings) {
        super(settings.luminance(state -> state.get(LIT)? 15 : 0));
    }

    private static final VoxelShape SHAPE_NS = Block.createCuboidShape(2, 2, 7, 14, 16, 9);
    private static final VoxelShape SHAPE_WE = Block.createCuboidShape(7, 2, 2, 9, 16, 14);

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)){
            case WEST, EAST -> SHAPE_WE;
            default -> SHAPE_NS;
        };
    }
}
