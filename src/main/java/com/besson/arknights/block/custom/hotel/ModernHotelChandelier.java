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

public class ModernHotelChandelier extends ModSwitchableLight {

    public ModernHotelChandelier(Settings settings) {
        super(settings.luminance(state -> state.get(LIT) ? 15 : 0));
    }

    private static final VoxelShape SHAPE_NS = Stream.of(
            Block.createCuboidShape(6, 1, 6, 10, 9, 10),
            Block.createCuboidShape(10, 3, 6, 14, 8, 10),
            Block.createCuboidShape(2, 3, 6, 6, 8, 10),
            Block.createCuboidShape(7, 0, 7, 9, 1, 9),
            Block.createCuboidShape(11, 2, 7, 13, 3, 9),
            Block.createCuboidShape(3, 2, 7, 5, 3, 9),
            Block.createCuboidShape(1.5, 8, 5.5, 6, 9, 10.5),
            Block.createCuboidShape(10, 8, 5.5, 14.5, 9, 10.5),
            Block.createCuboidShape(5.5, 9, 5.5, 10.5, 10, 10.5),
            Block.createCuboidShape(3.5, 9, 7.5, 4.5, 16, 8.5),
            Block.createCuboidShape(11.5, 9, 7.5, 12.5, 16, 8.5),
            Block.createCuboidShape(7.5, 10, 7.5, 8.5, 16, 8.5)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SHAPE_WE = Stream.of(
            Block.createCuboidShape(6, 1, 6, 10, 9, 10),
            Block.createCuboidShape(6, 3, 2, 10, 8, 6),
            Block.createCuboidShape(6, 3, 10, 10, 8, 14),
            Block.createCuboidShape(7, 0, 7, 9, 1, 9),
            Block.createCuboidShape(7, 2, 3, 9, 3, 5),
            Block.createCuboidShape(7, 2, 11, 9, 3, 13),
            Block.createCuboidShape(5.5, 8, 10, 10.5, 9, 14.5),
            Block.createCuboidShape(5.5, 8, 1.5, 10.5, 9, 6),
            Block.createCuboidShape(5.5, 9, 5.5, 10.5, 10, 10.5),
            Block.createCuboidShape(7.5, 9, 11.5, 8.5, 16, 12.5),
            Block.createCuboidShape(7.5, 9, 3.5, 8.5, 16, 4.5),
            Block.createCuboidShape(7.5, 10, 7.5, 8.5, 16, 8.5)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)){
            case WEST,EAST -> SHAPE_WE;
            default -> SHAPE_NS;
        };
    }
}
