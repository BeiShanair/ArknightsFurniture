package com.besson.arknights.block.custom.sideline;

import com.besson.arknights.block.ModAbstractContainerBE;
import com.besson.arknights.block.ModBlockEntities;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;

public class NightstandBE extends ModAbstractContainerBE {

    protected NightstandBE(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState);
    }
    public NightstandBE(BlockPos pos, BlockState state) {
        this(ModBlockEntities.NIGHTSTAND, pos, state);
    }

    @Override
    protected Text getContainerName() {
        return Text.translatable("container.nightstand");
    }
}
