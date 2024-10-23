package com.besson.arknights.block.custom.sideline;

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

public class Nightstand extends ModAbstractChestBlock<NightstandBE> {

    private static final VoxelShape SHAPE = Block.createCuboidShape(0,0,0,16,16,16);

    public Nightstand(Settings settings, Supplier<BlockEntityType<? extends NightstandBE>> blockEntityTypeSupplier) {
        super(settings, blockEntityTypeSupplier);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new NightstandBE(pos, state);
    }
}
