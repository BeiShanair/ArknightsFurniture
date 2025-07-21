package com.besson.arknights.item.custom;

import com.besson.arknights.block.SeatEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

public class SeatSummonItem extends Item {
    public float yOffset;
    public SeatSummonItem(float yOffset, Settings settings) {
        super(settings);
        this.yOffset = yOffset;
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        if (!world.isClient()){
            Direction direction = context.getHorizontalPlayerFacing();
            SeatEntity.create(world,
                    context.getBlockPos(),
                    this.yOffset,
                    context.getPlayer(),
                    direction
            );
        }
        return ActionResult.SUCCESS;
    }
}
