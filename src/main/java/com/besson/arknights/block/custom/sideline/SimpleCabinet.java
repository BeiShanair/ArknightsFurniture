package com.besson.arknights.block.custom.sideline;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import com.besson.arknights.block.ModAbstractChestBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

public class SimpleCabinet extends ModAbstractChestBlock<SimpleCabinetBE> {

    private static final VoxelShape SHAPE = Block.createCuboidShape(0,0,0,16,16,16);

    public SimpleCabinet(Settings settings, Supplier<BlockEntityType<? extends SimpleCabinetBE>> blockEntityTypeSupplier) {
        super(settings, blockEntityTypeSupplier);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new SimpleCabinetBE(pos, state);
    }
}
