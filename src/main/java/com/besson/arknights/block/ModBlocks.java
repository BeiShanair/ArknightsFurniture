package com.besson.arknights.block;

import com.besson.arknights.ArknightsFurniture;
import com.besson.arknights.block.custom.airtight.*;
import com.besson.arknights.block.custom.chen.*;
import com.besson.arknights.block.custom.columbian.*;
import com.besson.arknights.block.custom.countryside.*;
import com.besson.arknights.block.custom.fantastic.*;
import com.besson.arknights.block.custom.hotel.*;
import com.besson.arknights.block.custom.lgd.*;
import com.besson.arknights.block.custom.lifecycle.*;
import com.besson.arknights.block.custom.pizzeria.*;
import com.besson.arknights.block.custom.rehearsal.*;
import com.besson.arknights.block.custom.reimselar.*;
import com.besson.arknights.block.custom.sideline.*;
import com.besson.arknights.block.custom.siesta.*;
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

    public static final Block BARSTOOL = registerBlock("hotel/barstool",new Barstool(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block BILLBOARD_JUKEBOX = registerBlock("hotel/billboard_jukebox",new BillboardJukebox(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block BLACK_AND_GOLDEN_FREEZER = registerBlock("hotel/black_and_golden_freezer",new BlackAndGoldenFreezer(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block MODERN_HOTEL_CEILING_LIGHT = registerBlock("hotel/modern_hotel_ceiling_light",new ModernHotelCeilingLight(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block MODERN_HOTEL_CHANDELIER = registerBlock("hotel/modern_hotel_chandelier",new ModernHotelChandelier(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block MODERN_HOTEL_FLOOR_LAMP = registerBlock("hotel/modern_hotel_floor_lamp",new ModernHotelFloorLamp(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block MODERN_HOTEL_SOFA = registerBlock("hotel/modern_hotel_sofa",new ModernHotelSofa(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block MODERN_HOTEL_TABLE = registerBlock("hotel/modern_hotel_table",new ModernHotelTable(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block MODERN_HOTEL_WALL_LAMP = registerBlock("hotel/modern_hotel_wall_lamp",new ModernHotelWallLamp(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block MODERN_WALL_DECORATION = registerBlock("hotel/modern_wall_decoration",new ModernWallDecoration(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block MOUNTED_BAR_CEILING1 = registerBlock("hotel/mounted_bar_ceiling1",new MountedBarCeiling1(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block MOUNTED_BAR_CEILING2 = registerBlock("hotel/mounted_bar_ceiling2",new MountedBarCeiling2(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block VERSATILE_BAR_STAND = registerBlock("hotel/versatile_bar_stand",new VersatileBarStand(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block WILLIAMS_GRAND_PIANO_SET = registerBlock("hotel/williams_grand_piano_set",new WilliamsGrandPianoSet(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));

    public static final Block CHENS_CERTIFICATE_OF_HONOR = registerBlock("chen/chens_certificate_of_honor",new ChensCertificateOfHonor(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block CHENS_CHAIR = registerBlock("chen/chens_chair",new ChensChair(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block CHENS_DESK = registerBlock("chen/chens_desk",new ChensDesk(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block CHENS_WEAPON_RACK = registerBlock("chen/chens_weapon_rack",new ChensWeaponRack(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block FILE1 = registerBlock("chen/file1",new File(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block FILE2 = registerBlock("chen/file2",new File(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block LGD_BOOKCASE = registerBlock("chen/lgd_bookcase",new LgdBookcase(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque(), () -> ModBlockEntities.LGD_BOOKCASE));
    public static final Block LGD_DAYLIGHT_LIGHT = registerBlock("chen/lgd_daylight_light",new LgdDaylightLight(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block LGD_FLUORESCENT_LIGHT = registerBlock("chen/lgd_fluorescent_light",new LgdFluorescentLight(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block LGD_SPECIAL_DUMMY = registerBlock("chen/lgd_special_dummy",new LgdSpecialDummy(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block LGD_SPOTLIGHT = registerBlock("chen/lgd_spotlight",new LgdSpotlight(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block LGD_SUPINE_PLATE = registerBlock("chen/lgd_supine_plate",new LgdSupinePlate(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block LGD_TRASH_CAN = registerBlock("chen/lgd_trash_can",new LgdTrashCan(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block OFFICE_CLUE_BOARD = registerBlock("chen/office_clue_board",new OfficeClueBoard(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block POTTED_CACTUS_PLANT = registerBlock("chen/potted_cactus_plant",new PottedCactusPlant(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));

    public static final Block BEACH_HOUSE_FLOOR_LAMP = registerBlock("siesta/beach_house_floor_lamp",new BeachHouseFloorLamp(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block BLUE_AND_WHITE_CANVAS_CURTAINS_LEFT = registerBlock("siesta/blue_and_white_canvas_curtains_left",new BlueAndWhiteCanvasCurtains(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block BLUE_AND_WHITE_CANVAS_CURTAINS_RIGHT = registerBlock("siesta/blue_and_white_canvas_curtains_right",new BlueAndWhiteCanvasCurtains(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block LAZY_BENCH = registerBlock("siesta/lazy_bench",new LazyBench(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block LAZY_COFFEE_TABLE = registerBlock("siesta/lazy_coffee_table",new LazyCoffeeTable(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block LAZY_HIGH_TEA_TABLE = registerBlock("siesta/lazy_high_tea_table",new LazyHighTeaTable(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block LAZY_LOUNGE_CHAIR = registerBlock("siesta/lazy_lounge_chair",new LazyLoungeChair(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block RHODES_ISLAND_SUMMER_CALENDAR = registerBlock("siesta/rhodes_island_summer_calendar",new RhodesIslandSummerCalendar(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block SIESTA_COAT_OF_ARMS_SOUVENIR = registerBlock("siesta/siesta_coat_of_arms_souvenir",new SiestaCoatOfArmsSouvenir(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block SUMMER_BOAT_CABINET_BOTTOM = registerBlock("siesta/summer_boat_cabinet_bottom",new SummerBoatCabinet(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque(), () -> ModBlockEntities.SUMMER_BOAT_CABINET));
    public static final Block SUMMER_BOAT_CABINET_TOP = registerBlock("siesta/summer_boat_cabinet_top",new SummerBoatCabinet(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque(), () -> ModBlockEntities.SUMMER_BOAT_CABINET));
    public static final Block SUMMER_COLLECTION_SHELF = registerBlock("siesta/summer_collection_shelf",new SummerCollectionShelf(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block SUMMER_COLLECTION_SHELF_CHAIR = registerBlock("siesta/summer_collection_shelf_chair",new SummerCollectionShelfChair(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block SURFBOARD_STAND = registerBlock("siesta/surfboard_stand",new SurfboardStand(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block WOODEN_BEAM = registerBlock("siesta/wooden_beam",new WoodenBeam(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));

    public static final Block AMBER = registerBlock("rehearsal/amber",new Guitar(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block BIRCH = registerBlock("rehearsal/birch",new Guitar(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block DARK_CLOUD = registerBlock("rehearsal/dark_cloud",new Guitar(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block DARK_STEEL = registerBlock("rehearsal/dark_steel",new Guitar(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block DRIFTWOOD = registerBlock("rehearsal/driftwood",new Guitar(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block FLAME = registerBlock("rehearsal/flame",new Guitar(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block GRIT = registerBlock("rehearsal/grit",new Guitar(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block HANGING_SCROLLING_DISPLAY = registerBlock("rehearsal/hanging_scrolling_display",new HangingScrollingDisplay(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block REHEARSAL_ROOM_ACCESSORY_SHELF = registerBlock("rehearsal/rehearsal_room_accessory_shelf",new RehearsalRoomAccessoryShelf(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block REHEARSAL_ROOM_BELT_SHELF = registerBlock("rehearsal/rehearsal_room_belt_shelf",new RehearsalRoomBeltShelf(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block REHEARSAL_ROOM_BENCH = registerBlock("rehearsal/rehearsal_room_bench",new RehearsalRoomBench(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block REHEARSAL_ROOM_RECEPTION_DESK = registerBlock("rehearsal/rehearsal_room_reception_desk",new RehearsalRoomReceptionDesk(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block REHEARSAL_ROOM_ROUND_BENCH = registerBlock("rehearsal/rehearsal_room_round_bench",new RehearsalRoomRoundBench(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block REHEARSAL_ROOM_SPOTLIGHT = registerBlock("rehearsal/rehearsal_room_spotlight",new RehearsalRoomSpotlight(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block SHALLOW_SEA = registerBlock("rehearsal/shallow_sea",new Guitar(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block SPOTLIGHT_CEILING = registerBlock("rehearsal/spotlight_ceiling",new SpotlightCeiling(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block STAGE = registerBlock("rehearsal/stage",new Guitar(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block TOUR_INSTRUMENT_COMBO = registerBlock("rehearsal/tour_instrument_combo",new TourInstrumentCombo(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block WHEAT = registerBlock("rehearsal/wheat",new Guitar(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block YARMAHAN_DRUM_SET = registerBlock("rehearsal/yarmahan_drum_set",new YarmahanDrumSet(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));

    public static final Block CLEANROOM_AIRDUCT = registerBlock("airtight/cleanroom_airduct",new CleanroomAirduct(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block CLEANROOM_AIRFLOW_CONTROL_PIPE = registerBlock("airtight/cleanroom_airflow_control_pipe",new CleanroomAirflowControlPipe(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block CLEANROOM_ANTIMICROBIAL_LAMP = registerBlock("airtight/cleanroom_antimicrobial_lamp",new CleanroomAntimicrobialLamp(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block CLEANROOM_CEILING_LIGHT = registerBlock("airtight/cleanroom_ceiling_light",new CleanroomCeilingLight(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block CLEANROOM_DISINFECTING_QUARTERS = registerBlock("airtight/cleanroom_disinfecting_quarters",new CleanroomDisinfectingQuarters(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block CLEANROOM_FLUORESCENT_LAMP = registerBlock("airtight/cleanroom_fluorescent_lamp",new CleanroomFluorescentLamp(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block CLEANROOM_LORRY = registerBlock("airtight/cleanroom_lorry",new CleanroomLorry(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block CLEANROOM_MATERIALS_BOX = registerBlock("airtight/cleanroom_materials_box",new CleanroomMaterialsBox(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block CLEANROOM_PIPE_VALVE = registerBlock("airtight/cleanroom_pipe_valve",new CleanroomPipeValve(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block EMERGENCY_STRETCHER = registerBlock("airtight/emergency_stretcher",new EmergencyStretcher(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block MULTIFUNCTIONAL_ENGINEERING_SHOVEL = registerBlock("airtight/multifunctional_engineering_shovel",new MultifunctionalEngineeringShovel(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block MULTIFUNCTIONAL_STERILIZER = registerBlock("airtight/multifunctional_sterilizer",new MultifunctionalSterilizer(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block SUPPLY_TANKS = registerBlock("airtight/supply_tanks",new SupplyTanks(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));

    public static final Block BANQUET_GUEST_SEAT = registerBlock("reimselar/banquet_guest_seat",new BanquetGuestSeat(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block BANQUET_HOST_SEAT = registerBlock("reimselar/banquet_host_seat",new BanquetHostSeat(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block BANQUET_TABLE = registerBlock("reimselar/banquet_table",new BanquetTable(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block CANDLE_CHANDELIER = registerBlock("reimselar/candle_chandelier",new CandleChandelier(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block CANLELIT_HEARTH = registerBlock("reimselar/canlelit_hearth",new CanlelitHearth(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block DOUBLE_DECKER_CHANDELIER = registerBlock("reimselar/double_decker_chandelier",new DoubleDeckerChandelier(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block LOCKED_CABINET = registerBlock("reimselar/locked_cabinet",new LockedCabinet(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque(), () -> ModBlockEntities.LOCKED_CABINET));
    public static final Block IONIC_COLUMN_DOWN = registerBlock("reimselar/ionic_column_down",new LonicColumn(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block IONIC_COLUMN_MIDDLE = registerBlock("reimselar/ionic_column_middle",new LonicColumn(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block IONIC_COLUMN_UP = registerBlock("reimselar/ionic_column_up",new LonicColumn(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block REIMSELAR_BRAZIER = registerBlock("reimselar/reimselar_brazier",new ReimselarBrazier(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block REIMSELAR_GUARDS_BUST = registerBlock("reimselar/reimselar_guards_bust",new ReimselarGuardsBust(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block REIMSELAR_MAGIC_MIRROR = registerBlock("reimselar/reimselar_magic_mirror",new ReimselarMagicMirror(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block REIMSELAR_STOOL = registerBlock("reimselar/reimselar_stool",new ReimselarStool(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));


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
