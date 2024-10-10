package com.besson.arknights.block;

import com.besson.arknights.ArknightsFurniture;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final EntityType<SeatBlockEntity> SEAT = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(ArknightsFurniture.MOD_ID, "seat"),
            FabricEntityTypeBuilder.create(SpawnGroup.MISC, SeatBlockEntity::new).build());
    public static void registerModBlockEntities() {

    }
}
