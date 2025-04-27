package com.besson.arknights.block.custom.columbian;

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

public class BrownBookcase extends FurnitureHorizontalFacingBlock {
    public BrownBookcase(Settings settings) {
        super(settings);
    }
    private static final VoxelShape SHAPE = Block.createCuboidShape(0, 0, 0, 16, 8, 16);

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
        BlockPos rb = pos.offset(dir.rotateYCounterclockwise());
        BlockPos lm = pos.up();
        BlockPos rm = lm.offset(dir.rotateYCounterclockwise());
        BlockPos lt = lm.up();
        BlockPos rt = rm.up();

        if (!canPlace(world, rb, lm, rm, lt, rt)){
            return;
        }
        world.setBlockState(rb, ModBlocks.BROWN_BOOKCASE_RB.getDefaultState().with(FACING, dir));
        world.setBlockState(lm, ModBlocks.BROWN_BOOKCASE_LM.getDefaultState().with(FACING, dir));
        world.setBlockState(rm, ModBlocks.BROWN_BOOKCASE_RM.getDefaultState().with(FACING, dir));
        world.setBlockState(lt, ModBlocks.BROWN_BOOKCASE_LT.getDefaultState().with(FACING, dir));
        world.setBlockState(rt, ModBlocks.BROWN_BOOKCASE_RT.getDefaultState().with(FACING, dir));
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

        if (state == null) {
            return null;
        }
        Direction dir = state.get(FACING);
        BlockPos rb = pos.offset(dir.rotateYCounterclockwise());
        BlockPos lm = pos.up();
        BlockPos rm = lm.offset(dir.rotateYCounterclockwise());
        BlockPos lt = lm.up();
        BlockPos rt = rm.up();

        boolean canPlace = canPlace(world, rb, lm, rm, lt, rt);
        return canPlace ? state : null;
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (direction.getAxis() == Direction.Axis.Y){
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
        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    private void removeAllParts(World world, BlockPos mainPos, Direction dir){
        BlockPos rb = mainPos.offset(dir.rotateYCounterclockwise());
        BlockPos lm = mainPos.up();
        BlockPos rm = lm.offset(dir.rotateYCounterclockwise());
        BlockPos lt = lm.up();
        BlockPos rt = rm.up();

        BlockPos[] pos = {mainPos, rb, lm, rm, lt, rt};

        for (BlockPos p : pos){
            if (isBookcase(world.getBlockState(p))){
                world.removeBlock(p, false);
            }
        }
    }

    private BlockPos findMainPos(BlockState state, BlockPos pos){
        if (state.isOf(ModBlocks.BROWN_BOOKCASE_LB)){
            return pos;
        }
        Direction dir = state.get(FACING);
        if (state.isOf(ModBlocks.BROWN_BOOKCASE_RB)){
            return pos.offset(dir.rotateYClockwise());
        } else if (state.isOf(ModBlocks.BROWN_BOOKCASE_LM)) {
            return pos.down();
        } else if (state.isOf(ModBlocks.BROWN_BOOKCASE_RM)) {
            return pos.down().offset(dir.rotateYClockwise());
        } else if (state.isOf(ModBlocks.BROWN_BOOKCASE_LT)) {
            return pos.down(2);
        } else if (state.isOf(ModBlocks.BROWN_BOOKCASE_RT)) {
            return pos.down(2).offset(dir.rotateYClockwise());
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
    private boolean isBookcase(BlockState state){
        return state.isOf(this) ||
                state.isOf(ModBlocks.BROWN_BOOKCASE_LT) ||
                state.isOf(ModBlocks.BROWN_BOOKCASE_RT) ||
                state.isOf(ModBlocks.BROWN_BOOKCASE_LM) ||
                state.isOf(ModBlocks.BROWN_BOOKCASE_RM) ||
                state.isOf(ModBlocks.BROWN_BOOKCASE_LB) ||
                state.isOf(ModBlocks.BROWN_BOOKCASE_RB);
    }
}
