package com.besson.arknights.item;

import com.besson.arknights.ArknightsFurniture;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    // 图标
    public static final ItemGroup LOGO = Registry.register(Registries.ITEM_GROUP, new Identifier(ArknightsFurniture.MOD_ID, "logo"),
            ItemGroup.create(null, -1).displayName(Text.translatable("itemGroup.logo"))
                    .icon(() -> new ItemStack(ModItems.RHODES_ISLAND_OVERRIDE_LOGO)).entries((displayContext, entries) -> {
                        entries.add(ModItems.ABYSSAL_HUNTERS_LOGO);
                        entries.add(ModItems.AEGIR_LOGO);
                        entries.add(ModItems.BABEL_LOGO);
                        entries.add(ModItems.BLACK_STEEL_LOGO);
                        entries.add(ModItems.BOLIVAR_LOGO);
                        entries.add(ModItems.COLUMBIA_LOGO);
                        entries.add(ModItems.DONG_LOGO);
                        entries.add(ModItems.DUBLINN_LOGO);
                        entries.add(ModItems.ELITE_OP_LOGO);
                        entries.add(ModItems.FOLLOWERS_LOGO);
                        entries.add(ModItems.GLASGOW_LOGO);
                        entries.add(ModItems.IBERIA_LOGO);
                        entries.add(ModItems.KARLAN_TRADE_LOGO);
                        entries.add(ModItems.KAZIMIERZ_LOGO);
                        entries.add(ModItems.KJERAG_LOGO);
                        entries.add(ModItems.LATERANO_LOGO);
                        entries.add(ModItems.LEES_DETECTIVE_AGENCY_LOGO);
                        entries.add(ModItems.LEITHANIEN_LOGO);
                        entries.add(ModItems.LUNGMEN_GUARD_DEPARTMENT_LOGO);
                        entries.add(ModItems.LUNGMEN_LOGO);
                        entries.add(ModItems.MINOS_LOGO);
                        entries.add(ModItems.OP_A4_LOGO);
                        entries.add(ModItems.OP_RESERVE_A1_LOGO);
                        entries.add(ModItems.OP_RESERVE_A4_LOGO);
                        entries.add(ModItems.OP_RESERVE_A6_LOGO);
                        entries.add(ModItems.PENGUIN_LOGISTICS_LOGO);
                        entries.add(ModItems.PINUS_SYLVESTRIS_LOGO);
                        entries.add(ModItems.RHINE_LAB_LOGO);
                        entries.add(ModItems.RHODES_ISLAND_LOGO);
                        entries.add(ModItems.RHODES_ISLAND_OVERRIDE_LOGO);
                        entries.add(ModItems.RIM_BILLITON_LOGO);
                        entries.add(ModItems.SAMI_LOGO);
                        entries.add(ModItems.SARGON_LOGO);
                        entries.add(ModItems.SIESTA_LOGO);
                        entries.add(ModItems.SIRACUSA_BRANCHES_LOGO);
                        entries.add(ModItems.SIRACUSA_LOGO);
                        entries.add(ModItems.SUI_LOGO);
                        entries.add(ModItems.SWEEP_LOGO);
                        entries.add(ModItems.TEAM_RAINBOW_LOGO);
                        entries.add(ModItems.URSUS_LOGO);
                        entries.add(ModItems.URSUS_STUDENT_SELF_GOVERNING_GROUP_LOGO);
                        entries.add(ModItems.VICTORIA_LOGO);
                        entries.add(ModItems.YAN_LOGO);
                    }).build());
    // 材料
    public static final ItemGroup MATERIAL = Registry.register(Registries.ITEM_GROUP, new Identifier(ArknightsFurniture.MOD_ID, "material"),
            ItemGroup.create(null, -1).displayName(Text.translatable("itemGroup.material"))
                    .icon(() -> new ItemStack(ModItems.FURN_PARTS)).entries((displayContext, entries) -> {
                        entries.add(ModItems.FURN_PARTS);
                    }).build());
    public static void registerItemGroups() {
        ArknightsFurniture.LOGGER.info("Registering item groups...");
    }
}