package com.besson.arknights.block.custom.warehouse;

import com.besson.arknights.block.FurnitureProperties;
import com.besson.arknights.block.ModAbstractChestBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.ShulkerBoxBlockEntity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.context.LootContextParameterSet;
import net.minecraft.loot.context.LootContextParameters;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Supplier;

import static net.minecraft.block.ShulkerBoxBlock.CONTENTS_DYNAMIC_DROP_ID;

public class Carton extends ModAbstractChestBlock<CartonBE> {
    public static final BooleanProperty TAPED = FurnitureProperties.TAPED;

    private static final VoxelShape SHAPE_N = Block.createCuboidShape(0, 0, 0, 24, 32, 24);
    private static final VoxelShape SHAPE_W = Block.createCuboidShape(0, 0, -8, 24, 32, 16);
    private static final VoxelShape SHAPE_S = Block.createCuboidShape(-8, 0, -8, 16, 32, 16);
    private static final VoxelShape SHAPE_E = Block.createCuboidShape(-8, 0, 0, 16, 32, 24);

    public Carton(Settings settings, Supplier<BlockEntityType<? extends CartonBE>> blockEntityTypeSupplier) {
        super(settings, blockEntityTypeSupplier);
        this.setDefaultState(this.getStateManager().getDefaultState().with(TAPED, false));
    }


    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)) {
            case WEST -> SHAPE_W;
            case SOUTH -> SHAPE_S;
            case EAST -> SHAPE_E;
            default -> SHAPE_N;
        };
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(TAPED);
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new CartonBE(pos, state);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient() && !state.get(TAPED)) {
            NamedScreenHandlerFactory factory = this.createScreenHandlerFactory(state, world, pos);
            if (factory != null){
                player.openHandledScreen(factory);
                return ActionResult.SUCCESS;
            }
        }
        return ActionResult.CONSUME;
    }

    @Override
    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        BlockEntity blockEntity = world.getBlockEntity(pos);
        if (blockEntity instanceof CartonBE carton) {
            if (!world.isClient() && !player.isCreative() ) {
                if (!carton.isEmpty() && state.get(TAPED)){
                    ItemStack itemStack = new ItemStack(this);
                    blockEntity.setStackNbt(itemStack);

                    ItemEntity itemEntity = new ItemEntity(world, (double) pos.getX() + 0.5, (double) pos.getY() + 0.5, (double) pos.getZ() + 0.5, itemStack);
                    itemEntity.setToDefaultPickupDelay();
                    world.spawnEntity(itemEntity);
                    System.out.println("1");
                }
            }
        }
    }

    @Override
    public List<ItemStack> getDroppedStacks(BlockState state, LootContextParameterSet.Builder builder) {
        BlockEntity blockEntity = builder.getOptional(LootContextParameters.BLOCK_ENTITY);
        if (blockEntity instanceof CartonBE carton) {
            if (state.get(TAPED)) {
                if (carton.isEmpty()) {
                    // 空箱子时返回默认掉落
                    System.out.println("2");
                    return super.getDroppedStacks(state, builder);
                }
                System.out.println("3");
                // 非空箱子时返回空列表（已在onBreak处理）
                return List.of();
            }
        }
        System.out.println("4");
        return super.getDroppedStacks(state, builder);
    }

}
