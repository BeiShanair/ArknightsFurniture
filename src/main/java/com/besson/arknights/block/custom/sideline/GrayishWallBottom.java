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

public class GrayishWallBottom extends FurnitureHorizontalFacingBlock {
    private static final VoxelShape SHAPE = Block.createCuboidShape(0, 0, 0, 16, 16, 16);

    public GrayishWallBottom(Settings settings) {
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
        BlockPos bbr = pos.offset(dir.rotateYCounterclockwise());
        BlockPos btl = pos.up();
        BlockPos btr = pos.offset(dir.rotateYCounterclockwise()).up();

        if (!canPlace(world, bbr, btl, btr)) {
            return;
        }
        world.setBlockState(bbr, ModBlocks.GRAYISH_WALL_BBR.getDefaultState().with(FACING, dir));
        world.setBlockState(btl, ModBlocks.GRAYISH_WALL_BTL.getDefaultState().with(FACING, dir));
        world.setBlockState(btr, ModBlocks.GRAYISH_WALL_BTR.getDefaultState().with(FACING, dir));
    }

    @Override
    public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        if (state.isOf(newState.getBlock())){
            super.onStateReplaced(state, world, pos, newState, moved);
            return;
        }

        BlockPos mainPos = findMainBlockPosition(state, pos);
        if (mainPos == null) {
            return;
        }

        Direction dir = state.get(FACING);
        removeAllParts(world, mainPos, dir);

        super.onStateReplaced(state, world, pos, newState, moved);
    }

    private void removeAllParts(World world, BlockPos mainPos, Direction dir) {
        BlockPos[] partPositions = {
                mainPos, // bottom-left (this block)
                mainPos.offset(dir.rotateYCounterclockwise()), // bottom-right
                mainPos.up(), // top-left
                mainPos.offset(dir.rotateYCounterclockwise()).up() // top-right
        };

        for (BlockPos partPos : partPositions) {
            if (isWall(world.getBlockState(partPos))) {
                world.removeBlock(partPos, false);
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
        BlockPos bbr = pos.offset(dir.rotateYCounterclockwise());
        BlockPos btl = pos.up();
        BlockPos btr = pos.offset(dir.rotateYCounterclockwise()).up();

        boolean placeable = canPlace(world, bbr, btl, btr);
        return placeable ? state : null;
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (direction.getAxis() == Direction.Axis.Y){
            if (neighborState.isAir()){
                return state;
            }
            BlockPos mainPos = findMainBlockPosition(state, pos);
            if (mainPos != null && isPartOfThisSet(mainPos, neighborPos, (World)world)) {
                if (world.getBlockState(neighborPos).isAir()) {
                    return Blocks.AIR.getDefaultState();
                }
            }
            return state.with(FACING, state.get(FACING));

        }
        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }
    private boolean isPartOfThisSet(BlockPos mainPos, BlockPos pos, World world) {
        Direction dir = world.getBlockState(mainPos).get(FACING);
        BlockPos[] validPositions = {
                mainPos,
                mainPos.offset(dir.rotateYCounterclockwise()),
                mainPos.up(),
                mainPos.offset(dir.rotateYCounterclockwise()).up()
        };

        for (BlockPos validPos : validPositions) {
            if (validPos.equals(pos)) {
                return true;
            }
        }
        return false;
    }

    private BlockPos findMainBlockPosition(BlockState state, BlockPos pos) {
        if (state.isOf(ModBlocks.GRAYISH_WALL_BBL)) {
            return pos;
        }
        Direction dir = state.get(FACING);
        if (state.isOf(ModBlocks.GRAYISH_WALL_BBR)){
            return pos.offset(dir.rotateYClockwise());
        } else if (state.isOf(ModBlocks.GRAYISH_WALL_BTL)){
            return pos.down();
        } else if (state.isOf(ModBlocks.GRAYISH_WALL_BTR)) {
            return pos.down().offset(dir.rotateYClockwise());
        }
        return null;
    }

    private boolean canPlace(World world, BlockPos... pos) {
        for (BlockPos blockPos : pos) {
            if (!world.getBlockState(blockPos).isAir()) {
                return false;
            }
        }
        return true;
    }

    private boolean isWall(BlockState state){
        return state.isOf(this) ||
                state.isOf(ModBlocks.GRAYISH_WALL_BBL) ||
                state.isOf(ModBlocks.GRAYISH_WALL_BBR) ||
                state.isOf(ModBlocks.GRAYISH_WALL_BTL) ||
                state.isOf(ModBlocks.GRAYISH_WALL_BTR);
    }
}
