package com.besson.arknights.mixin;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(LivingEntity.class)
public class LivingEntityInvoker {
    @Invoker("setPositionInBed")
    void invokeSetPositionInBed(BlockPos pos) {
        throw new AssertionError();
    }
}
