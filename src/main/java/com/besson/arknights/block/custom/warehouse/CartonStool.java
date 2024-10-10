package com.besson.arknights.block.custom.warehouse;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import com.besson.arknights.block.SeatBlockEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class CartonStool extends FurnitureHorizontalFacingBlock {
    public CartonStool(Settings settings) {
        super(settings.nonOpaque());
    }
    private static final VoxelShape SHAPE = Block.createCuboidShape(-4, 0, -4, 20, 14, 20);

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient){
            return SeatBlockEntity.create(world,pos,0.65,player,state.get(FACING));
        }
        return ActionResult.SUCCESS;
    }
}
