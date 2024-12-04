package com.besson.arknights.block.custom.pizzeria;

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

public class PizzeriaHighStool extends FurnitureHorizontalFacingBlock{

    public PizzeriaHighStool(Settings settings) {
        super(settings);
    }

    private static final VoxelShape SHAPE = Stream.of(
            Block.createCuboidShape(5, 0, 5, 6, 12, 6),
            Block.createCuboidShape(5, 0, 10, 6, 12, 11),
            Block.createCuboidShape(10, 0, 5, 11, 12, 6),
            Block.createCuboidShape(10, 0, 10, 11, 12, 11),
            Block.createCuboidShape(4, 12, 4, 12, 13, 12),
            Block.createCuboidShape(6, 3, 5, 10, 4, 6),
            Block.createCuboidShape(6, 3, 10, 10, 4, 11),
            Block.createCuboidShape(10, 3, 6, 11, 4, 10),
            Block.createCuboidShape(5, 3, 6, 6, 4, 10),
            Block.createCuboidShape(10, 8, 6, 11, 9, 10),
            Block.createCuboidShape(6, 8, 10, 10, 9, 11),
            Block.createCuboidShape(6, 8, 5, 10, 9, 6),
            Block.createCuboidShape(5, 8, 6, 6, 9, 10)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient){
            return SeatEntity.create(world,pos,0.6,player,state.get(FACING));
        }
        return ActionResult.SUCCESS;
    }
}
