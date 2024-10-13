package com.besson.arknights.block;

import com.besson.arknights.ArknightsFurniture;
import com.besson.arknights.block.custom.sideline.*;
import com.besson.arknights.block.custom.warehouse.*;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block AIR_MATTRESS = registerBlock("air_mattress", new AirMattress(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block ATTENDANCE_BOARD = registerBlock("attendance_board", new AttendanceBoard(AbstractBlock.Settings.create().strength(0.3f, 0.3f)));
    public static final Block CARGO_TROLLEY = registerBlock("cargo_trolley", new CargoTrolley(AbstractBlock.Settings.create().strength(0.3f, 0.5f)));
    public static final Block CARTON = registerBlock("carton", new Carton(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block CARTON_STOOL = registerBlock("carton_stool", new CartonStool(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block GRAFFITI = registerBlock("graffiti", new Graffiti(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block LARGE_SHELF1 = registerBlock("large_shelf1", new LargeShelf(AbstractBlock.Settings.create().strength(0.5f, 0.5f)));
    public static final Block LARGE_SHELF2 = registerBlock("large_shelf2", new LargeShelf(AbstractBlock.Settings.create().strength(0.5f, 0.5f)));
    public static final Block LARGE_SHELF3 = registerBlock("large_shelf3", new LargeShelf(AbstractBlock.Settings.create().strength(0.5f, 0.5f)));
    public static final Block LARGE_SHELF4 = registerBlock("large_shelf4", new LargeShelf(AbstractBlock.Settings.create().strength(0.5f, 0.5f)));
    public static final Block PALLET = registerBlock("pallet", new Pallet(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block PILE_OF_CARTONS = registerBlock("pile_of_cartons", new PileOfCartons(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block PORTABLE_CALCULATOR = registerBlock("portable_calculator", new PortableCalculator(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block POST_IT_NOTE = registerBlock("post_it_note", new PostItNote(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));

    public static final Block GRAYISH_WALL_LIGHT = registerBlock("grayish_wall_light", new WallLight(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block SIMPLE_BLACK_CLOCK = registerBlock("simple_black_clock", new SimpleClock(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block BLACK_HD_TV = registerBlock("black_hd_tv", new HDTV(AbstractBlock.Settings.create().strength(0.2f, 0.1f)));
    public static final Block BLACK_NIGHTSTAND = registerBlock("black_nightstand", new Nightstand(AbstractBlock.Settings.create().nonOpaque().strength(0.2f, 0.2f)));
    public static final Block BLACK_BED = registerBlock("black_bed", new SimpleBed(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block SMALL_CALLBOARD = registerBlock("small_callboard", new SmallCallboard(AbstractBlock.Settings.create().strength(0.1f, 0.1f)));
    public static final Block BLACK_AND_WHITE_SQUARE_TABLE = registerBlock("black_and_white_square_table", new SquareTable(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block LOW_BLACK_AND_WHITE_SOFA = registerBlock("low_black_and_white_sofa", new LowSofa(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block CHECKERBOARD_BOOKCASE1 = registerBlock("checkerboard_bookcase1", new CheckerboardBookcase(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block CHECKERBOARD_BOOKCASE2 = registerBlock("checkerboard_bookcase2", new CheckerboardBookcase(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block CHECKERBOARD_BOOKCASE3 = registerBlock("checkerboard_bookcase3", new CheckerboardBookcase(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block SIMPLE_BLACK_CABINET = registerBlock("simple_black_cabinet", new SimpleCabinet(AbstractBlock.Settings.create().strength(0.2f, 0.2f)));
    public static final Block BLACK_OFFICE_CHAIR = registerBlock("black_office_chair", new OfficeChair(AbstractBlock.Settings.create().nonOpaque().strength(0.2f, 0.2f)));
    public static final Block SIMPLE_BLACK_DESK_LEFT = registerBlock("simple_black_desk_left", new SimpleDesk(AbstractBlock.Settings.create().nonOpaque().strength(0.3f, 0.2f)));
    public static final Block SIMPLE_BLACK_DESK_RIGHT = registerBlock("simple_black_desk_right", new SimpleDesk(AbstractBlock.Settings.create().nonOpaque().strength(0.3f, 0.2f)));
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
