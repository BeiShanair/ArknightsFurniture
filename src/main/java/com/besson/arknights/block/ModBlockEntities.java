package com.besson.arknights.block;

import com.besson.arknights.ArknightsFurniture;
import com.besson.arknights.block.custom.columbian.RedBrownCabinetBE;
import com.besson.arknights.block.custom.countryside.LogCabinetBottomBE;
import com.besson.arknights.block.custom.countryside.LogCabinetTopBE;
import com.besson.arknights.block.custom.fantastic.SmallSquareNightstandBE;
import com.besson.arknights.block.custom.lgd.SmallSandalwoodNightstandBE;
import com.besson.arknights.block.custom.sideline.CheckerboardBookcaseBE;
import com.besson.arknights.block.custom.sideline.NightstandBE;
import com.besson.arknights.block.custom.sideline.SimpleCabinetBE;
import com.besson.arknights.block.custom.warehouse.CartonBE;
import com.besson.arknights.block.custom.warehouse.LargeShelfBE;
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
    public static final EntityType<SeatEntity> SEAT = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(ArknightsFurniture.MOD_ID, "seat"),
            FabricEntityTypeBuilder.create(SpawnGroup.MISC, SeatEntity::new).build());

    public static final BlockEntityType<CartonBE> CARTON = create("carton",
            BlockEntityType.Builder.create(CartonBE::new, ModBlocks.CARTON));

    public static final BlockEntityType<LargeShelfBE> LARGE_SHELF = create("large_shelf",
            BlockEntityType.Builder.create(LargeShelfBE::new, ModBlocks.LARGE_SHELF1, ModBlocks.LARGE_SHELF2, ModBlocks.LARGE_SHELF3, ModBlocks.LARGE_SHELF4));

    public static final BlockEntityType<NightstandBE> NIGHTSTAND = create("nightstand",
            BlockEntityType.Builder.create(NightstandBE::new, ModBlocks.BLACK_NIGHTSTAND, ModBlocks.ORANGE_NIGHTSTAND));

    public static final BlockEntityType<SimpleCabinetBE> SIMPLE_CABINET = create("simple_black_cabinet",
            BlockEntityType.Builder.create(SimpleCabinetBE::new, ModBlocks.SIMPLE_BLACK_CABINET, ModBlocks.SIMPLE_ORANGE_CABINET));

    public static final BlockEntityType<CheckerboardBookcaseBE> CHECKERBOARD_BOOKCASE = create("checkerboard_bookcase",
            BlockEntityType.Builder.create(CheckerboardBookcaseBE::new,
                    ModBlocks.CHECKERBOARD_BOOKCASE1, ModBlocks.CHECKERBOARD_BOOKCASE2, ModBlocks.CHECKERBOARD_BOOKCASE3,
                    ModBlocks.ORANGE_CHECKERBOARD_BOOKCASE1, ModBlocks.ORANGE_CHECKERBOARD_BOOKCASE2, ModBlocks.ORANGE_CHECKERBOARD_BOOKCASE3));

    public static final BlockEntityType<SmallSquareNightstandBE> SMALL_SQUARE_NIGHTSTAND = create("small_square_nightstand",
            BlockEntityType.Builder.create(SmallSquareNightstandBE::new, ModBlocks.SMALL_SQUARE_NIGHTSTAND));

    public static final BlockEntityType<RedBrownCabinetBE> RED_BROWN_CABINET = create("red_brown_cabinet",
            BlockEntityType.Builder.create(RedBrownCabinetBE::new, ModBlocks.RED_BROWN_CABINET));

    public static final BlockEntityType<SmallSandalwoodNightstandBE> SMALL_SANDALWOOD_NIGHTSTAND = create("small_sandalwood_nightstand",
            BlockEntityType.Builder.create(SmallSandalwoodNightstandBE::new, ModBlocks.SMALL_SANDALWOOD_NIGHTSTAND, ModBlocks.SMALL_TEAK_NIGHTSTAND));

    public static final BlockEntityType<LogCabinetBottomBE> LOG_CABINET_BOTTOM = create("log_cabinet_bottom",
            BlockEntityType.Builder.create(LogCabinetBottomBE::new, ModBlocks.LOG_CABINET_BOTTOM));

    public static final BlockEntityType<LogCabinetTopBE> LOG_CABINET_TOP = create("log_cabinet_top",
            BlockEntityType.Builder.create(LogCabinetTopBE::new, ModBlocks.LOG_CABINET_TOP1, ModBlocks.LOG_CABINET_TOP2));

    private static <T extends BlockEntity> BlockEntityType<T> create(String id, BlockEntityType.Builder<T> builder) {
        Type<?> type = Util.getChoiceType(TypeReferences.BLOCK_ENTITY, id);
        return Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(ArknightsFurniture.MOD_ID, id), builder.build(type));
    }
    public static void registerModBlockEntities() {

    }
}
