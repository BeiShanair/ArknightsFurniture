package com.besson.arknights.datagen;

import com.besson.arknights.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.AIR_MATTRESS);
        addDrop(ModBlocks.ATTENDANCE_BOARD);
        addDrop(ModBlocks.CARGO_TROLLEY);
        addDrop(ModBlocks.CARTON);
        addDrop(ModBlocks.CARTON_STOOL);
        addDrop(ModBlocks.GRAFFITI);
        addDrop(ModBlocks.LARGE_SHELF1);
        addDrop(ModBlocks.LARGE_SHELF2);
        addDrop(ModBlocks.LARGE_SHELF3);
        addDrop(ModBlocks.LARGE_SHELF4);
        addDrop(ModBlocks.PALLET);
        addDrop(ModBlocks.PILE_OF_CARTONS);
        addDrop(ModBlocks.PORTABLE_CALCULATOR);
        addDrop(ModBlocks.POST_IT_NOTE);

        addDrop(ModBlocks.GRAYISH_WALL_LIGHT);
        addDrop(ModBlocks.SIMPLE_BLACK_CLOCK);
        addDrop(ModBlocks.BLACK_HD_TV);
        addDrop(ModBlocks.BLACK_NIGHTSTAND);
        addDrop(ModBlocks.BLACK_BED);
        addDrop(ModBlocks.SMALL_CALLBOARD);
        addDrop(ModBlocks.BLACK_AND_WHITE_SQUARE_TABLE);
        addDrop(ModBlocks.LOW_BLACK_AND_WHITE_SOFA);
        addDrop(ModBlocks.CHECKERBOARD_BOOKCASE1);
        addDrop(ModBlocks.CHECKERBOARD_BOOKCASE2);
        addDrop(ModBlocks.CHECKERBOARD_BOOKCASE3);
        addDrop(ModBlocks.BLACK_OFFICE_CHAIR);
        addDrop(ModBlocks.SIMPLE_BLACK_CABINET);
        addDrop(ModBlocks.SIMPLE_BLACK_DESK_LEFT);
        addDrop(ModBlocks.SIMPLE_BLACK_DESK_RIGHT);

        addDrop(ModBlocks.ORANGE_WALL_LAMP);
        addDrop(ModBlocks.SIMPLE_ORANGE_CLOCK);
        addDrop(ModBlocks.ORANGE_HD_TV);
        addDrop(ModBlocks.ORANGE_NIGHTSTAND);
        addDrop(ModBlocks.ORANGE_BED);
        addDrop(ModBlocks.SMALL_NOTICEBOARD);
        addDrop(ModBlocks.ORANGE_SQUARE_TABLE);
        addDrop(ModBlocks.LOW_ORANGE_SOFA);
        addDrop(ModBlocks.ORANGE_CHECKERBOARD_BOOKCASE1);
        addDrop(ModBlocks.ORANGE_CHECKERBOARD_BOOKCASE2);
        addDrop(ModBlocks.ORANGE_CHECKERBOARD_BOOKCASE3);
        addDrop(ModBlocks.ORANGE_SWIVEL_CHAIR);
        addDrop(ModBlocks.SIMPLE_ORANGE_CABINET);
        addDrop(ModBlocks.SIMPLE_ORANGE_DESK_LEFT);
        addDrop(ModBlocks.SIMPLE_ORANGE_DESK_RIGHT);

    }
}
