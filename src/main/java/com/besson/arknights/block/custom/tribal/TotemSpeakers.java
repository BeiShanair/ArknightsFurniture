package com.besson.arknights.block.custom.tribal;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class TotemSpeakers extends FurnitureHorizontalFacingBlock{
    public static final VoxelShape SHAPE_N = Block.createCuboidShape(-3, 0, 7, 19, 17, 11);

    public static final VoxelShape SHAPE_W = Block.createCuboidShape(7, 0, -3, 11, 17, 19);

    public static final VoxelShape SHAPE_S = Block.createCuboidShape(-3, 0, 5, 19, 17, 9);

    public static final VoxelShape SHAPE_E = Block.createCuboidShape(5, 0, -3, 9, 17, 19);

    public TotemSpeakers(Settings settings) {
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
