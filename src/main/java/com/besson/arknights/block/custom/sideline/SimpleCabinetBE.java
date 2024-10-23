package com.besson.arknights.block.custom.sideline;

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

public class SimpleCabinetBE extends ModAbstractContainerBE {

    protected SimpleCabinetBE(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState);
    }
    public SimpleCabinetBE(BlockPos pos, BlockState state) {
        this(ModBlockEntities.SIMPLE_CABINET, pos, state);
    }

    @Override
    protected Text getContainerName() {
        return Text.translatable("container.simple_cabinet");
    }
}
