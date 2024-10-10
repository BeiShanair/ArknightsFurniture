package com.besson.arknights.block.custom.renderer;

import com.besson.arknights.block.SeatBlockEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class SeatRenderer extends EntityRenderer<SeatBlockEntity> {
    public SeatRenderer(EntityRendererFactory.Context ctx) {
        super(ctx);
    }

    @Override
    public Identifier getTexture(SeatBlockEntity entity) {
        return null;
    }

    @Override
    protected void renderLabelIfPresent(SeatBlockEntity entity, Text text, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light) {

    }
}
