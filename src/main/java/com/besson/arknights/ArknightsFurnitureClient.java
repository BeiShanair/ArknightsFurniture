package com.besson.arknights;

import com.besson.arknights.block.ModBlockEntities;
import com.besson.arknights.block.ModBlocks;
import com.besson.arknights.block.custom.renderer.LargeShelfRenderer;
import com.besson.arknights.block.custom.renderer.SeatRenderer;
import com.besson.arknights.screen.ModScreenHandlers;
import com.besson.arknights.screen.SmallSlotScreen;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;

public class ArknightsFurnitureClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GRAFFITI, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ECO_EXHIBITION_CABINET, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_CONIFER_PLANT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_BROADLEAF_PLANT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_SUCCULENT_PLANT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SMALL_SQUARE_NIGHTSTAND, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TRANSPARENT_DIVIDING_PARTITION, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHECKERBOARD_BOOKCASE_BTR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHECKERBOARD_BOOKCASE_MBR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHECKERBOARD_BOOKCASE_MTL, RenderLayer.getTranslucent());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.COFFEE_BEAN_DISPLAY, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_LONG_LEAF_PLANT, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLACK_PEDESTAL_TABLE, RenderLayer.getCutout());

        EntityRendererRegistry.register(ModBlockEntities.SEAT, SeatRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.LARGE_SHELF_EMPTY, LargeShelfRenderer::new);

        HandledScreens.register(ModScreenHandlers.SMALL_SCREEN_HANDLER, SmallSlotScreen::new);
    }
}
