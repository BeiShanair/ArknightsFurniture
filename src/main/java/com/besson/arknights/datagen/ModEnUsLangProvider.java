package com.besson.arknights.datagen;

import com.besson.arknights.block.ModBlocks;
import com.besson.arknights.item.ModItems;
import com.besson.arknights.painting.ModPaintingVariants;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class ModEnUsLangProvider extends FabricLanguageProvider {
    public static final String painting = "painting.arknights-furniture.";
    public ModEnUsLangProvider(FabricDataOutput dataOutput) {
        super(dataOutput, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.ABYSSAL_HUNTERS_LOGO, "Abyssal Hunters Logo");
        translationBuilder.add(ModItems.AEGIR_LOGO, "Aegir Logo");
        translationBuilder.add(ModItems.BABEL_LOGO, "Babel Logo");
        translationBuilder.add(ModItems.BLACK_STEEL_LOGO, "Black Steel Logo");
        translationBuilder.add(ModItems.BOLIVAR_LOGO, "Bolivar Logo");
        translationBuilder.add(ModItems.COLUMBIA_LOGO, "Columbia Logo");
        translationBuilder.add(ModItems.DONG_LOGO, "Dong Logo");
        translationBuilder.add(ModItems.DUBLINN_LOGO, "Dublinn Logo");
        translationBuilder.add(ModItems.ELITE_OP_LOGO, "Elite Op Logo");
        translationBuilder.add(ModItems.FOLLOWERS_LOGO, "Followers Logo");
        translationBuilder.add(ModItems.GLASGOW_LOGO, "Glasgow Logo");
        translationBuilder.add(ModItems.IBERIA_LOGO, "Iberia Logo");
        translationBuilder.add(ModItems.KARLAN_TRADE_LOGO, "Karlan Trade Logo");
        translationBuilder.add(ModItems.KAZIMIERZ_LOGO, "Kazimierz Logo");
        translationBuilder.add(ModItems.KJERAG_LOGO, "Kjerag Logo");
        translationBuilder.add(ModItems.LATERANO_LOGO, "Laterano Logo");
        translationBuilder.add(ModItems.LEES_DETECTIVE_AGENCY_LOGO, "Lee's Detective Agency Logo");
        translationBuilder.add(ModItems.LEITHANIEN_LOGO, "Leithanien Logo");
        translationBuilder.add(ModItems.LUNGMEN_GUARD_DEPARTMENT_LOGO, "Lungmen Guard Department Logo");
        translationBuilder.add(ModItems.LUNGMEN_LOGO, "Lungmen Logo");
        translationBuilder.add(ModItems.MINOS_LOGO, "Minos Logo");
        translationBuilder.add(ModItems.OP_A4_LOGO, "Op A4 Logo");
        translationBuilder.add(ModItems.OP_RESERVE_A1_LOGO, "Op Reserve A1 Logo");
        translationBuilder.add(ModItems.OP_RESERVE_A4_LOGO, "Op Reserve A4 Logo");
        translationBuilder.add(ModItems.OP_RESERVE_A6_LOGO, "Op Reserve A6 Logo");
        translationBuilder.add(ModItems.PENGUIN_LOGISTICS_LOGO, "Penguin Logistics Logo");
        translationBuilder.add(ModItems.PINUS_SYLVESTRIS_LOGO, "Pinus Sylvestris Logo");
        translationBuilder.add(ModItems.RHINE_LAB_LOGO, "Rhine Lab Logo");
        translationBuilder.add(ModItems.RHODES_ISLAND_LOGO, "Rhodes Island Logo");
        translationBuilder.add(ModItems.RHODES_ISLAND_OVERRIDE_LOGO, "Rhodes Island Override Logo");
        translationBuilder.add(ModItems.RIM_BILLITON_LOGO, "Rim Billiton Logo");
        translationBuilder.add(ModItems.SAMI_LOGO, "Sami Logo");
        translationBuilder.add(ModItems.SARGON_LOGO, "Sargon Logo");
        translationBuilder.add(ModItems.SIESTA_LOGO, "Siesta Logo");
        translationBuilder.add(ModItems.SIRACUSA_BRANCHES_LOGO, "Siracusa Branches Logo");
        translationBuilder.add(ModItems.SIRACUSA_LOGO, "Siracusa Logo");
        translationBuilder.add(ModItems.SUI_LOGO, "Sui Logo");
        translationBuilder.add(ModItems.SWEEP_LOGO, "S.W.E.E.P Logo");
        translationBuilder.add(ModItems.TEAM_RAINBOW_LOGO, "Team Rainbow Logo");
        translationBuilder.add(ModItems.URSUS_LOGO, "Ursus Logo");
        translationBuilder.add(ModItems.URSUS_STUDENT_SELF_GOVERNING_GROUP_LOGO, "Ursus Student Self-Governing Group Logo");
        translationBuilder.add(ModItems.VICTORIA_LOGO, "Victoria Logo");
        translationBuilder.add(ModItems.YAN_LOGO, "Yan Logo");

        translationBuilder.add(painting + "abyssal_hunters.title", "Abyssal Hunters");
        translationBuilder.add(painting + "abyssal_hunters.author", "Hypergryph");
        translationBuilder.add(painting + "aegir.title", "Aegir");
        translationBuilder.add(painting + "aegir.author", "Hypergryph");
        translationBuilder.add(painting + "babel.title", "Babel");
        translationBuilder.add(painting + "babel.author", "Hypergryph");
        translationBuilder.add(painting + "black_steel.title", "Black Steel");
        translationBuilder.add(painting + "black_steel.author", "Hypergryph");
        translationBuilder.add(painting + "bolivar.title", "Bolivar");
        translationBuilder.add(painting + "bolivar.author", "Hypergryph");
        translationBuilder.add(painting + "columbia.title", "Columbia");
        translationBuilder.add(painting + "columbia.author", "Hypergryph");
        translationBuilder.add(painting + "dong.title", "Dong");
        translationBuilder.add(painting + "dong.author", "Hypergryph");
        translationBuilder.add(painting + "dublinn.title", "Dublinn");
        translationBuilder.add(painting + "dublinn.author", "Hypergryph");
        translationBuilder.add(painting + "elite_op.title", "Elite Op");
        translationBuilder.add(painting + "elite_op.author", "Hypergryph");
        translationBuilder.add(painting + "followers.title", "Followers");
        translationBuilder.add(painting + "followers.author", "Hypergryph");
        translationBuilder.add(painting + "glasgow.title", "Glasgow");
        translationBuilder.add(painting + "glasgow.author", "Hypergryph");
        translationBuilder.add(painting + "iberia.title", "Iberia");
        translationBuilder.add(painting + "iberia.author", "Hypergryph");
        translationBuilder.add(painting + "karlan_trade.title", "Karlan Trade");
        translationBuilder.add(painting + "karlan_trade.author", "Hypergryph");
        translationBuilder.add(painting + "kazimierz.title", "Kazimierz");
        translationBuilder.add(painting + "kazimierz.author", "Hypergryph");
        translationBuilder.add(painting + "kjerag.title", "Kjerag");
        translationBuilder.add(painting + "kjerag.author", "Hypergryph");
        translationBuilder.add(painting + "laterano.title", "Laterano");
        translationBuilder.add(painting + "laterano.author", "Hypergryph");
        translationBuilder.add(painting + "lee-s_detective_agency.title", "Lee's Detective Agency");
        translationBuilder.add(painting + "lee-s_detective_agency.author", "Hypergryph");
        translationBuilder.add(painting + "leithanien.title", "Leithanien");
        translationBuilder.add(painting + "leithanien.author", "Hypergryph");
        translationBuilder.add(painting + "lungmen_guard_department.title", "Lungmen Guard Department");
        translationBuilder.add(painting + "lungmen_guard_department.author", "Hypergryph");
        translationBuilder.add(painting + "lungmen.title", "Lungmen");
        translationBuilder.add(painting + "lungmen.author", "Hypergryph");
        translationBuilder.add(painting + "minos.title", "Minos");
        translationBuilder.add(painting + "minos.author", "Hypergryph");
        translationBuilder.add(painting + "op_a4.title", "Op A4");
        translationBuilder.add(painting + "op_a4.author", "Hypergryph");
        translationBuilder.add(painting + "op_reserve_a1.title", "Op Reserve A1");
        translationBuilder.add(painting + "op_reserve_a1.author", "Hypergryph");
        translationBuilder.add(painting + "op_reserve_a4.title", "Op Reserve A4");
        translationBuilder.add(painting + "op_reserve_a4.author", "Hypergryph");
        translationBuilder.add(painting + "op_reserve_a6.title", "Op Reserve A6");
        translationBuilder.add(painting + "op_reserve_a6.author", "Hypergryph");
        translationBuilder.add(painting + "penguin_logistics.title", "Penguin Logistics");
        translationBuilder.add(painting + "penguin_logistics.author", "Hypergryph");
        translationBuilder.add(painting + "pinus_sylvestris.title", "Pinus Sylvestris");
        translationBuilder.add(painting + "pinus_sylvestris.author", "Hypergryph");
        translationBuilder.add(painting + "rhine_lab.title", "Rhine Lab");
        translationBuilder.add(painting + "rhine_lab.author", "Hypergryph");
        translationBuilder.add(painting + "rhodes_island.title", "Rhodes Island");
        translationBuilder.add(painting + "rhodes_island.author", "Hypergryph");
        translationBuilder.add(painting + "rhodes_island_override.title", "Rhodes Island Override");
        translationBuilder.add(painting + "rhodes_island_override.author", "Hypergryph");
        translationBuilder.add(painting + "rim_billiton.title", "Rim Billiton");
        translationBuilder.add(painting + "rim_billiton.author", "Hypergryph");
        translationBuilder.add(painting + "sami.title", "Sami");
        translationBuilder.add(painting + "sami.author", "Hypergryph");
        translationBuilder.add(painting + "sargon.title", "Sargon");
        translationBuilder.add(painting + "sargon.author", "Hypergryph");
        translationBuilder.add(painting + "siesta.title", "Siesta");
        translationBuilder.add(painting + "siesta.author", "Hypergryph");
        translationBuilder.add(painting + "siracusa_branches.title", "Siracusa Branches");
        translationBuilder.add(painting + "siracusa_branches.author", "Hypergryph");
        translationBuilder.add(painting + "siracusa.title", "Siracusa");
        translationBuilder.add(painting + "siracusa.author", "Hypergryph");
        translationBuilder.add(painting + "sui.title", "Sui");
        translationBuilder.add(painting + "sui.author", "Hypergryph");
        translationBuilder.add(painting + "sweep.title", "Sweep");
        translationBuilder.add(painting + "sweep.author", "Hypergryph");
        translationBuilder.add(painting + "team_rainbow.title", "Team Rainbow");
        translationBuilder.add(painting + "team_rainbow.author", "Hypergryph");
        translationBuilder.add(painting + "ursus.title", "Ursus");
        translationBuilder.add(painting + "ursus.author", "Hypergryph");
        translationBuilder.add(painting + "ursus_student_self-governing_group.title", "Ursus Student Self-Governing Group");
        translationBuilder.add(painting + "ursus_student_self-governing_group.author", "Hypergryph");
        translationBuilder.add(painting + "victoria.title", "Victoria");
        translationBuilder.add(painting + "victoria.author", "Hypergryph");
        translationBuilder.add(painting + "yan.title", "Yan");
        translationBuilder.add(painting + "yan.author", "Hypergryph");

        translationBuilder.add(ModItems.FURN_PARTS, "Furn Parts");

        translationBuilder.add(ModBlocks.AIR_MATTRESS, "Air Mattress");
        translationBuilder.add(ModBlocks.ATTENDANCE_BOARD, "Attendance Board");
        translationBuilder.add(ModBlocks.CARGO_TROLLEY, "Cargo Trolley");
        translationBuilder.add(ModBlocks.CARTON, "Carton");
        translationBuilder.add(ModBlocks.CARTON_STOOL, "Carton Stool");
        translationBuilder.add(ModBlocks.GRAFFITI, "Graffiti");
        translationBuilder.add(ModBlocks.LARGE_SHELF1, "Large Shelf 1");
        translationBuilder.add(ModBlocks.LARGE_SHELF2, "Large Shelf 2");
        translationBuilder.add(ModBlocks.LARGE_SHELF3, "Large Shelf 3");
        translationBuilder.add(ModBlocks.LARGE_SHELF4, "Large Shelf 4");
        translationBuilder.add(ModBlocks.PALLET, "Pallet");
        translationBuilder.add(ModBlocks.PILE_OF_CARTONS, "Pile Of Cartons");
        translationBuilder.add(ModBlocks.PORTABLE_CALCULATOR, "Portable Calculator");
        translationBuilder.add(ModBlocks.POST_IT_NOTE, "Post It Note");

        translationBuilder.add(ModBlocks.GRAYISH_WALL_LIGHT, "Grayish Wall Light");
        translationBuilder.add(ModBlocks.SIMPLE_BLACK_CLOCK, "Simple Black Clock");
        translationBuilder.add(ModBlocks.BLACK_HD_TV, "Black HD TV");
        translationBuilder.add(ModBlocks.BLACK_NIGHTSTAND, "Black Nightstand");
        translationBuilder.add(ModBlocks.BLACK_BED, "Black Bed");
        translationBuilder.add(ModBlocks.SMALL_CALLBOARD, "Small Callboard");
        translationBuilder.add(ModBlocks.BLACK_AND_WHITE_SQUARE_TABLE, "Black And White Square Table");
        translationBuilder.add(ModBlocks.LOW_BLACK_AND_WHITE_SOFA, "Low Black And White Sofa");
        translationBuilder.add(ModBlocks.CHECKERBOARD_BOOKCASE1, "Checkerboard Bookcase 1");
        translationBuilder.add(ModBlocks.CHECKERBOARD_BOOKCASE2, "Checkerboard Bookcase 2");
        translationBuilder.add(ModBlocks.CHECKERBOARD_BOOKCASE3, "Checkerboard Bookcase 3");
        translationBuilder.add(ModBlocks.SIMPLE_BLACK_CABINET, "Simple Black Cabinet");
        translationBuilder.add(ModBlocks.BLACK_OFFICE_CHAIR, "Black Office Chair");
        translationBuilder.add(ModBlocks.SIMPLE_BLACK_DESK_LEFT, "Simple Black Desk Left");
        translationBuilder.add(ModBlocks.SIMPLE_BLACK_DESK_RIGHT, "Simple Black Desk Right");

        translationBuilder.add("itemGroup.logo", "Logo");
        translationBuilder.add("itemGroup.material", "Material");
        translationBuilder.add("itemGroup.warehouse", "Warehouse");
        translationBuilder.add("itemGroup.side_line", "Side Line/Simple Black-and-white/Orange Furniture");

        translationBuilder.add("container.carton", "Carton");
        translationBuilder.add("container.large_shelf", "Large Shelf");
        translationBuilder.add("container.nightstand", "Nightstand");
        translationBuilder.add("container.simple_cabinet", "Simple Cabinet");

    }
}
