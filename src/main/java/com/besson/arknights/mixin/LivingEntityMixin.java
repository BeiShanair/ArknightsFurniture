package com.besson.arknights.mixin;

import com.besson.arknights.block.FurnitureBedBlock;
import com.besson.arknights.block.custom.warehouse.AirMattress;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin extends Entity {
    public LivingEntityMixin(EntityType<?> type, World world) {
        super(type, world);
    }

    @Redirect(method = "setPositionInBed",
    at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/LivingEntity;setPosition(DDD)V"))
    private void modifySleepPosition(LivingEntity entity, double x, double y, double z, BlockPos pos) {
        BlockState state = this.getWorld().getBlockState(pos);
        double modifiedY = state.getBlock() instanceof AirMattress ?
                pos.getY() + 0.25 : pos.getZ() + 0.6875;

        this.setPosition(x, modifiedY, z);
    }
}
