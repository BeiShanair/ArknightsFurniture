package com.besson.arknights.block;

import net.minecraft.block.BedBlock;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.enums.BedPart;
import net.minecraft.util.DyeColor;
import net.minecraft.util.math.BlockPos;

public class ModBedBlock extends BedBlock {
    public ModBedBlock(DyeColor color, Settings settings) {
        super(color, settings);
    }
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
}
