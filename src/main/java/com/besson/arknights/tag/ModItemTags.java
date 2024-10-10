package com.besson.arknights.tag;

import com.besson.arknights.ArknightsFurniture;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModItemTags {
    public static final TagKey<Item> COIN_FURN_5 = of("coin_furn_5");
    private static TagKey<Item> of(String id) {
        return TagKey.of(RegistryKeys.ITEM, new Identifier(ArknightsFurniture.MOD_ID, id));
    }
    public static void registerModBlockTags() {
        ArknightsFurniture.LOGGER.info("Registering item tags");
    }
}
