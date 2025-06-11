package com.besson.arknights.item;

import com.besson.arknights.ArknightsFurniture;
import com.besson.arknights.block.ModBlocks;
import com.besson.arknights.item.custom.TapeItem;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ABYSSAL_HUNTERS_LOGO = registerItem("abyssal_hunters_logo", new Item(new Item.Settings()));
    public static final Item AEGIR_LOGO = registerItem("aegir_logo", new Item(new Item.Settings()));
    public static final Item BABEL_LOGO = registerItem("babel_logo", new Item(new Item.Settings()));
    public static final Item BLACK_STEEL_LOGO = registerItem("black_steel_logo", new Item(new Item.Settings()));
    public static final Item BOLIVAR_LOGO = registerItem("bolivar_logo", new Item(new Item.Settings()));
    public static final Item COLUMBIA_LOGO = registerItem("columbia_logo", new Item(new Item.Settings()));
    public static final Item DONG_LOGO = registerItem("dong_logo", new Item(new Item.Settings()));
    public static final Item DUBLINN_LOGO = registerItem("dublinn_logo", new Item(new Item.Settings()));
    public static final Item ELITE_OP_LOGO = registerItem("elite_op_logo", new Item(new Item.Settings()));
    public static final Item FOLLOWERS_LOGO = registerItem("followers_logo", new Item(new Item.Settings()));
    public static final Item GLASGOW_LOGO = registerItem("glasgow_logo", new Item(new Item.Settings()));
    public static final Item IBERIA_LOGO = registerItem("iberia_logo", new Item(new Item.Settings()));
    public static final Item KARLAN_TRADE_LOGO = registerItem("karlan_trade_logo", new Item(new Item.Settings()));
    public static final Item KAZIMIERZ_LOGO = registerItem("kazimierz_logo", new Item(new Item.Settings()));
    public static final Item KJERAG_LOGO = registerItem("kjerag_logo", new Item(new Item.Settings()));
    public static final Item LATERANO_LOGO = registerItem("laterano_logo", new Item(new Item.Settings()));
    public static final Item LEES_DETECTIVE_AGENCY_LOGO = registerItem("lee-s_detective_agency_logo", new Item(new Item.Settings()));
    public static final Item LEITHANIEN_LOGO = registerItem("leithanien_logo", new Item(new Item.Settings()));
    public static final Item LUNGMEN_GUARD_DEPARTMENT_LOGO = registerItem("lungmen_guard_department_logo", new Item(new Item.Settings()));
    public static final Item LUNGMEN_LOGO = registerItem("lungmen_logo", new Item(new Item.Settings()));
    public static final Item MINOS_LOGO = registerItem("minos_logo", new Item(new Item.Settings()));
    public static final Item OP_A4_LOGO = registerItem("op_a4_logo", new Item(new Item.Settings()));
    public static final Item OP_RESERVE_A1_LOGO = registerItem("op_reserve_a1_logo", new Item(new Item.Settings()));
    public static final Item OP_RESERVE_A4_LOGO = registerItem("op_reserve_a4_logo", new Item(new Item.Settings()));
    public static final Item OP_RESERVE_A6_LOGO = registerItem("op_reserve_a6_logo", new Item(new Item.Settings()));
    public static final Item PENGUIN_LOGISTICS_LOGO = registerItem("penguin_logistics_logo", new Item(new Item.Settings()));
    public static final Item PINUS_SYLVESTRIS_LOGO = registerItem("pinus_sylvestris_logo", new Item(new Item.Settings()));
    public static final Item RHINE_LAB_LOGO = registerItem("rhine_lab_logo", new Item(new Item.Settings()));
    public static final Item RHODES_ISLAND_LOGO = registerItem("rhodes_island_logo", new Item(new Item.Settings()));
    public static final Item RHODES_ISLAND_OVERRIDE_LOGO = registerItem("rhodes_island_override_logo", new Item(new Item.Settings()));
    public static final Item RIM_BILLITON_LOGO = registerItem("rim_billiton_logo", new Item(new Item.Settings()));
    public static final Item SAMI_LOGO = registerItem("sami_logo", new Item(new Item.Settings()));
    public static final Item SARGON_LOGO = registerItem("sargon_logo", new Item(new Item.Settings()));
    public static final Item SIESTA_LOGO = registerItem("siesta_logo", new Item(new Item.Settings()));
    public static final Item SIRACUSA_BRANCHES_LOGO = registerItem("siracusa_branches_logo", new Item(new Item.Settings()));
    public static final Item SIRACUSA_LOGO = registerItem("siracusa_logo", new Item(new Item.Settings()));
    public static final Item SUI_LOGO = registerItem("sui_logo", new Item(new Item.Settings()));
    public static final Item SWEEP_LOGO = registerItem("sweep_logo", new Item(new Item.Settings()));
    public static final Item TEAM_RAINBOW_LOGO = registerItem("team_rainbow_logo", new Item(new Item.Settings()));
    public static final Item URSUS_LOGO = registerItem("ursus_logo", new Item(new Item.Settings()));
    public static final Item URSUS_STUDENT_SELF_GOVERNING_GROUP_LOGO = registerItem("ursus_student_self-governing_group_logo", new Item(new Item.Settings()));
    public static final Item VICTORIA_LOGO = registerItem("victoria_logo", new Item(new Item.Settings()));
    public static final Item YAN_LOGO = registerItem("yan_logo", new Item(new Item.Settings()));

    public static final Item FURN_PARTS = registerItem("furn_parts", new Item(new Item.Settings()));
    public static final Item CARDBOARD = registerItem("cardboard", new Item(new Item.Settings()));
    public static final Item FURN_PARTS_ZIP1 = registerItem("furn_parts_zip1", new Item(new Item.Settings()));
    public static final Item FURN_PARTS_ZIP2 = registerItem("furn_parts_zip2", new Item(new Item.Settings()));

    public static final Item DAMAGED_DEVICE = registerItem("material/damaged_device", new Item(new Item.Settings()));
    public static final Item DIKETON = registerItem("material/diketon", new Item(new Item.Settings()));
    public static final Item ESTER = registerItem("material/ester", new Item(new Item.Settings()));
    public static final Item ORIROCK = registerItem("material/orirock", new Item(new Item.Settings()));
    public static final Item ORIRON_SHARD = registerItem("material/oriron_shard", new Item(new Item.Settings()));
    public static final Item SUGAR_SUBSTITUTE = registerItem("material/sugar_substitute", new Item(new Item.Settings()));

    public static final Item TAPE = registerItem("tape", new TapeItem(new Item.Settings()));

    public static final Item BROWN_BOOKCASE = registerSameBlockItem(ModBlocks.BROWN_BOOKCASE_LB, ModBlocks.BROWN_BOOKCASE_RB,
            ModBlocks.BROWN_BOOKCASE_LT, ModBlocks.BROWN_BOOKCASE_RT, ModBlocks.BROWN_BOOKCASE_LM, ModBlocks.BROWN_BOOKCASE_RM);
    public static final Item LARGE_SHELF = registerSameBlockItem(ModBlocks.LARGE_SHELF1, ModBlocks.LARGE_SHELF2, ModBlocks.LARGE_SHELF3, ModBlocks.LARGE_SHELF4);
    public static final Item CHECKERBOARD_BOOKCASE = registerSameBlockItem(ModBlocks.CHECKERBOARD_BOOKCASE_BBL, ModBlocks.CHECKERBOARD_BOOKCASE_BBR, ModBlocks.CHECKERBOARD_BOOKCASE_BTL,
            ModBlocks.CHECKERBOARD_BOOKCASE_BTR, ModBlocks.CHECKERBOARD_BOOKCASE_MBL, ModBlocks.CHECKERBOARD_BOOKCASE_MBR, ModBlocks.CHECKERBOARD_BOOKCASE_MTL, ModBlocks.CHECKERBOARD_BOOKCASE_MTR,
            ModBlocks.CHECKERBOARD_BOOKCASE_TL, ModBlocks.CHECKERBOARD_BOOKCASE_TR);
    public static final Item GRAYISH_WALL_BOTTOM = registerSameBlockItem(ModBlocks.GRAYISH_WALL_BBL, ModBlocks.GRAYISH_WALL_BBR, ModBlocks.GRAYISH_WALL_BTL, ModBlocks.GRAYISH_WALL_BTR);
    public static final Item GRAYISH_WALL_TOP = registerSameBlockItem(ModBlocks.GRAYISH_WALL_TBL, ModBlocks.GRAYISH_WALL_TBR, ModBlocks.GRAYISH_WALL_TTL, ModBlocks.GRAYISH_WALL_TTR);
    public static final Item SIMPLE_BLACK_DESK = registerSameBlockItem(ModBlocks.SIMPLE_BLACK_DESK_LBL, ModBlocks.SIMPLE_BLACK_DESK_LBR, ModBlocks.SIMPLE_BLACK_DESK_LTL, ModBlocks.SIMPLE_BLACK_DESK_LTR,
            ModBlocks.SIMPLE_BLACK_DESK_RBL, ModBlocks.SIMPLE_BLACK_DESK_RBR, ModBlocks.SIMPLE_BLACK_DESK_RTL, ModBlocks.SIMPLE_BLACK_DESK_RTR);
    public static final Item ECO_EXHIBITION_CABINET = registerSameBlockItem(ModBlocks.ECO_EXHIBITION_CABINET, ModBlocks.ECO_EXHIBITION_CABINET_BASE);
    public static final Item COPPER_FLOOR = registerSameBlockItem(ModBlocks.COPPER_FLOOR_FRONT, ModBlocks.COPPER_FLOOR_BEHIND);
    public static final Item METALLIC_WALLPAPER1 = registerSameBlockItem(ModBlocks.METALLIC_WALLPAPER_BOTTOM, ModBlocks.METALLIC_WALLPAPER_TOP);
    public static final Item METALLIC_WALLPAPER2 = registerSameBlockItem(ModBlocks.METALLIC_WALLPAPER_LB, ModBlocks.METALLIC_WALLPAPER_LT, ModBlocks.METALLIC_WALLPAPER_RB, ModBlocks.METALLIC_WALLPAPER_RT);
    private static Item registerSameBlockItem(Block block, Block... blocks){
        BlockItem blockItem = new BlockItem(block, new Item.Settings());
        for (Block b : blocks) {
            Item.BLOCK_ITEMS.put(b, blockItem);
        }
        return Registry.register(Registries.ITEM, new Identifier(ArknightsFurniture.MOD_ID, Registries.BLOCK.getId(block).getPath()), blockItem);
    }
    private static Item registerItem(String id, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ArknightsFurniture.MOD_ID, id),item);
    }
    public static void registerItems() {
        ArknightsFurniture.LOGGER.info("Registering items...");
    }
}
