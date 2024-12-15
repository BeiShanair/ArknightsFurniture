package com.besson.arknights.block.custom.reimselar;

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

public class CandleChandelier extends ModSwitchableLight {

    public CandleChandelier(Settings settings) {
        super(settings.luminance(state -> state.get(LIT) ? 15 : 0));
    }

    private static final VoxelShape SHAPE = Stream.of(
            Block.createCuboidShape(7, 13, 7, 9, 16, 9),
            Block.createCuboidShape(6, 7, 6, 10, 13, 10),
            Block.createCuboidShape(7, 5, 7, 9, 7, 9),
            Block.createCuboidShape(2, 8, 2, 14, 9, 3),
            Block.createCuboidShape(2, 8, 3, 3, 9, 13),
            Block.createCuboidShape(2, 8, 13, 14, 9, 14),
            Block.createCuboidShape(13, 8, 3, 14, 9, 13),
            Block.createCuboidShape(2, 9, 13, 3, 11, 14),
            Block.createCuboidShape(2, 9, 7.5, 3, 11, 8.5),
            Block.createCuboidShape(2, 9, 2, 3, 11, 3),
            Block.createCuboidShape(7.5, 9, 13, 8.5, 11, 14),
            Block.createCuboidShape(13, 9, 13, 14, 11, 14),
            Block.createCuboidShape(13, 9, 7.5, 14, 11, 8.5),
            Block.createCuboidShape(13, 9, 2, 14, 11, 3),
            Block.createCuboidShape(7.5, 9, 2, 8.5, 11, 3)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
}
