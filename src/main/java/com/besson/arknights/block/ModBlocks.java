package com.besson.arknights.block;

import com.besson.arknights.ArknightsFurniture;
import com.besson.arknights.block.custom.columbian.*;
import com.besson.arknights.block.custom.countryside.*;
import com.besson.arknights.block.custom.fantastic.*;
import com.besson.arknights.block.custom.lgd.*;
import com.besson.arknights.block.custom.lifecycle.*;
import com.besson.arknights.block.custom.pizzeria.*;
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
    public static final Block AIR_MATTRESS = registerBlock("warehouse/air_mattress", new FurnitureBedBlock(DyeColor.BLACK, AbstractBlock.Settings.create().strength(0.1f, 0.1f).nonOpaque()));
    public static final Block ATTENDANCE_BOARD = registerBlock("warehouse/attendance_board", new AttendanceBoard(AbstractBlock.Settings.create().strength(0.3f, 0.3f)));
    public static final Block CARGO_TROLLEY = registerBlock("warehouse/cargo_trolley", new CargoTrolley(AbstractBlock.Settings.create().strength(0.3f, 0.5f).nonOpaque()));
    public static final Block CARTON = registerBlock("warehouse/carton", new Carton(AbstractBlock.Settings.create().strength(0.2f, 0.2f), () -> ModBlockEntities.CARTON));
    public static final Block CARTON_STOOL = registerBlock("warehouse/carton_stool", new CartonStool(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block GRAFFITI = registerBlock("warehouse/graffiti", new Graffiti(AbstractBlock.Settings.create().strength(0.1f, 0.1f).nonOpaque()));
    public static final Block LARGE_SHELF1 = registerBlock("warehouse/large_shelf1", new LargeShelf(AbstractBlock.Settings.create().strength(0.5f, 0.5f).nonOpaque(), () -> ModBlockEntities.LARGE_SHELF));
    public static final Block LARGE_SHELF2 = registerBlock("warehouse/large_shelf2", new LargeShelf(AbstractBlock.Settings.create().strength(0.5f, 0.5f).nonOpaque(), () -> ModBlockEntities.LARGE_SHELF));
    public static final Block LARGE_SHELF3 = registerBlock("warehouse/large_shelf3", new LargeShelf(AbstractBlock.Settings.create().strength(0.5f, 0.5f).nonOpaque(), () -> ModBlockEntities.LARGE_SHELF));
    public static final Block LARGE_SHELF4 = registerBlock("warehouse/large_shelf4", new LargeShelf(AbstractBlock.Settings.create().strength(0.5f, 0.5f).nonOpaque(), () -> ModBlockEntities.LARGE_SHELF));
    public static final Block PALLET = registerBlock("warehouse/pallet", new Pallet(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block PILE_OF_CARTONS = registerBlock("warehouse/pile_of_cartons", new PileOfCartons(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block PORTABLE_CALCULATOR = registerBlock("warehouse/portable_calculator", new PortableCalculator(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block POST_IT_NOTE = registerBlock("warehouse/post_it_note", new PostItNote(AbstractBlock.Settings.create().strength(0.1f, 0.1f).nonOpaque()));

    public static final Block GRAYISH_WALL_LIGHT = registerBlock("sideline/grayish_wall_light", new WallLight(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block SIMPLE_BLACK_CLOCK = registerBlock("sideline/simple_black_clock", new SimpleClock(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block BLACK_HD_TV = registerBlock("sideline/black_hd_tv", new HDTV(AbstractBlock.Settings.create().strength(0.2f, 0.1f)));
    public static final Block BLACK_NIGHTSTAND = registerBlock("sideline/black_nightstand", new Nightstand(AbstractBlock.Settings.create().nonOpaque().strength(0.2f, 0.2f), () -> ModBlockEntities.NIGHTSTAND));
    public static final Block BLACK_BED = registerBlock("sideline/black_bed", new FurnitureBedBlock(DyeColor.BLACK, AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block SMALL_CALLBOARD = registerBlock("sideline/small_callboard", new SmallCallboard(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block BLACK_AND_WHITE_SQUARE_TABLE = registerBlock("sideline/black_and_white_square_table", new SquareTable(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block LOW_BLACK_AND_WHITE_SOFA = registerBlock("sideline/low_black_and_white_sofa", new LowSofa(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block CHECKERBOARD_BOOKCASE1 = registerBlock("sideline/checkerboard_bookcase1", new CheckerboardBookcase(AbstractBlock.Settings.create().strength(0.2f, 0.2f), () -> ModBlockEntities.CHECKERBOARD_BOOKCASE));
    public static final Block CHECKERBOARD_BOOKCASE2 = registerBlock("sideline/checkerboard_bookcase2", new CheckerboardBookcase(AbstractBlock.Settings.create().strength(0.2f, 0.2f), () -> ModBlockEntities.CHECKERBOARD_BOOKCASE));
    public static final Block CHECKERBOARD_BOOKCASE3 = registerBlock("sideline/checkerboard_bookcase3", new CheckerboardBookcase(AbstractBlock.Settings.create().strength(0.2f, 0.2f), () -> ModBlockEntities.CHECKERBOARD_BOOKCASE));
    public static final Block SIMPLE_BLACK_CABINET = registerBlock("sideline/simple_black_cabinet", new SimpleCabinet(AbstractBlock.Settings.create().strength(0.2f, 0.2f), () -> ModBlockEntities.SIMPLE_CABINET));
    public static final Block BLACK_OFFICE_CHAIR = registerBlock("sideline/black_office_chair", new OfficeChair(AbstractBlock.Settings.create().nonOpaque().strength(0.2f, 0.2f)));
    public static final Block SIMPLE_BLACK_DESK_LEFT = registerBlock("sideline/simple_black_desk_left", new SimpleDesk(AbstractBlock.Settings.create().nonOpaque().strength(0.3f, 0.2f)));
    public static final Block SIMPLE_BLACK_DESK_RIGHT = registerBlock("sideline/simple_black_desk_right", new SimpleDesk(AbstractBlock.Settings.create().nonOpaque().strength(0.3f, 0.2f)));

    public static final Block ORANGE_WALL_LAMP = registerBlock("sideline/orange_wall_lamp", new WallLight(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block SIMPLE_ORANGE_CLOCK = registerBlock("sideline/simple_orange_clock", new SimpleClock(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block ORANGE_HD_TV = registerBlock("sideline/orange_hd_tv", new HDTV(AbstractBlock.Settings.create().strength(0.2f, 0.1f)));
    public static final Block ORANGE_NIGHTSTAND = registerBlock("sideline/orange_nightstand", new Nightstand(AbstractBlock.Settings.create().nonOpaque().strength(0.2f, 0.2f), () -> ModBlockEntities.NIGHTSTAND));
    public static final Block ORANGE_BED = registerBlock("sideline/orange_bed", new FurnitureBedBlock(DyeColor.ORANGE, AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block SMALL_NOTICEBOARD = registerBlock("sideline/small_noticeboard", new SmallCallboard(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block ORANGE_SQUARE_TABLE = registerBlock("sideline/orange_square_table", new SquareTable(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block LOW_ORANGE_SOFA = registerBlock("sideline/low_orange_sofa", new LowSofa(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block ORANGE_CHECKERBOARD_BOOKCASE1 = registerBlock("sideline/orange_checkerboard_bookcase1", new CheckerboardBookcase(AbstractBlock.Settings.create().strength(0.2f, 0.2f), () -> ModBlockEntities.CHECKERBOARD_BOOKCASE));
    public static final Block ORANGE_CHECKERBOARD_BOOKCASE2 = registerBlock("sideline/orange_checkerboard_bookcase2", new CheckerboardBookcase(AbstractBlock.Settings.create().strength(0.2f, 0.2f), () -> ModBlockEntities.CHECKERBOARD_BOOKCASE));
    public static final Block ORANGE_CHECKERBOARD_BOOKCASE3 = registerBlock("sideline/orange_checkerboard_bookcase3", new CheckerboardBookcase(AbstractBlock.Settings.create().strength(0.2f, 0.2f), () -> ModBlockEntities.CHECKERBOARD_BOOKCASE));
    public static final Block ORANGE_SWIVEL_CHAIR = registerBlock("sideline/orange_swivel_chair", new OfficeChair(AbstractBlock.Settings.create().nonOpaque().strength(0.2f, 0.2f)));
    public static final Block SIMPLE_ORANGE_CABINET = registerBlock("sideline/simple_orange_cabinet", new SimpleCabinet(AbstractBlock.Settings.create().strength(0.2f, 0.2f), () -> ModBlockEntities.SIMPLE_CABINET));
    public static final Block SIMPLE_ORANGE_DESK_LEFT = registerBlock("sideline/simple_orange_desk_left", new SimpleDesk(AbstractBlock.Settings.create().nonOpaque().strength(0.3f, 0.2f)));
    public static final Block SIMPLE_ORANGE_DESK_RIGHT = registerBlock("sideline/simple_orange_desk_right", new SimpleDesk(AbstractBlock.Settings.create().nonOpaque().strength(0.3f, 0.2f)));

    public static final Block BROWN_BEAN_BAG_SOFA = registerBlock("fantastic/brown_bean_bag_sofa", new BrownBeanBagSofa(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block ECO_EXHIBITION_CABINET = registerBlock("fantastic/eco_exhibition_cabinet", new EcoExhibitionCabinet(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block ECO_EXHIBITION_CABINET_BASE = registerBlock("fantastic/eco_exhibition_cabinet_base", new EcoExhibitionCabinetBase(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block FLUSH_MOUNT_RECTANGLE_CEILING_LIGHT = registerBlock("fantastic/flush_mount_rectangle_ceiling_light", new FlushMountRectangleCeilingLight(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block FLUSH_MOUNT_SQUARE_CEILING_LIGHT = registerBlock("fantastic/flush_mount_square_ceiling_light", new FlushMountSquareCeilingLight(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block METALLIC_BED = registerBlock("fantastic/metallic_bed", new MetallicBed(DyeColor.BLACK, AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block POTTED_BROADLEAF_PLANT = registerBlock("fantastic/potted_broadleaf_plant", new PottedBroadleafPlant(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block POTTED_CONIFER_PLANT = registerBlock("fantastic/potted_conifer_plant", new PottedConiferPlant(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block POTTED_SUCCULENT_PLANT = registerBlock("fantastic/potted_succulent_plant", new PottedSucculentPlant(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block SMALL_SQUARE_NIGHTSTAND = registerBlock("fantastic/small_square_nightstand", new SmallSquareNightstand(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque(), () -> ModBlockEntities.SMALL_SQUARE_NIGHTSTAND));
    public static final Block SPECIMEN_DATA_BOARD = registerBlock("fantastic/specimen_data_board", new SpecimenDataBoard(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block WIRE_SIDE_TABLE = registerBlock("fantastic/wire_side_table", new WireSideTable(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));

    public static final Block ANTI_EXPLOSION_TRASH_CAN = registerBlock("lifecycle/anti_explosion_trash_can", new AntiExplosionTrashCan(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block BUILT_IN_FILE_CABINET1 = registerBlock("lifecycle/built_in_file_cabinet1", new BuiltInFileCabinet(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block BUILT_IN_FILE_CABINET2 = registerBlock("lifecycle/built_in_file_cabinet2", new BuiltInFileCabinet(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block BUNK_BED_IN_CABIN = registerBlock("lifecycle/bunk_bed_in_cabin", new FurnitureBedBlock(DyeColor.BLACK, AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block CABIN_FIRE_EXTINGUISHER_KIT = registerBlock("lifecycle/cabin_fire_extinguisher_kit", new CabinFireExtinguisherKit(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block CABIN_FLUSH_MOUNT_PIPE = registerBlock("lifecycle/cabin_flush_mount_pipe", new CabinFlushMountPipe(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block CONTROL_DISPLAY = registerBlock("lifecycle/control_display", new ControlDisplay(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block DIY_SWIVEL_CHAIR = registerBlock("lifecycle/diy_swivel_chair", new DiySwivelChair(AbstractBlock.Settings.create().nonOpaque().strength(0.2f, 0.2f)));
    public static final Block DIY_WORKBENCH_LEFT = registerBlock("lifecycle/diy_workbench_left", new DiyWorkbench(AbstractBlock.Settings.create().nonOpaque().strength(0.3f, 0.2f)));
    public static final Block DIY_WORKBENCH_RIGHT = registerBlock("lifecycle/diy_workbench_right", new DiyWorkbench(AbstractBlock.Settings.create().nonOpaque().strength(0.3f, 0.2f)));
    public static final Block GENERAL_CONSOLE = registerBlock("lifecycle/general_console", new GeneralConsole(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block NOTE_BOARD_IN_CABIN = registerBlock("lifecycle/note_board_in_cabin", new NoteBoardInCabin(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));

    public static final Block BAR_CEILING = registerBlock("columbian/bar_ceiling", new BarCeiling(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block BARSTOOL_WITH_CURVED_LEGS = registerBlock("columbian/barstool_with_curved_legs", new BarstoolWithCurvedLegs(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block BEVERAGE_CABINET_COFFEE1 = registerBlock("columbian/beverage_cabinet_coffee1", new BeverageCabinet(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block BEVERAGE_CABINET_COFFEE2 = registerBlock("columbian/beverage_cabinet_coffee2", new BeverageCabinet(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block BEVERAGE_CABINET_DC = registerBlock("columbian/beverage_cabinet_dc", new BeverageCabinet(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block BEVERAGE_CABINET_DRINK = registerBlock("columbian/beverage_cabinet_drink", new BeverageCabinet(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block BEVERAGE_CABINET_EMPTY = registerBlock("columbian/beverage_cabinet_empty", new BeverageCabinet(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block BEVERAGE_MENU = registerBlock("columbian/beverage_menu", new BeverageMenu(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block BOLIVARIAN_COFFEE_BEAN = registerBlock("columbian/bolivarian_coffee_bean", new BolivarianCoffeeBean(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block BROWN_BOOKCASE1 = registerBlock("columbian/brown_bookcase1", new BrownBookcase(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block BROWN_BOOKCASE2 = registerBlock("columbian/brown_bookcase2", new BrownBookcase(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block BROWN_BOOKCASE3 = registerBlock("columbian/brown_bookcase3", new BrownBookcase(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block COLUMBIAN_STREET_VIEW_PHOTO = registerBlock("columbian/columbian_street_view_photo", new ColumbianStreetViewPhoto(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block DINING_CHAIR = registerBlock("columbian/dining_chair", new DiningChair(AbstractBlock.Settings.create().nonOpaque().strength(0.2f, 0.2f)));
    public static final Block PEDESTAL_COFFEE_TABLE = registerBlock("columbian/pedestal_coffee_table", new PedestalCoffeeTable(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block PENDANT_LIGHT = registerBlock("columbian/pendant_light", new PendantLight(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block POTTED_LONG_LEAF_PLANT = registerBlock("columbian/potted_long_leaf_plant", new PottedLongLeafPlant(AbstractBlock.Settings.create().strength(0.1f, 0.1f).nonOpaque()));
    public static final Block RED_BRICK_CAFE_BAR = registerBlock("columbian/red_brick_cafe_bar", new RedBrickCafeBar(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block RED_BROWN_CABINET = registerBlock("columbian/red_brown_cabinet", new RedBrownCabinet(AbstractBlock.Settings.create().strength(0.2f, 0.2f), () -> ModBlockEntities.RED_BROWN_CABINET));
    public static final Block SOFT_CEILING_LIGHT = registerBlock("columbian/soft_ceiling_light", new SoftCeilingLight(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));

    public static final Block BLACK_PEDESTAL_TABLE = registerBlock("ldg/black_pedestal_table", new BlackPedestalTable(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block BLACK_VINTAGE_CHAIR = registerBlock("ldg/black_vintage_chair", new BlackVintageChair(AbstractBlock.Settings.create().nonOpaque().strength(0.2f, 0.2f)));
    public static final Block BLACK_VINTAGE_STOOL = registerBlock("ldg/black_vintage_stool", new BlackVintageStool(AbstractBlock.Settings.create().nonOpaque().strength(0.2f, 0.2f)));
    public static final Block BRIGHT_WALL_LIGHT = registerBlock("ldg/bright_wall_light", new BrightWallLight(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block DUPLEX_WOODEN_FENCE = registerBlock("ldg/duplex_wooden_fence", new DuplexWoodenFence(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block LOW_SANDALWOOD_MEETING_TABLE = registerBlock("ldg/low_sandalwood_meeting_table", new LowSandalwoodMeetingTable(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block SANDALWOOD_BED = registerBlock("ldg/sandalwood_bed", new FurnitureBedBlock(DyeColor.BROWN, AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block SANDALWOOD_MEETING_BOARD = registerBlock("ldg/sandalwood_meeting_board", new SandalwoodMeetingBoard(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block SIMPLE_BLACK_LOUNGE_CHAIR = registerBlock("ldg/simple_black_lounge_chair", new SimpleBlackLoungeChair(AbstractBlock.Settings.create().nonOpaque().strength(0.2f, 0.2f)));
    public static final Block SMALL_SANDALWOOD_NIGHTSTAND = registerBlock("ldg/small_sandalwood_nightstand", new SmallSandalwoodNightstand(AbstractBlock.Settings.create().strength(0.2f, 0.2f), () -> ModBlockEntities.SMALL_SANDALWOOD_NIGHTSTAND));

    public static final Block DUPLEX_BRONZE_FENCE = registerBlock("ldg/duplex_bronze_fence", new DuplexWoodenFence(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block LOW_TEAK_MEETING_TABLE = registerBlock("ldg/low_teak_meeting_table", new LowSandalwoodMeetingTable(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block PIANO_BLACK_VINTAGE_CHAIR = registerBlock("ldg/piano_black_vintage_chair", new BlackVintageChair(AbstractBlock.Settings.create().nonOpaque().strength(0.2f, 0.2f)));
    public static final Block PIANO_BLACK_VINTAGE_STOOL = registerBlock("ldg/piano_black_vintage_stool", new BlackVintageStool(AbstractBlock.Settings.create().nonOpaque().strength(0.2f, 0.2f)));
    public static final Block SIMPLE_GRAY_LOUNGE_CHAIR = registerBlock("ldg/simple_gray_lounge_chair", new SimpleBlackLoungeChair(AbstractBlock.Settings.create().nonOpaque().strength(0.2f, 0.2f)));
    public static final Block SMALL_TEAK_NIGHTSTAND = registerBlock("ldg/small_teak_nightstand", new SmallSandalwoodNightstand(AbstractBlock.Settings.create().strength(0.2f, 0.2f), () -> ModBlockEntities.SMALL_SANDALWOOD_NIGHTSTAND));
    public static final Block TEAK_BED = registerBlock("ldg/teak_bed", new FurnitureBedBlock(DyeColor.BROWN, AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block TEAK_ATTENDANCE_BOARD = registerBlock("ldg/teak_attendance_board", new SandalwoodMeetingBoard(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block WHITE_PEDESTAL_TABLE = registerBlock("ldg/white_pedestal_table", new BlackPedestalTable(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));

    public static final Block CREATURES_REMAINS = registerBlock("countryside/creatures_remains", new CreaturesRemains(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block FUTON_BUNK_BED_BOTTOM = registerBlock("countryside/futon_bunk_bed_bottom", new FutonBunkBedBottom(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block FUTON_BUNK_BED_TOP = registerBlock("countryside/futon_bunk_bed_top", new FurnitureBedBlock(DyeColor.BLACK, AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block HANDMADE_WOOD_BASKET = registerBlock("countryside/handmade_wood_basket", new HandmadeWoodBasket(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block LOG_BEAM = registerBlock("countryside/log_beam", new LogBeam(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block LOG_CABINET_BOTTOM = registerBlock("countryside/log_cabinet_bottom", new LogCabinetBottom(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque(), () -> ModBlockEntities.LOG_CABINET_BOTTOM));
    public static final Block LOG_CABINET_TOP1 = registerBlock("countryside/log_cabinet_top1", new LogCabinetTop(AbstractBlock.Settings.create().strength(0.2f, 0.2f), () -> ModBlockEntities.LOG_CABINET_TOP));
    public static final Block LOG_CABINET_TOP2 = registerBlock("countryside/log_cabinet_top2", new LogCabinetTop(AbstractBlock.Settings.create().strength(0.2f, 0.2f), () -> ModBlockEntities.LOG_CABINET_TOP));
    public static final Block LOG_DINING_CHAIR = registerBlock("countryside/log_dining_chair", new LogDiningChair(AbstractBlock.Settings.create().nonOpaque().strength(0.2f, 0.2f)));
    public static final Block LOG_DINING_TABLE = registerBlock("countryside/log_dining_table", new LogDiningTable(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block ROCKING_CHAIR_WITH_CUSHION = registerBlock("countryside/rocking_chair_with_cushion", new RockingChairWithCushion(AbstractBlock.Settings.create().nonOpaque().strength(0.2f, 0.2f)));
    public static final Block SPRUCE_WOOD_VIOLIN = registerBlock("countryside/spruce_wood_violin", new SpruceWoodViolin(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block VINTAGE_CEILING_FAN = registerBlock("countryside/vintage_ceiling_fan", new VintageCeilingFan(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block VINTAGE_CEILING_LIGHT = registerBlock("countryside/vintage_ceiling_light", new VintageCeilingLight(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));

    public static final Block DINING_PLATE = registerBlock("pizzeria/dining_plate",new DiningPlate(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block PIZZA_BOWL = registerBlock("pizzeria/pizza_bowl",new PizzaBowl(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block PIZZA_BOX = registerBlock("pizzeria/pizza_box",new PizzaBox(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block PIZZA_MENU1 = registerBlock("pizzeria/pizza_menu1",new PizzaMenu(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block PIZZA_MENU2 = registerBlock("pizzeria/pizza_menu2",new PizzaMenu(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block PIZZERIA_BLACK_COUNTER = registerBlock("pizzeria/pizzeria_black_counter",new PizzeriaBlackCounter(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block PIZZERIA_CUPBOARD = registerBlock("pizzeria/pizzeria_cupboard",new PizzeriaCupboard(AbstractBlock.Settings.create().strength(0.2f, 0.2f), () -> ModBlockEntities.PIZZERIA_CUPBOARD));
    public static final Block PIZZERIA_DINING_CHAIR = registerBlock("pizzeria/pizzeria_dining_chair",new PizzeriaDiningChair(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block PIZZERIA_EXIT_SIGN = registerBlock("pizzeria/pizzeria_exit_sign",new PizzeriaExitSign(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block PIZZERIA_HIGH_STOOL = registerBlock("pizzeria/pizzeria_high_stool",new PizzeriaHighStool(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block PIZZERIA_MOVEABLE_TABLE = registerBlock("pizzeria/pizzeria_moveable_table",new PizzeriaMoveableTable(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block PIZZERIA_PLATE_RACK = registerBlock("pizzeria/pizzeria_plate_rack",new PizzeriaPlateRack(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block PIZZERIA_POSTER_COLUMN = registerBlock("pizzeria/pizzeria_poster_column",new PizzeriaPosterColumn(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block PIZZERIA_POSTER_STAND = registerBlock("pizzeria/pizzeria_poster_stand",new PizzeriaPosterStand(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block PIZZERIA_SOFT_CEILING_LIGHT = registerBlock("pizzeria/pizzeria_soft_ceiling_light",new PizzeriaSoftCeilingLight(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));

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
