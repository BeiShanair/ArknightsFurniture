package com.besson.arknights.block.custom.fantasticbiod;

import com.besson.arknights.block.ModSwitchableLight;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class FlushMountRectangleCeilingLight extends ModSwitchableLight {
    public FlushMountRectangleCeilingLight(Settings settings) {
        super(settings.luminance(state -> state.get(Properties.LIT) ? 15 : 0));
    }
    private static final VoxelShape SHAPE_NS = Block.createCuboidShape(-8, 15, 0, 24, 16, 16);
    private static final VoxelShape SHAPE_WE = Block.createCuboidShape(0, 15, -8, 16, 16, 24);
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)) {
            case EAST, WEST -> SHAPE_WE;
            default -> SHAPE_NS;
        };
    }}
