package com.besson.arknights.block.custom.countryside;

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

public class LogCabinetBottom extends ModAbstractChestBlock<LogCabinetBottomBE> {


    public LogCabinetBottom(Settings settings, Supplier<BlockEntityType<? extends LogCabinetBottomBE>> blockEntityTypeSupplier) {
        super(settings, blockEntityTypeSupplier);
    }
    private static final VoxelShape SHAPE_N = Block.createCuboidShape(-16, 0, 0, 16, 16, 16);
    private static final VoxelShape SHAPE_W = Block.createCuboidShape(0, 0, 0, 16, 16, 32);
    private static final VoxelShape SHAPE_S = Block.createCuboidShape(0, 0, 0, 32, 16, 16);
    private static final VoxelShape SHAPE_E = Block.createCuboidShape(0, 0, -16, 16, 16, 16);

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)){
            case WEST -> SHAPE_W;
            case SOUTH -> SHAPE_S;
            case EAST -> SHAPE_E;
            default -> SHAPE_N;
        };
    }

    @Override
    public @Nullable BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new LogCabinetBottomBE(pos, state);
    }
}
