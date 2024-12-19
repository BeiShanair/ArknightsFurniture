package com.besson.arknights.block.custom.eatery;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import com.besson.arknights.block.ModSwitchableLight;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

import java.util.stream.Stream;

public class HexagonalLantern extends ModSwitchableLight {

    public HexagonalLantern(Settings settings) {
        super(settings.luminance(state -> state.get(LIT)? 15 : 0));
    }

    private static final VoxelShape SHAPE = Stream.of(
            Block.createCuboidShape(7, -6, 7, 9, -1, 9),
            Block.createCuboidShape(7.5, -1, 7.5, 8.5, 1, 8.5),
            Block.createCuboidShape(6, 13, 6, 10, 14, 10),
            Block.createCuboidShape(5, 3, 5, 11, 4, 11),
            Block.createCuboidShape(6, 4, 6, 10, 12, 10),
            Block.createCuboidShape(5, 12, 5, 11, 13, 11),
            Block.createCuboidShape(6, 1, 6, 10, 3, 10),
            Block.createCuboidShape(7.5, 14, 7.5, 8.5, 16, 8.5)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
}
