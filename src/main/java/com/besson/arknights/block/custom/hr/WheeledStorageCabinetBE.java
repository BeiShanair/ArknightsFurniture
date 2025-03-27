package com.besson.arknights.block.custom.hr;

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

public class WheeledStorageCabinetBE extends ModAbstractContainerBE {

    protected WheeledStorageCabinetBE(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState);
    }
    public WheeledStorageCabinetBE(BlockPos pos, BlockState state) {
        this(ModBlockEntities.WHEELED_STORAGE_CABINET, pos, state);
    }

    @Override
    protected Text getContainerName() {
        return Text.translatable("container.wheeled_storage_cabinet");
    }
}
