package com.besson.arknights.block;

import com.besson.arknights.ArknightsFurniture;
import com.besson.arknights.block.custom.warehouse.ManyCardboardBoxes;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block MANY_CARDBOARD_BOXES = registerBlock("many_cardboard_boxes", new ManyCardboardBoxes(AbstractBlock.Settings.copy(Blocks.STONE)));
    private static Block registerBlock(String id, Block block) {
        registerBlockItem(id, block);
        return Registry.register(Registries.BLOCK, new Identifier(ArknightsFurniture.MOD_ID, id), block);
    }
    private static void registerBlockItem(String id, Block block) {
        Registry.register(Registries.ITEM, new Identifier(ArknightsFurniture.MOD_ID, id),
                new BlockItem(block, new Item.Settings()));
    }
    public static void registerBlocks() {
        ArknightsFurniture.LOGGER.info("Registering blocks...");
    }
}
