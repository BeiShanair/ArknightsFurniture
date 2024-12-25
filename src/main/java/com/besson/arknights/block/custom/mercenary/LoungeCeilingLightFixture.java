package com.besson.arknights.block.custom.mercenary;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import com.besson.arknights.block.ModSwitchableLight;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class LoungeCeilingLightFixture extends ModSwitchableLight {

    public LoungeCeilingLightFixture(Settings settings) {
        super(settings.luminance(state -> state.get(LIT) ? 15 : 0));
    }

    private static final VoxelShape SHAPE_N = Block.createCuboidShape(-8, 14, 0, 24, 16, 16);
    private static final VoxelShape SHAPE_W = Block.createCuboidShape(0, 14, -8, 16, 16, 24);
    private static final VoxelShape SHAPE_S = Block.createCuboidShape(-8, 14, 0, 24, 16, 16);
    private static final VoxelShape SHAPE_E = Block.createCuboidShape(0, 14, -8, 16, 16, 24);

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
