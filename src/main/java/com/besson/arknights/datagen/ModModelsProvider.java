package com.besson.arknights.datagen;

import com.besson.arknights.block.ModBlocks;
import com.besson.arknights.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;

public class ModModelsProvider extends FabricModelProvider {
    public ModModelsProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.AIR_MATTRESS);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ATTENDANCE_BOARD);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CARGO_TROLLEY);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CARTON);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CARTON_STOOL);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.GRAFFITI);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.LARGE_SHELF1);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.LARGE_SHELF2);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.LARGE_SHELF3);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.LARGE_SHELF4);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.PALLET);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.PILE_OF_CARTONS);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.PORTABLE_CALCULATOR);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.POST_IT_NOTE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.ABYSSAL_HUNTERS_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.AEGIR_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.BABEL_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLACK_STEEL_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.BOLIVAR_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.COLUMBIA_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.DONG_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.DUBLINN_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.ELITE_OP_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.FOLLOWERS_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.GLASGOW_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.IBERIA_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.KARLAN_TRADE_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.KAZIMIERZ_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.KJERAG_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.LATERANO_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.LEES_DETECTIVE_AGENCY_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.LEITHANIEN_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.LUNGMEN_GUARD_DEPARTMENT_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.LUNGMEN_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.MINOS_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.OP_A4_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.OP_RESERVE_A1_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.OP_RESERVE_A4_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.OP_RESERVE_A6_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.PENGUIN_LOGISTICS_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.PINUS_SYLVESTRIS_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.RHINE_LAB_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.RHODES_ISLAND_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.RHODES_ISLAND_OVERRIDE_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.RIM_BILLITON_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.SAMI_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.SARGON_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.SIESTA_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.SIRACUSA_BRANCHES_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.SIRACUSA_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.SUI_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.SWEEP_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.TEAM_RAINBOW_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.URSUS_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.URSUS_STUDENT_SELF_GOVERNING_GROUP_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.VICTORIA_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.YAN_LOGO, Models.GENERATED);

        itemModelGenerator.register(ModItems.FURN_PARTS, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARDBOARD, Models.GENERATED);
    }
}
