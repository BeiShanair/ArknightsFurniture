package com.besson.arknights.block.custom.columbian;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import com.besson.arknights.block.ModAbstractContainerBE;
import com.besson.arknights.block.ModBlockEntities;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class RedBrownCabinetBE extends ModAbstractContainerBE {

    protected RedBrownCabinetBE(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState);
    }

    public RedBrownCabinetBE(BlockPos blockPos, BlockState blockState) {
        super(ModBlockEntities.RED_BROWN_CABINET, blockPos, blockState);
    }
    @Override
    protected Text getContainerName() {
        return Text.translatable("container.red_brown_cabinet");
    }
}
