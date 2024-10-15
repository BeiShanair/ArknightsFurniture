package com.besson.arknights.block.custom.warehouse;

import com.besson.arknights.block.ModBlockEntities;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.LootableContainerBlockEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;

public class CartonBlockEntity extends LootableContainerBlockEntity {
    private DefaultedList<ItemStack> inv = DefaultedList.ofSize(27, ItemStack.EMPTY);
    protected CartonBlockEntity(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState);
    }
    public CartonBlockEntity(BlockPos pos, BlockState state) {
        this(ModBlockEntities.CARTON, pos, state);
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
    protected Text getContainerName() {
        return Text.translatable("container.carton");
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
