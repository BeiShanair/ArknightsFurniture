package com.besson.arknights.block;

import com.besson.arknights.ArknightsFurniture;
import com.besson.arknights.block.custom.airtight.*;
import com.besson.arknights.block.custom.chen.*;
import com.besson.arknights.block.custom.columbian.*;
import com.besson.arknights.block.custom.countryside.*;
import com.besson.arknights.block.custom.diner.*;
import com.besson.arknights.block.custom.eatery.*;
import com.besson.arknights.block.custom.fantastic.*;
import com.besson.arknights.block.custom.hotel.*;
import com.besson.arknights.block.custom.hr.*;
import com.besson.arknights.block.custom.leithanian.*;
import com.besson.arknights.block.custom.lgd.*;
import com.besson.arknights.block.custom.lifecycle.*;
import com.besson.arknights.block.custom.mercenary.*;
import com.besson.arknights.block.custom.occult.*;
import com.besson.arknights.block.custom.pizzeria.*;
import com.besson.arknights.block.custom.rehearsal.*;
import com.besson.arknights.block.custom.reimselar.*;
import com.besson.arknights.block.custom.safehouse.*;
import com.besson.arknights.block.custom.seven.*;
import com.besson.arknights.block.custom.sideline.*;
import com.besson.arknights.block.custom.siesta.*;
import com.besson.arknights.block.custom.tribal.*;
import com.besson.arknights.block.custom.ursus.*;
import com.besson.arknights.block.custom.warehouse.*;
import com.besson.arknights.block.custom.workstation.*;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;

public class ModBlocks {
    // region WAREHOUSE
    public static final Block AIR_MATTRESS = registerBlock("warehouse/air_mattress", new AirMattress(DyeColor.BLACK, AbstractBlock.Settings.create().strength(0.1f, 0.1f).nonOpaque()));
    public static final Block ATTENDANCE_BOARD = registerBlock("warehouse/attendance_board", new AttendanceBoard(AbstractBlock.Settings.create().strength(0.3f, 0.3f)));
    public static final Block CARGO_TROLLEY = registerBlock("warehouse/cargo_trolley", new CargoTrolley(AbstractBlock.Settings.create().strength(0.3f, 0.5f).nonOpaque()));
    public static final Block CARTON = registerBlock("warehouse/carton", new Carton(AbstractBlock.Settings.create().strength(0.2f, 0.2f), () -> ModBlockEntities.CARTON));
    public static final Block CARTON_STOOL = registerBlock("warehouse/carton_stool", new CartonStool(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block GRAFFITI = registerBlock("warehouse/graffiti", new Graffiti(AbstractBlock.Settings.create().strength(0.1f, 0.1f).nonOpaque()));
    public static final Block LARGE_SHELF1 = registerBlockWithOutBlockItems("warehouse/large_shelf1", new LargeShelf(AbstractBlock.Settings.create().strength(0.5f, 0.5f).nonOpaque(), () -> ModBlockEntities.LARGE_SHELF));
    public static final Block LARGE_SHELF2 = registerBlockWithOutBlockItems("warehouse/large_shelf2", new LargeShelf(AbstractBlock.Settings.create().strength(0.5f, 0.5f).nonOpaque(), () -> ModBlockEntities.LARGE_SHELF));
    public static final Block LARGE_SHELF3 = registerBlockWithOutBlockItems("warehouse/large_shelf3", new LargeShelf(AbstractBlock.Settings.create().strength(0.5f, 0.5f).nonOpaque(), () -> ModBlockEntities.LARGE_SHELF));
    public static final Block LARGE_SHELF4 = registerBlockWithOutBlockItems("warehouse/large_shelf4", new LargeShelf(AbstractBlock.Settings.create().strength(0.5f, 0.5f).nonOpaque(), () -> ModBlockEntities.LARGE_SHELF));
    public static final Block LARGE_SHELF_EMPTY = registerBlock("warehouse/large_shelf_empty", new LargeShelfEmpty(AbstractBlock.Settings.create().strength(0.5f, 0.5f).nonOpaque(), () -> ModBlockEntities.LARGE_SHELF_EMPTY));
    public static final Block PALLET = registerBlock("warehouse/pallet", new Pallet(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block PILE_OF_CARTONS = registerBlock("warehouse/pile_of_cartons", new PileOfCartons(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block PORTABLE_CALCULATOR = registerBlock("warehouse/portable_calculator", new PortableCalculator(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block POST_IT_NOTE = registerBlock("warehouse/post_it_note", new PostItNote(AbstractBlock.Settings.create().strength(0.1f, 0.1f).nonOpaque()));
    public static final Block CEILING_ROW_LIGHT = registerBlock("warehouse/ceiling_row_light", new CeilingRowLight(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block CONCRETE_WALL = registerBlock("warehouse/concrete_wall", new ConcreteWall(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block DORMITORY_DOOR_FRAMES = registerBlock("warehouse/dormitory_door_frames", new DormitoryDoorFrames(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block REINFORCED_CONCRETE_WALLS = registerBlock("warehouse/reinforced_concrete_walls", new ReinforcedConcreteWalls(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    // endregion

    // region SIDE LINE
    public static final Block GRAYISH_WALL_LIGHT = registerBlock("sideline/grayish_wall_light", new WallLight(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block SIMPLE_BLACK_CLOCK = registerBlock("sideline/simple_black_clock", new SimpleClock(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block BLACK_HD_TV = registerBlock("sideline/black_hd_tv", new HDTV(AbstractBlock.Settings.create().strength(0.2f, 0.1f)));
    public static final Block BLACK_NIGHTSTAND = registerBlock("sideline/black_nightstand", new Nightstand(AbstractBlock.Settings.create().nonOpaque().strength(0.2f, 0.2f), () -> ModBlockEntities.NIGHTSTAND));
    public static final Block BLACK_BED = registerBlock("sideline/black_bed", new FurnitureBedBlock(DyeColor.BLACK, AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block SMALL_CALLBOARD = registerBlock("sideline/small_callboard", new SmallCallboard(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block BLACK_AND_WHITE_SQUARE_TABLE = registerBlock("sideline/black_and_white_square_table", new SquareTable(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block LOW_BLACK_AND_WHITE_SOFA = registerBlock("sideline/low_black_and_white_sofa", new LowSofa(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block CHECKERBOARD_BOOKCASE_BBL = registerBlockWithOutBlockItems("sideline/checkerboard_bookcase_bbl", new CheckerboardBookcase(AbstractBlock.Settings.create().strength(0.2f, 0.2f), () -> ModBlockEntities.CHECKERBOARD_BOOKCASE));
    public static final Block CHECKERBOARD_BOOKCASE_BBR = registerBlockWithOutBlockItems("sideline/checkerboard_bookcase_bbr", new CheckerboardBookcase(AbstractBlock.Settings.create().strength(0.2f, 0.2f), () -> ModBlockEntities.CHECKERBOARD_BOOKCASE));
    public static final Block CHECKERBOARD_BOOKCASE_BTL = registerBlockWithOutBlockItems("sideline/checkerboard_bookcase_btl", new CheckerboardBookcase(AbstractBlock.Settings.create().strength(0.2f, 0.2f), () -> ModBlockEntities.CHECKERBOARD_BOOKCASE));
    public static final Block CHECKERBOARD_BOOKCASE_BTR = registerBlockWithOutBlockItems("sideline/checkerboard_bookcase_btr", new CheckerboardBookcase(AbstractBlock.Settings.create().strength(0.2f, 0.2f), () -> ModBlockEntities.CHECKERBOARD_BOOKCASE));
    public static final Block CHECKERBOARD_BOOKCASE_MBL = registerBlockWithOutBlockItems("sideline/checkerboard_bookcase_mbl", new CheckerboardBookcase(AbstractBlock.Settings.create().strength(0.2f, 0.2f), () -> ModBlockEntities.CHECKERBOARD_BOOKCASE));
    public static final Block CHECKERBOARD_BOOKCASE_MBR = registerBlockWithOutBlockItems("sideline/checkerboard_bookcase_mbr", new CheckerboardBookcase(AbstractBlock.Settings.create().strength(0.2f, 0.2f), () -> ModBlockEntities.CHECKERBOARD_BOOKCASE));
    public static final Block CHECKERBOARD_BOOKCASE_MTL = registerBlockWithOutBlockItems("sideline/checkerboard_bookcase_mtl", new CheckerboardBookcase(AbstractBlock.Settings.create().strength(0.2f, 0.2f), () -> ModBlockEntities.CHECKERBOARD_BOOKCASE));
    public static final Block CHECKERBOARD_BOOKCASE_MTR = registerBlockWithOutBlockItems("sideline/checkerboard_bookcase_mtr", new CheckerboardBookcase(AbstractBlock.Settings.create().strength(0.2f, 0.2f), () -> ModBlockEntities.CHECKERBOARD_BOOKCASE));
    public static final Block CHECKERBOARD_BOOKCASE_TL = registerBlockWithOutBlockItems("sideline/checkerboard_bookcase_tl", new CheckerboardBookcase(AbstractBlock.Settings.create().strength(0.2f, 0.2f), () -> ModBlockEntities.CHECKERBOARD_BOOKCASE));
    public static final Block CHECKERBOARD_BOOKCASE_TR = registerBlockWithOutBlockItems("sideline/checkerboard_bookcase_tr", new CheckerboardBookcase(AbstractBlock.Settings.create().strength(0.2f, 0.2f), () -> ModBlockEntities.CHECKERBOARD_BOOKCASE));
    public static final Block GRAY_FIBER_CARPET = registerBlock("sideline/gray_fiber_carpet", new FiberCarpet(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block GRAYISH_WALL_BBL = registerBlockWithOutBlockItems("sideline/grayish_wall_bbl", new GrayishWallBottom(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block GRAYISH_WALL_BBR = registerBlockWithOutBlockItems("sideline/grayish_wall_bbr", new GrayishWallBottom(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block GRAYISH_WALL_BTL = registerBlockWithOutBlockItems("sideline/grayish_wall_btl", new GrayishWallBottom(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block GRAYISH_WALL_BTR = registerBlockWithOutBlockItems("sideline/grayish_wall_btr", new GrayishWallBottom(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block GRAYISH_WALL_TBL = registerBlockWithOutBlockItems("sideline/grayish_wall_tbl", new GrayishWallTop(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block GRAYISH_WALL_TBR = registerBlockWithOutBlockItems("sideline/grayish_wall_tbr", new GrayishWallTop(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block GRAYISH_WALL_TTL = registerBlockWithOutBlockItems("sideline/grayish_wall_ttl", new GrayishWallTop(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block GRAYISH_WALL_TTR = registerBlockWithOutBlockItems("sideline/grayish_wall_ttr", new GrayishWallTop(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block SMALL_CEILING_LIGHT = registerBlock("sideline/small_ceiling_light", new CeilingLight(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block SIMPLE_BLACK_CABINET = registerBlock("sideline/simple_black_cabinet", new SimpleCabinet(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque(), () -> ModBlockEntities.SIMPLE_CABINET));
    public static final Block BLACK_OFFICE_CHAIR = registerBlock("sideline/black_office_chair", new OfficeChair(AbstractBlock.Settings.create().nonOpaque().strength(0.2f, 0.2f)));
    public static final Block SIMPLE_BLACK_DESK_LBL = registerBlockWithOutBlockItems("sideline/simple_black_desk_lbl", new BlackSimpleDesk(AbstractBlock.Settings.create().nonOpaque().strength(0.2f, 0.2f)));
    public static final Block SIMPLE_BLACK_DESK_LBR = registerBlockWithOutBlockItems("sideline/simple_black_desk_lbr", new BlackSimpleDeskMiddle(AbstractBlock.Settings.create().nonOpaque().strength(0.2f, 0.2f)));
    public static final Block SIMPLE_BLACK_DESK_LTL = registerBlockWithOutBlockItems("sideline/simple_black_desk_ltl", new BlackSimpleDesk(AbstractBlock.Settings.create().nonOpaque().strength(0.2f, 0.2f)));
    public static final Block SIMPLE_BLACK_DESK_LTR = registerBlockWithOutBlockItems("sideline/simple_black_desk_ltr", new BlackSimpleDeskMiddle(AbstractBlock.Settings.create().nonOpaque().strength(0.2f, 0.2f)));
    public static final Block SIMPLE_BLACK_DESK_RBL = registerBlockWithOutBlockItems("sideline/simple_black_desk_rbl", new BlackSimpleDeskMiddle(AbstractBlock.Settings.create().nonOpaque().strength(0.2f, 0.2f)));
    public static final Block SIMPLE_BLACK_DESK_RBR = registerBlockWithOutBlockItems("sideline/simple_black_desk_rbr", new BlackSimpleDesk(AbstractBlock.Settings.create().nonOpaque().strength(0.2f, 0.2f)));
    public static final Block SIMPLE_BLACK_DESK_RTL = registerBlockWithOutBlockItems("sideline/simple_black_desk_rtl", new BlackSimpleDeskMiddle(AbstractBlock.Settings.create().nonOpaque().strength(0.2f, 0.2f)));
    public static final Block SIMPLE_BLACK_DESK_RTR = registerBlockWithOutBlockItems("sideline/simple_black_desk_rtr", new BlackSimpleDesk(AbstractBlock.Settings.create().nonOpaque().strength(0.2f, 0.2f)));

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
    public static final Block SIMPLE_ORANGE_DESK_LEFT = registerBlock("sideline/simple_orange_desk_left", new BlackSimpleDesk(AbstractBlock.Settings.create().nonOpaque().strength(0.3f, 0.2f)));
    public static final Block SIMPLE_ORANGE_DESK_RIGHT = registerBlock("sideline/simple_orange_desk_right", new BlackSimpleDesk(AbstractBlock.Settings.create().nonOpaque().strength(0.3f, 0.2f)));
    // endregion

    // region FANTASTIC
    public static final Block BROWN_BEAN_BAG_SOFA = registerBlock("fantastic/brown_bean_bag_sofa", new BrownBeanBagSofa(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block ECO_EXHIBITION_CABINET = registerBlockWithOutBlockItems("fantastic/eco_exhibition_cabinet", new EcoExhibitionCabinetBase(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque().solidBlock(Blocks::never)));
    public static final Block ECO_EXHIBITION_CABINET_BASE = registerBlockWithOutBlockItems("fantastic/eco_exhibition_cabinet_base", new EcoExhibitionCabinetBase(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block FLUSH_MOUNT_RECTANGLE_CEILING_LIGHT = registerBlock("fantastic/flush_mount_rectangle_ceiling_light", new FlushMountRectangleCeilingLight(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block FLUSH_MOUNT_SQUARE_CEILING_LIGHT = registerBlock("fantastic/flush_mount_square_ceiling_light", new FlushMountSquareCeilingLight(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block METALLIC_BED = registerBlock("fantastic/metallic_bed", new MetallicBed(DyeColor.BLACK, AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block POTTED_BROADLEAF_PLANT = registerBlock("fantastic/potted_broadleaf_plant", new PottedBroadleafPlant(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block POTTED_CONIFER_PLANT = registerBlock("fantastic/potted_conifer_plant", new PottedConiferPlant(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block POTTED_SUCCULENT_PLANT = registerBlock("fantastic/potted_succulent_plant", new PottedSucculentPlant(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block SMALL_SQUARE_NIGHTSTAND = registerBlock("fantastic/small_square_nightstand", new SmallSquareNightstand(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque(), () -> ModBlockEntities.SMALL_SQUARE_NIGHTSTAND));
    public static final Block SPECIMEN_DATA_BOARD = registerBlock("fantastic/specimen_data_board", new SpecimenDataBoard(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block WIRE_SIDE_TABLE = registerBlock("fantastic/wire_side_table", new WireSideTable(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block COPPER_FLOOR_FRONT = registerBlockWithOutBlockItems("fantastic/copper_floor_front", new CopperFloor(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block COPPER_FLOOR_BEHIND = registerBlockWithOutBlockItems("fantastic/copper_floor_behind", new CopperFloor(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block METALLIC_WALLPAPER_BOTTOM = registerBlockWithOutBlockItems("fantastic/metallic_wallpaper_bottom", new MetallicWallpaper1(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block METALLIC_WALLPAPER_TOP = registerBlockWithOutBlockItems("fantastic/metallic_wallpaper_top", new MetallicWallpaper1(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block METALLIC_WALLPAPER_LB = registerBlockWithOutBlockItems("fantastic/metallic_wallpaper_lb", new MetallicWallpaper2(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block METALLIC_WALLPAPER_LT = registerBlockWithOutBlockItems("fantastic/metallic_wallpaper_lt", new MetallicWallpaper2(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block METALLIC_WALLPAPER_RB = registerBlockWithOutBlockItems("fantastic/metallic_wallpaper_rb", new MetallicWallpaper2(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block METALLIC_WALLPAPER_RT = registerBlockWithOutBlockItems("fantastic/metallic_wallpaper_rt", new MetallicWallpaper2(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block UNKNOWN_SPECIMENS = registerBlock("fantastic/unknown_specimens", new UnknownSpecimens(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block WIDE_GRAY_CARPET_LEFT = registerBlock("fantastic/wide_gray_carpet_left", new WideGrayCarpet(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block WIDE_GRAY_CARPET_RIGHT = registerBlock("fantastic/wide_gray_carpet_right", new WideGrayCarpet(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block UNKNOWN_BONES = registerBlock("fantastic/unknown_bones", new UnknownBones(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    // endregion

    // region LIFECYCLE
    public static final Block ANTI_EXPLOSION_TRASH_CAN = registerBlock("lifecycle/anti_explosion_trash_can", new AntiExplosionTrashCan(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block BLACK_FIBER_CARPET = registerBlock("lifecycle/black_fiber_carpet", new BlackFiberCarpet(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block BLACK_HANGING_BASKET = registerBlock("lifecycle/black_hanging_basket", new BlackHangingBasket(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block BUILT_IN_FILE_CABINET1 = registerBlock("lifecycle/built_in_file_cabinet1", new BuiltInFileCabinet(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block BUILT_IN_FILE_CABINET2 = registerBlock("lifecycle/built_in_file_cabinet2", new BuiltInFileCabinet(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block BUNK_BED_IN_CABIN_TOP = registerBlock("lifecycle/bunk_bed_in_cabin_top", new BunkBedInCabinTop(DyeColor.BLACK, AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block BUNK_BED_IN_CABIN_BOTTOM = registerBlock("lifecycle/bunk_bed_in_cabin_bottom", new BunkBedInCabin(DyeColor.BLACK, AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block CABIN_FIRE_EXTINGUISHER_KIT = registerBlock("lifecycle/cabin_fire_extinguisher_kit", new CabinFireExtinguisherKit(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block CABIN_FLUSH_MOUNT_PIPE_LEFT = registerBlock("lifecycle/cabin_flush_mount_pipe_left", new CabinFlushMountPipe(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block CABIN_FLUSH_MOUNT_PIPE_RIGHT = registerBlock("lifecycle/cabin_flush_mount_pipe_right", new CabinFlushMountPipe(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block CONTROL_DISPLAY = registerBlock("lifecycle/control_display", new ControlDisplay(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block DIY_SWIVEL_CHAIR = registerBlock("lifecycle/diy_swivel_chair", new DiySwivelChair(AbstractBlock.Settings.create().nonOpaque().strength(0.2f, 0.2f)));
    public static final Block DIY_WORKBENCH_LEFT = registerBlock("lifecycle/diy_workbench_left", new DiyWorkbench(AbstractBlock.Settings.create().nonOpaque().strength(0.3f, 0.2f)));
    public static final Block DIY_WORKBENCH_RIGHT = registerBlock("lifecycle/diy_workbench_right", new DiyWorkbench(AbstractBlock.Settings.create().nonOpaque().strength(0.3f, 0.2f)));
//    public static final Block FIRE_EXTINGUISHER = registerBlock("lifecycle/fire_extinguisher", new FireExtinguisher(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block GENERAL_CONSOLE = registerBlock("lifecycle/general_console", new GeneralConsole(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block LIGHT_GREEN_WALLPAPER = registerBlock("lifecycle/light_green_wallpaper", new FurnitureHorizontalFacingBlock(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block LIGHT_GREEN_WALLPAPER_FLOOR_MIDDLE = registerBlock("lifecycle/light_green_wallpaper_floor_middle", new FurnitureHorizontalFacingBlock(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block LIGHT_GREEN_WALLPAPER_FLOOR_RIGHT = registerBlock("lifecycle/light_green_wallpaper_floor_right", new FurnitureHorizontalFacingBlock(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block LIGHT_GREEN_WALLPAPER_REFUGE = registerBlock("lifecycle/light_green_wallpaper_refuge", new FurnitureHorizontalFacingBlock(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block LIGHT_GREEN_WALLPAPER_REFUGE2 = registerBlock("lifecycle/light_green_wallpaper_refuge2", new FurnitureHorizontalFacingBlock(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block LIGHT_GREEN_WALLPAPER_RIGHT = registerBlock("lifecycle/light_green_wallpaper_right", new FurnitureHorizontalFacingBlock(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block NOTE_BOARD_IN_CABIN_DISPLAY = registerBlock("lifecycle/note_board_in_cabin_display", new NoteBoardInCabinDisplay(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block NOTE_BOARD_IN_CABIN_SIGN = registerBlock("lifecycle/note_board_in_cabin_sign", new NoteBoardInCabinSign(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block POWER_BOX = registerBlock("lifecycle/power_box", new PowerBox(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block SUCK_BEVERAGES = registerBlock("lifecycle/suck_beverages", new SuckBeverages(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    // endregion

    // region COLUMBIAN
    public static final Block BAR_CEILING = registerBlock("columbian/bar_ceiling", new BarCeiling(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block BARSTOOL_WITH_CURVED_LEGS = registerBlock("columbian/barstool_with_curved_legs", new BarstoolWithCurvedLegs(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block BEVERAGE_CABINET_COFFEE = registerBlock("columbian/beverage_cabinet_coffee", new BeverageCabinet(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block BEVERAGE_CABINET_EMPTY = registerBlock("columbian/beverage_cabinet_empty", new BeverageCabinetEmpty(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block BEVERAGE_MENU = registerBlock("columbian/beverage_menu", new BeverageMenu(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block BOLIVARIAN_COFFEE_BEAN = registerBlock("columbian/bolivarian_coffee_bean", new BolivarianCoffeeBean(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block BRICK_PATTERN_WALLPAPER = registerBlock("columbian/brick_pattern_wallpaper", new BrickPatternWallpaper(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block BRICK_PATTERN_WALLPAPER_FLOOR = registerBlock("columbian/brick_pattern_wallpaper_floor", new BrickPatternWallpaper(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block BROWN_BOOKCASE_LB = registerBlockWithOutBlockItems("columbian/brown_bookcase_lb", new BrownBookcase(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block BROWN_BOOKCASE_LM = registerBlockWithOutBlockItems("columbian/brown_bookcase_lm", new BrownBookcase(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block BROWN_BOOKCASE_LT = registerBlockWithOutBlockItems("columbian/brown_bookcase_lt", new BrownBookcase(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block BROWN_BOOKCASE_RB = registerBlockWithOutBlockItems("columbian/brown_bookcase_rb", new BrownBookcase(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block BROWN_BOOKCASE_RM = registerBlockWithOutBlockItems("columbian/brown_bookcase_rm", new BrownBookcase(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block BROWN_BOOKCASE_RT = registerBlockWithOutBlockItems("columbian/brown_bookcase_rt", new BrownBookcase(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block COFFEE_BEAN_CAN = registerBlock("columbian/coffee_bean_can", new CoffeeBeanCan(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block COFFEE_BEAN_DISPLAY = registerBlock("columbian/coffee_bean_display", new CoffeeBeanDisplay(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block COFFEE_MENU = registerBlock("columbian/coffee_menu", new CoffeeMenu(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block COLUMBIAN_STREET_VIEW_PHOTO = registerBlock("columbian/columbian_street_view_photo", new ColumbianStreetViewPhoto(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block DINING_CHAIR = registerBlock("columbian/dining_chair", new DiningChair(AbstractBlock.Settings.create().nonOpaque().strength(0.2f, 0.2f)));
    public static final Block PEDESTAL_COFFEE_TABLE = registerBlock("columbian/pedestal_coffee_table", new PedestalCoffeeTable(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block PENDANT_LIGHT = registerBlock("columbian/pendant_light", new PendantLight(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block POTTED_LONG_LEAF_PLANT = registerBlock("columbian/potted_long_leaf_plant", new PottedLongLeafPlant(AbstractBlock.Settings.create().strength(0.1f, 0.1f).nonOpaque()));
    public static final Block RED_BRICK_CAFE_BAR = registerBlock("columbian/red_brick_cafe_bar", new RedBrickCafeBar(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block RED_BROWN_CABINET = registerBlock("columbian/red_brown_cabinet", new RedBrownCabinet(AbstractBlock.Settings.create().strength(0.2f, 0.2f), () -> ModBlockEntities.RED_BROWN_CABINET));
    public static final Block SOFT_CEILING_LIGHT = registerBlock("columbian/soft_ceiling_light", new SoftCeilingLight(AbstractBlock.Settings.create().strength(0.1f, 0.1f).nonOpaque()));
    public static final Block WOOD_ORNAMENT = registerBlock("columbian/wood_ornament", new WoodOrnament(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block CAFE_FLOOR = registerBlock("columbian/cafe_floor", new Block(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    // endregion

    // region LDG
    public static final Block BLACK_PEDESTAL_TABLE = registerBlock("ldg/black_pedestal_table", new BlackPedestalTable(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block BLACK_VINTAGE_CHAIR = registerBlock("ldg/black_vintage_chair", new BlackVintageChair(AbstractBlock.Settings.create().nonOpaque().strength(0.2f, 0.2f)));
    public static final Block BLACK_VINTAGE_STOOL = registerBlock("ldg/black_vintage_stool", new BlackVintageStool(AbstractBlock.Settings.create().nonOpaque().strength(0.2f, 0.2f)));
    public static final Block BRIGHT_WALL_LIGHT = registerBlock("ldg/bright_wall_light", new BrightWallLight(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block DUPLEX_WOODEN_FENCE_TOP = registerBlock("ldg/duplex_wooden_fence_top", new DuplexWoodenFence(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block DUPLEX_WOODEN_FENCE_BOTTOM = registerBlock("ldg/duplex_wooden_fence_bottom", new DuplexWoodenFence(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block DUPLEX_WOODEN_FENCE_BOTTOM_LIGHT = registerBlock("ldg/duplex_wooden_fence_bottom_light", new DuplexWoodenFenceLight(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block LOW_SANDALWOOD_MEETING_TABLE = registerBlock("ldg/low_sandalwood_meeting_table", new LowSandalwoodMeetingTable(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block SANDALWOOD_BED = registerBlock("ldg/sandalwood_bed", new FurnitureBedBlock(DyeColor.BROWN, AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block SANDALWOOD_MEETING_BOARD = registerBlock("ldg/sandalwood_meeting_board", new SandalwoodMeetingBoard(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block SIMPLE_BLACK_LOUNGE_CHAIR = registerBlock("ldg/simple_black_lounge_chair", new SimpleBlackLoungeChair(AbstractBlock.Settings.create().nonOpaque().strength(0.2f, 0.2f)));
    public static final Block SMALL_SANDALWOOD_NIGHTSTAND = registerBlock("ldg/small_sandalwood_nightstand", new SmallSandalwoodNightstand(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque(), () -> ModBlockEntities.SMALL_SANDALWOOD_NIGHTSTAND));
    public static final Block GRAY_WOOL_CARPET_LEFT = registerBlock("ldg/gray_wool_carpet_left", new GrayWoolCarpet(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block GRAY_WOOL_CARPET_RIGHT = registerBlock("ldg/gray_wool_carpet_right", new GrayWoolCarpet(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block PAINTING_WITH_SANDALWOOD_FRAME = registerBlock("ldg/painting_with_sandalwood_frame", new PaintingWithSandalwoodFrame(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    // endregion

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

    public static final Block BOARDED_UP_STONE_WINDOWS = registerBlock("occult/boarded_up_stone_windows",new BoardedUpStoneWindows(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block CAULDRON_OF_SWEETS = registerBlock("occult/cauldron_of_sweets",new CauldronOfSweets(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block DESK_OF_THE_OCCULT = registerBlock("occult/desk_of_the_occult",new DeskOfTheOccult(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block ELEGANT_SEAT = registerBlock("occult/elegant_seat",new ElegantSeat(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block MANY_RITUAL_GOURDS = registerBlock("occult/many_ritual_gourds",new ManyRitualGourds(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block RITUAL_CHANDELIER = registerBlock("occult/ritual_chandelier",new RitualChandelier(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block SEVERAL_RITUAL_GOURDS = registerBlock("occult/several_ritual_gourds",new SeveralRitualGourds(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block STACK_OF_GRIMOIRES = registerBlock("occult/stack_of_grimoires",new StackOfGrimoires(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block STRANGE_BED = registerBlock("occult/strange_bed",new FurnitureBedBlock(DyeColor.BLACK, AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block STRANGE_BED_LIGHT = registerBlock("occult/strange_bed_light",new StrangeBedLight(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block STRANGE_BED_TREE = registerBlock("occult/strange_bed_tree",new StrangeBedTree(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));

    public static final Block ADJUSTABLE_ROUND_STOOL = registerBlock("safehouse/adjustable_round_stool",new AdjustableRoundStool(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block COLLECTIBLE_BEVERAGE_DISPENSER = registerBlock("safehouse/collectible_beverage_dispenser",new CollectibleBeverageDispenser(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block COMFORTABLE_SOFA = registerBlock("safehouse/comfortable_sofa",new ComfortableSofa(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block FLUORESCENT_CEILING_LAMP = registerBlock("safehouse/fluorescent_ceiling_lamp",new FluorescentCeilingLamp(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block HIGH_POWER_FLOOR_LAMP = registerBlock("safehouse/high_power_floor_lamp",new HighPowerFloorLamp(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block MULTIFUNCTIONAL_WORKBENCH = registerBlock("safehouse/multifunctional_workbench",new MultifunctionalWorkbench(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block MULTIFUNCTIONAL_WORKBENCH_BOARD = registerBlock("safehouse/multifunctional_workbench_board",new MultifunctionalWorkbenchBoard(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block MULTIFUNCTIONAL_WORKBENCH_COMPUTER = registerBlock("safehouse/multifunctional_workbench_computer",new MultifunctionalWorkbenchComputer(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block OLD_RECORD_PLAYER = registerBlock("safehouse/old_record_player",new OldRecordPlayer(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block OUTGOING_SHIPMENTS = registerBlock("safehouse/outgoing_shipments",new OutgoingShipments(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block PENGUIN_CLUE_COLLECTION_BOARD = registerBlock("safehouse/penguin_clue_collection_board",new PenguinClueCollectionBoard(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block RED_SUNDRIES_SHELVES1 = registerBlock("safehouse/red_sundries_shelves1",new RedSundriesShelves(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block RED_SUNDRIES_SHELVES2 = registerBlock("safehouse/red_sundries_shelves2",new RedSundriesShelves(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block RED_SUNDRIES_SHELVES3 = registerBlock("safehouse/red_sundries_shelves3",new RedSundriesShelves(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block SAFEHOUSE_PARTITION_DOOR = registerBlock("safehouse/safehouse_partition_door",new SafehousePartitionDoor(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));

    public static final Block CEILING_FLOODLIGHTS = registerBlock("workstation/ceiling_floodlights",new CeilingFloodlights(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block CLEANSER = registerBlock("workstation/cleanser",new Cleanser(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block DUAL_BEAMED_CRANE = registerBlock("workstation/dual_beamed_crane",new DualBeamedCrane(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block INDUSTRIAL_CUTTING_STATION = registerBlock("workstation/industrial_cutting_station",new IndustrialCuttingStation(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block MATERIAL_CRATES = registerBlock("workstation/material_crates",new MaterialCrates(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque(), () -> ModBlockEntities.MATERIAL_CRATES));
    public static final Block ROBOTIC_ARM = registerBlock("workstation/robotic_arm",new RoboticArm(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block WEAPON_STORAGE_CABINET = registerBlock("workstation/weapon_storage_cabinet",new WeaponStorageCabinet(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block WHITE_ROUND_STOOL = registerBlock("workstation/white_round_stool",new WhiteRoundStool(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block WORKBENCH = registerBlock("workstation/workbench",new Workbench(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block WORKSTATION_BLACKBOARD = registerBlock("workstation/workstation_blackboard",new WorkstationBlackboard(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));

    public static final Block BAMBOO_SCREEN = registerBlock("eatery/bamboo_screen",new BambooScreen(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block BOILING_STATION = registerBlock("eatery/boiling_station",new BoilingStation(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block BOILING_STATION_POT = registerBlock("eatery/boiling_station_pot",new BoilingStationPot(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block CEILING_MOUNTED_LIGHTS = registerBlock("eatery/ceiling_mounted_lights",new CeilingMountedLights(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block EATERY_DINING_TABLE = registerBlock("eatery/eatery_dining_table",new EateryDiningTable(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block EATERY_ROUND_STOOL = registerBlock("eatery/eatery_round_stool",new EateryRoundStool(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block ELECTRIC_FRYING_TABLE = registerBlock("eatery/electric_frying_table",new ElectricFryingTable(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block HALF_SHUT_SCREEN = registerBlock("eatery/half_shut_screen",new HalfShutScreen(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block HEXAGONAL_LANTERN = registerBlock("eatery/hexagonal_lantern",new HexagonalLantern(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block INSCRIPTION_CEILING_PLAQUE = registerBlock("eatery/inscription_ceiling_plaque",new InscriptionCeilingPlaque(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block INSCRIPTION_CEILING_PLAQUE_FANG = registerBlock("eatery/inscription_ceiling_plaque_fang",new InscriptionCeilingPlaque(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block INSCRIPTION_CEILING_PLAQUE_JIAO = registerBlock("eatery/inscription_ceiling_plaque_jiao",new InscriptionCeilingPlaque(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block INSCRIPTION_CEILING_PLAQUE_LEFT = registerBlock("eatery/inscription_ceiling_plaque_left",new InscriptionCeilingPlaque(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block INSCRIPTION_CEILING_PLAQUE_LONG = registerBlock("eatery/inscription_ceiling_plaque_long",new InscriptionCeilingPlaque(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block INSCRIPTION_CEILING_PLAQUE_MENG = registerBlock("eatery/inscription_ceiling_plaque_meng",new InscriptionCeilingPlaque(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block INSCRIPTION_CEILING_PLAQUE_MENU1 = registerBlock("eatery/inscription_ceiling_plaque_menu1",new InscriptionCeilingPlaque(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block INSCRIPTION_CEILING_PLAQUE_MENU2 = registerBlock("eatery/inscription_ceiling_plaque_menu2",new InscriptionCeilingPlaque(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block INSCRIPTION_CEILING_PLAQUE_RIGHT = registerBlock("eatery/inscription_ceiling_plaque_right",new InscriptionCeilingPlaque(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block INSCRIPTION_CEILING_PLAQUE_ZI = registerBlock("eatery/inscription_ceiling_plaque_zi",new InscriptionCeilingPlaque(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block ORNAMENTAL_BONSAI = registerBlock("eatery/ornamental_bonsai",new OrnamentalBonsai(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block ORNAMENTAL_PLANT = registerBlock("eatery/ornamental_plant",new OrnamentalPlant(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block RECTANGULAR_BENCH = registerBlock("eatery/rectangular_bench",new RectangularBench(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block SMALL_SPOTLIGHT = registerBlock("eatery/small_spotlight",new SmallSpotlight(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block WOODEN_CORNER_TABLE = registerBlock("eatery/wooden_corner_table",new WoodenCornerTable(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));

    public static final Block FRESH_FOOD_CABINET = registerBlock("diner/fresh_food_cabinet",new FreshFoodCabinet(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block GARDEN_STYLE_CEILING_FIXTURE = registerBlock("diner/garden_style_ceiling_fixture",new GardenStyleCeilingFixture(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block GREEN_TWO_SEAT_SOFA = registerBlock("diner/green_two_seat_sofa",new GreenTwoSeatSofa(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block HEALTHY_DECORATIVE_PLATE = registerBlock("diner/healthy_decorative_plate",new HealthyDecorativePlate(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block HEALTHY_DINING_TABLE = registerBlock("diner/healthy_dining_table",new HealthyDiningTable(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block HEALTHY_MENU = registerBlock("diner/healthy_menu",new HealthyMenu(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block HEALTHY_SERVICE_COUNTER = registerBlock("diner/healthy_service_counter",new HealthyServiceCounter(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block HEALTHY_SERVICE_COUNTER_CASHIER = registerBlock("diner/healthy_service_counter_cashier",new HealthyServiceCounterCashier(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block HEALTHY_SPOTLIGHT = registerBlock("diner/healthy_spotlight",new HealthySpotlight(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block ICEY_JUICER = registerBlock("diner/icey_juicer",new IceyJuicer(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block SELF_SERVICE_ORDERING_KIOSK = registerBlock("diner/self_service_ordering_kiosk",new SelfServiceOrderingKiosk(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block TODAYS_RECOMMENDATIONS = registerBlock("diner/todays_recommendations",new TodaysRecommendations(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block VENDING_MACHINE = registerBlock("diner/vending_machine",new VendingMachine(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));

    public static final Block DOUBLE_ROW_SEATING = registerBlock("seven/double_row_seating",new DoubleRowSeating(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block DOUBLE_ROW_SEATING_DESK = registerBlock("seven/double_row_seating_desk",new DoubleRowSeatingDesk(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block GOURMET_FOOD_WARMER = registerBlock("seven/gourmet_food_warmer",new GourmetFoodWarmer(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block LARGE_NOTICE_BOARD = registerBlock("seven/large_notice_board",new LargeNoticeBoard(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block LIQUOR_STORAGE_RACK = registerBlock("seven/liquor_storage_rack",new LiquorStorageRack(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block PRISTINE_SERVICE_COUNTER = registerBlock("seven/pristine_service_counter",new PristineServiceCounter(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block RESTAURANT_NOTICE_BOARD = registerBlock("seven/restaurant_notice_board",new RestaurantNoticeBoard(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block SEVEN_CITIES_WARM_LIGHT_CHANDELIER = registerBlock("seven/seven_cities_warm_light_chandelier",new SevenCitiesWarmLightChandelier(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block UPSCALE_MENU_DISPLAY = registerBlock("seven/upscale_menu_display",new UpscaleMenuDisplay(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));

    public static final Block BOUNTY_DISPLAY_RACK = registerBlock("mercenary/bounty_display_rack",new BountyDisplayRack(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block BULLETPROOF_GLASS_DOOR = registerBlock("mercenary/bulletproof_glass_door",new BulletproofGlassDoor(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block HANGING_DARTBOARD = registerBlock("mercenary/hanging_dartboard",new HangingDartboard(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block HANGING_SHELVES = registerBlock("mercenary/hanging_shelves",new HangingShelves(AbstractBlock.Settings.create().strength(0.2f, 0.2f), () -> ModBlockEntities.HANGING_SHELVES));
    public static final Block HIGH_OUTPUT_EXPLOSIVE_MATERIAL = registerBlock("mercenary/high_output_explosive_material",new HighOutputExplosiveMaterial(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block IGNITION_TOOL = registerBlock("mercenary/ignition_tool",new IgnitionTool(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block LOUNGE_BULLETIN_BOARD = registerBlock("mercenary/lounge_bulletin_board",new LoungeBulletinBoard(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block LOUNGE_CEILING_LIGHT_FIXTURE = registerBlock("mercenary/lounge_ceiling_light_fixture",new LoungeCeilingLightFixture(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block LOUNGE_CHANDELIER = registerBlock("mercenary/lounge_chandelier",new LoungeChandelier(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block LOUNGE_TUBE_LIGHT = registerBlock("mercenary/lounge_tube_light",new LoungeTubeLight(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block RED_FRAMED_FLOOR_MIRROR = registerBlock("mercenary/red_framed_floor_mirror",new RedFramedFloorMirror(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block SARKAZ_BALL_RACK = registerBlock("mercenary/sarkaz_ball_rack",new SarkazBallRack(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block SARKAZ_POOL_TABLE = registerBlock("mercenary/sarkaz_pool_table",new SarkazPoolTable(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block SMALL_LOUNGE_WALL_LIGHT = registerBlock("mercenary/small_lounge_wall_light",new SmallLoungeWallLight(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block UPSCALE_DINING_TABLE = registerBlock("mercenary/upscale_dining_table",new UpscaleDiningTable(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));

    public static final Block CEILING_DISK_LIGHT = registerBlock("ursus/ceiling_disk_light",new CeilingDiskLight(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block HANGING_LAMP = registerBlock("ursus/hanging_lamp",new HangingLamp(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block LONG_WOODEN_TABLE = registerBlock("ursus/long_wooden_table",new LongWoodenTable(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block LOW_BOOKSHELF = registerBlock("ursus/low_bookshelf",new LowBookshelf(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block LOW_FLOOR_LAMP = registerBlock("ursus/low_floor_lamp",new LowFloorLamp(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block LOW_STORAGE_CABINET = registerBlock("ursus/low_storage_cabinet",new LowStorageCabinet(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque(), () -> ModBlockEntities.LOW_STORAGE_CABINET));
    public static final Block PORTABLE_PICNIC_STOVE = registerBlock("ursus/portable_picnic_stove",new PortablePicnicStove(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block SIMPLE_LOW_CHAIR = registerBlock("ursus/simple_low_chair",new SimpleLowChair(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block SQUAD_BULLETIN_BOARD = registerBlock("ursus/squad_bulletin_board",new SquadBulletinBoard(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));

    public static final Block ACCOMPANISTS_CHAIR = registerBlock("leithanian/accompanists_chair",new AccompanistsChair(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block ALL_IN_ONE_BOOKSHELF = registerBlock("leithanian/all_in_one_bookshelf",new AllInOneBookshelf(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block ALL_IN_ONE_BOOKSHELF_BOTTOM = registerBlock("leithanian/all_in_one_bookshelf_bottom",new AllInOneBookshelfBottom(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block ALL_IN_ONE_BOOKSHELF_UPPER = registerBlock("leithanian/all_in_one_bookshelf_upper",new AllInOneBookshelfUpper(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block ANTIQUE_PHONOGRAPH = registerBlock("leithanian/antique_phonograph",new AntiquePhonograph(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block EXTRA_LONG_WHITE_SOFA = registerBlock("leithanian/extra_long_white_sofa",new ExtraLongWhiteSofa(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block FOUR_CANDLE_CHANDELIER = registerBlock("leithanian/four_candle_chandelier",new FourCandleChandelier(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block FOUR_POSTER_BED = registerBlock("leithanian/four_poster_bed",new FurnitureBedBlock(DyeColor.BLACK, AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block GLOBE_OF_BALANCE = registerBlock("leithanian/globe_of_balance",new GlobeOfBalance(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block GRAND_SIX_CANDLE_CHANDELIER = registerBlock("leithanian/grand_six_candle_chandelier",new GrandSixCandleChandelier(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block LEITHANIAN_BEVERAGE = registerBlock("leithanian/leithanian_beverage",new LeithanianBeverage(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block MONOCHROMATIC_CELLO = registerBlock("leithanian/monochromatic_cello",new MonochromaticCello(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block PILE_OF_MISCELLANEOUS_BOOKS = registerBlock("leithanian/pile_of_miscellaneous_books",new PileOfMiscellaneousBooks(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));

    public static final Block CUBICLE_FLOORPLAN = registerBlock("hr/cubicle_floorplan",new CubicleFloorplan(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block CUBICLE_LIGHTING = registerBlock("hr/cubicle_lighting",new CubicleLighting(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block FLOOR_INDICATOR = registerBlock("hr/floor_indicator",new FloorIndicator(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block HR_OFFICE_LIGHTING = registerBlock("hr/hr_office_lighting",new HrOfficeLighting(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block OVERLOADED_PRINTER = registerBlock("hr/overloaded_printer",new OverloadedPrinter(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block PRICKLY_ORNAMENTAL_PLANT = registerBlock("hr/prickly_ornamental_plant",new PricklyOrnamentalPlant(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block SQUARE_SOFA_STOOL = registerBlock("hr/square_sofa_stool",new SquareSofaStool(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block STANDARD_ISSUE_OFFICE_CHAIR = registerBlock("hr/standard_issue_office_chair",new StandardIssueOfficeChair(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block STANDARD_ISSUE_WORKDESK = registerBlock("hr/standard_issue_workdesk",new StandardIssueWorkdesk(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block STANDARD_ISSUE_WORKDESK_COMPUTER = registerBlock("hr/standard_issue_workdesk_computer",new StandardIssueWorkdeskComputer(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block TRANSPARENT_DIVIDING_PARTITION = registerBlock("hr/transparent_dividing_partition",new TransparentDividingPartition(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block WATER_DISPENSER = registerBlock("hr/water_dispenser",new WaterDispenser(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block WHEELED_STORAGE_CABINET = registerBlock("hr/wheeled_storage_cabinet",new WheeledStorageCabinet(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque(), () -> ModBlockEntities.WHEELED_STORAGE_CABINET));

    public static final Block TOTEM_POT = registerBlock("tribal/totem_pot",new TotemPot(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block TOTEM_SPEAKERS = registerBlock("tribal/totem_speakers",new TotemSpeakers(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block TRIBAL_DECORATIVE_CHANDELIER = registerBlock("tribal/tribal_decorative_chandelier",new TribalDecorativeChandelier(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block TRIBAL_LOFT_BED = registerBlock("tribal/tribal_loft_bed",new FurnitureBedBlock(DyeColor.BLACK, AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block TRIBAL_STONE_STAND = registerBlock("tribal/tribal_stone_stand",new TribalStoneStand(AbstractBlock.Settings.create().strength(0.2f, 0.2f).nonOpaque()));
    public static final Block TRIBAL_STYLE_SOFA = registerBlock("tribal/tribal_style_sofa",new TribalStyleSofa(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block TROPICAL_POTTED_PLANT = registerBlock("tribal/tropical_potted_plant",new TropicalPottedPlant(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));

    private static Block registerBlockWithOutBlockItems(String id, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(ArknightsFurniture.MOD_ID, id), block);
    }

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
