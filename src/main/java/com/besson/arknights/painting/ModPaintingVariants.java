package com.besson.arknights.painting;

import com.besson.arknights.ArknightsFurniture;
import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModPaintingVariants {
    public static final PaintingVariant ABYSSAL_HUNTERS = registerPaintingVariant("abyssal_hunters", new PaintingVariant(64, 64));
    public static final PaintingVariant AEGIR = registerPaintingVariant("aegir", new PaintingVariant(64, 64));
    public static final PaintingVariant BABEL = registerPaintingVariant("babel", new PaintingVariant(64, 64));
    public static final PaintingVariant BLACK_STEEL = registerPaintingVariant("black_steel", new PaintingVariant(64, 64));
    public static final PaintingVariant BOLIVAR = registerPaintingVariant("bolivar", new PaintingVariant(64, 64));
    public static final PaintingVariant COLUMBIA = registerPaintingVariant("columbia", new PaintingVariant(64, 64));
    public static final PaintingVariant DONG = registerPaintingVariant("dong", new PaintingVariant(64, 64));
    public static final PaintingVariant DUBLINN = registerPaintingVariant("dublinn", new PaintingVariant(64, 64));
    public static final PaintingVariant ELITE_OP = registerPaintingVariant("elite_op", new PaintingVariant(64, 64));
    public static final PaintingVariant FOLLOWERS = registerPaintingVariant("followers", new PaintingVariant(64, 64));
    public static final PaintingVariant GLASGOW = registerPaintingVariant("glasgow", new PaintingVariant(64, 64));
    public static final PaintingVariant IBERIA = registerPaintingVariant("iberia", new PaintingVariant(64, 64));
    public static final PaintingVariant KARLAN_TRADE = registerPaintingVariant("karlan_trade", new PaintingVariant(64, 64));
    public static final PaintingVariant KAZIMIERZ = registerPaintingVariant("kazimierz", new PaintingVariant(64, 64));
    public static final PaintingVariant KJERAG = registerPaintingVariant("kjerag", new PaintingVariant(64, 64));
    public static final PaintingVariant LATERANO = registerPaintingVariant("laterano", new PaintingVariant(64, 64));
    public static final PaintingVariant LEES_DETECTIVE_AGENCY = registerPaintingVariant("lee-s_detective_agency", new PaintingVariant(64, 64));
    public static final PaintingVariant LEITHANIEN = registerPaintingVariant("leithanien", new PaintingVariant(64, 64));
    public static final PaintingVariant LUNGMEN_GUARD_DEPARTMENT = registerPaintingVariant("lungmen_guard_department", new PaintingVariant(64, 64));
    public static final PaintingVariant LUNGMEN = registerPaintingVariant("lungmen", new PaintingVariant(64, 64));
    public static final PaintingVariant MINOS = registerPaintingVariant("minos", new PaintingVariant(64, 64));
    public static final PaintingVariant OP_A4 = registerPaintingVariant("op_a4", new PaintingVariant(64, 64));
    public static final PaintingVariant OP_RESERVE_A1 = registerPaintingVariant("op_reserve_a1", new PaintingVariant(64, 64));
    public static final PaintingVariant OP_RESERVE_A4 = registerPaintingVariant("op_reserve_a4", new PaintingVariant(64, 64));
    public static final PaintingVariant OP_RESERVE_A6 = registerPaintingVariant("op_reserve_a6", new PaintingVariant(64, 64));
    public static final PaintingVariant PENGUIN_LOGISTICS = registerPaintingVariant("penguin_logistics", new PaintingVariant(64, 64));
    public static final PaintingVariant PINUS_SYLVESTRIS = registerPaintingVariant("pinus_sylvestris", new PaintingVariant(64, 64));
    public static final PaintingVariant RHINE_LAB = registerPaintingVariant("rhine_lab", new PaintingVariant(64, 64));
    public static final PaintingVariant RHODES_ISLAND = registerPaintingVariant("rhodes_island", new PaintingVariant(64, 64));
    public static final PaintingVariant RHODES_ISLAND_OVERRIDE = registerPaintingVariant("rhodes_island_override", new PaintingVariant(64, 64));
    public static final PaintingVariant RIM_BILLITON = registerPaintingVariant("rim_billiton", new PaintingVariant(64, 64));
    public static final PaintingVariant SAMI = registerPaintingVariant("sami", new PaintingVariant(64, 64));
    public static final PaintingVariant SARGON = registerPaintingVariant("sargon", new PaintingVariant(64, 64));
    public static final PaintingVariant SIESTA = registerPaintingVariant("siesta", new PaintingVariant(64, 64));
    public static final PaintingVariant SIRACUSA_BRANCHES = registerPaintingVariant("siracusa_branches", new PaintingVariant(64, 64));
    public static final PaintingVariant SIRACUSA = registerPaintingVariant("siracusa", new PaintingVariant(64, 64));
    public static final PaintingVariant SUI = registerPaintingVariant("sui", new PaintingVariant(64, 64));
    public static final PaintingVariant SWEEP = registerPaintingVariant("sweep", new PaintingVariant(64, 64));
    public static final PaintingVariant TEAM_RAINBOW = registerPaintingVariant("team_rainbow", new PaintingVariant(64, 64));
    public static final PaintingVariant URSUS = registerPaintingVariant("ursus", new PaintingVariant(64, 64));
    public static final PaintingVariant URSUS_STUDENT_SELF_GOVERNING_GROUP = registerPaintingVariant("ursus_student_self-governing_group", new PaintingVariant(64, 64));
    public static final PaintingVariant VICTORIA = registerPaintingVariant("victoria", new PaintingVariant(64, 64));
    public static final PaintingVariant YAN = registerPaintingVariant("yan", new PaintingVariant(64, 64));
    public static final PaintingVariant UNKNOWN_BONES = registerPaintingVariant("unknown_bones", new PaintingVariant(16, 32));
    public static final PaintingVariant UNKNOWN_SPECIMEN1 = registerPaintingVariant("unknown_specimen1", new PaintingVariant(32, 16));
    public static final PaintingVariant UNKNOWN_SPECIMEN2 = registerPaintingVariant("unknown_specimen2", new PaintingVariant(16, 16));
    public static final PaintingVariant UNKNOWN_SPECIMEN3 = registerPaintingVariant("unknown_specimen3", new PaintingVariant(16, 16));
    public static final PaintingVariant PAINTING_WITH_SANDALWOOD_FRAME = registerPaintingVariant("painting_with_sandalwood_frame", new PaintingVariant(16, 32));

    private static PaintingVariant registerPaintingVariant(String id, PaintingVariant variant) {
        return Registry.register(Registries.PAINTING_VARIANT, new Identifier(ArknightsFurniture.MOD_ID, id), variant);
    }
    public static void registerPaintings() {

    }
}
