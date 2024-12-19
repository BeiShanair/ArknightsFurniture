package com.besson.arknights.block.custom.eatery;

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

public class RectangularBench extends FurnitureHorizontalFacingBlock{

    public RectangularBench(Settings settings) {
        super(settings);
    }

    private static final VoxelShape SHAPE_N = Block.createCuboidShape(0, 0, 0, 16, 10, 32);
    private static final VoxelShape SHAPE_S = Block.createCuboidShape(0, 0, -16, 16, 10, 16);
    private static final VoxelShape SHAPE_W = Block.createCuboidShape(0, 0, 0, 32, 10, 16);
    private static final VoxelShape SHAPE_E = Block.createCuboidShape(-16, 0, 0, 16, 10, 16);

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)) {
            case SOUTH -> SHAPE_S;
            case WEST -> SHAPE_W;
            case EAST -> SHAPE_E;
            default -> SHAPE_N;
        };
    }
    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient){
            return SeatEntity.create(world,pos,0.35,player,state.get(FACING));
        }
        return ActionResult.SUCCESS;
    }
}
