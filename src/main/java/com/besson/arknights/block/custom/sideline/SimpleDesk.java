package com.besson.arknights.block.custom.sideline;

import com.besson.arknights.block.ConnectableBlock;
import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import com.besson.arknights.block.ModDoubleBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;

public class SimpleDesk extends FurnitureHorizontalFacingBlock {
    public SimpleDesk(Settings settings) {
        super(settings);
    }
    private static final VoxelShape SHAPE_N = Block.createCuboidShape(-16, 0, 0, 16, 16, 32);
    private static final VoxelShape SHAPE_W = Block.createCuboidShape(0, 0, 0, 32, 16, 32);
    private static final VoxelShape SHAPE_S = Block.createCuboidShape(0, 0, -16, 32, 16, 16);
    private static final VoxelShape SHAPE_E = Block.createCuboidShape(-16, 0, -16, 16, 16, 16);

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)){
            case WEST -> SHAPE_W;
            case EAST -> SHAPE_E;
            case SOUTH -> SHAPE_S;
            default -> SHAPE_N;
        };
    }
}
