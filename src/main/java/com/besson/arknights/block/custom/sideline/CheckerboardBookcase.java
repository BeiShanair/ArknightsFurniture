package com.besson.arknights.block.custom.sideline;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import com.besson.arknights.block.ModAbstractChestBlock;
import com.besson.arknights.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
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

import java.util.function.Supplier;

public class CheckerboardBookcase extends ModAbstractChestBlock<CheckerboardBookcaseBE> {

    private static final VoxelShape SHAPE = Block.createCuboidShape(0, 0, 0, 16, 16, 16);

    public CheckerboardBookcase(Settings settings, Supplier<BlockEntityType<? extends CheckerboardBookcaseBE>> blockEntityTypeSupplier) {
        super(settings, blockEntityTypeSupplier);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new CheckerboardBookcaseBE(pos, state);
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
        BlockPos btr = btl.offset(dir.rotateYCounterclockwise());
        BlockPos mbl = btl.up();
        BlockPos mbr = mbl.offset(dir.rotateYCounterclockwise());
        BlockPos mtl = mbl.up();
        BlockPos mtr = mtl.offset(dir.rotateYCounterclockwise());
        BlockPos tl = mtl.up();
        BlockPos tr = tl.offset(dir.rotateYCounterclockwise());

        if (!canPlace(world, bbr, btl, btr, mbl, mbr, mtl, mtr, tl, tr)){
            return;
        }
        world.setBlockState(bbr, ModBlocks.CHECKERBOARD_BOOKCASE_BBR.getDefaultState().with(FACING, dir));
        world.setBlockState(btl, ModBlocks.CHECKERBOARD_BOOKCASE_BTL.getDefaultState().with(FACING, dir));
        world.setBlockState(btr, ModBlocks.CHECKERBOARD_BOOKCASE_BTR.getDefaultState().with(FACING, dir));
        world.setBlockState(mbl, ModBlocks.CHECKERBOARD_BOOKCASE_MBL.getDefaultState().with(FACING, dir));
        world.setBlockState(mbr, ModBlocks.CHECKERBOARD_BOOKCASE_MBR.getDefaultState().with(FACING, dir));
        world.setBlockState(mtl, ModBlocks.CHECKERBOARD_BOOKCASE_MTL.getDefaultState().with(FACING, dir));
        world.setBlockState(mtr, ModBlocks.CHECKERBOARD_BOOKCASE_MTR.getDefaultState().with(FACING, dir));
        world.setBlockState(tl, ModBlocks.CHECKERBOARD_BOOKCASE_TL.getDefaultState().with(FACING, dir));
        world.setBlockState(tr, ModBlocks.CHECKERBOARD_BOOKCASE_TR.getDefaultState().with(FACING, dir));
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

    private void removeAllParts(World world, BlockPos mainPos, Direction dir){
        BlockPos bbr = mainPos.offset(dir.rotateYCounterclockwise());
        BlockPos btl = mainPos.up();
        BlockPos btr = btl.offset(dir.rotateYCounterclockwise());
        BlockPos mbl = btl.up();
        BlockPos mbr = mbl.offset(dir.rotateYCounterclockwise());
        BlockPos mtl = mbl.up();
        BlockPos mtr = mtl.offset(dir.rotateYCounterclockwise());
        BlockPos tl = mtl.up();
        BlockPos tr = tl.offset(dir.rotateYCounterclockwise());

        BlockPos[] pos = {mainPos, bbr, btl, btr, mbl, mbr, mtl, mtr, tl, tr};

        for (BlockPos p : pos){
            if (isBookcase(world.getBlockState(p))){
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
        BlockPos bbr = pos.offset(dir.rotateYCounterclockwise());
        BlockPos btl = pos.up();
        BlockPos btr = btl.offset(dir.rotateYCounterclockwise());
        BlockPos mbl = btl.up();
        BlockPos mbr = mbl.offset(dir.rotateYCounterclockwise());
        BlockPos mtl = mbl.up();
        BlockPos mtr = mtl.offset(dir.rotateYCounterclockwise());
        BlockPos tl = mtl.up();
        BlockPos tr = tl.offset(dir.rotateYCounterclockwise());

        boolean placeable = canPlace(world, bbr, btl, btr, mbl, mbr, mtl, mtr, tl, tr);
        return placeable ? state : null;
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

    private BlockPos findMainPos(BlockState state, BlockPos pos){
        if (state.isOf(ModBlocks.CHECKERBOARD_BOOKCASE_BBL)){
            return pos;
        }
        Direction dir = state.get(FACING);
        if (state.isOf(ModBlocks.CHECKERBOARD_BOOKCASE_BBR)){
            return pos.offset(dir.rotateYClockwise());
        } else if (state.isOf(ModBlocks.CHECKERBOARD_BOOKCASE_BTL)) {
            return pos.down();
        } else if (state.isOf(ModBlocks.CHECKERBOARD_BOOKCASE_BTR)) {
            return pos.down().offset(dir.rotateYClockwise());
        } else if (state.isOf(ModBlocks.CHECKERBOARD_BOOKCASE_MBL)) {
            return pos.down(2);
        } else if (state.isOf(ModBlocks.CHECKERBOARD_BOOKCASE_MBR)) {
            return pos.down(2).offset(dir.rotateYClockwise());
        } else if (state.isOf(ModBlocks.CHECKERBOARD_BOOKCASE_MTL)) {
            return pos.down(3);
        } else if (state.isOf(ModBlocks.CHECKERBOARD_BOOKCASE_MTR)) {
            return pos.down(3).offset(dir.rotateYClockwise());
        } else if (state.isOf(ModBlocks.CHECKERBOARD_BOOKCASE_TL)) {
            return pos.down(4);
        } else if (state.isOf(ModBlocks.CHECKERBOARD_BOOKCASE_TR)) {
            return pos.down(4).offset(dir.rotateYClockwise());
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
               state.isOf(ModBlocks.CHECKERBOARD_BOOKCASE_BBL) ||
               state.isOf(ModBlocks.CHECKERBOARD_BOOKCASE_BBR) ||
               state.isOf(ModBlocks.CHECKERBOARD_BOOKCASE_BTL) ||
               state.isOf(ModBlocks.CHECKERBOARD_BOOKCASE_BTR) ||
               state.isOf(ModBlocks.CHECKERBOARD_BOOKCASE_MBL) ||
               state.isOf(ModBlocks.CHECKERBOARD_BOOKCASE_MBR) ||
               state.isOf(ModBlocks.CHECKERBOARD_BOOKCASE_MTL) ||
               state.isOf(ModBlocks.CHECKERBOARD_BOOKCASE_MTR) ||
               state.isOf(ModBlocks.CHECKERBOARD_BOOKCASE_TL) ||
               state.isOf(ModBlocks.CHECKERBOARD_BOOKCASE_TR);
    }
}
