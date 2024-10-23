package com.besson.arknights.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.LootableContainerBlockEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;

public abstract class ModAbstractContainerBE extends LootableContainerBlockEntity {
    private DefaultedList<ItemStack> inv = createInventory();
    protected ModAbstractContainerBE(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState);
    }
    public DefaultedList<ItemStack> createInventory() {
        return DefaultedList.ofSize(27, ItemStack.EMPTY);
    }

    @Override
    protected DefaultedList<ItemStack> getInvStackList() {
        return this.inv;
    }

    @Override
    protected void setInvStackList(DefaultedList<ItemStack> list) {
        this.inv = list;
    }

    @Override
    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return GenericContainerScreenHandler.createGeneric9x3(syncId, playerInventory, this);
    }

    @Override
    public int size() {
        return 27;
    }
}
