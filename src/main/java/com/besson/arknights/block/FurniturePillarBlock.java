package com.besson.arknights.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.WorldAccess;

// 与可连接方块类似，只是判断方向改为上下
public class FurniturePillarBlock extends FurnitureHorizontalFacingBlock{
    public static final EnumProperty<Type> TYPE = EnumProperty.of("type2", Type.class);
    public FurniturePillarBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.getStateManager().getDefaultState().with(TYPE,Type.SINGLE));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(TYPE);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        boolean top = world.getBlockState(pos.up(1)).isOf(this);
        boolean bottom = world.getBlockState(pos.down(1)).isOf(this);
        if (top & bottom) {
            return state.with(TYPE,Type.MIDDLE);
        } else if (bottom) {
            return state.with(TYPE,Type.TOP);
        } else if (top) {
            return state.with(TYPE,Type.BOTTOM);
        } else {
            return state.with(TYPE,Type.SINGLE);
        }
    }

    public enum Type implements StringIdentifiable {
        SINGLE("single"),
        TOP("top"),
        BOTTOM("bottom"),
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
