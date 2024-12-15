package com.besson.arknights.block.custom.reimselar;

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

public class LockedCabinet extends ModAbstractChestBlock<LockedCabinetBE> {

    private static final VoxelShape SHAPE_NS = Block.createCuboidShape(-2, 0, 1, 18, 32, 15);
    private static final VoxelShape SHAPE_WE = Block.createCuboidShape(1, 0, -2, 15, 32, 18);

    public LockedCabinet(Settings settings, Supplier<BlockEntityType<? extends LockedCabinetBE>> blockEntityTypeSupplier) {
        super(settings, blockEntityTypeSupplier);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)) {
            case WEST,EAST -> SHAPE_WE;
            default -> SHAPE_NS;
        };
    }

    @Override
    public @Nullable BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new LockedCabinetBE(pos, state);
    }
}
