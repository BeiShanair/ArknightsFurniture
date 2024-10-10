package com.besson.arknights.item;

import com.besson.arknights.ArknightsFurniture;
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
    private static Item registerItem(String id, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ArknightsFurniture.MOD_ID, id),item);
    }
    public static void registerItems() {
        ArknightsFurniture.LOGGER.info("Registering items...");
    }
}
