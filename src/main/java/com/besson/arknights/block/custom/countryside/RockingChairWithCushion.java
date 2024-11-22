package com.besson.arknights.block.custom.countryside;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import com.besson.arknights.block.SeatEntity;
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

public class RockingChairWithCushion extends FurnitureHorizontalFacingBlock {
    public RockingChairWithCushion(Settings settings) {
        super(settings);
    }
    private static final VoxelShape SHAPE_N = Block.createCuboidShape(2, 0, 0, 14, 16, 24);
    private static final VoxelShape SHAPE_W = Block.createCuboidShape(0, 0, 2, 24, 16, 14);
    private static final VoxelShape SHAPE_S = Block.createCuboidShape(2, 0, -8, 14, 16, 16);
    private static final VoxelShape SHAPE_E = Block.createCuboidShape(-8, 0, 2, 16, 16, 14);

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
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient){
            return SeatEntity.create(world,pos,0.15,player,state.get(FACING));
        }
        return ActionResult.SUCCESS;
    }
}
