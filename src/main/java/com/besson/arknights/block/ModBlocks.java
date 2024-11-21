package com.besson.arknights.block;

import com.besson.arknights.ArknightsFurniture;
import com.besson.arknights.block.custom.columbian.*;
import com.besson.arknights.block.custom.fantastic.*;
import com.besson.arknights.block.custom.lgd.*;
import com.besson.arknights.block.custom.lifecycle.*;
import com.besson.arknights.block.custom.sideline.*;
import com.besson.arknights.block.custom.warehouse.*;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block AIR_MATTRESS = registerBlock("air_mattress", new FurnitureBedBlock(DyeColor.BLACK, AbstractBlock.Settings.create().strength(0.1f, 0.1f).nonOpaque()));
    public static final Block ATTENDANCE_BOARD = registerBlock("attendance_board", new AttendanceBoard(AbstractBlock.Settings.create().strength(0.3f, 0.3f)));
    public static final Block CARGO_TROLLEY = registerBlock("cargo_trolley", new CargoTrolley(AbstractBlock.Settings.create().strength(0.3f, 0.5f).nonOpaque()));
    public static final Block CARTON = registerBlock("carton", new Carton(AbstractBlock.Settings.create().strength(0.2f, 0.2f), () -> ModBlockEntities.CARTON));
    public static final Block CARTON_STOOL = registerBlock("carton_stool", new CartonStool(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block GRAFFITI = registerBlock("graffiti", new Graffiti(AbstractBlock.Settings.create().strength(0.1f, 0.1f).nonOpaque()));
    public static final Block LARGE_SHELF1 = registerBlock("large_shelf1", new LargeShelf(AbstractBlock.Settings.create().strength(0.5f, 0.5f).nonOpaque(), () -> ModBlockEntities.LARGE_SHELF));
    public static final Block LARGE_SHELF2 = registerBlock("large_shelf2", new LargeShelf(AbstractBlock.Settings.create().strength(0.5f, 0.5f).nonOpaque(), () -> ModBlockEntities.LARGE_SHELF));
    public static final Block LARGE_SHELF3 = registerBlock("large_shelf3", new LargeShelf(AbstractBlock.Settings.create().strength(0.5f, 0.5f).nonOpaque(), () -> ModBlockEntities.LARGE_SHELF));
    public static final Block LARGE_SHELF4 = registerBlock("large_shelf4", new LargeShelf(AbstractBlock.Settings.create().strength(0.5f, 0.5f).nonOpaque(), () -> ModBlockEntities.LARGE_SHELF));
    public static final Block PALLET = registerBlock("pallet", new Pallet(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block PILE_OF_CARTONS = registerBlock("pile_of_cartons", new PileOfCartons(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block PORTABLE_CALCULATOR = registerBlock("portable_calculator", new PortableCalculator(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block POST_IT_NOTE = registerBlock("post_it_note", new PostItNote(AbstractBlock.Settings.create().strength(0.1f, 0.1f).nonOpaque()));

    public static final Block GRAYISH_WALL_LIGHT = registerBlock("grayish_wall_light", new WallLight(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block SIMPLE_BLACK_CLOCK = registerBlock("simple_black_clock", new SimpleClock(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block BLACK_HD_TV = registerBlock("black_hd_tv", new HDTV(AbstractBlock.Settings.create().strength(0.2f, 0.1f)));
    public static final Block BLACK_NIGHTSTAND = registerBlock("black_nightstand", new Nightstand(AbstractBlock.Settings.create().nonOpaque().strength(0.2f, 0.2f), () -> ModBlockEntities.NIGHTSTAND));
    public static final Block BLACK_BED = registerBlock("black_bed", new FurnitureBedBlock(DyeColor.BLACK, AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block SMALL_CALLBOARD = registerBlock("small_callboard", new SmallCallboard(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block BLACK_AND_WHITE_SQUARE_TABLE = registerBlock("black_and_white_square_table", new SquareTable(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block LOW_BLACK_AND_WHITE_SOFA = registerBlock("low_black_and_white_sofa", new LowSofa(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block CHECKERBOARD_BOOKCASE1 = registerBlock("checkerboard_bookcase1", new CheckerboardBookcase(AbstractBlock.Settings.create().strength(0.2f, 0.2f), () -> ModBlockEntities.CHECKERBOARD_BOOKCASE));
    public static final Block CHECKERBOARD_BOOKCASE2 = registerBlock("checkerboard_bookcase2", new CheckerboardBookcase(AbstractBlock.Settings.create().strength(0.2f, 0.2f), () -> ModBlockEntities.CHECKERBOARD_BOOKCASE));
    public static final Block CHECKERBOARD_BOOKCASE3 = registerBlock("checkerboard_bookcase3", new CheckerboardBookcase(AbstractBlock.Settings.create().strength(0.2f, 0.2f), () -> ModBlockEntities.CHECKERBOARD_BOOKCASE));
    public static final Block SIMPLE_BLACK_CABINET = registerBlock("simple_black_cabinet", new SimpleCabinet(AbstractBlock.Settings.create().strength(0.2f, 0.2f), () -> ModBlockEntities.SIMPLE_CABINET));
    public static final Block BLACK_OFFICE_CHAIR = registerBlock("black_office_chair", new OfficeChair(AbstractBlock.Settings.create().nonOpaque().strength(0.2f, 0.2f)));
    public static final Block SIMPLE_BLACK_DESK_LEFT = registerBlock("simple_black_desk_left", new SimpleDesk(AbstractBlock.Settings.create().nonOpaque().strength(0.3f, 0.2f)));
    public static final Block SIMPLE_BLACK_DESK_RIGHT = registerBlock("simple_black_desk_right", new SimpleDesk(AbstractBlock.Settings.create().nonOpaque().strength(0.3f, 0.2f)));

    public static final Block ORANGE_WALL_LAMP = registerBlock("orange_wall_lamp", new WallLight(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block SIMPLE_ORANGE_CLOCK = registerBlock("simple_orange_clock", new SimpleClock(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block ORANGE_HD_TV = registerBlock("orange_hd_tv", new HDTV(AbstractBlock.Settings.create().strength(0.2f, 0.1f)));
    public static final Block ORANGE_NIGHTSTAND = registerBlock("orange_nightstand", new Nightstand(AbstractBlock.Settings.create().nonOpaque().strength(0.2f, 0.2f), () -> ModBlockEntities.NIGHTSTAND));
    public static final Block ORANGE_BED = registerBlock("orange_bed", new FurnitureBedBlock(DyeColor.ORANGE, AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block SMALL_NOTICEBOARD = registerBlock("small_noticeboard", new SmallCallboard(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block ORANGE_SQUARE_TABLE = registerBlock("orange_square_table", new SquareTable(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block LOW_ORANGE_SOFA = registerBlock("low_orange_sofa", new LowSofa(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block ORANGE_CHECKERBOARD_BOOKCASE1 = registerBlock("orange_checkerboard_bookcase1", new CheckerboardBookcase(AbstractBlock.Settings.create().strength(0.2f, 0.2f), () -> ModBlockEntities.CHECKERBOARD_BOOKCASE));
    public static final Block ORANGE_CHECKERBOARD_BOOKCASE2 = registerBlock("orange_checkerboard_bookcase2", new CheckerboardBookcase(AbstractBlock.Settings.create().strength(0.2f, 0.2f), () -> ModBlockEntities.CHECKERBOARD_BOOKCASE));
    public static final Block ORANGE_CHECKERBOARD_BOOKCASE3 = registerBlock("orange_checkerboard_bookcase3", new CheckerboardBookcase(AbstractBlock.Settings.create().strength(0.2f, 0.2f), () -> ModBlockEntities.CHECKERBOARD_BOOKCASE));
    public static final Block ORANGE_SWIVEL_CHAIR = registerBlock("orange_swivel_chair", new OfficeChair(AbstractBlock.Settings.create().nonOpaque().strength(0.2f, 0.2f)));
    public static final Block SIMPLE_ORANGE_CABINET = registerBlock("simple_orange_cabinet", new SimpleCabinet(AbstractBlock.Settings.create().strength(0.2f, 0.2f), () -> ModBlockEntities.SIMPLE_CABINET));
    public static final Block SIMPLE_ORANGE_DESK_LEFT = registerBlock("simple_orange_desk_left", new SimpleDesk(AbstractBlock.Settings.create().nonOpaque().strength(0.3f, 0.2f)));
    public static final Block SIMPLE_ORANGE_DESK_RIGHT = registerBlock("simple_orange_desk_right", new SimpleDesk(AbstractBlock.Settings.create().nonOpaque().strength(0.3f, 0.2f)));

    public static final Block BROWN_BEAN_BAG_SOFA = registerBlock("brown_bean_bag_sofa", new BrownBeanBagSofa(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block ECO_EXHIBITION_CABINET = registerBlock("eco_exhibition_cabinet", new EcoExhibitionCabinet(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block ECO_EXHIBITION_CABINET_BASE = registerBlock("eco_exhibition_cabinet_base", new EcoExhibitionCabinetBase(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block FLUSH_MOUNT_RECTANGLE_CEILING_LIGHT = registerBlock("flush_mount_rectangle_ceiling_light", new FlushMountRectangleCeilingLight(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block FLUSH_MOUNT_SQUARE_CEILING_LIGHT = registerBlock("flush_mount_square_ceiling_light", new FlushMountSquareCeilingLight(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block METALLIC_BED = registerBlock("metallic_bed", new MetallicBed(DyeColor.BLACK, AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block POTTED_BROADLEAF_PLANT = registerBlock("potted_broadleaf_plant", new PottedBroadleafPlant(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block POTTED_CONIFER_PLANT = registerBlock("potted_conifer_plant", new PottedConiferPlant(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block POTTED_SUCCULENT_PLANT = registerBlock("potted_succulent_plant", new PottedSucculentPlant(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block SMALL_SQUARE_NIGHTSTAND = registerBlock("small_square_nightstand", new SmallSquareNightstand(AbstractBlock.Settings.create().strength(0.2f, 0.2f), () -> ModBlockEntities.SMALL_SQUARE_NIGHTSTAND));
    public static final Block SPECIMEN_DATA_BOARD = registerBlock("specimen_data_board", new SpecimenDataBoard(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block WIRE_SIDE_TABLE = registerBlock("wire_side_table", new WireSideTable(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));

    public static final Block ANTI_EXPLOSION_TRASH_CAN = registerBlock("anti_explosion_trash_can", new AntiExplosionTrashCan(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block BUILT_IN_FILE_CABINET1 = registerBlock("built_in_file_cabinet1", new BuiltInFileCabinet(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block BUILT_IN_FILE_CABINET2 = registerBlock("built_in_file_cabinet2", new BuiltInFileCabinet(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block BUNK_BED_IN_CABIN = registerBlock("bunk_bed_in_cabin", new FurnitureBedBlock(DyeColor.BLACK, AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block CABIN_FIRE_EXTINGUISHER_KIT = registerBlock("cabin_fire_extinguisher_kit", new CabinFireExtinguisherKit(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block CABIN_FLUSH_MOUNT_PIPE = registerBlock("cabin_flush_mount_pipe", new CabinFlushMountPipe(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block CONTROL_DISPLAY = registerBlock("control_display", new ControlDisplay(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block DIY_SWIVEL_CHAIR = registerBlock("diy_swivel_chair", new DiySwivelChair(AbstractBlock.Settings.create().nonOpaque().strength(0.2f, 0.2f)));
    public static final Block DIY_WORKBENCH_LEFT = registerBlock("diy_workbench_left", new DiyWorkbench(AbstractBlock.Settings.create().nonOpaque().strength(0.3f, 0.2f)));
    public static final Block DIY_WORKBENCH_RIGHT = registerBlock("diy_workbench_right", new DiyWorkbench(AbstractBlock.Settings.create().nonOpaque().strength(0.3f, 0.2f)));
    public static final Block GENERAL_CONSOLE = registerBlock("general_console", new GeneralConsole(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block NOTE_BOARD_IN_CABIN = registerBlock("note_board_in_cabin", new NoteBoardInCabin(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));

    public static final Block BAR_CEILING = registerBlock("bar_ceiling", new BarCeiling(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block BARSTOOL_WITH_CURVED_LEGS = registerBlock("barstool_with_curved_legs", new BarstoolWithCurvedLegs(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block BEVERAGE_CABINET_COFFEE1 = registerBlock("beverage_cabinet_coffee1", new BeverageCabinet(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block BEVERAGE_CABINET_COFFEE2 = registerBlock("beverage_cabinet_coffee2", new BeverageCabinet(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block BEVERAGE_CABINET_DC = registerBlock("beverage_cabinet_dc", new BeverageCabinet(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block BEVERAGE_CABINET_DRINK = registerBlock("beverage_cabinet_drink", new BeverageCabinet(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block BEVERAGE_CABINET_EMPTY = registerBlock("beverage_cabinet_empty", new BeverageCabinet(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block BEVERAGE_MENU = registerBlock("beverage_menu", new BeverageMenu(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block BOLIVARIAN_COFFEE_BEAN = registerBlock("bolivarian_coffee_bean", new BolivarianCoffeeBean(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block BROWN_BOOKCASE1 = registerBlock("brown_bookcase1", new BrownBookcase(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block BROWN_BOOKCASE2 = registerBlock("brown_bookcase2", new BrownBookcase(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block BROWN_BOOKCASE3 = registerBlock("brown_bookcase3", new BrownBookcase(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block COLUMBIAN_STREET_VIEW_PHOTO = registerBlock("columbian_street_view_photo", new ColumbianStreetViewPhoto(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block DINING_CHAIR = registerBlock("dining_chair", new DiningChair(AbstractBlock.Settings.create().nonOpaque().strength(0.2f, 0.2f)));
    public static final Block PEDESTAL_COFFEE_TABLE = registerBlock("pedestal_coffee_table", new PedestalCoffeeTable(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block PENDANT_LIGHT = registerBlock("pendant_light", new PendantLight(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block POTTED_LONG_LEAF_PLANT = registerBlock("potted_long_leaf_plant", new PottedLongLeafPlant(AbstractBlock.Settings.create().strength(0.1f, 0.1f).nonOpaque()));
    public static final Block RED_BRICK_CAFE_BAR = registerBlock("red_brick_cafe_bar", new RedBrickCafeBar(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block RED_BROWN_CABINET = registerBlock("red_brown_cabinet", new RedBrownCabinet(AbstractBlock.Settings.create().strength(0.2f, 0.2f), () -> ModBlockEntities.RED_BROWN_CABINET));
    public static final Block SOFT_CEILING_LIGHT = registerBlock("soft_ceiling_light", new SoftCeilingLight(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));

    public static final Block BLACK_PEDESTAL_TABLE = registerBlock("black_pedestal_table", new BlackPedestalTable(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block BLACK_VINTAGE_CHAIR = registerBlock("black_vintage_chair", new BlackVintageChair(AbstractBlock.Settings.create().nonOpaque().strength(0.2f, 0.2f)));
    public static final Block BLACK_VINTAGE_STOOL = registerBlock("black_vintage_stool", new BlackVintageStool(AbstractBlock.Settings.create().nonOpaque().strength(0.2f, 0.2f)));
    public static final Block BRIGHT_WALL_LIGHT = registerBlock("bright_wall_light", new BrightWallLight(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block DUPLEX_WOODEN_FENCE = registerBlock("duplex_wooden_fence", new DuplexWoodenFence(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block LOW_SANDALWOOD_MEETING_TABLE = registerBlock("low_sandalwood_meeting_table", new LowSandalwoodMeetingTable(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block SANDALWOOD_BED = registerBlock("sandalwood_bed", new FurnitureBedBlock(DyeColor.BROWN, AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block SANDALWOOD_MEETING_BOARD = registerBlock("sandalwood_meeting_board", new SandalwoodMeetingBoard(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block SIMPLE_BLACK_LOUNGE_CHAIR = registerBlock("simple_black_lounge_chair", new SimpleBlackLoungeChair(AbstractBlock.Settings.create().nonOpaque().strength(0.2f, 0.2f)));
    public static final Block SMALL_SANDALWOOD_NIGHTSTAND = registerBlock("small_sandalwood_nightstand", new SmallSandalwoodNightstand(AbstractBlock.Settings.create().strength(0.2f, 0.2f), () -> ModBlockEntities.SMALL_SANDALWOOD_NIGHTSTAND));

    public static final Block DUPLEX_BRONZE_FENCE = registerBlock("duplex_bronze_fence", new DuplexWoodenFence(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block LOW_TEAK_MEETING_TABLE = registerBlock("low_teak_meeting_table", new LowSandalwoodMeetingTable(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block PIANO_BLACK_VINTAGE_CHAIR = registerBlock("piano_black_vintage_chair", new BlackVintageChair(AbstractBlock.Settings.create().nonOpaque().strength(0.2f, 0.2f)));
    public static final Block PIANO_BLACK_VINTAGE_STOOL = registerBlock("piano_black_vintage_stool", new BlackVintageStool(AbstractBlock.Settings.create().nonOpaque().strength(0.2f, 0.2f)));
    public static final Block SIMPLE_GRAY_LOUNGE_CHAIR = registerBlock("simple_gray_lounge_chair", new SimpleBlackLoungeChair(AbstractBlock.Settings.create().nonOpaque().strength(0.2f, 0.2f)));
    public static final Block SMALL_TEAK_NIGHTSTAND = registerBlock("small_teak_nightstand", new SmallSandalwoodNightstand(AbstractBlock.Settings.create().strength(0.2f, 0.2f), () -> ModBlockEntities.SMALL_SANDALWOOD_NIGHTSTAND));
    public static final Block TEAK_BED = registerBlock("teak_bed", new FurnitureBedBlock(DyeColor.BROWN, AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block TEAK_ATTENDANCE_BOARD = registerBlock("teak_attendance_board", new SandalwoodMeetingBoard(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block WHITE_PEDESTAL_TABLE = registerBlock("white_pedestal_table", new BlackPedestalTable(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));

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
