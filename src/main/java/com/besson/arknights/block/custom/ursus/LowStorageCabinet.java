package com.besson.arknights.block.custom.ursus;

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

public class LowStorageCabinet extends ModAbstractChestBlock<LowStorageCabinetBE> {
    public static final VoxelShape SHAPE_N = Block.createCuboidShape(0,0,0,16,16,16);

    public static final VoxelShape SHAPE_W = Block.createCuboidShape(0,0,0,16,16,16);

    public static final VoxelShape SHAPE_S = Block.createCuboidShape(0,0,0,16,16,16);

    public static final VoxelShape SHAPE_E = Block.createCuboidShape(0,0,0,16,16,16);

    public LowStorageCabinet(Settings settings, Supplier<BlockEntityType<? extends LowStorageCabinetBE>> blockEntityTypeSupplier) {
        super(settings, blockEntityTypeSupplier);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)){
            case EAST -> SHAPE_E;
            case SOUTH -> SHAPE_S;
            case WEST -> SHAPE_W;
            default -> SHAPE_N;
        };
    }

    @Override
    public @Nullable BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new LowStorageCabinetBE(pos, state);
    }
}
