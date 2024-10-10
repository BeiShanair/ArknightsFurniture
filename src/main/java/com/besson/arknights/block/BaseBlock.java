package com.besson.arknights.block;

import com.besson.arknights.utils.PosList;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Objects;

// 原计划是拿它来修碰撞箱，但是修不好qwq，此类暂时废弃
@Deprecated
public class BaseBlock extends FurnitureHorizontalFacingBlock {
    // 这是一个大方块的基类，用于继承，重点在于修复碰撞箱
    // 其具体修复逻辑见我的教程（正在施工）
    // 沙发等具有特殊功能的方块实体不会继承这个类（毕竟一般他们也是单方块但多状态的）

    public static final EnumProperty<Part> PART = EnumProperty.of("part", Part.class);
    private List<BlockPos> posList;
    // 主方块所在位置
    private BlockPos masterPos;
    public BaseBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(PART, Part.MINOR));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(PART);
    }
    public Vec3i getSize(){
        // 根据大方块的具体尺寸进行重写
        return new Vec3i(1, 1, 1);
    };

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        if (placer == null) {
            return;
        }
        Vec3i size = getSize();
        // 获取方块的位置列表（按照blockbench中的模型形状）
        List<BlockPos> posList = PosList.checkPlayerFace(pos, size, placer);
        // 按照xyz坐标排序，找到主方块
        posList.sort((pos1, pos2) -> {
            int c1 = Integer.compare(pos1.getX(), pos2.getX());
            if (c1 != 0) {
                return c1;
            }
            int c2 = Integer.compare(pos1.getY(), pos2.getY());
            if (c2 != 0) {
                return c2;
            }
            return Integer.compare(pos1.getZ(), pos2.getZ());
        });
        // 设置方块的状态
        for (BlockPos blockPos : posList) {
            if (blockPos.equals(pos)) {
                world.setBlockState(blockPos, this.getDefaultState().with(PART, Part.MAIN));
            } else {
                world.setBlockState(blockPos, this.getDefaultState().with(PART, Part.MINOR));
            }
        }
        // 保存主方块的位置和方块列表
        this.masterPos = pos;
        this.posList = posList;
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        if (state.get(PART) == Part.MAIN) {
            return BlockRenderType.MODEL;
        } else {
            return BlockRenderType.INVISIBLE;
        }
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return Block.createCuboidShape(0, 0, 0, 16, 16, 16);
    }

//    @Override
//    public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
//        // 如果主方块被移除，次方块也会被移除
//        BlockPos masterPos = this.masterPos;
//        if (Objects.equals(masterPos, pos) || state.get(PART) == Part.MINOR) {
//            if (masterPos != null) {
//                // 利用保存的方块列表移除所有方块
//                for (BlockPos p : posList) {
//                    world.removeBlock(p, false);
//                }
//            }
//        }
//        super.onStateReplaced(state, world, pos, newState, moved);
//    }

    @Override
    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        BlockPos masterPos = this.masterPos;
        if (Objects.equals(masterPos, pos) || state.get(PART) == Part.MINOR) {
            if (masterPos != null) {
                for (BlockPos p : posList) {
                    world.breakBlock(p, p.equals(masterPos), player);
                }
            }
        }
    }

    // PART属性
    public enum Part implements StringIdentifiable {
        MAIN("main"),
        MINOR("minor");
        private final String name;

        Part(String name) {
            this.name = name;
        }

        @Override
        public String asString() {
            return name;
        }
    }
}
