package com.besson.arknights.block.custom.ursus;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class SquadBulletinBoard extends FurnitureHorizontalFacingBlock{
    public static final VoxelShape SHAPE_N = Block.createCuboidShape(-8, -2, 15, 24, 18, 16);

    public static final VoxelShape SHAPE_W = Block.createCuboidShape(15, -2, -8, 16, 18, 24);

    public static final VoxelShape SHAPE_S = Block.createCuboidShape(-8, -2, 0, 24, 18, 1);

    public static final VoxelShape SHAPE_E = Block.createCuboidShape(0, -2, -8, 1, 18, 24);

    public SquadBulletinBoard(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)){
            case EAST -> SHAPE_E;
            case SOUTH -> SHAPE_S;
            case WEST -> SHAPE_W;
            default -> SHAPE_N;
        };
    }
}
