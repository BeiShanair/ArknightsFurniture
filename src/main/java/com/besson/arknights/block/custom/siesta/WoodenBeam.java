package com.besson.arknights.block.custom.siesta;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

import java.util.stream.Stream;

public class WoodenBeam extends FurnitureHorizontalFacingBlock{

    public WoodenBeam(Settings settings) {
        super(settings);
    }

    private static final VoxelShape SHAPE_NS = Stream.of(
            Block.createCuboidShape(0, 14, 0, 16, 16, 1),
            Block.createCuboidShape(0, 14, 15, 16, 16, 16),
            Block.createCuboidShape(1, 14, 12, 15, 16, 13),
            Block.createCuboidShape(1, 14, 9, 15, 16, 10),
            Block.createCuboidShape(1, 14, 6, 15, 16, 7),
            Block.createCuboidShape(1, 14, 3, 15, 16, 4),
            Block.createCuboidShape(0, 14, 1, 1, 16, 15),
            Block.createCuboidShape(15, 14, 1, 16, 16, 15)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SHAPE_WE = Stream.of(
            Block.createCuboidShape(0, 14, 0, 1, 16, 16),
            Block.createCuboidShape(15, 14, 0, 16, 16, 16),
            Block.createCuboidShape(12, 14, 1, 13, 16, 15),
            Block.createCuboidShape(9, 14, 1, 10, 16, 15),
            Block.createCuboidShape(6, 14, 1, 7, 16, 15),
            Block.createCuboidShape(3, 14, 1, 4, 16, 15),
            Block.createCuboidShape(1, 14, 15, 15, 16, 16),
            Block.createCuboidShape(1, 14, 0, 15, 16, 1)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)){
            case WEST,EAST -> SHAPE_WE;
            default -> SHAPE_NS;
        };
    }
}
