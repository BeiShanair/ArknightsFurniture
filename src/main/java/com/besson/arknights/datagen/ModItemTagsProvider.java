package com.besson.arknights.datagen;

import com.besson.arknights.block.ModBlocks;
import com.besson.arknights.tag.ModItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModItemTags.COIN_FURN_5)
                .add(ModBlocks.AIR_MATTRESS.asItem())
                .add(ModBlocks.ATTENDANCE_BOARD.asItem())
                .add(ModBlocks.CARGO_TROLLEY.asItem())
                .add(ModBlocks.CARTON.asItem())
                .add(ModBlocks.CARTON_STOOL.asItem())
                .add(ModBlocks.GRAFFITI.asItem())
                .add(ModBlocks.LARGE_SHELF1.asItem())
                .add(ModBlocks.LARGE_SHELF2.asItem())
                .add(ModBlocks.LARGE_SHELF3.asItem())
                .add(ModBlocks.LARGE_SHELF4.asItem())
                .add(ModBlocks.PALLET.asItem())
                .add(ModBlocks.PILE_OF_CARTONS.asItem())
                .add(ModBlocks.PORTABLE_CALCULATOR.asItem())
                .add(ModBlocks.POST_IT_NOTE.asItem());
    }
}
