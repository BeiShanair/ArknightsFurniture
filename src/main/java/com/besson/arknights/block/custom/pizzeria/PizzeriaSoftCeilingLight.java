package com.besson.arknights.block.custom.pizzeria;

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

public class PizzeriaSoftCeilingLight extends ModSwitchableLight {

    public PizzeriaSoftCeilingLight(Settings settings) {
        super(settings.luminance(state -> state.get(LIT) ? 15 : 0));
    }

    private static final VoxelShape SHAPE = Stream.of(
            Block.createCuboidShape(5, 0, 4, 11, 5, 5),
            Block.createCuboidShape(5, 0, 11, 11, 5, 12),
            Block.createCuboidShape(5, 5, 5, 11, 6, 11),
            Block.createCuboidShape(4, 0, 5, 5, 5, 11),
            Block.createCuboidShape(11, 0, 5, 12, 5, 11),
            Block.createCuboidShape(6, 6, 6, 10, 7, 10),
            Block.createCuboidShape(7, 7, 7, 9, 16, 9)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
}
