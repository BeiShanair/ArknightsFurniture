package com.besson.arknights.block.custom.fantastic;

import com.besson.arknights.block.ModAbstractContainerBE;
import com.besson.arknights.block.ModBlockEntities;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;

public class SmallSquareNightstandBE extends ModAbstractContainerBE {

    protected SmallSquareNightstandBE(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState);
    }
    public SmallSquareNightstandBE(BlockPos pos, BlockState state) {
        this(ModBlockEntities.SMALL_SQUARE_NIGHTSTAND, pos, state);
    }
    @Override
    protected Text getContainerName() {
        return Text.translatable("container.small_square_nightstand");
    }
}
