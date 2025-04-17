package com.besson.arknights.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.WorldAccess;

public class ConnectableBlock extends FurnitureHorizontalFacingBlock{
    // 声明代表不同连接状态的枚举
    public static final EnumProperty<Type> TYPE = EnumProperty.of("type", Type.class);

    // 构造函数
    public ConnectableBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.getStateManager().getDefaultState().with(TYPE, Type.SINGLE));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(TYPE);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        // 根据相邻方块的状态更新当前方块的状态
        return this.getRelatedBlockState(state, world, pos, state.get(FACING));
    }

    private BlockState getRelatedBlockState(BlockState state, WorldAccess access, BlockPos pos, Direction direction){
        boolean left = isRelatedInDirection(access, pos, direction, true);
        boolean right = isRelatedInDirection(access, pos, direction, false);
        if (left && right){
            return state.with(TYPE, Type.MIDDLE);
        } else if (right) {
            return state.with(TYPE, Type.RIGHT);
        } else if (left) {
            return state.with(TYPE, Type.LEFT);
        }
        return state.with(TYPE, Type.SINGLE);
    }

    // 根据方块面向和它周围的方块，判断是否与相邻方块连接
    private boolean isRelatedInDirection(WorldAccess access, BlockPos pos, Direction direction, boolean counterclockwise) {
        Direction rotatedOnce = counterclockwise ? direction.rotateYCounterclockwise() : direction.rotateYClockwise();
        return this.isRelatedBlock(access, pos, rotatedOnce, direction);
    }

    // 判断位置和方向是否与当前方块连接
    public boolean isRelatedBlock(WorldAccess access, BlockPos pos, Direction direction1, Direction direction2){
        BlockState state = access.getBlockState(pos.offset(direction1));
        if (state.getBlock() == this){
            Direction blockDirection = state.get(FACING);
            return blockDirection.equals(direction2);
        }
        return false;
    }

    // 枚举类，表示不同连接状态
    public enum Type implements StringIdentifiable {
        SINGLE("single"),
        LEFT("left"),
        RIGHT("right"),
        MIDDLE("middle");

        private final String id;

        Type(String id) {
            this.id = id;
        }

        @Override
        public String asString() {
            return id;
        }
    }
}
