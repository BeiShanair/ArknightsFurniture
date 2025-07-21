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

public class BlackVintageStool extends FurnitureHorizontalFacingBlock {
    public BlackVintageStool(Settings settings) {
        super(settings);
    }
    private static final VoxelShape SHAPE = Stream.of(
            Block.createCuboidShape(3, 6.75, 3, 13, 8, 13.5),
            Block.createCuboidShape(2.25, 8, 2.5, 13.75, 8.5, 14),
            Block.createCuboidShape(2.5, 0, 2.75, 4.25, 8, 4.5),
            Block.createCuboidShape(2.5, 0, 12, 4.25, 8, 13.75),
            Block.createCuboidShape(11.75, 0, 12, 13.5, 8, 13.75),
            Block.createCuboidShape(11.75, 0, 2.75, 13.5, 8, 4.5)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();;

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
