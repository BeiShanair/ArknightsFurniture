package com.besson.arknights.block.custom.lgd;

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

public class BlackPedestalTable extends FurnitureHorizontalFacingBlock {
    public BlackPedestalTable(Settings settings) {
        super(settings);
    }
    private static final VoxelShape SHAPE = Stream.of(
            Block.createCuboidShape(11, 0, 11, 12, 0.5, 12),
            Block.createCuboidShape(4, 0.5, 4, 12, 1, 12),
            Block.createCuboidShape(7, 1, 7, 9, 15, 9),
            Block.createCuboidShape(-2, 15, -3, 18, 16, 18),
            Stream.of(
                    Block.createCuboidShape(4, 0, 4, 7.25, 1, 12),
                    Block.createCuboidShape(4, 0.1, 4, 12, 1.1, 7.25),
                    Stream.of(
                            Block.createCuboidShape(8.75, 0, 4, 12, 1, 12),
                            Block.createCuboidShape(4, 0.1, 8.75, 12, 1.1, 12),
                            Block.createCuboidShape(4, 0, 4, 5, 0.5, 5),
                            Block.createCuboidShape(4, 0, 11, 5, 0.5, 12),
                            Block.createCuboidShape(11, 0, 4, 12, 0.5, 5)
                    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get()
            ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get()
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
}
