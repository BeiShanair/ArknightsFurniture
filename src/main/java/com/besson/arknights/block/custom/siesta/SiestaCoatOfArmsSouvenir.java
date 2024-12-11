package com.besson.arknights.block.custom.siesta;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class SiestaCoatOfArmsSouvenir extends FurnitureHorizontalFacingBlock{

    public SiestaCoatOfArmsSouvenir(Settings settings) {
        super(settings);
    }

    private static final VoxelShape SHAPE_N = Block.createCuboidShape(1, 0, 14, 15, 16, 16);
    private static final VoxelShape SHAPE_W = Block.createCuboidShape(14, 0, 1, 16, 16, 15);
    private static final VoxelShape SHAPE_S = Block.createCuboidShape(1, 0, 0, 15, 16, 2);
    private static final VoxelShape SHAPE_E = Block.createCuboidShape(0, 0, 1, 2, 16, 15);

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
