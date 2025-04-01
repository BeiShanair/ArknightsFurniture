package com.besson.arknights.block.custom.warehouse;

import com.besson.arknights.block.ModAbstractContainerBE;
import com.besson.arknights.block.ModBlockEntities;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class LargeShelfBE extends ModAbstractContainerBE {
    protected LargeShelfBE(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState);
    }
    public LargeShelfBE(BlockPos pos, BlockState state) {
        this(ModBlockEntities.LARGE_SHELF, pos, state);
    }

    @Override
    protected Text getContainerName() {
        return Text.translatable("container.large_shelf");
    }

    @Override
    public DefaultedList<ItemStack> createInventory() {
        return DefaultedList.ofSize(9, ItemStack.EMPTY);
    }

    @Override
    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return new GenericContainerScreenHandler(ScreenHandlerType.GENERIC_9X1, syncId, playerInventory, this, 1);
    }

    @Override
    public int size() {
        return 9;
    }
}
