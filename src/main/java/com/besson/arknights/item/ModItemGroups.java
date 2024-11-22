package com.besson.arknights.item;

import com.besson.arknights.ArknightsFurniture;
import com.besson.arknights.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    // 图标
    public static final ItemGroup LOGO = Registry.register(Registries.ITEM_GROUP, new Identifier(ArknightsFurniture.MOD_ID, "logo"),
            ItemGroup.create(null, -1).displayName(Text.translatable("itemGroup.logo"))
                    .icon(() -> new ItemStack(ModItems.RHODES_ISLAND_OVERRIDE_LOGO)).entries((displayContext, entries) -> {
                        entries.add(ModItems.ABYSSAL_HUNTERS_LOGO);
                        entries.add(ModItems.AEGIR_LOGO);
                        entries.add(ModItems.BABEL_LOGO);
                        entries.add(ModItems.BLACK_STEEL_LOGO);
                        entries.add(ModItems.BOLIVAR_LOGO);
                        entries.add(ModItems.COLUMBIA_LOGO);
                        entries.add(ModItems.DONG_LOGO);
                        entries.add(ModItems.DUBLINN_LOGO);
                        entries.add(ModItems.ELITE_OP_LOGO);
                        entries.add(ModItems.FOLLOWERS_LOGO);
                        entries.add(ModItems.GLASGOW_LOGO);
                        entries.add(ModItems.IBERIA_LOGO);
                        entries.add(ModItems.KARLAN_TRADE_LOGO);
                        entries.add(ModItems.KAZIMIERZ_LOGO);
                        entries.add(ModItems.KJERAG_LOGO);
                        entries.add(ModItems.LATERANO_LOGO);
                        entries.add(ModItems.LEES_DETECTIVE_AGENCY_LOGO);
                        entries.add(ModItems.LEITHANIEN_LOGO);
                        entries.add(ModItems.LUNGMEN_GUARD_DEPARTMENT_LOGO);
                        entries.add(ModItems.LUNGMEN_LOGO);
                        entries.add(ModItems.MINOS_LOGO);
                        entries.add(ModItems.OP_A4_LOGO);
                        entries.add(ModItems.OP_RESERVE_A1_LOGO);
                        entries.add(ModItems.OP_RESERVE_A4_LOGO);
                        entries.add(ModItems.OP_RESERVE_A6_LOGO);
                        entries.add(ModItems.PENGUIN_LOGISTICS_LOGO);
                        entries.add(ModItems.PINUS_SYLVESTRIS_LOGO);
                        entries.add(ModItems.RHINE_LAB_LOGO);
                        entries.add(ModItems.RHODES_ISLAND_LOGO);
                        entries.add(ModItems.RHODES_ISLAND_OVERRIDE_LOGO);
                        entries.add(ModItems.RIM_BILLITON_LOGO);
                        entries.add(ModItems.SAMI_LOGO);
                        entries.add(ModItems.SARGON_LOGO);
                        entries.add(ModItems.SIESTA_LOGO);
                        entries.add(ModItems.SIRACUSA_BRANCHES_LOGO);
                        entries.add(ModItems.SIRACUSA_LOGO);
                        entries.add(ModItems.SUI_LOGO);
                        entries.add(ModItems.SWEEP_LOGO);
                        entries.add(ModItems.TEAM_RAINBOW_LOGO);
                        entries.add(ModItems.URSUS_LOGO);
                        entries.add(ModItems.URSUS_STUDENT_SELF_GOVERNING_GROUP_LOGO);
                        entries.add(ModItems.VICTORIA_LOGO);
                        entries.add(ModItems.YAN_LOGO);
                    }).build());
    // 材料
    public static final ItemGroup MATERIAL = Registry.register(Registries.ITEM_GROUP, new Identifier(ArknightsFurniture.MOD_ID, "material"),
            ItemGroup.create(null, -1).displayName(Text.translatable("itemGroup.material"))
                    .icon(() -> new ItemStack(ModItems.FURN_PARTS)).entries((displayContext, entries) -> {
                        entries.add(ModItems.FURN_PARTS);
                        entries.add(ModItems.CARDBOARD);
                        entries.add(ModItems.FURN_PARTS_ZIP1);
                        entries.add(ModItems.FURN_PARTS_ZIP2);
                    }).build());

    // WareHouse
    public static final ItemGroup WAREHOUSE = Registry.register(Registries.ITEM_GROUP, new Identifier(ArknightsFurniture.MOD_ID, "warehouse"),
            ItemGroup.create(null, -1).displayName(Text.translatable("itemGroup.warehouse"))
                    .icon(() -> new ItemStack(ModBlocks.CARTON)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.AIR_MATTRESS);
                        entries.add(ModBlocks.ATTENDANCE_BOARD);
                        entries.add(ModBlocks.CARGO_TROLLEY);
                        entries.add(ModBlocks.CARTON);
                        entries.add(ModBlocks.CARTON_STOOL);
                        entries.add(ModBlocks.GRAFFITI);
                        entries.add(ModBlocks.LARGE_SHELF1);
                        entries.add(ModBlocks.LARGE_SHELF2);
                        entries.add(ModBlocks.LARGE_SHELF3);
                        entries.add(ModBlocks.LARGE_SHELF4);
                        entries.add(ModBlocks.PALLET);
                        entries.add(ModBlocks.PILE_OF_CARTONS);
                        entries.add(ModBlocks.PORTABLE_CALCULATOR);
                        entries.add(ModBlocks.POST_IT_NOTE);
                    }).build());

    // Side-line/Simple Black-and-white/Orange Furniture
    public static final ItemGroup SIDE_LINE = Registry.register(Registries.ITEM_GROUP, new Identifier(ArknightsFurniture.MOD_ID, "side_line"),
            ItemGroup.create(null, -1).displayName(Text.translatable("itemGroup.side_line"))
                    .icon(() -> new ItemStack(ModBlocks.SIMPLE_BLACK_CLOCK)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.GRAYISH_WALL_LIGHT);
                        entries.add(ModBlocks.SIMPLE_BLACK_CLOCK);
                        entries.add(ModBlocks.BLACK_HD_TV);
                        entries.add(ModBlocks.BLACK_NIGHTSTAND);
                        entries.add(ModBlocks.BLACK_BED);
                        entries.add(ModBlocks.SMALL_CALLBOARD);
                        entries.add(ModBlocks.BLACK_AND_WHITE_SQUARE_TABLE);
                        entries.add(ModBlocks.LOW_BLACK_AND_WHITE_SOFA);
                        entries.add(ModBlocks.CHECKERBOARD_BOOKCASE1);
                        entries.add(ModBlocks.CHECKERBOARD_BOOKCASE2);
                        entries.add(ModBlocks.CHECKERBOARD_BOOKCASE3);
                        entries.add(ModBlocks.BLACK_OFFICE_CHAIR);
                        entries.add(ModBlocks.SIMPLE_BLACK_CABINET);
                        entries.add(ModBlocks.SIMPLE_BLACK_DESK_LEFT);
                        entries.add(ModBlocks.SIMPLE_BLACK_DESK_RIGHT);

                        entries.add(ModBlocks.ORANGE_WALL_LAMP);
                        entries.add(ModBlocks.SIMPLE_ORANGE_CLOCK);
                        entries.add(ModBlocks.ORANGE_HD_TV);
                        entries.add(ModBlocks.ORANGE_NIGHTSTAND);
                        entries.add(ModBlocks.ORANGE_BED);
                        entries.add(ModBlocks.SMALL_NOTICEBOARD);
                        entries.add(ModBlocks.ORANGE_SQUARE_TABLE);
                        entries.add(ModBlocks.LOW_ORANGE_SOFA);
                        entries.add(ModBlocks.ORANGE_CHECKERBOARD_BOOKCASE1);
                        entries.add(ModBlocks.ORANGE_CHECKERBOARD_BOOKCASE2);
                        entries.add(ModBlocks.ORANGE_CHECKERBOARD_BOOKCASE3);
                        entries.add(ModBlocks.ORANGE_SWIVEL_CHAIR);
                        entries.add(ModBlocks.SIMPLE_ORANGE_CABINET);
                        entries.add(ModBlocks.SIMPLE_ORANGE_DESK_LEFT);
                        entries.add(ModBlocks.SIMPLE_ORANGE_DESK_RIGHT);
                    }).build());

    public static final ItemGroup FANTASTIC_BIO_DOCUMENTARY = Registry.register(Registries.ITEM_GROUP, new Identifier(ArknightsFurniture.MOD_ID, "fantastic_bio-documentary"),
            ItemGroup.create(null, -1).displayName(Text.translatable("itemGroup.fantastic_bio-documentary"))
                    .icon(() -> new ItemStack(ModBlocks.WIRE_SIDE_TABLE)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.BROWN_BEAN_BAG_SOFA);
                        entries.add(ModBlocks.ECO_EXHIBITION_CABINET);
                        entries.add(ModBlocks.ECO_EXHIBITION_CABINET_BASE);
                        entries.add(ModBlocks.FLUSH_MOUNT_RECTANGLE_CEILING_LIGHT);
                        entries.add(ModBlocks.FLUSH_MOUNT_SQUARE_CEILING_LIGHT);
                        entries.add(ModBlocks.METALLIC_BED);
                        entries.add(ModBlocks.POTTED_BROADLEAF_PLANT);
                        entries.add(ModBlocks.POTTED_CONIFER_PLANT);
                        entries.add(ModBlocks.POTTED_SUCCULENT_PLANT);
                        entries.add(ModBlocks.SMALL_SQUARE_NIGHTSTAND);
                        entries.add(ModBlocks.SPECIMEN_DATA_BOARD);
                        entries.add(ModBlocks.WIRE_SIDE_TABLE);
                    }).build());

    public static final ItemGroup NO_12_LIFE_CYCLE_CABIN = Registry.register(Registries.ITEM_GROUP, new Identifier(ArknightsFurniture.MOD_ID, "no_12_life_cycle_cabin"),
            ItemGroup.create(null, -1).displayName(Text.translatable("itemGroup.no_12_life_cycle_cabin"))
                    .icon(() -> new ItemStack(ModBlocks.GENERAL_CONSOLE)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.ANTI_EXPLOSION_TRASH_CAN);
                        entries.add(ModBlocks.BUILT_IN_FILE_CABINET1);
                        entries.add(ModBlocks.BUILT_IN_FILE_CABINET2);
                        entries.add(ModBlocks.BUNK_BED_IN_CABIN);
                        entries.add(ModBlocks.CABIN_FIRE_EXTINGUISHER_KIT);
                        entries.add(ModBlocks.CABIN_FLUSH_MOUNT_PIPE);
                        entries.add(ModBlocks.CONTROL_DISPLAY);
                        entries.add(ModBlocks.DIY_SWIVEL_CHAIR);
                        entries.add(ModBlocks.DIY_WORKBENCH_LEFT);
                        entries.add(ModBlocks.DIY_WORKBENCH_RIGHT);
                        entries.add(ModBlocks.GENERAL_CONSOLE);
                        entries.add(ModBlocks.NOTE_BOARD_IN_CABIN);
                    }).build());
    public static final ItemGroup COLUMBIAN_CAFE = Registry.register(Registries.ITEM_GROUP, new Identifier(ArknightsFurniture.MOD_ID, "columbian_cafe"),
            ItemGroup.create(null, -1).displayName(Text.translatable("itemGroup.columbian_cafe"))
                    .icon(() -> new ItemStack(ModBlocks.BOLIVARIAN_COFFEE_BEAN)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.BAR_CEILING);
                        entries.add(ModBlocks.BARSTOOL_WITH_CURVED_LEGS);
                        entries.add(ModBlocks.BEVERAGE_CABINET_COFFEE1);
                        entries.add(ModBlocks.BEVERAGE_CABINET_COFFEE2);
                        entries.add(ModBlocks.BEVERAGE_CABINET_DC);
                        entries.add(ModBlocks.BEVERAGE_CABINET_DRINK);
                        entries.add(ModBlocks.BEVERAGE_CABINET_EMPTY);
                        entries.add(ModBlocks.BEVERAGE_MENU);
                        entries.add(ModBlocks.BOLIVARIAN_COFFEE_BEAN);
                        entries.add(ModBlocks.BROWN_BOOKCASE1);
                        entries.add(ModBlocks.BROWN_BOOKCASE2);
                        entries.add(ModBlocks.BROWN_BOOKCASE3);
                        entries.add(ModBlocks.COLUMBIAN_STREET_VIEW_PHOTO);
                        entries.add(ModBlocks.DINING_CHAIR);
                        entries.add(ModBlocks.PEDESTAL_COFFEE_TABLE);
                        entries.add(ModBlocks.PENDANT_LIGHT);
                        entries.add(ModBlocks.POTTED_LONG_LEAF_PLANT);
                        entries.add(ModBlocks.RED_BRICK_CAFE_BAR);
                        entries.add(ModBlocks.RED_BROWN_CABINET);
                        entries.add(ModBlocks.SOFT_CEILING_LIGHT);
                    }).build());

    public static final ItemGroup LDG_LOUNGE = Registry.register(Registries.ITEM_GROUP, new Identifier(ArknightsFurniture.MOD_ID, "ldg_faux_lungmen_lounge"),
            ItemGroup.create(null, -1).displayName(Text.translatable("itemGroup.ldg_faux_lungmen_lounge"))
                    .icon(() -> new ItemStack(ModBlocks.BLACK_PEDESTAL_TABLE)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.BLACK_PEDESTAL_TABLE);
                        entries.add(ModBlocks.BLACK_VINTAGE_CHAIR);
                        entries.add(ModBlocks.BLACK_VINTAGE_STOOL);
                        entries.add(ModBlocks.BRIGHT_WALL_LIGHT);
                        entries.add(ModBlocks.DUPLEX_WOODEN_FENCE);
                        entries.add(ModBlocks.LOW_SANDALWOOD_MEETING_TABLE);
                        entries.add(ModBlocks.SANDALWOOD_BED);
                        entries.add(ModBlocks.SANDALWOOD_MEETING_BOARD);
                        entries.add(ModBlocks.SIMPLE_BLACK_LOUNGE_CHAIR);
                        entries.add(ModBlocks.SMALL_SANDALWOOD_NIGHTSTAND);

                        entries.add(ModBlocks.DUPLEX_BRONZE_FENCE);
                        entries.add(ModBlocks.LOW_TEAK_MEETING_TABLE);
                        entries.add(ModBlocks.PIANO_BLACK_VINTAGE_CHAIR);
                        entries.add(ModBlocks.PIANO_BLACK_VINTAGE_STOOL);
                        entries.add(ModBlocks.SIMPLE_GRAY_LOUNGE_CHAIR);
                        entries.add(ModBlocks.SMALL_TEAK_NIGHTSTAND);
                        entries.add(ModBlocks.TEAK_BED);
                        entries.add(ModBlocks.TEAK_ATTENDANCE_BOARD);
                        entries.add(ModBlocks.WHITE_PEDESTAL_TABLE);
                    }).build());

    public static final ItemGroup SAMI_COUNTRYSIDE_VILLA = Registry.register(Registries.ITEM_GROUP, new Identifier(ArknightsFurniture.MOD_ID, "sami_countryside_villa"),
            ItemGroup.create(null, -1).displayName(Text.translatable("itemGroup.sami_countryside_villa"))
                    .icon(() -> new ItemStack(ModBlocks.CREATURES_REMAINS)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.CREATURES_REMAINS);
                        entries.add(ModBlocks.FUTON_BUNK_BED_BOTTOM);
                        entries.add(ModBlocks.FUTON_BUNK_BED_TOP);
                        entries.add(ModBlocks.HANDMADE_WOOD_BASKET);
                        entries.add(ModBlocks.LOG_BEAM);
                        entries.add(ModBlocks.LOG_CABINET_BOTTOM);
                        entries.add(ModBlocks.LOG_CABINET_TOP1);
                        entries.add(ModBlocks.LOG_CABINET_TOP2);
                        entries.add(ModBlocks.LOG_DINING_CHAIR);
                        entries.add(ModBlocks.LOG_DINING_TABLE);
                        entries.add(ModBlocks.ROCKING_CHAIR_WITH_CUSHION);
                        entries.add(ModBlocks.SPRUCE_WOOD_VIOLIN);
                        entries.add(ModBlocks.VINTAGE_CEILING_FAN);
                        entries.add(ModBlocks.VINTAGE_CEILING_LIGHT);
                    }).build());

    public static void registerItemGroups() {
        ArknightsFurniture.LOGGER.info("Registering item groups...");
    }
}
