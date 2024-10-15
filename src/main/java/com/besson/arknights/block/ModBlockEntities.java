package com.besson.arknights.block;

import com.besson.arknights.ArknightsFurniture;
import com.besson.arknights.block.custom.warehouse.CartonBlockEntity;
import com.mojang.datafixers.types.Type;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.datafixer.TypeReferences;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

public class ModBlockEntities {
    public static final EntityType<SeatBlockEntity> SEAT = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(ArknightsFurniture.MOD_ID, "seat"),
            FabricEntityTypeBuilder.create(SpawnGroup.MISC, SeatBlockEntity::new).build());
    public static final BlockEntityType<CartonBlockEntity> CARTON = create("carton",
            BlockEntityType.Builder.create(CartonBlockEntity::new, ModBlocks.CARTON));
    private static <T extends BlockEntity> BlockEntityType<T> create(String id, BlockEntityType.Builder<T> builder) {
        Type<?> type = Util.getChoiceType(TypeReferences.BLOCK_ENTITY, id);
        return Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(ArknightsFurniture.MOD_ID, id), builder.build(type));
    }
    public static void registerModBlockEntities() {

    }
}
