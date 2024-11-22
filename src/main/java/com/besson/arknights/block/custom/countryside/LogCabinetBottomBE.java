package com.besson.arknights.block.custom.countryside;

import com.besson.arknights.block.ModAbstractContainerBE;
import com.besson.arknights.block.ModBlockEntities;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;

public class LogCabinetBottomBE extends ModAbstractContainerBE {

    protected LogCabinetBottomBE(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState);
    }

    public LogCabinetBottomBE(BlockPos blockPos, BlockState blockState) {
        super(ModBlockEntities.LOG_CABINET_BOTTOM, blockPos, blockState);
    }
    @Override
    protected Text getContainerName() {
        return Text.translatable("container.log_cabinet_bottom");
    }
}
