package com.besson.arknights.block.custom.renderer;

import com.besson.arknights.block.custom.warehouse.LargeShelf;
import com.besson.arknights.block.custom.warehouse.LargeShelfBE;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.RotationAxis;

@Environment(value = EnvType.CLIENT)
public class LargeShelfRenderer implements BlockEntityRenderer<LargeShelfBE> {
    private final ItemRenderer itemRenderer;
    public LargeShelfRenderer(BlockEntityRendererFactory.Context ctx){
        this.itemRenderer = ctx.getItemRenderer();
    }

    private static final float u1 = 1f/16f;

    @Override
    public void render(LargeShelfBE entity, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        Direction direction = entity.getCachedState().get(LargeShelf.FACING);

        float scale = 0.5f;
        float xoffset = 5.0f;
        float yoffset = 1.5f;
        float zoffset = 0.0f;

        if (entity.getStack(0) != ItemStack.EMPTY) {
            matrices.push();
            matrices.translate(.5f, .5f, .5f);
            matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-direction.asRotation() + 180.0f));
            matrices.translate(4 * u1 * xoffset, u1 * yoffset, zoffset);
            matrices.scale(scale, scale, scale);
            this.itemRenderer.renderItem(entity.getStack(0), ModelTransformationMode.FIXED, light, overlay,
                            matrices, vertexConsumers, entity.getWorld(), 1);
            matrices.pop();
        }
        if (entity.getStack(1) != ItemStack.EMPTY) {
            matrices.push();
            matrices.translate(.5f, .5f, .5f);
            matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-direction.asRotation() + 180.0f));
            matrices.translate(3 * u1 * xoffset, u1 * yoffset, zoffset);
            matrices.scale(scale, scale, scale);
            this.itemRenderer.renderItem(entity.getStack(1), ModelTransformationMode.FIXED, light, overlay,
                    matrices, vertexConsumers, entity.getWorld(), 1);
            matrices.pop();
        }
        if (entity.getStack(2) != ItemStack.EMPTY) {
            matrices.push();
            matrices.translate(.5f, .5f, .5f);
            matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-direction.asRotation() + 180.0f));
            matrices.translate(2 * u1 * xoffset, u1 * yoffset, zoffset);
            matrices.scale(scale, scale, scale);
            this.itemRenderer.renderItem(entity.getStack(2), ModelTransformationMode.FIXED, light, overlay,
                    matrices, vertexConsumers, entity.getWorld(), 1);
            matrices.pop();
        }
        if (entity.getStack(3) != ItemStack.EMPTY) {
            matrices.push();
            matrices.translate(.5f, .5f, .5f);
            matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-direction.asRotation() + 180.0f));
            matrices.translate(u1 * xoffset, u1 * yoffset, zoffset);
            matrices.scale(scale, scale, scale);
            this.itemRenderer.renderItem(entity.getStack(3), ModelTransformationMode.FIXED, light, overlay,
                    matrices, vertexConsumers, entity.getWorld(), 1);
            matrices.pop();
        }
        if (entity.getStack(4) != ItemStack.EMPTY) {
            matrices.push();
            matrices.translate(.5f, .5f, .5f);
            matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-direction.asRotation() + 180.0f));
            matrices.translate(0, u1 * yoffset, zoffset);
            matrices.scale(scale, scale, scale);
            this.itemRenderer.renderItem(entity.getStack(4), ModelTransformationMode.FIXED, light, overlay,
                    matrices, vertexConsumers, entity.getWorld(), 1);
            matrices.pop();
        }
        if (entity.getStack(5) != ItemStack.EMPTY) {
            matrices.push();
            matrices.translate(.5f, .5f, .5f);
            matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-direction.asRotation() + 180.0f));
            matrices.translate(-u1 * xoffset, u1 * yoffset, zoffset);
            matrices.scale(scale, scale, scale);
            this.itemRenderer.renderItem(entity.getStack(5), ModelTransformationMode.FIXED, light, overlay,
                    matrices, vertexConsumers, entity.getWorld(), 1);
            matrices.pop();
        }
        if (entity.getStack(6) != ItemStack.EMPTY) {
            matrices.push();
            matrices.translate(.5f, .5f, .5f);
            matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-direction.asRotation() + 180.0f));
            matrices.translate(-2 * u1 * xoffset, u1 * yoffset, zoffset);
            matrices.scale(scale, scale, scale);
            this.itemRenderer.renderItem(entity.getStack(6), ModelTransformationMode.FIXED, light, overlay,
                    matrices, vertexConsumers, entity.getWorld(), 1);
            matrices.pop();
        }
        if (entity.getStack(7) != ItemStack.EMPTY) {
            matrices.push();
            matrices.translate(.5f, .5f, .5f);
            matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-direction.asRotation() + 180.0f));
            matrices.translate(-3 * u1 * xoffset, u1 * yoffset, zoffset);
            matrices.scale(scale, scale, scale);
            this.itemRenderer.renderItem(entity.getStack(7), ModelTransformationMode.FIXED, light, overlay,
                    matrices, vertexConsumers, entity.getWorld(), 1);
            matrices.pop();
        }
        if (entity.getStack(8) != ItemStack.EMPTY) {
            matrices.push();
            matrices.translate(.5f, .5f, .5f);
            matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-direction.asRotation() + 180.0f));
            matrices.translate(-4 * u1 * xoffset, u1 * yoffset, zoffset);
            matrices.scale(scale, scale, scale);
            this.itemRenderer.renderItem(entity.getStack(8), ModelTransformationMode.FIXED, light, overlay,
                    matrices, vertexConsumers, entity.getWorld(), 1);
            matrices.pop();
        }
    }
}
