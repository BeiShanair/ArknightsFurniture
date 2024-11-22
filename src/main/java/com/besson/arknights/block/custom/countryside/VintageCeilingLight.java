package com.besson.arknights.block.custom.countryside;

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

public class VintageCeilingLight extends ModSwitchableLight {
    public VintageCeilingLight(Settings settings) {
        super(settings.luminance(state -> state.get(LIT) ? 15 : 0));
    }
    private static final VoxelShape SHAPE = Stream.of(
            Block.createCuboidShape(6, 1, 6, 10, 4, 10),
            Block.createCuboidShape(7, 4, 7, 9, 8, 9),
            Block.createCuboidShape(7.5, 8, 7.5, 8.5, 16, 8.5),
            Block.createCuboidShape(7, 0, 7, 9, 1, 9)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
}
