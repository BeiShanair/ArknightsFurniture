package com.besson.arknights.item.custom;

import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class FireExtinguisher extends Item {

    public FireExtinguisher(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!world.isClient()) {
            BlockHitResult hitResult = rayCast(world, user, 5.0D);
            if (hitResult != null) {
                BlockPos pos = hitResult.getBlockPos();
                if (world.getBlockState(pos).isOf(Blocks.FIRE)) {
                    world.setBlockState(pos, Blocks.AIR.getDefaultState());
                }
            }
        } else {
            double sideOffset = 0.5; // 侧向偏移，右手为正，左手为负
            double downOffset = 0.4; // 向下偏移
            Vec3d look = user.getRotationVec(1.0F);
            Vec3d up = new Vec3d(0, 1, 0);
            Vec3d right = look.crossProduct(up).normalize().multiply(sideOffset);

            double dx = user.getX() + look.x * 1.2 + right.x;
            double dy = user.getEyeY() - downOffset;
            double dz = user.getZ() + look.z * 1.2 + right.z;

            for (int i = 0; i < 20; i++) {
                double vx = look.x * 0.3 + (world.random.nextDouble() - 0.5) * 0.1;
                double vy = look.y * 0.3 + (world.random.nextDouble() - 0.5) * 0.1;
                double vz = look.z * 0.3 + (world.random.nextDouble() - 0.5) * 0.1;
                world.addParticle(ParticleTypes.POOF, dx, dy, dz, vx, vy, vz);
            }
        }
        return TypedActionResult.success(user.getStackInHand(hand));
    }

    private BlockHitResult rayCast(World world, PlayerEntity user, double distance) {
        return (BlockHitResult) user.raycast(distance, 1.0F, false);
    }
}
