package com.besson.arknights.block.custom.fantastic;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import com.besson.arknights.block.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;

public class CopperFloor extends FurnitureHorizontalFacingBlock {
    public CopperFloor(Settings settings) {
        super(settings);
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        super.onPlaced(world, pos, state, placer, itemStack);
        if (world.isClient()){
            return;
        }
        Direction dir = state.get(FACING);
        BlockPos behind = pos.offset(dir.getOpposite());

        if(!canPlace(world, behind)){
            return;
        }
        world.setBlockState(behind, ModBlocks.COPPER_FLOOR_BEHIND.getDefaultState().with(FACING, dir));
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
        BlockPos behind = pos.offset(dir.getOpposite());

        boolean placeable = canPlace(world, behind);
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
        BlockPos behind = mainPos.offset(dir.getOpposite());

        BlockPos[] pos = {mainPos, behind};

        for (BlockPos p : pos){
            if (isBookcase(world.getBlockState(p))){
                world.removeBlock(p, false);
            }
        }
    }

    private boolean isBookcase(BlockState state){
        return state.isOf(this) ||
                state.isOf(ModBlocks.COPPER_FLOOR_FRONT) ||
                state.isOf(ModBlocks.COPPER_FLOOR_BEHIND);
    }

    private BlockPos findMainPos(BlockState state, BlockPos pos){
        if (state.isOf(ModBlocks.COPPER_FLOOR_FRONT)){
            return pos;
        }
        Direction dir = state.get(FACING);
        if (state.isOf(ModBlocks.COPPER_FLOOR_BEHIND)){
            return pos.offset(dir);
        }
        return null;
    }

    private boolean canPlace(World world, BlockPos... pos){
        for (BlockPos p : pos){
            if (!world.getBlockState(p).isAir()){
                return false;
            }
        }
        return true;
    }
}
