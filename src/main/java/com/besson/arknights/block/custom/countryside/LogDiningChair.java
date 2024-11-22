package com.besson.arknights.block.custom.countryside;

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

public class LogDiningChair extends FurnitureHorizontalFacingBlock {
    public LogDiningChair(Settings settings) {
        super(settings);
    }
    private static final VoxelShape SHAPE_N = Stream.of(
            Block.createCuboidShape(2, 0, 2, 4, 7, 4),
            Block.createCuboidShape(12, 0, 2, 14, 7, 4),
            Block.createCuboidShape(2, 0, 12, 4, 7, 14),
            Block.createCuboidShape(12, 0, 12, 14, 7, 14),
            Block.createCuboidShape(2, 7, 2, 14, 9, 14),
            Block.createCuboidShape(2, 9, 12, 14, 20, 14),
            Block.createCuboidShape(2.5, 9, 2.5, 3.5, 11, 3.5),
            Block.createCuboidShape(12.5, 9, 2.5, 13.5, 11, 3.5),
            Block.createCuboidShape(12, 11, 2, 14, 12, 12),
            Block.createCuboidShape(2, 11, 2, 4, 12, 12)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SHAPE_W = Stream.of(
            Block.createCuboidShape(2, 0, 12, 4, 7, 14),
            Block.createCuboidShape(2, 0, 2, 4, 7, 4),
            Block.createCuboidShape(12, 0, 12, 14, 7, 14),
            Block.createCuboidShape(12, 0, 2, 14, 7, 4),
            Block.createCuboidShape(2, 7, 2, 14, 9, 14),
            Block.createCuboidShape(12, 9, 2, 14, 20, 14),
            Block.createCuboidShape(2.5, 9, 12.5, 3.5, 11, 13.5),
            Block.createCuboidShape(2.5, 9, 2.5, 3.5, 11, 3.5),
            Block.createCuboidShape(2, 11, 2, 12, 12, 4),
            Block.createCuboidShape(2, 11, 12, 12, 12, 14)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SHAPE_S = Stream.of(
            Block.createCuboidShape(12, 0, 12, 14, 7, 14),
            Block.createCuboidShape(2, 0, 12, 4, 7, 14),
            Block.createCuboidShape(12, 0, 2, 14, 7, 4),
            Block.createCuboidShape(2, 0, 2, 4, 7, 4),
            Block.createCuboidShape(2, 7, 2, 14, 9, 14),
            Block.createCuboidShape(2, 9, 2, 14, 20, 4),
            Block.createCuboidShape(12.5, 9, 12.5, 13.5, 11, 13.5),
            Block.createCuboidShape(2.5, 9, 12.5, 3.5, 11, 13.5),
            Block.createCuboidShape(2, 11, 4, 4, 12, 14),
            Block.createCuboidShape(12, 11, 4, 14, 12, 14)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SHAPE_E = Stream.of(
            Block.createCuboidShape(12, 0, 2, 14, 7, 4),
            Block.createCuboidShape(12, 0, 12, 14, 7, 14),
            Block.createCuboidShape(2, 0, 2, 4, 7, 4),
            Block.createCuboidShape(2, 0, 12, 4, 7, 14),
            Block.createCuboidShape(2, 7, 2, 14, 9, 14),
            Block.createCuboidShape(2, 9, 2, 4, 20, 14),
            Block.createCuboidShape(12.5, 9, 2.5, 13.5, 11, 3.5),
            Block.createCuboidShape(12.5, 9, 12.5, 13.5, 11, 13.5),
            Block.createCuboidShape(4, 11, 12, 14, 12, 14),
            Block.createCuboidShape(4, 11, 2, 14, 12, 4)
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
