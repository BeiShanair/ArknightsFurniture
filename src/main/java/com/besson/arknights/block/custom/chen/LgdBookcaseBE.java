package com.besson.arknights.block.custom.chen;

import com.besson.arknights.block.ModAbstractContainerBE;
import com.besson.arknights.block.ModBlockEntities;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;

public class LgdBookcaseBE extends ModAbstractContainerBE {

    protected LgdBookcaseBE(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState);
    }

    public LgdBookcaseBE(BlockPos blockPos, BlockState blockState) {
        super(ModBlockEntities.LGD_BOOKCASE, blockPos, blockState);
    }

    @Override
    protected Text getContainerName() {
        return Text.translatable("container.lgd_bookcase");
    }
}
