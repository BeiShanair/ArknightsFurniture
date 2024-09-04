package com.besson.arknights.datagen;

import com.besson.arknights.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class ModZhCnLangProvider extends FabricLanguageProvider {
    public ModZhCnLangProvider(FabricDataOutput dataOutput) {
        super(dataOutput, "zh_cn");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.ABYSSAL_HUNTERS_LOGO, "深海猎人 Logo");
        translationBuilder.add(ModItems.AEGIR_LOGO, "阿戈尔 Logo");
        translationBuilder.add(ModItems.BABEL_LOGO, "巴别塔 Logo");
        translationBuilder.add(ModItems.BLACK_STEEL_LOGO, "黑钢国际 Logo");
        translationBuilder.add(ModItems.BOLIVAR_LOGO, "玻利瓦尔 Logo");
        translationBuilder.add(ModItems.COLUMBIA_LOGO, "哥伦比亚 Logo");
        translationBuilder.add(ModItems.DONG_LOGO, "东 Logo");
        translationBuilder.add(ModItems.DUBLINN_LOGO, "深池 Logo");
        translationBuilder.add(ModItems.ELITE_OP_LOGO, "罗德岛精英干员 Logo");
        translationBuilder.add(ModItems.FOLLOWERS_LOGO, "使徒 Logo");
        translationBuilder.add(ModItems.GLASGOW_LOGO, "格拉斯帮 Logo");
        translationBuilder.add(ModItems.IBERIA_LOGO, "伊比利亚 Logo");
        translationBuilder.add(ModItems.KARLAN_TRADE_LOGO, "喀兰贸易 Logo");
        translationBuilder.add(ModItems.KAZIMIERZ_LOGO, "卡西米尔 Logo");
        translationBuilder.add(ModItems.KJERAG_LOGO, "谢拉格 Logo");
        translationBuilder.add(ModItems.LATERANO_LOGO, "拉特兰 Logo");
        translationBuilder.add(ModItems.LEES_DETECTIVE_AGENCY_LOGO, "鲤氏侦探事务所 Logo");
        translationBuilder.add(ModItems.LEITHANIEN_LOGO, "莱塔尼亚 Logo");
        translationBuilder.add(ModItems.LUNGMEN_GUARD_DEPARTMENT_LOGO, "龙门近卫局 Logo");
        translationBuilder.add(ModItems.LUNGMEN_LOGO, "龙门 Logo");
        translationBuilder.add(ModItems.MINOS_LOGO, "米诺斯 Logo");
        translationBuilder.add(ModItems.OP_A4_LOGO, "行动组A4 Logo");
        translationBuilder.add(ModItems.OP_RESERVE_A1_LOGO, "行动预备组A1 Logo");
        translationBuilder.add(ModItems.OP_RESERVE_A4_LOGO, "行动预备组A4 Logo");
        translationBuilder.add(ModItems.OP_RESERVE_A6_LOGO, "行动预备组A6 Logo");
        translationBuilder.add(ModItems.PENGUIN_LOGISTICS_LOGO, "企鹅物流 Logo");
        translationBuilder.add(ModItems.PINUS_SYLVESTRIS_LOGO, "红松骑士团 Logo");
        translationBuilder.add(ModItems.RHINE_LAB_LOGO, "莱茵生命 Logo");
        translationBuilder.add(ModItems.RHODES_ISLAND_LOGO, "罗德岛 Logo");
        translationBuilder.add(ModItems.RHODES_ISLAND_OVERRIDE_LOGO, "罗德岛（重制） Logo");
        translationBuilder.add(ModItems.RIM_BILLITON_LOGO, "雷姆必拓 Logo");
        translationBuilder.add(ModItems.SAMI_LOGO, "萨米 Logo");
        translationBuilder.add(ModItems.SARGON_LOGO, "萨尔贡 Logo");
        translationBuilder.add(ModItems.SIESTA_LOGO, "汐斯塔 Logo");
        translationBuilder.add(ModItems.SIRACUSA_BRANCHES_LOGO, "贾维团伙 Logo");
        translationBuilder.add(ModItems.SIRACUSA_LOGO, "叙拉古 Logo");
        translationBuilder.add(ModItems.SUI_LOGO, "炎-岁 Logo");
        translationBuilder.add(ModItems.SWEEP_LOGO, "S.W.E.E.P Logo");
        translationBuilder.add(ModItems.TEAM_RAINBOW_LOGO, "彩虹小队 Logo");
        translationBuilder.add(ModItems.URSUS_LOGO, "乌萨斯 Logo");
        translationBuilder.add(ModItems.URSUS_STUDENT_SELF_GOVERNING_GROUP_LOGO, "乌萨斯学生自治团 Logo");
        translationBuilder.add(ModItems.VICTORIA_LOGO, "维多利亚 Logo");
        translationBuilder.add(ModItems.YAN_LOGO, "炎 Logo");

        translationBuilder.add(ModItems.FURN_PARTS, "家具零件");
    }
}
