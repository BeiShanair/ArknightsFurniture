package com.besson.arknights.block.custom.mercenary;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class BulletproofGlassDoor extends FurnitureHorizontalFacingBlock{

    public BulletproofGlassDoor(Settings settings) {
        super(settings);
    }

    private static final VoxelShape SHAPE_N = Block.createCuboidShape(-3, 0, 4, 19, 28, 13);
    private static final VoxelShape SHAPE_W = Block.createCuboidShape(4, 0, -3, 13, 28, 19);
    private static final VoxelShape SHAPE_S = Block.createCuboidShape(-3, 0, 3, 19, 28, 12);
    private static final VoxelShape SHAPE_E = Block.createCuboidShape(3, 0, -3, 12, 28, 19);

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
