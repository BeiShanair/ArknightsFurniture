package com.besson.arknights.datagen;

import com.besson.arknights.block.ModBlocks;
import com.besson.arknights.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;

public class ModModelsProvider extends FabricModelProvider {
    public ModModelsProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.AIR_MATTRESS);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ATTENDANCE_BOARD);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CARGO_TROLLEY);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CARTON);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CARTON_STOOL);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.GRAFFITI);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.LARGE_SHELF1);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.LARGE_SHELF2);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.LARGE_SHELF3);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.LARGE_SHELF4);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.PALLET);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.PILE_OF_CARTONS);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.PORTABLE_CALCULATOR);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.POST_IT_NOTE);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.GRAYISH_WALL_LIGHT);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SIMPLE_BLACK_CLOCK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BLACK_HD_TV);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BLACK_NIGHTSTAND);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BLACK_BED);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SMALL_CALLBOARD);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BLACK_AND_WHITE_SQUARE_TABLE);
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.LOW_BLACK_AND_WHITE_SOFA, ModelIds.getBlockModelId(ModBlocks.LOW_BLACK_AND_WHITE_SOFA));
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CHECKERBOARD_BOOKCASE1);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CHECKERBOARD_BOOKCASE2);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CHECKERBOARD_BOOKCASE3);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SIMPLE_BLACK_CABINET);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BLACK_OFFICE_CHAIR);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SIMPLE_BLACK_DESK_LEFT);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SIMPLE_BLACK_DESK_RIGHT);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ORANGE_WALL_LAMP);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SIMPLE_ORANGE_CLOCK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ORANGE_HD_TV);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ORANGE_NIGHTSTAND);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ORANGE_BED);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SMALL_NOTICEBOARD);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ORANGE_SQUARE_TABLE);
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.LOW_ORANGE_SOFA, ModelIds.getBlockModelId(ModBlocks.LOW_ORANGE_SOFA));
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ORANGE_CHECKERBOARD_BOOKCASE1);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ORANGE_CHECKERBOARD_BOOKCASE2);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ORANGE_CHECKERBOARD_BOOKCASE3);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ORANGE_SWIVEL_CHAIR);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SIMPLE_ORANGE_CABINET);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SIMPLE_ORANGE_DESK_LEFT);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SIMPLE_ORANGE_DESK_RIGHT);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BROWN_BEAN_BAG_SOFA);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ECO_EXHIBITION_CABINET);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ECO_EXHIBITION_CABINET_BASE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.FLUSH_MOUNT_RECTANGLE_CEILING_LIGHT);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.FLUSH_MOUNT_SQUARE_CEILING_LIGHT);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.METALLIC_BED);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.POTTED_BROADLEAF_PLANT);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.POTTED_CONIFER_PLANT);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.POTTED_SUCCULENT_PLANT);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SMALL_SQUARE_NIGHTSTAND);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SPECIMEN_DATA_BOARD);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.WIRE_SIDE_TABLE);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ANTI_EXPLOSION_TRASH_CAN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BUILT_IN_FILE_CABINET1);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BUILT_IN_FILE_CABINET2);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BUNK_BED_IN_CABIN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CABIN_FIRE_EXTINGUISHER_KIT);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CABIN_FLUSH_MOUNT_PIPE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CONTROL_DISPLAY);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.DIY_SWIVEL_CHAIR);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.DIY_WORKBENCH_LEFT);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.DIY_WORKBENCH_RIGHT);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.GENERAL_CONSOLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.NOTE_BOARD_IN_CABIN);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BAR_CEILING);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BARSTOOL_WITH_CURVED_LEGS);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BEVERAGE_CABINET_COFFEE1);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BEVERAGE_CABINET_COFFEE2);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BEVERAGE_CABINET_DC);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BEVERAGE_CABINET_DRINK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BEVERAGE_CABINET_EMPTY);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BEVERAGE_MENU);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BOLIVARIAN_COFFEE_BEAN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BROWN_BOOKCASE1);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BROWN_BOOKCASE2);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BROWN_BOOKCASE3);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.COLUMBIAN_STREET_VIEW_PHOTO);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.DINING_CHAIR);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.PEDESTAL_COFFEE_TABLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.PENDANT_LIGHT);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.POTTED_LONG_LEAF_PLANT);
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.RED_BRICK_CAFE_BAR, ModelIds.getBlockModelId(ModBlocks.RED_BRICK_CAFE_BAR));
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.RED_BROWN_CABINET);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SOFT_CEILING_LIGHT);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BLACK_PEDESTAL_TABLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BLACK_VINTAGE_CHAIR);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BLACK_VINTAGE_STOOL);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BRIGHT_WALL_LIGHT);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.DUPLEX_WOODEN_FENCE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.LOW_SANDALWOOD_MEETING_TABLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SANDALWOOD_BED);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SANDALWOOD_MEETING_BOARD);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SIMPLE_BLACK_LOUNGE_CHAIR);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SMALL_SANDALWOOD_NIGHTSTAND);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.DUPLEX_BRONZE_FENCE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.LOW_TEAK_MEETING_TABLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.PIANO_BLACK_VINTAGE_CHAIR);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.PIANO_BLACK_VINTAGE_STOOL);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SIMPLE_GRAY_LOUNGE_CHAIR);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SMALL_TEAK_NIGHTSTAND);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.TEAK_BED);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.TEAK_ATTENDANCE_BOARD);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.WHITE_PEDESTAL_TABLE);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CREATURES_REMAINS);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.FUTON_BUNK_BED_BOTTOM);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.FUTON_BUNK_BED_TOP);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.HANDMADE_WOOD_BASKET);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.LOG_BEAM);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.LOG_CABINET_BOTTOM);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.LOG_CABINET_TOP1);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.LOG_CABINET_TOP2);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.LOG_DINING_CHAIR);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.LOG_DINING_TABLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROCKING_CHAIR_WITH_CUSHION);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SPRUCE_WOOD_VIOLIN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.VINTAGE_CEILING_FAN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.VINTAGE_CEILING_LIGHT);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.DINING_PLATE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.PIZZA_BOWL);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.PIZZA_BOX);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.PIZZA_MENU1);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.PIZZA_MENU2);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.PIZZERIA_BLACK_COUNTER);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.PIZZERIA_CUPBOARD);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.PIZZERIA_DINING_CHAIR);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.PIZZERIA_EXIT_SIGN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.PIZZERIA_HIGH_STOOL);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.PIZZERIA_MOVEABLE_TABLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.PIZZERIA_PLATE_RACK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.PIZZERIA_POSTER_COLUMN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.PIZZERIA_POSTER_STAND);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.PIZZERIA_SOFT_CEILING_LIGHT);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BARSTOOL);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BILLBOARD_JUKEBOX);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BLACK_AND_GOLDEN_FREEZER);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MODERN_HOTEL_CEILING_LIGHT);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MODERN_HOTEL_CHANDELIER);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MODERN_HOTEL_FLOOR_LAMP);
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.MODERN_HOTEL_SOFA, ModelIds.getBlockModelId(ModBlocks.MODERN_HOTEL_SOFA));
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MODERN_HOTEL_TABLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MODERN_HOTEL_WALL_LAMP);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MODERN_WALL_DECORATION);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MOUNTED_BAR_CEILING1);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MOUNTED_BAR_CEILING2);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.VERSATILE_BAR_STAND);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.WILLIAMS_GRAND_PIANO_SET);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CHENS_CERTIFICATE_OF_HONOR);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CHENS_CHAIR);
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.CHENS_DESK, ModelIds.getBlockModelId(ModBlocks.CHENS_DESK));
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CHENS_WEAPON_RACK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.FILE1);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.FILE2);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.LGD_BOOKCASE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.LGD_DAYLIGHT_LIGHT);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.LGD_FLUORESCENT_LIGHT);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.LGD_SPECIAL_DUMMY);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.LGD_SPOTLIGHT);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.LGD_SUPINE_PLATE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.LGD_TRASH_CAN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.OFFICE_CLUE_BOARD);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.POTTED_CACTUS_PLANT);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BEACH_HOUSE_FLOOR_LAMP);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BLUE_AND_WHITE_CANVAS_CURTAINS_LEFT);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BLUE_AND_WHITE_CANVAS_CURTAINS_RIGHT);
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.LAZY_BENCH, ModelIds.getBlockModelId(ModBlocks.LAZY_BENCH));
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.LAZY_COFFEE_TABLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.LAZY_HIGH_TEA_TABLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.LAZY_LOUNGE_CHAIR);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.RHODES_ISLAND_SUMMER_CALENDAR);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SIESTA_COAT_OF_ARMS_SOUVENIR);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SUMMER_BOAT_CABINET_BOTTOM);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SUMMER_BOAT_CABINET_TOP);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SUMMER_COLLECTION_SHELF);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SUMMER_COLLECTION_SHELF_CHAIR);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SURFBOARD_STAND);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.WOODEN_BEAM);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.ABYSSAL_HUNTERS_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.AEGIR_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.BABEL_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLACK_STEEL_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.BOLIVAR_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.COLUMBIA_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.DONG_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.DUBLINN_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.ELITE_OP_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.FOLLOWERS_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.GLASGOW_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.IBERIA_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.KARLAN_TRADE_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.KAZIMIERZ_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.KJERAG_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.LATERANO_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.LEES_DETECTIVE_AGENCY_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.LEITHANIEN_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.LUNGMEN_GUARD_DEPARTMENT_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.LUNGMEN_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.MINOS_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.OP_A4_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.OP_RESERVE_A1_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.OP_RESERVE_A4_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.OP_RESERVE_A6_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.PENGUIN_LOGISTICS_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.PINUS_SYLVESTRIS_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.RHINE_LAB_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.RHODES_ISLAND_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.RHODES_ISLAND_OVERRIDE_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.RIM_BILLITON_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.SAMI_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.SARGON_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.SIESTA_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.SIRACUSA_BRANCHES_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.SIRACUSA_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.SUI_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.SWEEP_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.TEAM_RAINBOW_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.URSUS_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.URSUS_STUDENT_SELF_GOVERNING_GROUP_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.VICTORIA_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.YAN_LOGO, Models.GENERATED);

        itemModelGenerator.register(ModItems.FURN_PARTS, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARDBOARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.FURN_PARTS_ZIP1, Models.GENERATED);
        itemModelGenerator.register(ModItems.FURN_PARTS_ZIP2, Models.GENERATED);
    }
}
