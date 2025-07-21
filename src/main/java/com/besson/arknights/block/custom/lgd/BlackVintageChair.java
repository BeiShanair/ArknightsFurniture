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
            Block.createCuboidShape(2.75, 0, 13.25, 4.5, 15, 15),
            Block.createCuboidShape(3, 6.75, 3.5, 13, 8, 14),
            Block.createCuboidShape(2, 15, 13, 14, 16, 15),
            Block.createCuboidShape(2.25, 8, 2.5, 13.75, 8.5, 13.5),
            Block.createCuboidShape(2.75, 0, 3.25, 4.5, 8, 5),
            Block.createCuboidShape(11.5, 0, 3.25, 13.25, 8, 5),
            Block.createCuboidShape(11.5, 0, 13.25, 13.25, 15, 15)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();;
    private static final VoxelShape SHAPE_W = Stream.of(
            Block.createCuboidShape(13.25, 0, 11.5, 15, 15, 13.25),
            Block.createCuboidShape(3.5, 6.75, 3, 14, 8, 13),
            Block.createCuboidShape(13, 15, 2, 15, 16, 14),
            Block.createCuboidShape(2.5, 8, 2.25, 14.5, 8.5, 13.75),
            Block.createCuboidShape(3.25, 0, 11.5, 5, 8, 13.25),
            Block.createCuboidShape(3.25, 0, 2.75, 5, 8, 4.5),
            Block.createCuboidShape(13.25, 0, 2.75, 15, 15, 4.5)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();;
    private static final VoxelShape SHAPE_S = Stream.of(
            Block.createCuboidShape(11.5, 0, 1, 13.25, 15, 2.75),
            Block.createCuboidShape(3, 6.75, 2, 13, 8, 12.5),
            Block.createCuboidShape(2, 15, 1, 14, 16, 3),
            Block.createCuboidShape(2.25, 8, 1.5, 13.75, 8.5, 13.5),
            Block.createCuboidShape(11.5, 0, 11, 13.25, 8, 12.75),
            Block.createCuboidShape(2.75, 0, 11, 4.5, 8, 12.75),
            Block.createCuboidShape(2.75, 0, 1, 4.5, 15, 2.75)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();;
    private static final VoxelShape SHAPE_E = Stream.of(
            Block.createCuboidShape(1, 0, 2.75, 2.75, 15, 4.5),
            Block.createCuboidShape(2, 6.75, 3, 12.5, 8, 13),
            Block.createCuboidShape(1, 15, 2, 3, 16, 14),
            Block.createCuboidShape(1.5, 8, 2.25, 13.5, 8.5, 13.75),
            Block.createCuboidShape(11, 0, 2.75, 12.75, 8, 4.5),
            Block.createCuboidShape(11, 0, 11.5, 12.75, 8, 13.25),
            Block.createCuboidShape(1, 0, 11.5, 2.75, 15, 13.25)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();;

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
