package com.besson.arknights.block.custom.lgd;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import com.besson.arknights.block.ModAbstractContainerBE;
import com.besson.arknights.block.ModBlockEntities;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;

public class SmallSandalwoodNightstandBE extends ModAbstractContainerBE {

    protected SmallSandalwoodNightstandBE(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState);
    }
    public SmallSandalwoodNightstandBE(BlockPos blockPos, BlockState blockState) {
        super(ModBlockEntities.SMALL_SANDALWOOD_NIGHTSTAND, blockPos, blockState);
    }

    @Override
    protected Text getContainerName() {
        return Text.translatable("container.small_sandalwood_nightstand");
    }
}
