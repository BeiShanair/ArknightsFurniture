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

public class LargeShelf extends ModAbstractChestBlock<LargeShelfBE> {

    private static final VoxelShape SHAPE_NS = Block.createCuboidShape(-16, 0, -4, 32, 16, 20);
    private static final VoxelShape SHAPE_WE = Block.createCuboidShape(-4, 0, -16, 20, 16, 32);

    public LargeShelf(Settings settings, Supplier<BlockEntityType<? extends LargeShelfBE>> blockEntityTypeSupplier) {
        super(settings, blockEntityTypeSupplier);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)) {
            case EAST, WEST -> SHAPE_WE;
            default -> SHAPE_NS;
        };
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new LargeShelfBE(pos, state);
    }
}
