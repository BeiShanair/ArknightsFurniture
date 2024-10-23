package com.besson.arknights.block.custom.warehouse;

import com.besson.arknights.block.ModAbstractContainerBE;
import com.besson.arknights.block.ModBlockEntities;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;

public class CartonBE extends ModAbstractContainerBE {
    protected CartonBE(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState);
    }
    public CartonBE(BlockPos pos, BlockState state) {
        this(ModBlockEntities.CARTON, pos, state);
    }

    @Override
    protected Text getContainerName() {
        return Text.translatable("container.carton");
    }
}
