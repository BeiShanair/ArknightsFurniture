package com.besson.arknights.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;

public class ModDoubleBlock extends FurnitureHorizontalFacingBlock{
    public static final EnumProperty<DoubleBlockType> TYPE = EnumProperty.of("double_block_type", DoubleBlockType.class);

    public ModDoubleBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(TYPE,DoubleBlockType.SINGLE));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(TYPE);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (neighborState.isOf(this) && direction.getAxis().isHorizontal()) {
            DoubleBlockType doubleBlockType = neighborState.get(TYPE);
            if (state.get(TYPE) == DoubleBlockType.SINGLE &&
                    doubleBlockType != DoubleBlockType.SINGLE &&
                    state.get(FACING) == neighborState.get(FACING) &&
                    getFacing(neighborState) == direction.getOpposite()) {
                return state.with(TYPE, doubleBlockType.getOpposite());
            }
        } else if (getFacing(state) == direction) {
            return state.with(TYPE, DoubleBlockType.SINGLE);
        }
        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }
    public static Direction getFacing(BlockState state) {
        Direction direction = state.get(FACING);
        return state.get(TYPE) == DoubleBlockType.RIGHT ? direction.rotateYClockwise() : direction.rotateYCounterclockwise();
    }

    @Override
    public @Nullable BlockState getPlacementState(ItemPlacementContext ctx) {
        DoubleBlockType doubleBlockType = DoubleBlockType.SINGLE;
        Direction direction = ctx.getHorizontalPlayerFacing().getOpposite();
        if (direction == this.getNeighborDirection(ctx, direction.rotateYClockwise())) {
            doubleBlockType = DoubleBlockType.RIGHT;
        } else if (direction == this.getNeighborDirection(ctx, direction.rotateYCounterclockwise())) {
            doubleBlockType = DoubleBlockType.LEFT;
        }
        return this.getDefaultState().with(FACING, direction).with(TYPE, doubleBlockType);
    }

    @Nullable
    public Direction getNeighborDirection(ItemPlacementContext ctx, Direction dir) {
        BlockState blockState = ctx.getWorld().getBlockState(ctx.getBlockPos().offset(dir));
        return blockState.isOf(this) && blockState.get(TYPE) == DoubleBlockType.SINGLE ? blockState.get(FACING) : null;
    }
    public enum DoubleBlockType implements StringIdentifiable {
        SINGLE("single"),
        LEFT("left"),
        RIGHT("right");
        private final String name;

        DoubleBlockType(String name) {
            this.name = name;
        }

        @Override
        public String asString() {
            return this.name;
        }

        public DoubleBlockType getOpposite() {
            return switch (this) {
                case SINGLE -> SINGLE;
                case LEFT -> RIGHT;
                case RIGHT -> LEFT;
            };
        }
    }
}
