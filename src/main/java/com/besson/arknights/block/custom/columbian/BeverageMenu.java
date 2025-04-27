package com.besson.arknights.block.custom.columbian;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class BeverageMenu extends FurnitureHorizontalFacingBlock {
    public BeverageMenu(Settings settings) {
        super(settings);
    }
    private static final VoxelShape SHAPE_N = VoxelShapes.combineAndSimplify(
            Block.createCuboidShape(0, 13, 15, 19, 25, 16),
            Block.createCuboidShape(-6, 0, 15, 13, 11, 16), BooleanBiFunction.OR);
    private static final VoxelShape SHAPE_W = VoxelShapes.combineAndSimplify(
            Block.createCuboidShape(15, 13, -3, 16, 25, 16),
            Block.createCuboidShape(15, 0, 3, 16, 11, 22), BooleanBiFunction.OR);
    private static final VoxelShape SHAPE_S = VoxelShapes.combineAndSimplify(
            Block.createCuboidShape(-3, 13, 0, 16, 25, 1),
            Block.createCuboidShape(3, 0, 0, 22, 11, 1), BooleanBiFunction.OR);
    private static final VoxelShape SHAPE_E = VoxelShapes.combineAndSimplify(
            Block.createCuboidShape(0, 13, 0, 1, 25, 19),
            Block.createCuboidShape(0, 0, -6, 1, 11, 13), BooleanBiFunction.OR);

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
