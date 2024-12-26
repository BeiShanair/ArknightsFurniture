package com.besson.arknights.block.custom.ursus;

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

public class HangingLamp extends ModSwitchableLight {
    public static final VoxelShape SHAPE = Stream.of(
            Block.createCuboidShape(6, 12, 6, 10, 14, 10),
            Block.createCuboidShape(7, 4, 7, 9, 6, 9),
            Block.createCuboidShape(7.5, 6, 7.5, 8.5, 16, 8.5)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    public HangingLamp(Settings settings) {
        super(settings.luminance(state -> state.get(LIT)? 15 : 0));
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
}
