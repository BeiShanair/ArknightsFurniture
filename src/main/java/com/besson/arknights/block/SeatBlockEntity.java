package com.besson.arknights.block;

import net.minecraft.entity.Dismounting;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.*;
import net.minecraft.world.World;

import javax.print.DocFlavor;
import java.util.List;

public class SeatBlockEntity extends Entity {
    public SeatBlockEntity(EntityType<? extends SeatBlockEntity> type, World world) {
        super(type, world);
        this.intersectionChecked = true;
    }
    private SeatBlockEntity(World world, BlockPos blockPos, double yOffset, Direction direction) {
        this(ModBlockEntities.SEAT, world);
        this.setPosition(blockPos.getX() + 0.5, blockPos.getY() + yOffset, blockPos.getZ() + 0.5);
        this.setRotation(direction.asRotation(), 0F);
    }
    @Override
    protected void initDataTracker() {

    }

    @Override
    protected void readCustomDataFromNbt(NbtCompound nbt) {

    }

    @Override
    protected void writeCustomDataToNbt(NbtCompound nbt) {

    }

    @Override
    public void tick() {
        super.tick();
        if (!this.getWorld().isClient()) {
            if (this.getPassengerList().isEmpty() || this.getWorld().isAir(this.getBlockPos())) {
                this.remove(RemovalReason.DISCARDED);
                this.getWorld().updateComparators(getBlockPos(), this.getWorld().getBlockState(getBlockPos()).getBlock());
            }
        }
    }

    @Override
    public double getMountedHeightOffset() {
        return 0.0;
    }

    @Override
    protected boolean canStartRiding(Entity entity) {
        return true;
    }

    @Override
    public Packet<ClientPlayPacketListener> createSpawnPacket() {
        return super.createSpawnPacket();
    }
    public static ActionResult create(World world, BlockPos pos, double yOffset, PlayerEntity player, Direction direction) {
        if(!world.isClient()) {
            List<SeatBlockEntity> seats = world.getNonSpectatingEntities(
                    SeatBlockEntity.class, new Box(pos.getX(), pos.getY(), pos.getZ(), pos.getX() + 1.0, pos.getY() + 1.0, pos.getZ() + 1.0));

            if(seats.isEmpty()) {
                SeatBlockEntity seat = new SeatBlockEntity(world, pos, yOffset, direction);
                world.spawnEntity(seat);
                player.startRiding(seat, false);
            }
        }
        return ActionResult.SUCCESS;
    }
    @Override
    public Vec3d updatePassengerForDismount(LivingEntity passenger) {
        Direction direction = this.getMovementDirection();
        Direction[] offsets = {direction, direction.rotateYClockwise(), direction.rotateYCounterclockwise(), direction};
        for (Direction dir : offsets){
            Vec3d vec3d = Dismounting.findRespawnPos(passenger.getType(),this.getWorld(),this.getBlockPos().offset(dir),false);
            if (vec3d != null){
                return vec3d.add(0,0.25,0);
            }
        }
        return super.updatePassengerForDismount(passenger);
    }

    @Override
    protected void addPassenger(Entity passenger) {
        super.addPassenger(passenger);
        passenger.setYaw(this.getYaw());
    }

    @Override
    protected void updatePassengerPosition(Entity passenger, PositionUpdater positionUpdater) {
        super.updatePassengerPosition(passenger, positionUpdater);
        this.clampYaw(passenger);
    }
    private void clampYaw(Entity passenger){
        passenger.setBodyYaw(this.getYaw());
        float wrappedYaw = MathHelper.wrapDegrees(passenger.getYaw() - this.getYaw());
        float clampedYaw = MathHelper.clamp(wrappedYaw, -120.0F, 120.0F);
        passenger.prevYaw += clampedYaw - wrappedYaw;
        passenger.setYaw(passenger.getYaw() + clampedYaw - wrappedYaw);
        passenger.setHeadYaw(passenger.getYaw());
    }
}