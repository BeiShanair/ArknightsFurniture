package com.besson.arknights.mixin;

import com.besson.arknights.block.FurnitureBedBlock;
import com.besson.arknights.block.ModBlocks;
import com.besson.arknights.block.custom.lifecycle.BunkBedInCabinTop;
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
        double modifiedY = pos.getY() + 0.6875;
        if (state.getBlock() instanceof AirMattress) {
            modifiedY = pos.getY() + 0.25;
        }
        else if (state.getBlock() instanceof BunkBedInCabinTop){
            modifiedY = pos.getY() + 0.9;
        }
        else if (state.getBlock() instanceof FurnitureBedBlock) {
            modifiedY = pos.getY() + 0.75;
        }
        this.setPosition(x, modifiedY, z);
    }
}
