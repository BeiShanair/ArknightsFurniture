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
    // region LOGO
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
    // endregion

    // region MATERIAL
    public static final ItemGroup MATERIAL = Registry.register(Registries.ITEM_GROUP, new Identifier(ArknightsFurniture.MOD_ID, "material"),
            ItemGroup.create(null, -1).displayName(Text.translatable("itemGroup.material"))
                    .icon(() -> new ItemStack(ModItems.FURN_PARTS)).entries((displayContext, entries) -> {
                        entries.add(ModItems.FURN_PARTS);
                        entries.add(ModItems.CARDBOARD);
                        entries.add(ModItems.FURN_PARTS_ZIP1);
                        entries.add(ModItems.FURN_PARTS_ZIP2);
                        entries.add(ModItems.TAPE);
                        entries.add(ModItems.DAMAGED_DEVICE);
                        entries.add(ModItems.DIKETON);
                        entries.add(ModItems.ESTER);
                        entries.add(ModItems.ORIROCK);
                        entries.add(ModItems.ORIRON_SHARD);
                        entries.add(ModItems.SUGAR_SUBSTITUTE);
                        entries.add(ModItems.DEVICE);
                        entries.add(ModItems.ORIROCK_CUBE);
                        entries.add(ModItems.ORIRON);
                        entries.add(ModItems.POLYESTER);
                        entries.add(ModItems.POLYKETON);
                        entries.add(ModItems.SUGAR);
//                        entries.add(ModItems.SEAT_SUMMON_ITEM_BLOCK);
//                        entries.add(ModItems.SEAT_SUMMON_ITEM_SLAB);
                    }).build());
    // endregion

    // region WAREHOUSE
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
                        entries.add(ModBlocks.LARGE_SHELF_EMPTY);
                        entries.add(ModBlocks.PALLET);
                        entries.add(ModBlocks.PILE_OF_CARTONS);
                        entries.add(ModBlocks.PORTABLE_CALCULATOR);
                        entries.add(ModBlocks.POST_IT_NOTE);
                        entries.add(ModBlocks.CEILING_ROW_LIGHT);
                        entries.add(ModBlocks.CONCRETE_WALL);
                        entries.add(ModBlocks.DORMITORY_DOOR_FRAMES);
                        entries.add(ModBlocks.REINFORCED_CONCRETE_WALLS);
                    }).build());
    // endregion

    // region SIDE_LINE
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
                        entries.add(ModBlocks.CHECKERBOARD_BOOKCASE_BBL);
                        entries.add(ModBlocks.BLACK_OFFICE_CHAIR);
                        entries.add(ModBlocks.SIMPLE_BLACK_CABINET);
                        entries.add(ModBlocks.SIMPLE_BLACK_DESK_LBL);
                        entries.add(ModBlocks.GRAY_FIBER_CARPET);
                        entries.add(ModBlocks.GRAYISH_WALL_BBL);
                        entries.add(ModBlocks.GRAYISH_WALL_TBL);
                        entries.add(ModBlocks.SMALL_CEILING_LIGHT);

                        entries.add(ModBlocks.ORANGE_WALL_LIGHT);
                        entries.add(ModBlocks.SIMPLE_ORANGE_CLOCK);
                        entries.add(ModBlocks.ORANGE_HD_TV);
                        entries.add(ModBlocks.ORANGE_NIGHTSTAND);
                        entries.add(ModBlocks.ORANGE_BED);
                        entries.add(ModBlocks.SMALL_NOTICEBOARD);
                        entries.add(ModBlocks.ORANGE_SQUARE_TABLE);
                        entries.add(ModBlocks.LOW_ORANGE_SOFA);
                        entries.add(ModBlocks.ORANGE_CHECKERBOARD_BOOKCASE_BBL);
                        entries.add(ModBlocks.ORANGE_SWIVEL_CHAIR);
                        entries.add(ModBlocks.SIMPLE_ORANGE_CABINET);
                        entries.add(ModBlocks.SIMPLE_ORANGE_DESK_LBL);
                    }).build());
    // endregion

    // region FANTASTIC BIO-DOCUMENTARY
    public static final ItemGroup FANTASTIC_BIO_DOCUMENTARY = Registry.register(Registries.ITEM_GROUP, new Identifier(ArknightsFurniture.MOD_ID, "fantastic_bio-documentary"),
            ItemGroup.create(null, -1).displayName(Text.translatable("itemGroup.fantastic_bio-documentary"))
                    .icon(() -> new ItemStack(ModBlocks.WIRE_SIDE_TABLE)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.BROWN_BEAN_BAG_SOFA);
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
                        entries.add(ModBlocks.WIDE_GRAY_CARPET_LEFT);
                        entries.add(ModBlocks.UNKNOWN_SPECIMENS);
                        entries.add(ModBlocks.METALLIC_WALLPAPER_BOTTOM);
                        entries.add(ModBlocks.METALLIC_WALLPAPER_LB);
                        entries.add(ModBlocks.COPPER_FLOOR_FRONT);
                        entries.add(ModBlocks.UNKNOWN_BONES);
                    }).build());
    // endregion

    // region NO.12 LIFE CYCLE CABIN
    public static final ItemGroup NO_12_LIFE_CYCLE_CABIN = Registry.register(Registries.ITEM_GROUP, new Identifier(ArknightsFurniture.MOD_ID, "no_12_life_cycle_cabin"),
            ItemGroup.create(null, -1).displayName(Text.translatable("itemGroup.no_12_life_cycle_cabin"))
                    .icon(() -> new ItemStack(ModBlocks.GENERAL_CONSOLE)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.ANTI_EXPLOSION_TRASH_CAN);
                        entries.add(ModBlocks.BLACK_FIBER_CARPET);
                        entries.add(ModBlocks.BLACK_HANGING_BASKET);
                        entries.add(ModBlocks.BUILT_IN_FILE_CABINET1);
                        entries.add(ModBlocks.BUILT_IN_FILE_CABINET2);
                        entries.add(ModBlocks.BUNK_BED_IN_CABIN_TOP);
                        entries.add(ModBlocks.BUNK_BED_IN_CABIN_BOTTOM);
                        entries.add(ModBlocks.CABIN_FIRE_EXTINGUISHER_KIT);
                        entries.add(ModBlocks.CABIN_FLUSH_MOUNT_PIPE_LEFT);
                        entries.add(ModBlocks.CABIN_FLUSH_MOUNT_PIPE_RIGHT);
                        entries.add(ModBlocks.CONTROL_DISPLAY);
                        entries.add(ModBlocks.DIY_SWIVEL_CHAIR);
                        entries.add(ModBlocks.DIY_WORKBENCH_LEFT);
                        entries.add(ModBlocks.DIY_WORKBENCH_RIGHT);
                        entries.add(ModItems.FIRE_EXTINGUISHER);
                        entries.add(ModBlocks.GENERAL_CONSOLE);
                        entries.add(ModBlocks.LIGHT_GREEN_WALLPAPER);
                        entries.add(ModBlocks.LIGHT_GREEN_WALLPAPER_FLOOR_MIDDLE);
                        entries.add(ModBlocks.LIGHT_GREEN_WALLPAPER_FLOOR_RIGHT);
                        entries.add(ModBlocks.LIGHT_GREEN_WALLPAPER_REFUGE);
                        entries.add(ModBlocks.LIGHT_GREEN_WALLPAPER_REFUGE2);
                        entries.add(ModBlocks.LIGHT_GREEN_WALLPAPER_RIGHT);
                        entries.add(ModBlocks.NOTE_BOARD_IN_CABIN_DISPLAY);
                        entries.add(ModBlocks.NOTE_BOARD_IN_CABIN_SIGN);
                        entries.add(ModBlocks.POWER_BOX);
                        entries.add(ModBlocks.SUCK_BEVERAGES);
                    }).build());
    // endregion

    // region COLUMBIAN CAFE
    public static final ItemGroup COLUMBIAN_CAFE = Registry.register(Registries.ITEM_GROUP, new Identifier(ArknightsFurniture.MOD_ID, "columbian_cafe"),
            ItemGroup.create(null, -1).displayName(Text.translatable("itemGroup.columbian_cafe"))
                    .icon(() -> new ItemStack(ModBlocks.BOLIVARIAN_COFFEE_BEAN)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.BAR_CEILING);
                        entries.add(ModBlocks.BARSTOOL_WITH_CURVED_LEGS);
                        entries.add(ModBlocks.BEVERAGE_CABINET_COFFEE);
                        entries.add(ModBlocks.BEVERAGE_CABINET_EMPTY);
                        entries.add(ModBlocks.BEVERAGE_MENU);
                        entries.add(ModBlocks.BOLIVARIAN_COFFEE_BEAN);
                        entries.add(ModBlocks.BRICK_PATTERN_WALLPAPER);
                        entries.add(ModBlocks.BRICK_PATTERN_WALLPAPER_FLOOR);
                        entries.add(ModBlocks.BROWN_BOOKCASE_LB);
                        entries.add(ModBlocks.COLUMBIAN_STREET_VIEW_PHOTO);
                        entries.add(ModBlocks.COFFEE_BEAN_DISPLAY);
                        entries.add(ModBlocks.COFFEE_BEAN_CAN);
                        entries.add(ModBlocks.COFFEE_MENU);
                        entries.add(ModBlocks.DINING_CHAIR);
                        entries.add(ModBlocks.PEDESTAL_COFFEE_TABLE);
                        entries.add(ModBlocks.PENDANT_LIGHT);
                        entries.add(ModBlocks.POTTED_LONG_LEAF_PLANT);
                        entries.add(ModBlocks.RED_BRICK_CAFE_BAR);
                        entries.add(ModBlocks.RED_BROWN_CABINET);
                        entries.add(ModBlocks.SOFT_CEILING_LIGHT);
                        entries.add(ModBlocks.WOOD_ORNAMENT);
                        entries.add(ModBlocks.CAFE_FLOOR);
                    }).build());
    // endregion

    // region FAUX LUNG MEN LOUNGE
    public static final ItemGroup LDG_LOUNGE = Registry.register(Registries.ITEM_GROUP, new Identifier(ArknightsFurniture.MOD_ID, "ldg_faux_lungmen_lounge"),
            ItemGroup.create(null, -1).displayName(Text.translatable("itemGroup.ldg_faux_lungmen_lounge"))
                    .icon(() -> new ItemStack(ModBlocks.BLACK_PEDESTAL_TABLE)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.BLACK_PEDESTAL_TABLE);
                        entries.add(ModBlocks.BLACK_VINTAGE_CHAIR);
                        entries.add(ModBlocks.BLACK_VINTAGE_STOOL);
                        entries.add(ModBlocks.BRIGHT_WALL_LIGHT);
                        entries.add(ModBlocks.DUPLEX_WOODEN_FENCE_TOP);
                        entries.add(ModBlocks.DUPLEX_WOODEN_FENCE_BOTTOM);
                        entries.add(ModBlocks.DUPLEX_WOODEN_FENCE_BOTTOM_LIGHT);
                        entries.add(ModBlocks.LOW_SANDALWOOD_MEETING_TABLE);
                        entries.add(ModBlocks.SANDALWOOD_BED);
                        entries.add(ModBlocks.SANDALWOOD_MEETING_BOARD);
                        entries.add(ModBlocks.SIMPLE_BLACK_LOUNGE_CHAIR);
                        entries.add(ModBlocks.SMALL_SANDALWOOD_NIGHTSTAND);
                        entries.add(ModBlocks.GRAY_WOOL_CARPET_LEFT);
                        entries.add(ModBlocks.PAINTING_WITH_SANDALWOOD_FRAME);

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
    // endregion

    // region SAMI COUNTRYSIDE VILLA
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
    // endregion

    // region EXPRESS CHAIN PIZZERIA
    public static final ItemGroup EXPRESS_CHAIN_PIZZERIA = Registry.register(Registries.ITEM_GROUP, new Identifier(ArknightsFurniture.MOD_ID, "express_chain_pizzeria"),
            ItemGroup.create(null, -1).displayName(Text.translatable("itemGroup.express_chain_pizzeria"))
                    .icon(() -> new ItemStack(ModBlocks.PIZZERIA_POSTER_STAND)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.DINING_PLATE);
                        entries.add(ModBlocks.PIZZA_BOWL);
                        entries.add(ModBlocks.PIZZA_BOX);
                        entries.add(ModBlocks.PIZZA_MENU1);
                        entries.add(ModBlocks.PIZZA_MENU2);
                        entries.add(ModBlocks.PIZZERIA_BLACK_COUNTER);
                        entries.add(ModBlocks.PIZZERIA_CUPBOARD);
                        entries.add(ModBlocks.PIZZERIA_DINING_CHAIR);
                        entries.add(ModBlocks.PIZZERIA_EXIT_SIGN);
                        entries.add(ModBlocks.PIZZERIA_HIGH_STOOL);
                        entries.add(ModBlocks.PIZZERIA_MOVEABLE_TABLE);
                        entries.add(ModBlocks.PIZZERIA_POSTER_COLUMN);
                        entries.add(ModBlocks.PIZZERIA_PLATE_RACK);
                        entries.add(ModBlocks.PIZZERIA_POSTER_STAND);
                        entries.add(ModBlocks.PIZZERIA_SOFT_CEILING_LIGHT);
                    }).build());
    // endregion

    // region MODERN COLUMBIAN HOTEL
    public static final ItemGroup MODERN_COLUMBIAN_HOTEL = Registry.register(Registries.ITEM_GROUP, new Identifier(ArknightsFurniture.MOD_ID, "modern_columbian_hotel"),
            ItemGroup.create(null, -1).displayName(Text.translatable("itemGroup.modern_columbian_hotel"))
                    .icon(() -> new ItemStack(ModBlocks.WILLIAMS_GRAND_PIANO_SET)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.BARSTOOL);
                        entries.add(ModBlocks.BILLBOARD_JUKEBOX);
                        entries.add(ModBlocks.BLACK_AND_GOLDEN_FREEZER);
                        entries.add(ModBlocks.MODERN_HOTEL_CEILING_LIGHT);
                        entries.add(ModBlocks.MODERN_HOTEL_CHANDELIER);
                        entries.add(ModBlocks.MODERN_HOTEL_FLOOR_LAMP);
                        entries.add(ModBlocks.MODERN_HOTEL_SOFA);
                        entries.add(ModBlocks.MODERN_HOTEL_TABLE);
                        entries.add(ModBlocks.MODERN_HOTEL_WALL_LAMP);
                        entries.add(ModBlocks.MODERN_WALL_DECORATION);
                        entries.add(ModBlocks.MOUNTED_BAR_CEILING1);
                        entries.add(ModBlocks.MOUNTED_BAR_CEILING2);
                        entries.add(ModBlocks.VERSATILE_BAR_STAND);
                        entries.add(ModBlocks.WILLIAMS_GRAND_PIANO_SET);
                    }).build());
    // endregion

    // region CHEN'S OFFICE
    public static final ItemGroup CHENS_OFFICE = Registry.register(Registries.ITEM_GROUP, new Identifier(ArknightsFurniture.MOD_ID, "chens_office"),
            ItemGroup.create(null, -1).displayName(Text.translatable("itemGroup.chens_office"))
                    .icon(() -> new ItemStack(ModBlocks.CHENS_CERTIFICATE_OF_HONOR)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.CHENS_CERTIFICATE_OF_HONOR);
                        entries.add(ModBlocks.CHENS_CHAIR);
                        entries.add(ModBlocks.CHENS_DESK);
                        entries.add(ModBlocks.CHENS_WEAPON_RACK);
                        entries.add(ModBlocks.FILE1);
                        entries.add(ModBlocks.FILE2);
                        entries.add(ModBlocks.LGD_BOOKCASE);
                        entries.add(ModBlocks.LGD_DAYLIGHT_LIGHT);
                        entries.add(ModBlocks.LGD_FLUORESCENT_LIGHT);
                        entries.add(ModBlocks.LGD_SPECIAL_DUMMY);
                        entries.add(ModBlocks.LGD_SPOTLIGHT);
                        entries.add(ModBlocks.LGD_SUPINE_PLATE);
                        entries.add(ModBlocks.LGD_TRASH_CAN);
                        entries.add(ModBlocks.OFFICE_CLUE_BOARD);
                        entries.add(ModBlocks.POTTED_CACTUS_PLANT);
                    }).build());
    // endregion

    // region SIESTA BEACH HUT
    public static final ItemGroup SIESTA_BEACH_HUT = Registry.register(Registries.ITEM_GROUP, new Identifier(ArknightsFurniture.MOD_ID, "siesta_beach_hut"),
            ItemGroup.create(null, -1).displayName(Text.translatable("itemGroup.siesta_beach_hut"))
                    .icon(() -> new ItemStack(ModBlocks.RHODES_ISLAND_SUMMER_CALENDAR)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.BEACH_HOUSE_FLOOR_LAMP);
                        entries.add(ModBlocks.BLUE_AND_WHITE_CANVAS_CURTAINS_LEFT);
                        entries.add(ModBlocks.BLUE_AND_WHITE_CANVAS_CURTAINS_RIGHT);
                        entries.add(ModBlocks.LAZY_BENCH);
                        entries.add(ModBlocks.LAZY_COFFEE_TABLE);
                        entries.add(ModBlocks.LAZY_HIGH_TEA_TABLE);
                        entries.add(ModBlocks.LAZY_LOUNGE_CHAIR);
                        entries.add(ModBlocks.RHODES_ISLAND_SUMMER_CALENDAR);
                        entries.add(ModBlocks.SIESTA_COAT_OF_ARMS_SOUVENIR);
                        entries.add(ModBlocks.SUMMER_BOAT_CABINET_BOTTOM);
                        entries.add(ModBlocks.SUMMER_BOAT_CABINET_TOP);
                        entries.add(ModBlocks.SUMMER_COLLECTION_SHELF);
                        entries.add(ModBlocks.SUMMER_COLLECTION_SHELF_CHAIR);
                        entries.add(ModBlocks.SURFBOARD_STAND);
                        entries.add(ModBlocks.WOODEN_BEAM);
                    }).build());
    // endregion

    // region RHODES ISLAND MODERN MUSIC REHEARSAL ROOM
    public static final ItemGroup RHODES_ISLAND_MODERN_MUSIC_REHEARSAL_ROOM = Registry.register(Registries.ITEM_GROUP, new Identifier(ArknightsFurniture.MOD_ID, "rhodes_island_modern_music_rehearsal_room"),
            ItemGroup.create(null, -1).displayName(Text.translatable("itemGroup.rhodes_island_modern_music_rehearsal_room"))
                    .icon(() -> new ItemStack(ModBlocks.YARMAHAN_DRUM_SET)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.AMBER);
                        entries.add(ModBlocks.BIRCH);
                        entries.add(ModBlocks.DARK_CLOUD);
                        entries.add(ModBlocks.DARK_STEEL);
                        entries.add(ModBlocks.DRIFTWOOD);
                        entries.add(ModBlocks.FLAME);
                        entries.add(ModBlocks.GRIT);
                        entries.add(ModBlocks.HANGING_SCROLLING_DISPLAY);
                        entries.add(ModBlocks.REHEARSAL_ROOM_ACCESSORY_SHELF);
                        entries.add(ModBlocks.REHEARSAL_ROOM_BELT_SHELF);
                        entries.add(ModBlocks.REHEARSAL_ROOM_BENCH);
                        entries.add(ModBlocks.REHEARSAL_ROOM_RECEPTION_DESK);
                        entries.add(ModBlocks.REHEARSAL_ROOM_ROUND_BENCH);
                        entries.add(ModBlocks.REHEARSAL_ROOM_SPOTLIGHT);
                        entries.add(ModBlocks.SHALLOW_SEA);
                        entries.add(ModBlocks.SPOTLIGHT_CEILING);
                        entries.add(ModBlocks.STAGE);
                        entries.add(ModBlocks.TOUR_INSTRUMENT_COMBO);
                        entries.add(ModBlocks.WHEAT);
                        entries.add(ModBlocks.YARMAHAN_DRUM_SET);
                    }).build());
    // endregion

    // region AIRTIGHT ANTI-CHEMICAL SAFETY CABIN
    public static final ItemGroup AIRTIGHT_ANTI_CHEMICAL_SAFETY_CABIN = Registry.register(Registries.ITEM_GROUP, new Identifier(ArknightsFurniture.MOD_ID, "airtight_anti-chemical_safety_cabin"),
            ItemGroup.create(null, -1).displayName(Text.translatable("itemGroup.airtight_anti-chemical_safety_cabin"))
                    .icon(() -> new ItemStack(ModBlocks.CLEANROOM_LORRY)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.CLEANROOM_AIRDUCT);
                        entries.add(ModBlocks.CLEANROOM_AIRFLOW_CONTROL_PIPE);
                        entries.add(ModBlocks.CLEANROOM_ANTIMICROBIAL_LAMP);
                        entries.add(ModBlocks.CLEANROOM_CEILING_LIGHT);
                        entries.add(ModBlocks.CLEANROOM_DISINFECTING_QUARTERS);
                        entries.add(ModBlocks.CLEANROOM_FLUORESCENT_LAMP);
                        entries.add(ModBlocks.CLEANROOM_LORRY);
                        entries.add(ModBlocks.CLEANROOM_MATERIALS_BOX);
                        entries.add(ModBlocks.CLEANROOM_PIPE_VALVE);
                        entries.add(ModBlocks.EMERGENCY_STRETCHER);
                        entries.add(ModBlocks.MULTIFUNCTIONAL_ENGINEERING_SHOVEL);
                        entries.add(ModBlocks.MULTIFUNCTIONAL_STERILIZER);
                        entries.add(ModBlocks.SUPPLY_TANKS);
                    }).build());
    // endregion

    // region REIMSELAR BALLROOM
    public static final ItemGroup REIMSELAR_BALLROOM = Registry.register(Registries.ITEM_GROUP, new Identifier(ArknightsFurniture.MOD_ID, "reimselar_ballroom"),
            ItemGroup.create(null, -1).displayName(Text.translatable("itemGroup.reimselar_ballroom"))
                    .icon(() -> new ItemStack(ModBlocks.LOCKED_CABINET)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.BANQUET_GUEST_SEAT);
                        entries.add(ModBlocks.BANQUET_HOST_SEAT);
                        entries.add(ModBlocks.BANQUET_TABLE);
                        entries.add(ModBlocks.CANDLE_CHANDELIER);
                        entries.add(ModBlocks.CANLELIT_HEARTH);
                        entries.add(ModBlocks.DOUBLE_DECKER_CHANDELIER);
                        entries.add(ModBlocks.LOCKED_CABINET);
                        entries.add(ModBlocks.IONIC_COLUMN_DOWN);
                        entries.add(ModBlocks.IONIC_COLUMN_MIDDLE);
                        entries.add(ModBlocks.IONIC_COLUMN_UP);
                        entries.add(ModBlocks.REIMSELAR_BRAZIER);
                        entries.add(ModBlocks.REIMSELAR_GUARDS_BUST);
                        entries.add(ModBlocks.REIMSELAR_MAGIC_MIRROR);
                        entries.add(ModBlocks.REIMSELAR_STOOL);
                    }).build());
    // endregion

    // region SECRET OCCULT SOCIETY
    public static final ItemGroup SECRET_OCCULT_SOCIETY = Registry.register(Registries.ITEM_GROUP, new Identifier(ArknightsFurniture.MOD_ID, "secret_occult_society"),
            ItemGroup.create(null, -1).displayName(Text.translatable("itemGroup.secret_occult_society"))
                    .icon(() -> new ItemStack(ModBlocks.STACK_OF_GRIMOIRES)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.BOARDED_UP_STONE_WINDOWS);
                        entries.add(ModBlocks.CAULDRON_OF_SWEETS);
                        entries.add(ModBlocks.DESK_OF_THE_OCCULT);
                        entries.add(ModBlocks.ELEGANT_SEAT);
                        entries.add(ModBlocks.MANY_RITUAL_GOURDS);
                        entries.add(ModBlocks.RITUAL_CHANDELIER);
                        entries.add(ModBlocks.SEVERAL_RITUAL_GOURDS);
                        entries.add(ModBlocks.STACK_OF_GRIMOIRES);
                        entries.add(ModBlocks.STRANGE_BED);
                        entries.add(ModBlocks.STRANGE_BED_LIGHT);
                        entries.add(ModBlocks.STRANGE_BED_TREE);
                    }).build());
    // endregion

    // region PENGUIN LOGISTICS SAFEHOUSE
    public static final ItemGroup PENGUIN_LOGISTICS_SAFEHOUSE = Registry.register(Registries.ITEM_GROUP, new Identifier(ArknightsFurniture.MOD_ID, "penguin_logistics_safehouse"),
            ItemGroup.create(null, -1).displayName(Text.translatable("itemGroup.penguin_logistics_safehouse"))
                    .icon(() -> new ItemStack(ModBlocks.SAFEHOUSE_PARTITION_DOOR)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.ADJUSTABLE_ROUND_STOOL);
                        entries.add(ModBlocks.COLLECTIBLE_BEVERAGE_DISPENSER);
                        entries.add(ModBlocks.COMFORTABLE_SOFA);
                        entries.add(ModBlocks.FLUORESCENT_CEILING_LAMP);
                        entries.add(ModBlocks.HIGH_POWER_FLOOR_LAMP);
                        entries.add(ModBlocks.MULTIFUNCTIONAL_WORKBENCH);
                        entries.add(ModBlocks.MULTIFUNCTIONAL_WORKBENCH_BOARD);
                        entries.add(ModBlocks.MULTIFUNCTIONAL_WORKBENCH_COMPUTER);
                        entries.add(ModBlocks.OLD_RECORD_PLAYER);
                        entries.add(ModBlocks.OUTGOING_SHIPMENTS);
                        entries.add(ModBlocks.PENGUIN_CLUE_COLLECTION_BOARD);
                        entries.add(ModBlocks.RED_SUNDRIES_SHELVES1);
                        entries.add(ModBlocks.RED_SUNDRIES_SHELVES2);
                        entries.add(ModBlocks.RED_SUNDRIES_SHELVES3);
                        entries.add(ModBlocks.SAFEHOUSE_PARTITION_DOOR);
                    }).build());
    // endregion

    // region RHODES ISLAND WORKSTATION
    public static final ItemGroup RHODES_ISLAND_WORKSTATION = Registry.register(Registries.ITEM_GROUP, new Identifier(ArknightsFurniture.MOD_ID, "rhodes_island_workstation"),
            ItemGroup.create(null, -1).displayName(Text.translatable("itemGroup.rhodes_island_workstation"))
                    .icon(() -> new ItemStack(ModBlocks.ROBOTIC_ARM)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.CEILING_FLOODLIGHTS);
                        entries.add(ModBlocks.CLEANSER);
                        entries.add(ModBlocks.DUAL_BEAMED_CRANE);
                        entries.add(ModBlocks.INDUSTRIAL_CUTTING_STATION);
                        entries.add(ModBlocks.MATERIAL_CRATES);
                        entries.add(ModBlocks.ROBOTIC_ARM);
                        entries.add(ModBlocks.WEAPON_STORAGE_CABINET);
                        entries.add(ModBlocks.WHITE_ROUND_STOOL);
                        entries.add(ModBlocks.WORKBENCH);
                        entries.add(ModBlocks.WORKSTATION_BLACKBOARD);
                    }).build());
    // endregion

    // region LUNG MEN EATERY
    public static final ItemGroup LUNGMEN_EATERY = Registry.register(Registries.ITEM_GROUP, new Identifier(ArknightsFurniture.MOD_ID, "lungmen_eatery"),
            ItemGroup.create(null, -1).displayName(Text.translatable("itemGroup.lungmen_eatery"))
                    .icon(() -> new ItemStack(ModBlocks.INSCRIPTION_CEILING_PLAQUE_LONG)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.BAMBOO_SCREEN);
                        entries.add(ModBlocks.BOILING_STATION);
                        entries.add(ModBlocks.BOILING_STATION_POT);
                        entries.add(ModBlocks.CEILING_MOUNTED_LIGHTS);
                        entries.add(ModBlocks.EATERY_DINING_TABLE);
                        entries.add(ModBlocks.EATERY_ROUND_STOOL);
                        entries.add(ModBlocks.ELECTRIC_FRYING_TABLE);
                        entries.add(ModBlocks.HALF_SHUT_SCREEN);
                        entries.add(ModBlocks.HEXAGONAL_LANTERN);
                        entries.add(ModBlocks.INSCRIPTION_CEILING_PLAQUE);
                        entries.add(ModBlocks.INSCRIPTION_CEILING_PLAQUE_FANG);
                        entries.add(ModBlocks.INSCRIPTION_CEILING_PLAQUE_JIAO);
                        entries.add(ModBlocks.INSCRIPTION_CEILING_PLAQUE_LEFT);
                        entries.add(ModBlocks.INSCRIPTION_CEILING_PLAQUE_LONG);
                        entries.add(ModBlocks.INSCRIPTION_CEILING_PLAQUE_MENG);
                        entries.add(ModBlocks.INSCRIPTION_CEILING_PLAQUE_MENU1);
                        entries.add(ModBlocks.INSCRIPTION_CEILING_PLAQUE_MENU2);
                        entries.add(ModBlocks.INSCRIPTION_CEILING_PLAQUE_RIGHT);
                        entries.add(ModBlocks.INSCRIPTION_CEILING_PLAQUE_ZI);
                        entries.add(ModBlocks.ORNAMENTAL_BONSAI);
                        entries.add(ModBlocks.ORNAMENTAL_PLANT);
                        entries.add(ModBlocks.RECTANGULAR_BENCH);
                        entries.add(ModBlocks.SMALL_SPOTLIGHT);
                        entries.add(ModBlocks.WOODEN_CORNER_TABLE);
                    }).build());
    // endregion

    // region HEALTHY DINER
    public static final ItemGroup HEALTHY_DINER = Registry.register(Registries.ITEM_GROUP, new Identifier(ArknightsFurniture.MOD_ID, "healthy_diner"),
            ItemGroup.create(null, -1).displayName(Text.translatable("itemGroup.healthy_diner"))
                    .icon(() -> new ItemStack(ModBlocks.TODAYS_RECOMMENDATIONS)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.FRESH_FOOD_CABINET);
                        entries.add(ModBlocks.GARDEN_STYLE_CEILING_FIXTURE);
                        entries.add(ModBlocks.GREEN_TWO_SEAT_SOFA);
                        entries.add(ModBlocks.HEALTHY_DECORATIVE_PLATE);
                        entries.add(ModBlocks.HEALTHY_DINING_TABLE);
                        entries.add(ModBlocks.HEALTHY_MENU);
                        entries.add(ModBlocks.HEALTHY_SERVICE_COUNTER);
                        entries.add(ModBlocks.HEALTHY_SERVICE_COUNTER_CASHIER);
                        entries.add(ModBlocks.HEALTHY_SPOTLIGHT);
                        entries.add(ModBlocks.ICEY_JUICER);
                        entries.add(ModBlocks.SELF_SERVICE_ORDERING_KIOSK);
                        entries.add(ModBlocks.TODAYS_RECOMMENDATIONS);
                        entries.add(ModBlocks.VENDING_MACHINE);
                    }).build());
    // endregion

    // region SEVEN CITIES STYLE RESTAURANT
    public static final ItemGroup SEVEN_CITIES_STYLE_RESTAURANT = Registry.register(Registries.ITEM_GROUP, new Identifier(ArknightsFurniture.MOD_ID, "seven_cities_style_restaurant"),
            ItemGroup.create(null, -1).displayName(Text.translatable("itemGroup.seven_cities_style_restaurant"))
                    .icon(() -> new ItemStack(ModBlocks.LARGE_NOTICE_BOARD)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.DOUBLE_ROW_SEATING);
                        entries.add(ModBlocks.DOUBLE_ROW_SEATING_DESK);
                        entries.add(ModBlocks.GOURMET_FOOD_WARMER);
                        entries.add(ModBlocks.LARGE_NOTICE_BOARD);
                        entries.add(ModBlocks.LIQUOR_STORAGE_RACK);
                        entries.add(ModBlocks.PRISTINE_SERVICE_COUNTER);
                        entries.add(ModBlocks.RESTAURANT_NOTICE_BOARD);
                        entries.add(ModBlocks.SEVEN_CITIES_WARM_LIGHT_CHANDELIER);
                        entries.add(ModBlocks.UPSCALE_MENU_DISPLAY);
                    }).build());
    // endregion

    // region SARKAZ MERCENARY LOUNGE
    public static final ItemGroup SARKAZ_MERCENARY_LOUNGE = Registry.register(Registries.ITEM_GROUP, new Identifier(ArknightsFurniture.MOD_ID, "sarkaz_mercenary_lounge"),
            ItemGroup.create(null, -1).displayName(Text.translatable("itemGroup.sarkaz_mercenary_lounge"))
                    .icon(() -> new ItemStack(ModBlocks.SARKAZ_BALL_RACK)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.BOUNTY_DISPLAY_RACK);
                        entries.add(ModBlocks.BULLETPROOF_GLASS_DOOR);
                        entries.add(ModBlocks.HANGING_DARTBOARD);
                        entries.add(ModBlocks.HANGING_SHELVES);
                        entries.add(ModBlocks.HIGH_OUTPUT_EXPLOSIVE_MATERIAL);
                        entries.add(ModBlocks.IGNITION_TOOL);
                        entries.add(ModBlocks.LOUNGE_BULLETIN_BOARD);
                        entries.add(ModBlocks.LOUNGE_CEILING_LIGHT_FIXTURE);
                        entries.add(ModBlocks.LOUNGE_CHANDELIER);
                        entries.add(ModBlocks.LOUNGE_TUBE_LIGHT);
                        entries.add(ModBlocks.RED_FRAMED_FLOOR_MIRROR);
                        entries.add(ModBlocks.SARKAZ_BALL_RACK);
                        entries.add(ModBlocks.SARKAZ_POOL_TABLE);
                        entries.add(ModBlocks.SMALL_LOUNGE_WALL_LIGHT);
                        entries.add(ModBlocks.UPSCALE_DINING_TABLE);
                    }).build());
    // endregion

    // region URUSUS STUDENT CLUBROOM
    public static final ItemGroup URSUS_STUDENT_CLUBROOM = Registry.register(Registries.ITEM_GROUP, new Identifier(ArknightsFurniture.MOD_ID, "ursus_student_clubroom"),
            ItemGroup.create(null, -1).displayName(Text.translatable("itemGroup.ursus_student_clubroom"))
                    .icon(() -> new ItemStack(ModBlocks.SQUAD_BULLETIN_BOARD)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.CEILING_DISK_LIGHT);
                        entries.add(ModBlocks.HANGING_LAMP);
                        entries.add(ModBlocks.LONG_WOODEN_TABLE);
                        entries.add(ModBlocks.LOW_BOOKSHELF);
                        entries.add(ModBlocks.LOW_FLOOR_LAMP);
                        entries.add(ModBlocks.LOW_STORAGE_CABINET);
                        entries.add(ModBlocks.PORTABLE_PICNIC_STOVE);
                        entries.add(ModBlocks.SIMPLE_LOW_CHAIR);
                        entries.add(ModBlocks.SQUAD_BULLETIN_BOARD);
                    }).build());
    // endregion

    // region LEITHANIAN NIGHTS
    public static final ItemGroup LEITHANIAN_NIGHTS = Registry.register(Registries.ITEM_GROUP, new Identifier(ArknightsFurniture.MOD_ID, "leithanian_nights"),
            ItemGroup.create(null, -1).displayName(Text.translatable("itemGroup.leithanian_nights"))
                    .icon(() -> new ItemStack(ModBlocks.MONOCHROMATIC_CELLO)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.ACCOMPANISTS_CHAIR);
                        entries.add(ModBlocks.ALL_IN_ONE_BOOKSHELF);
                        entries.add(ModBlocks.ALL_IN_ONE_BOOKSHELF_BOTTOM);
                        entries.add(ModBlocks.ALL_IN_ONE_BOOKSHELF_UPPER);
                        entries.add(ModBlocks.ANTIQUE_PHONOGRAPH);
                        entries.add(ModBlocks.EXTRA_LONG_WHITE_SOFA);
                        entries.add(ModBlocks.FOUR_CANDLE_CHANDELIER);
                        entries.add(ModBlocks.FOUR_POSTER_BED);
                        entries.add(ModBlocks.GLOBE_OF_BALANCE);
                        entries.add(ModBlocks.GRAND_SIX_CANDLE_CHANDELIER);
                        entries.add(ModBlocks.LEITHANIAN_BEVERAGE);
                        entries.add(ModBlocks.MONOCHROMATIC_CELLO);
                        entries.add(ModBlocks.PILE_OF_MISCELLANEOUS_BOOKS);
                    }).build());
    // endregion

    // region RHODES ISLAND HR OFFICE
    public static final ItemGroup RHODES_ISLAND_HR_OFFICE = Registry.register(Registries.ITEM_GROUP, new Identifier(ArknightsFurniture.MOD_ID, "rhodes_island_hr_office"),
            ItemGroup.create(null, -1).displayName(Text.translatable("itemGroup.rhodes_island_hr_office"))
                    .icon(() -> new ItemStack(ModBlocks.CUBICLE_FLOORPLAN)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.CUBICLE_FLOORPLAN);
                        entries.add(ModBlocks.CUBICLE_LIGHTING);
                        entries.add(ModBlocks.FLOOR_INDICATOR);
                        entries.add(ModBlocks.HR_OFFICE_LIGHTING);
                        entries.add(ModBlocks.OVERLOADED_PRINTER);
                        entries.add(ModBlocks.PRICKLY_ORNAMENTAL_PLANT);
                        entries.add(ModBlocks.SQUARE_SOFA_STOOL);
                        entries.add(ModBlocks.STANDARD_ISSUE_OFFICE_CHAIR);
                        entries.add(ModBlocks.STANDARD_ISSUE_WORKDESK);
                        entries.add(ModBlocks.STANDARD_ISSUE_WORKDESK_COMPUTER);
                        entries.add(ModBlocks.TRANSPARENT_DIVIDING_PARTITION);
                        entries.add(ModBlocks.WATER_DISPENSER);
                        entries.add(ModBlocks.WHEELED_STORAGE_CABINET);
                    }).build());
    // endregion

    // region TRIBAL STYLE INN
    public static final ItemGroup TRIBAL_STYLE_INN = Registry.register(Registries.ITEM_GROUP, new Identifier(ArknightsFurniture.MOD_ID, "tribal_style_inn"),
            ItemGroup.create(null, -1).displayName(Text.translatable("itemGroup.tribal_style_inn"))
                    .icon(() -> new ItemStack(ModBlocks.CUBICLE_FLOORPLAN)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.TOTEM_POT);
                        entries.add(ModBlocks.TOTEM_SPEAKERS);
                        entries.add(ModBlocks.TRIBAL_DECORATIVE_CHANDELIER);
                        entries.add(ModBlocks.TRIBAL_LOFT_BED);
                        entries.add(ModBlocks.TRIBAL_STONE_STAND);
                        entries.add(ModBlocks.TRIBAL_STYLE_SOFA);
                        entries.add(ModBlocks.TROPICAL_POTTED_PLANT);
                    }).build());
    // endregion
    public static void registerItemGroups() {
        ArknightsFurniture.LOGGER.info("Registering item groups...");
    }
}
