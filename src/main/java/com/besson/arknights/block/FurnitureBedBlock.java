package com.besson.arknights.block;

import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.enums.BedPart;
import net.minecraft.util.DyeColor;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class FurnitureBedBlock extends BedBlock {
    public FurnitureBedBlock(DyeColor color, Settings settings) {
        super(color, settings);
    }
    private static final VoxelShape SHAPE = Block.createCuboidShape(0, 0, 0, 16, 8, 16);
    @Override
    public BlockRenderType getRenderType(BlockState state) {
        if (state.get(PART) == BedPart.HEAD) {
            return BlockRenderType.MODEL;
        } else {
            return BlockRenderType.INVISIBLE;
        }
    }
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return null;
    }
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
}
