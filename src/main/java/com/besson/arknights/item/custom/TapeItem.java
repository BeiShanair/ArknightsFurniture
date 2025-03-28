package com.besson.arknights.item.custom;

import com.besson.arknights.block.FurnitureProperties;
import com.besson.arknights.tag.ModBlockTags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;

public class TapeItem extends Item {
    public TapeItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if (!context.getWorld().isClient()){
            BlockState state = context.getWorld().getBlockState(context.getBlockPos());
            if (state.isIn(ModBlockTags.CARTON)){
                context.getWorld().setBlockState(context.getBlockPos(), state.with(FurnitureProperties.TAPED, true));
                return ActionResult.SUCCESS;
            }
        }
        return ActionResult.CONSUME;
    }
}
