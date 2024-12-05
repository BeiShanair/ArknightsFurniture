package com.besson.arknights.block.custom.hotel;

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

public class ModernHotelFloorLamp extends ModSwitchableLight {

    public ModernHotelFloorLamp(Settings settings) {
        super(settings.luminance(state -> state.get(LIT) ? 15 : 0));
    }

    private static final VoxelShape SHAPE = Stream.of(
            Block.createCuboidShape(4, 0, 4, 12, 1, 12),
            Block.createCuboidShape(7, 1, 7, 9, 16, 9),
            Block.createCuboidShape(6, 16, 6, 10, 18, 10),
            Block.createCuboidShape(5, 18, 5, 11, 23, 11),
            Block.createCuboidShape(4, 19, 3, 12, 22, 4),
            Block.createCuboidShape(4, 19, 12, 12, 22, 13),
            Block.createCuboidShape(3, 19, 3, 4, 22, 13),
            Block.createCuboidShape(12, 19, 3, 13, 22, 13)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
}
