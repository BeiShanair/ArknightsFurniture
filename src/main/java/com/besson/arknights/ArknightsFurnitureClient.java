package com.besson.arknights;

import com.besson.arknights.block.ModBlockEntities;
import com.besson.arknights.block.ModBlocks;
import com.besson.arknights.block.custom.renderer.SeatRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;

public class ArknightsFurnitureClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GRAFFITI, RenderLayer.getCutout());

        EntityRendererRegistry.register(ModBlockEntities.SEAT, SeatRenderer::new);
    }
}
