package com.besson.arknights.block.custom.warehouse;

import com.besson.arknights.block.ModAbstractChestBlock;
import com.besson.arknights.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;

import java.util.List;
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

    @Override
    public void appendTooltip(ItemStack stack, @Nullable BlockView world, List<Text> tooltip, TooltipContext options) {
        tooltip.add(Text.translatable("tooltip.arknights.large_shelf"));
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new LargeShelfBE(pos, state);
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        super.onPlaced(world, pos, state, placer, itemStack);
        if (world.isClient()){
            return;
        }
        Direction direction = state.get(FACING);
        BlockPos midPos1 = pos.up();
        BlockPos midPos2 = pos.up(2);
        BlockPos topPos = pos.up(3);
        if (!canPlace(world, midPos1, midPos2, topPos)) {
            return;
        }
        world.setBlockState(midPos1, ModBlocks.LARGE_SHELF2.getDefaultState().with(FACING, direction), 3);
        world.setBlockState(midPos2, ModBlocks.LARGE_SHELF3.getDefaultState().with(FACING, direction), 3);
        world.setBlockState(topPos, ModBlocks.LARGE_SHELF4.getDefaultState().with(FACING, direction), 3);

    }

    private boolean canPlace(World world, BlockPos... pos) {
        for (BlockPos blockPos : pos) {
            if (!world.getBlockState(blockPos).isAir()) {
                return false;
            }
        }
        return true;
    }
    @Override
    public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        if (state.isOf(newState.getBlock())) {
            super.onStateReplaced(state, world, pos, newState, moved);
            return;
        }

        // 向上破坏
        for (int i = 1; i <= 3; i++) {
            BlockPos upPos = pos.up(i);
            if (isShelfBlock(world.getBlockState(upPos))) {
                world.removeBlock(upPos, false);
            }
        }

        // 向下破坏
        for (int i = 1; i <= 3; i++) {
            BlockPos downPos = pos.down(i);
            if (isShelfBlock(world.getBlockState(downPos))) {
                world.removeBlock(downPos, false);
            }
        }

        super.onStateReplaced(state, world, pos, newState, moved);
    }

    @Override
    public @Nullable BlockState getPlacementState(ItemPlacementContext ctx) {
        World world = ctx.getWorld();
        BlockPos mainPos = ctx.getBlockPos();
        BlockState state = super.getPlacementState(ctx);
        if (state == null) {
            return null;
        }
        BlockPos midPos1 = mainPos.up();
        BlockPos midPos2 = mainPos.up(2);
        BlockPos topPos = mainPos.up(3);
        boolean placeable = canPlace(world, midPos1, midPos2, topPos);
        return placeable ? state : null;
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (direction.getAxis() == Direction.Axis.Y) {
            if (neighborState.isAir()) {
                return state; // 放置时允许
            }
            if (isShelfBlock(neighborState) && world.getBlockState(neighborPos).isAir()) {
                return Blocks.AIR.getDefaultState(); // 邻居被破坏时也破坏自己
            }
            return state.with(FACING, state.get(FACING));
        }
        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    private boolean isShelfBlock(BlockState state) {
        return state.isOf(this) ||
                state.isOf(ModBlocks.LARGE_SHELF1) ||
                state.isOf(ModBlocks.LARGE_SHELF2) ||
                state.isOf(ModBlocks.LARGE_SHELF3) ||
                state.isOf(ModBlocks.LARGE_SHELF4);
    }
}
