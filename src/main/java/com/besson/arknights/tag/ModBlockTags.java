package com.besson.arknights.tag;

import com.besson.arknights.ArknightsFurniture;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModBlockTags {
    public static final TagKey<Block> CARTON = of("carton");
    private static TagKey<Block> of(String id) {
        return TagKey.of(RegistryKeys.BLOCK, new Identifier(ArknightsFurniture.MOD_ID, id));
    }
    public static void registerModBlockTags() {
        ArknightsFurniture.LOGGER.info("Registering block tags");
    }
}
