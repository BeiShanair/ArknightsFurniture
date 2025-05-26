package com.besson.arknights.block.custom.fantastic;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.Direction;

public class EcoExhibitionCabinetGlass extends FurnitureHorizontalFacingBlock {
    public EcoExhibitionCabinetGlass(Settings settings) {
        super(settings);
    }

    @Override
    public boolean isSideInvisible(BlockState state, BlockState stateFrom, Direction direction) {
        return stateFrom.isOf(this) || super.isSideInvisible(state, stateFrom, direction);
    }
}
