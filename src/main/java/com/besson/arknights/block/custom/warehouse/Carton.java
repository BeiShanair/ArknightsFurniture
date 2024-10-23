package com.besson.arknights.block.custom.warehouse;

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

public class Carton extends ModAbstractChestBlock<CartonBE> {

    private static final VoxelShape SHAPE = Block.createCuboidShape(-4, 0, -4, 20, 32, 20);

    public Carton(Settings settings, Supplier<BlockEntityType<? extends CartonBE>> blockEntityTypeSupplier) {
        super(settings, blockEntityTypeSupplier);
    }


    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new CartonBE(pos, state);
    }
}
