package com.besson.arknights.datagen;

import com.besson.arknights.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class ModEnUsLangProvider extends FabricLanguageProvider {
    public ModEnUsLangProvider(FabricDataOutput dataOutput) {
        super(dataOutput, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.ABYSSAL_HUNTERS_LOGO, "Abyssal Hunters Logo");
        translationBuilder.add(ModItems.AEGIR_LOGO, "Aegir Logo");
        translationBuilder.add(ModItems.BABEL_LOGO, "Babel Logo");
        translationBuilder.add(ModItems.BLACK_STEEL_LOGO, "Black Steel Logo");
        translationBuilder.add(ModItems.BOLIVAR_LOGO, "Bolivar Logo");
        translationBuilder.add(ModItems.COLUMBIA_LOGO, "Columbia Logo");
        translationBuilder.add(ModItems.DONG_LOGO, "Dong Logo");
        translationBuilder.add(ModItems.DUBLINN_LOGO, "Dublinn Logo");
        translationBuilder.add(ModItems.ELITE_OP_LOGO, "Elite Op Logo");
        translationBuilder.add(ModItems.FOLLOWERS_LOGO, "Followers Logo");
        translationBuilder.add(ModItems.GLASGOW_LOGO, "Glasgow Logo");
        translationBuilder.add(ModItems.IBERIA_LOGO, "Iberia Logo");
        translationBuilder.add(ModItems.KARLAN_TRADE_LOGO, "Karlan Trade Logo");
        translationBuilder.add(ModItems.KAZIMIERZ_LOGO, "Kazimierz Logo");
        translationBuilder.add(ModItems.KJERAG_LOGO, "Kjerag Logo");
        translationBuilder.add(ModItems.LATERANO_LOGO, "Laterano Logo");
        translationBuilder.add(ModItems.LEES_DETECTIVE_AGENCY_LOGO, "Lee's Detective Agency Logo");
        translationBuilder.add(ModItems.LEITHANIEN_LOGO, "Leithanien Logo");
        translationBuilder.add(ModItems.LUNGMEN_GUARD_DEPARTMENT_LOGO, "Lungmen Guard Department Logo");
        translationBuilder.add(ModItems.LUNGMEN_LOGO, "Lungmen Logo");
        translationBuilder.add(ModItems.MINOS_LOGO, "Minos Logo");
        translationBuilder.add(ModItems.OP_A4_LOGO, "Op A4 Logo");
        translationBuilder.add(ModItems.OP_RESERVE_A1_LOGO, "Op Reserve A1 Logo");
        translationBuilder.add(ModItems.OP_RESERVE_A4_LOGO, "Op Reserve A4 Logo");
        translationBuilder.add(ModItems.OP_RESERVE_A6_LOGO, "Op Reserve A6 Logo");
        translationBuilder.add(ModItems.PENGUIN_LOGISTICS_LOGO, "Penguin Logistics Logo");
        translationBuilder.add(ModItems.PINUS_SYLVESTRIS_LOGO, "Pinus Sylvestris Logo");
        translationBuilder.add(ModItems.RHINE_LAB_LOGO, "Rhine Lab Logo");
        translationBuilder.add(ModItems.RHODES_ISLAND_LOGO, "Rhodes Island Logo");
        translationBuilder.add(ModItems.RHODES_ISLAND_OVERRIDE_LOGO, "Rhodes Island Override Logo");
        translationBuilder.add(ModItems.RIM_BILLITON_LOGO, "Rim Billiton Logo");
        translationBuilder.add(ModItems.SAMI_LOGO, "Sami Logo");
        translationBuilder.add(ModItems.SARGON_LOGO, "Sargon Logo");
        translationBuilder.add(ModItems.SIESTA_LOGO, "Siesta Logo");
        translationBuilder.add(ModItems.SIRACUSA_BRANCHES_LOGO, "Siracusa Branches Logo");
        translationBuilder.add(ModItems.SIRACUSA_LOGO, "Siracusa Logo");
        translationBuilder.add(ModItems.SUI_LOGO, "Sui Logo");
        translationBuilder.add(ModItems.SWEEP_LOGO, "S.W.E.E.P Logo");
        translationBuilder.add(ModItems.TEAM_RAINBOW_LOGO, "Team Rainbow Logo");
        translationBuilder.add(ModItems.URSUS_LOGO, "Ursus Logo");
        translationBuilder.add(ModItems.URSUS_STUDENT_SELF_GOVERNING_GROUP_LOGO, "Ursus Student Self-Governing Group Logo");
        translationBuilder.add(ModItems.VICTORIA_LOGO, "Victoria Logo");
        translationBuilder.add(ModItems.YAN_LOGO, "Yan Logo");

        translationBuilder.add(ModItems.FURN_PARTS, "Furn Parts");

    }
}
