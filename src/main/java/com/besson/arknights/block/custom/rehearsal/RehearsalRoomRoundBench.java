package com.besson.arknights.block.custom.rehearsal;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import com.besson.arknights.block.SeatEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.stream.Stream;

public class RehearsalRoomRoundBench extends FurnitureHorizontalFacingBlock{

    public RehearsalRoomRoundBench(Settings settings) {
        super(settings);
    }

    private static final VoxelShape SHAPE = Stream.of(
            Block.createCuboidShape(4, 7, 4, 12, 11, 12),
            Block.createCuboidShape(4, 0, 4, 5, 7, 5),
            Block.createCuboidShape(11, 0, 4, 12, 7, 5),
            Block.createCuboidShape(11, 0, 11, 12, 7, 12),
            Block.createCuboidShape(4, 0, 11, 5, 7, 12),
            Block.createCuboidShape(5, 2, 4, 11, 3, 5),
            Block.createCuboidShape(5, 2, 11, 11, 3, 12),
            Block.createCuboidShape(11, 2, 5, 12, 3, 11),
            Block.createCuboidShape(4, 2, 5, 5, 3, 11)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient){
            return SeatEntity.create(world,pos,0.4,player,state.get(FACING));
        }
        return ActionResult.SUCCESS;
    }
}
