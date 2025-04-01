package com.besson.arknights.block.custom.warehouse;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class DormitoryDoorFrames extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_N = VoxelShapes.combineAndSimplify(
            Block.createCuboidShape(-3.45, 0, 13, -1, 32, 16),
            Block.createCuboidShape(17, 0, 13, 19.5, 32, 16), BooleanBiFunction.OR);

    public static final VoxelShape SHAPE_W = VoxelShapes.combineAndSimplify(
            Block.createCuboidShape(13, 0, 17, 16, 32, 19.45),
            Block.createCuboidShape(13, 0, -3.5, 16, 32, -1), BooleanBiFunction.OR);

    public static final VoxelShape SHAPE_S = VoxelShapes.combineAndSimplify(
            Block.createCuboidShape(17, 0, 0, 19.45, 32, 3),
            Block.createCuboidShape(-3.5, 0, 0, -1, 32, 3), BooleanBiFunction.OR);

    public static final VoxelShape SHAPE_E = VoxelShapes.combineAndSimplify(
            Block.createCuboidShape(0, 0, -3.5, 3, 32, -1),
            Block.createCuboidShape(0, 0, 17, 3, 32, 19.5), BooleanBiFunction.OR);

    public DormitoryDoorFrames(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)) {
            case WEST -> SHAPE_W;
            case EAST -> SHAPE_E;
            case SOUTH -> SHAPE_S;
            default -> SHAPE_N;
        };
    }
}
