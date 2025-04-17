package com.besson.arknights.block.custom.sideline;

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

public class BlackSimpleDesk extends FurnitureHorizontalFacingBlock {
    public BlackSimpleDesk(Settings settings) {
        super(settings);
    }
    private static final VoxelShape SHAPE = Block.createCuboidShape(0, 0, 0, 16, 16, 16);

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
        BlockPos lbr = pos.offset(dir.rotateYCounterclockwise());
        BlockPos ltl = pos.offset(dir.getOpposite());
        BlockPos ltr = pos.offset(dir.getOpposite()).offset(dir.rotateYCounterclockwise());
        BlockPos rbl = lbr.offset(dir.rotateYCounterclockwise());
        BlockPos rbr = rbl.offset(dir.rotateYCounterclockwise());
        BlockPos rtl = ltr.offset(dir.rotateYCounterclockwise());
        BlockPos rtr = rtl.offset(dir.rotateYCounterclockwise());

        if (!canPlace(world, lbr, ltl, ltr, rbl, rbr, rtl, rtr)){
            return;
        }
        world.setBlockState(lbr, ModBlocks.SIMPLE_BLACK_DESK_LBR.getDefaultState().with(FACING, dir));
        world.setBlockState(ltl, ModBlocks.SIMPLE_BLACK_DESK_LTL.getDefaultState().with(FACING, dir));
        world.setBlockState(ltr, ModBlocks.SIMPLE_BLACK_DESK_LTR.getDefaultState().with(FACING, dir));
        world.setBlockState(rbl, ModBlocks.SIMPLE_BLACK_DESK_RBL.getDefaultState().with(FACING, dir));
        world.setBlockState(rbr, ModBlocks.SIMPLE_BLACK_DESK_RBR.getDefaultState().with(FACING, dir));
        world.setBlockState(rtl, ModBlocks.SIMPLE_BLACK_DESK_RTL.getDefaultState().with(FACING, dir));
        world.setBlockState(rtr, ModBlocks.SIMPLE_BLACK_DESK_RTR.getDefaultState().with(FACING, dir));
    }

    @Override
    public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        if (state.isOf(newState.getBlock())){
            super.onStateReplaced(state, world, pos, newState, moved);
            return;
        }

        BlockPos mainPos = findMainBlockPosition(state, pos);
        if (mainPos == null){
            return;
        }

        Direction dir = state.get(FACING);
        removeAllParts(world, mainPos, dir);

        super.onStateReplaced(state, world, pos, newState, moved);
    }

    private void removeAllParts(World world, BlockPos mainPos, Direction dir){
        BlockPos lbr = mainPos.offset(dir.rotateYCounterclockwise());
        BlockPos ltl = mainPos.offset(dir.getOpposite());
        BlockPos ltr = mainPos.offset(dir.getOpposite()).offset(dir.rotateYCounterclockwise());
        BlockPos rbl = lbr.offset(dir.rotateYCounterclockwise());
        BlockPos rbr = rbl.offset(dir.rotateYCounterclockwise());
        BlockPos rtl = ltr.offset(dir.rotateYCounterclockwise());
        BlockPos rtr = rtl.offset(dir.rotateYCounterclockwise());
        BlockPos[] partPositions = {mainPos, lbr, ltl, ltr, rbl, rbr, rtl, rtr};

        for (BlockPos p : partPositions){
            if (isDesk(world.getBlockState(p))){
                world.removeBlock(p, false);
            }
        }
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
        BlockPos lbr = pos.offset(dir.rotateYCounterclockwise());
        BlockPos ltl = pos.offset(dir.getOpposite());
        BlockPos ltr = pos.offset(dir.getOpposite()).offset(dir.rotateYCounterclockwise());
        BlockPos rbl = lbr.offset(dir.rotateYCounterclockwise());
        BlockPos rbr = rbl.offset(dir.rotateYCounterclockwise());
        BlockPos rtl = ltr.offset(dir.rotateYCounterclockwise());
        BlockPos rtr = rtl.offset(dir.rotateYCounterclockwise());

        boolean placeable = canPlace(world, lbr, ltl, ltr, rbl, rbr, rtl, rtr);
        return placeable ? state : null;
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (neighborState.isAir()){
            return state;
        }
        BlockPos mainPos = findMainBlockPosition(state, pos);
        if (mainPos != null){
            if (world.getBlockState(neighborPos).isAir()){
                return Blocks.AIR.getDefaultState();
            }
        }
        return state.with(FACING, state.get(FACING));
    }

    private BlockPos findMainBlockPosition(BlockState state, BlockPos pos) {
        if (state.isOf(ModBlocks.SIMPLE_BLACK_DESK_LBL)){
            return pos;
        }
        Direction dir = state.get(FACING);
        if (state.isOf(ModBlocks.SIMPLE_BLACK_DESK_LBR)){
            return pos.offset(dir.rotateYClockwise());
        } else if (state.isOf(ModBlocks.SIMPLE_BLACK_DESK_LTL)) {
            return pos.offset(dir);
        } else if (state.isOf(ModBlocks.SIMPLE_BLACK_DESK_LTR)) {
            return pos.offset(dir.rotateYClockwise()).offset(dir);
        } else if (state.isOf(ModBlocks.SIMPLE_BLACK_DESK_RBL)) {
            return pos.offset(dir.rotateYClockwise(), 2);
        } else if (state.isOf(ModBlocks.SIMPLE_BLACK_DESK_RBR)) {
            return pos.offset(dir.rotateYClockwise(), 3);
        } else if (state.isOf(ModBlocks.SIMPLE_BLACK_DESK_RTL)) {
            return pos.offset(dir.rotateYClockwise(), 2).offset(dir);
        } else if (state.isOf(ModBlocks.SIMPLE_BLACK_DESK_RTR)) {
            return pos.offset(dir.rotateYClockwise(), 3).offset(dir);
        }
        return null;
    }


    private boolean canPlace(World world, BlockPos... pos) {
        for (BlockPos p : pos){
            if (!world.getBlockState(p).isAir()){
                return false;
            }
        }
        return true;
    }
    private boolean isDesk(BlockState state){
        return state.isOf(this) ||
                state.isOf(ModBlocks.SIMPLE_BLACK_DESK_LBL) ||
                state.isOf(ModBlocks.SIMPLE_BLACK_DESK_LBR) ||
                state.isOf(ModBlocks.SIMPLE_BLACK_DESK_LTL) ||
                state.isOf(ModBlocks.SIMPLE_BLACK_DESK_LTR) ||
                state.isOf(ModBlocks.SIMPLE_BLACK_DESK_RBL) ||
                state.isOf(ModBlocks.SIMPLE_BLACK_DESK_RBR) ||
                state.isOf(ModBlocks.SIMPLE_BLACK_DESK_RTL) ||
                state.isOf(ModBlocks.SIMPLE_BLACK_DESK_RTR);
    }
}
