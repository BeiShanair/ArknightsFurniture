package com.besson.arknights.block.custom.fantastic;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import com.besson.arknights.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;

public class WideGrayCarpet extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE = Block.createCuboidShape(-16, 0, -16, 32, 0.45, 32);
    public WideGrayCarpet(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        super.onPlaced(world, pos, state, placer, itemStack);
        if (world.isClient()){
            return;
        }
        Direction dir = state.get(FACING);
        BlockPos right = pos.offset(dir.rotateYCounterclockwise(),3);

        if (!world.getBlockState(right).isAir()){
            return;
        }
        world.setBlockState(right, ModBlocks.WIDE_GRAY_CARPET_RIGHT.getDefaultState().with(FACING, dir));
    }

    @Override
    public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        if (state.isOf(newState.getBlock())){
            super.onStateReplaced(state, world, pos, newState, moved);
            return;
        }

        BlockPos mainPos = findMainPos(state, pos);
        if (mainPos == null){
            return;
        }
        Direction dir = state.get(FACING);
        removeAllParts(world, mainPos, dir);

        super.onStateReplaced(state, world, pos, newState, moved);
    }

    @Override
    public @Nullable BlockState getPlacementState(ItemPlacementContext ctx) {
        World world = ctx.getWorld();
        BlockPos pos = ctx.getBlockPos();
        BlockState state = super.getPlacementState(ctx);

        if (state == null){
            return null;
        }
        Direction dir = state.get(FACING);
        BlockPos right = pos.offset(dir.rotateYCounterclockwise(), 3);

        boolean placeable = world.getBlockState(right).isAir();
        return placeable ? state : null;
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (neighborState.isAir()){
            return state;
        }
        BlockPos mainPos = findMainPos(state, pos);
        if (mainPos == null){
            if (world.getBlockState(neighborPos).isAir()){
                return Blocks.AIR.getDefaultState();
            }
        }
        return state.with(FACING, state.get(FACING));
    }

    private void removeAllParts(World world, BlockPos mainPos, Direction dir){
        BlockPos right = mainPos.offset(dir.rotateYCounterclockwise(), 3);

        BlockPos[] pos = {mainPos, right};

        for (BlockPos p : pos){
            if (isBookcase(world.getBlockState(p))){
                world.removeBlock(p, false);
            }
        }
    }

    private BlockPos findMainPos(BlockState state, BlockPos pos){
        if (state.isOf(ModBlocks.WIDE_GRAY_CARPET_LEFT)){
            return pos;
        }
        Direction dir = state.get(FACING);
        if (state.isOf(ModBlocks.WIDE_GRAY_CARPET_RIGHT)){
            return pos.offset(dir.rotateYClockwise(), 3);
        }
        return null;
    }
    private boolean isBookcase(BlockState state){
        return state.isOf(this) ||
                state.isOf(ModBlocks.WIDE_GRAY_CARPET_LEFT) ||
                state.isOf(ModBlocks.WIDE_GRAY_CARPET_RIGHT);
    }
}
