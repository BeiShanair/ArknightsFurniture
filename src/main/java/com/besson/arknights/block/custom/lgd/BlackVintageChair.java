package com.besson.arknights.block.custom.lgd;

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

public class BlackVintageChair extends FurnitureHorizontalFacingBlock {
    public BlackVintageChair(Settings settings) {
        super(settings);
    }
    private static final VoxelShape SHAPE_N = Stream.of(
            Block.createCuboidShape(2, 0, 2, 4, 8, 4),
            Block.createCuboidShape(2, 0, 12, 4, 15, 14),
            Block.createCuboidShape(12, 0, 2, 14, 8, 4),
            Block.createCuboidShape(2, 8, 2, 14, 10, 12),
            Block.createCuboidShape(12, 0, 12, 14, 15, 14),
            Block.createCuboidShape(1, 15, 12, 15, 16, 14)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SHAPE_W = Stream.of(
            Block.createCuboidShape(2, 0, 12, 4, 8, 14),
            Block.createCuboidShape(12, 0, 12, 14, 15, 14),
            Block.createCuboidShape(2, 0, 2, 4, 8, 4),
            Block.createCuboidShape(2, 8, 2, 12, 10, 14),
            Block.createCuboidShape(12, 0, 2, 14, 15, 4),
            Block.createCuboidShape(12, 15, 1, 14, 16, 15)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SHAPE_S = Stream.of(
            Block.createCuboidShape(12, 0, 12, 14, 8, 14),
            Block.createCuboidShape(12, 0, 2, 14, 15, 4),
            Block.createCuboidShape(2, 0, 12, 4, 8, 14),
            Block.createCuboidShape(2, 8, 4, 14, 10, 14),
            Block.createCuboidShape(2, 0, 2, 4, 15, 4),
            Block.createCuboidShape(1, 15, 2, 15, 16, 4)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SHAPE_E = Stream.of(
            Block.createCuboidShape(12, 0, 2, 14, 8, 4),
            Block.createCuboidShape(2, 0, 2, 4, 15, 4),
            Block.createCuboidShape(12, 0, 12, 14, 8, 14),
            Block.createCuboidShape(4, 8, 2, 14, 10, 14),
            Block.createCuboidShape(2, 0, 12, 4, 15, 14),
            Block.createCuboidShape(2, 15, 1, 4, 16, 15)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

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
            return SeatEntity.create(world,pos,0.4,player,state.get(FACING));
        }
        return ActionResult.SUCCESS;
    }
}
