package com.besson.arknights.block.custom.warehouse;

import com.besson.arknights.block.ModAbstractContainerBE;
import com.besson.arknights.block.ModBlockEntities;
import com.besson.arknights.screen.SmallSlotScreenHandler;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;

public class LargeShelfEmptyBE extends ModAbstractContainerBE implements ExtendedScreenHandlerFactory {
    protected LargeShelfEmptyBE(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState);
    }
    public LargeShelfEmptyBE(BlockPos pos, BlockState state) {
        this(ModBlockEntities.LARGE_SHELF_EMPTY, pos, state);
    }

    @Override
    protected Text getContainerName() {
        return Text.translatable("container.large_shelf");
    }

    @Override
    public DefaultedList<ItemStack> createInventory() {
        return DefaultedList.ofSize(3, ItemStack.EMPTY);
    }

    @Override
    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return new SmallSlotScreenHandler(syncId, playerInventory, this);
    }

    @Override
    public int size() {
        return 3;
    }

    @Override
    public void writeScreenOpeningData(ServerPlayerEntity player, PacketByteBuf buf) {
        buf.writeBlockPos(this.pos);
    }
}
