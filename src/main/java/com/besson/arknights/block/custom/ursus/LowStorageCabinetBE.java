package com.besson.arknights.block.custom.ursus;

import com.besson.arknights.block.ModAbstractContainerBE;
import com.besson.arknights.block.ModBlockEntities;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;

public class LowStorageCabinetBE extends ModAbstractContainerBE {

    protected LowStorageCabinetBE(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState);
    }
    public LowStorageCabinetBE(BlockPos blockPos, BlockState blockState){
        this(ModBlockEntities.LOW_STORAGE_CABINET, blockPos, blockState);
    }

    @Override
    protected Text getContainerName() {
        return Text.translatable("container.low_storage_cabinet");
    }
}
