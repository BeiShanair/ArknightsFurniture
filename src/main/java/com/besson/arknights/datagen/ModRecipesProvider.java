package com.besson.arknights.datagen;

import com.besson.arknights.ArknightsFurniture;
import com.besson.arknights.block.ModBlocks;
import com.besson.arknights.item.ModItems;
import com.besson.arknights.tag.ModItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipesProvider extends FabricRecipeProvider {
    public ModRecipesProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.FURN_PARTS, 5)
                .input(ModItemTags.COIN_FURN_5)
                .criterion("has_item", conditionsFromTag(ModItemTags.COIN_FURN_5))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "coin_furn_5"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CARTON, 1)
                .pattern("###")
                .pattern("# #")
                .pattern("###")
                .input('#', ModItems.CARDBOARD)
                .criterion("has_item", conditionsFromItem(ModItems.CARDBOARD))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "carton"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALLET, 1)
                .pattern("###")
                .input('#', ModItems.CARDBOARD)
                .criterion("has_item", conditionsFromItem(ModItems.CARDBOARD))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "pallet"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CARTON_STOOL, 1)
                .pattern("###")
                .pattern("# #")
                .input('#', ModItems.CARDBOARD)
                .criterion("has_item", conditionsFromItem(ModItems.CARDBOARD))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "carton_stool"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CARGO_TROLLEY, 1)
                .pattern("A##")
                .input('#', ModItems.CARDBOARD)
                .input('A', Items.MINECART)
                .criterion("has_item", conditionsFromItem(ModItems.CARDBOARD))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "cargo_trolley"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LARGE_SHELF1, 1)
                .pattern("## ")
                .pattern("ABA")
                .input('#', ModItems.CARDBOARD)
                .input('A', Items.IRON_INGOT)
                .input('B', Items.BLACK_DYE)
                .criterion("has_item", conditionsFromItem(ModItems.CARDBOARD))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "large_shelf1"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LARGE_SHELF2, 1)
                .pattern("ABA")
                .input('A', Items.IRON_INGOT)
                .input('B', Items.BLACK_DYE)
                .criterion("has_item", conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "large_shelf2"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LARGE_SHELF3, 1)
                .pattern(" # ")
                .pattern("ABA")
                .input('#', ModItems.CARDBOARD)
                .input('A', Items.IRON_INGOT)
                .input('B', Items.BLACK_DYE)
                .criterion("has_item", conditionsFromItem(ModItems.CARDBOARD))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "large_shelf3"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LARGE_SHELF4, 1)
                .pattern(" # ")
                .pattern("ABA")
                .input('#', Items.FLOWER_POT)
                .input('A', Items.IRON_INGOT)
                .input('B', Items.BLACK_DYE)
                .criterion("has_item", conditionsFromItem(Items.FLOWER_POT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "large_shelf4"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PILE_OF_CARTONS, 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.CARDBOARD)
                .criterion("has_item", conditionsFromItem(ModItems.CARDBOARD))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "pile_of_cartons"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PORTABLE_CALCULATOR, 1)
                .pattern(" # ")
                .pattern("AAA")
                .input('#', Items.COMMAND_BLOCK)
                .input('A', ModItems.CARDBOARD)
                .criterion("has_item", conditionsFromItem(Items.COMMAND_BLOCK))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "portable_calculator"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AIR_MATTRESS, 1)
                .pattern("AAA")
                .input('A', Items.BLACK_WOOL)
                .criterion("has_item", conditionsFromItem(Items.BLACK_WOOL))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "air_mattress"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POST_IT_NOTE, 1)
                .pattern("###")
                .input('#', Items.PAPER)
                .criterion("has_item", conditionsFromItem(Items.PAPER))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "post_it_note"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ATTENDANCE_BOARD, 1)
                .pattern("###")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "attendance_board"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAFFITI, 1)
                .pattern("###")
                .pattern("# #")
                .pattern("###")
                .input('#', Items.BLACK_DYE)
                .criterion("has_item", conditionsFromItem(Items.BLACK_DYE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "graffiti"));


        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_BED, 1)
                .pattern("###")
                .pattern("AAA")
                .input('#', Items.BLACK_WOOL)
                .input('A', ItemTags.PLANKS)
                .criterion("has_item", conditionsFromItem(Items.BLACK_WOOL))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "black_bed"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_NIGHTSTAND, 1)
                .pattern("##A")
                .pattern("## ")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.BLACK_DYE)
                .criterion("has_item", conditionsFromItem(Items.BLACK_DYE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "black_nightstand"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SIMPLE_BLACK_DESK_LEFT, 1)
                .pattern("###")
                .pattern("A  ")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.BLACK_DYE)
                .criterion("has_item", conditionsFromItem(Items.BLACK_DYE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "simple_black_desk_left"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SIMPLE_BLACK_DESK_RIGHT, 1)
                .pattern("###")
                .pattern("  A")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.BLACK_DYE)
                .criterion("has_item", conditionsFromItem(Items.BLACK_DYE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "simple_black_desk_right"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_OFFICE_CHAIR, 1)
                .pattern("A A")
                .pattern("ABA")
                .pattern(" A ")
                .input('A', Items.BLACK_WOOL)
                .input('B', Items.IRON_INGOT)
                .criterion("has_item", conditionsFromItem(Items.BLACK_WOOL))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "black_office_chair"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SIMPLE_BLACK_CABINET, 1)
                .pattern("###")
                .pattern("A A")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.BLACK_DYE)
                .criterion("has_item", conditionsFromItem(Items.BLACK_DYE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "simple_black_cabinet"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHECKERBOARD_BOOKCASE1, 1)
                .pattern("###")
                .pattern("AAA")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.BLACK_DYE)
                .criterion("has_item", conditionsFromItem(Items.BLACK_DYE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "checkerboard_bookcase1"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHECKERBOARD_BOOKCASE2, 1)
                .pattern("###")
                .pattern("ABA")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.WHITE_DYE)
                .input('B', Items.BLACK_DYE)
                .criterion("has_item", conditionsFromItem(Items.WHITE_DYE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "checkerboard_bookcase2"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHECKERBOARD_BOOKCASE3, 1)
                .pattern("###")
                .pattern("ABA")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.WHITE_DYE)
                .input('B', Items.BLACK_DYE)
                .criterion("has_item", conditionsFromItem(Items.WHITE_DYE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "checkerboard_bookcase3"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_HD_TV, 1)
                .pattern("#BA")
                .pattern(" # ")
                .input('#', Items.IRON_INGOT)
                .input('A', Items.BLACK_WOOL)
                .input('B', Items.GLASS_PANE)
                .criterion("has_item", conditionsFromItem(Items.BLACK_WOOL))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "black_hd_tv"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_AND_WHITE_SQUARE_TABLE, 1)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .input('A', ItemTags.PLANKS)
                .input('B', Items.BLACK_DYE)
                .criterion("has_item", conditionsFromItem(Items.BLACK_DYE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "black_and_white_square_table"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LOW_BLACK_AND_WHITE_SOFA, 1)
                .pattern("A A")
                .pattern("BBB")
                .input('A', Items.BLACK_WOOL)
                .input('B', Items.WHITE_WOOL)
                .criterion("has_item", conditionsFromItem(Items.BLACK_WOOL))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "low_black_and_white_sofa"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMALL_CALLBOARD, 1)
                .pattern("###")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "small_callboard"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SIMPLE_BLACK_CLOCK, 1)
                .pattern("#A")
                .input('#', Items.BLACK_DYE)
                .input('A', Items.CLOCK)
                .criterion("has_item", conditionsFromItem(Items.CLOCK))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "simple_black_clock"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAYISH_WALL_LIGHT, 1)
                .pattern("A")
                .pattern("B")
                .input('A', Items.QUARTZ)
                .input('B', Items.TORCH)
                .criterion("has_item", conditionsFromItem(Items.TORCH))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "grayish_wall_light"));


        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_BED, 1)
                .pattern("###")
                .pattern("AAA")
                .input('#', Items.ORANGE_WOOL)
                .input('A', ItemTags.PLANKS)
                .criterion("has_item", conditionsFromItem(Items.ORANGE_WOOL))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "orange_bed"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_NIGHTSTAND, 1)
                .pattern("##A")
                .pattern("## ")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.ORANGE_DYE)
                .criterion("has_item", conditionsFromItem(Items.ORANGE_DYE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "orange_nightstand"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SIMPLE_ORANGE_DESK_LEFT, 1)
                .pattern("###")
                .pattern("A  ")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.ORANGE_DYE)
                .criterion("has_item", conditionsFromItem(Items.ORANGE_DYE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "simple_orange_desk_left"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SIMPLE_ORANGE_DESK_RIGHT, 1)
                .pattern("###")
                .pattern("  A")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.ORANGE_DYE)
                .criterion("has_item", conditionsFromItem(Items.ORANGE_DYE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "simple_orange_desk_right"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_SWIVEL_CHAIR, 1)
                .pattern("A A")
                .pattern("ABA")
                .pattern(" A ")
                .input('A', Items.ORANGE_WOOL)
                .input('B', Items.IRON_INGOT)
                .criterion("has_item", conditionsFromItem(Items.ORANGE_WOOL))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "orange_swivel_chair"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SIMPLE_ORANGE_CABINET, 1)
                .pattern("###")
                .pattern("A A")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.ORANGE_DYE)
                .criterion("has_item", conditionsFromItem(Items.ORANGE_DYE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "simple_orange_cabinet"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CHECKERBOARD_BOOKCASE1, 1)
                .pattern("###")
                .pattern("AAA")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.BLACK_DYE)
                .criterion("has_item", conditionsFromItem(Items.BLACK_DYE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "orange_checkerboard_bookcase1"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CHECKERBOARD_BOOKCASE2, 1)
                .pattern("###")
                .pattern("ABA")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.ORANGE_DYE)
                .input('B', Items.BLACK_DYE)
                .criterion("has_item", conditionsFromItem(Items.ORANGE_DYE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "orange_checkerboard_bookcase2"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CHECKERBOARD_BOOKCASE3, 1)
                .pattern("###")
                .pattern("ABA")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.ORANGE_DYE)
                .input('B', Items.BLACK_DYE)
                .criterion("has_item", conditionsFromItem(Items.ORANGE_DYE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "orange_checkerboard_bookcase3"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_HD_TV, 1)
                .pattern("#BA")
                .pattern(" # ")
                .input('#', Items.IRON_INGOT)
                .input('A', Items.ORANGE_DYE)
                .input('B', Items.GLASS_PANE)
                .criterion("has_item", conditionsFromItem(Items.ORANGE_DYE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "orange_hd_tv"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_SQUARE_TABLE, 1)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .input('A', ItemTags.PLANKS)
                .input('B', Items.ORANGE_DYE)
                .criterion("has_item", conditionsFromItem(Items.ORANGE_DYE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "orange_square_table"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LOW_ORANGE_SOFA, 1)
                .pattern("A A")
                .pattern("BBB")
                .input('A', Items.BLACK_WOOL)
                .input('B', Items.ORANGE_DYE)
                .criterion("has_item", conditionsFromItem(Items.ORANGE_DYE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "low_orange_sofa"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMALL_NOTICEBOARD, 1)
                .pattern("###")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "small_noticeboard"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SIMPLE_ORANGE_CLOCK, 1)
                .pattern("#A")
                .input('#', Items.ORANGE_DYE)
                .input('A', Items.CLOCK)
                .criterion("has_item", conditionsFromItem(Items.CLOCK))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "simple_orange_clock"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_WALL_LAMP, 1)
                .pattern("A")
                .pattern("B")
                .input('A', Items.ORANGE_DYE)
                .input('B', Items.TORCH)
                .criterion("has_item", conditionsFromItem(Items.TORCH))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "orange_wall_lamp"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_BEAN_BAG_SOFA, 1)
                .pattern("AAA")
                .pattern("AAA")
                .input('A', Items.BROWN_WOOL)
                .criterion("has_item", conditionsFromItem(Items.BROWN_WOOL))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "brown_bean_bag_sofa"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECO_EXHIBITION_CABINET, 1)
                .pattern("###")
                .pattern("ABA")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.GLASS_PANE)
                .input('B', Items.IRON_INGOT)
                .criterion("has_item", conditionsFromItem(Items.GLASS_PANE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "eco_exhibition_cabinet"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECO_EXHIBITION_CABINET_BASE, 1)
                .pattern("###")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "eco_exhibition_cabinet_base"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FLUSH_MOUNT_RECTANGLE_CEILING_LIGHT, 1)
                .pattern("#A#")
                .input('#', Items.IRON_INGOT)
                .input('A', Items.GLOWSTONE_DUST)
                .criterion("has_item", conditionsFromItem(Items.GLOWSTONE_DUST))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "flush_mount_rectangle_ceiling_light"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FLUSH_MOUNT_SQUARE_CEILING_LIGHT, 1)
                .pattern("#A ")
                .input('#', Items.IRON_INGOT)
                .input('A', Items.GLOWSTONE_DUST)
                .criterion("has_item", conditionsFromItem(Items.GLOWSTONE_DUST))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "flush_mount_square_ceiling_light"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.METALLIC_BED, 1)
                .pattern("###")
                .pattern("AAA")
                .input('#', Items.IRON_INGOT)
                .input('A', ItemTags.PLANKS)
                .criterion("has_item", conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "metallic_bed"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POTTED_BROADLEAF_PLANT, 1)
                .input(Items.FLOWER_POT)
                .input(Items.OAK_LEAVES)
                .criterion("has_item", conditionsFromItem(Items.OAK_LEAVES))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "potted_broadleaf_plant"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POTTED_CONIFER_PLANT, 1)
                .input(Items.FLOWER_POT)
                .input(Items.SPRUCE_LEAVES)
                .criterion("has_item", conditionsFromItem(Items.SPRUCE_LEAVES))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "potted_conifer_plant"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POTTED_SUCCULENT_PLANT, 1)
                .input(Items.FLOWER_POT)
                .input(Items.CACTUS)
                .criterion("has_item", conditionsFromItem(Items.CACTUS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "potted_succulent_plant"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMALL_SQUARE_NIGHTSTAND, 1)
                .pattern("## ")
                .pattern("## ")
                .input('#', ItemTags.PLANKS)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "small_square_nightstand"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPECIMEN_DATA_BOARD, 1)
                .pattern("###")
                .pattern("ABA")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.PAPER)
                .input('B', Items.IRON_INGOT)
                .criterion("has_item", conditionsFromItem(Items.PAPER))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "specimen_data_board"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WIRE_SIDE_TABLE, 1)
                .pattern("###")
                .pattern("A A")
                .pattern("###")
                .input('#', Items.IRON_INGOT)
                .input('A', ItemTags.PLANKS)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "wire_side_table"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANTI_EXPLOSION_TRASH_CAN, 1)
                .pattern("# #")
                .pattern("# #")
                .pattern("AAA")
                .input('#', Items.IRON_INGOT)
                .input('A', Items.BLACK_DYE)
                .criterion("has_item", conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "anti_explosion_trash_can"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BUILT_IN_FILE_CABINET1, 1)
                .pattern("###")
                .pattern("A A")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.GRAY_DYE)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "built_in_file_cabinet1"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BUILT_IN_FILE_CABINET2, 1)
                .pattern("###")
                .pattern("A A")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.BLACK_DYE)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "built_in_file_cabinet2"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BUNK_BED_IN_CABIN, 1)
                .pattern("#B#")
                .pattern("AAA")
                .input('#', Items.IRON_INGOT)
                .input('A', ItemTags.PLANKS)
                .input('B', ItemTags.WOOL)
                .criterion("has_item", conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "bunk_bed_in_cabin"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CABIN_FIRE_EXTINGUISHER_KIT, 1)
                .pattern("A")
                .pattern("B")
                .input('A', Items.IRON_INGOT)
                .input('B', Items.WATER_BUCKET)
                .criterion("has_item", conditionsFromItem(Items.WATER_BUCKET))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "cabin_fire_extinguisher_kit"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CABIN_FLUSH_MOUNT_PIPE, 1)
                .pattern("A")
                .pattern("A")
                .input('A', Items.IRON_INGOT)
                .criterion("has_item", conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "cabin_flush_mount_pipe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONTROL_DISPLAY, 1)
                .pattern("###")
                .pattern("ABA")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.BLACK_DYE)
                .input('B', Items.REDSTONE_TORCH)
                .criterion("has_item", conditionsFromItem(Items.REDSTONE_TORCH))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "control_display"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIY_SWIVEL_CHAIR, 1)
                .pattern("A A")
                .pattern("ABA")
                .pattern(" A ")
                .input('A', Items.BLACK_WOOL)
                .input('B', Items.IRON_INGOT)
                .criterion("has_item", conditionsFromItem(Items.BLACK_WOOL))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "diy_swivel_chair"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIY_WORKBENCH_LEFT, 1)
                .pattern("###")
                .pattern("A  ")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.GRAY_DYE)
                .criterion("has_item", conditionsFromItem(Items.GRAY_DYE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "diy_workbench_left"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIY_WORKBENCH_RIGHT, 1)
                .pattern("###")
                .pattern("  A")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.GRAY_DYE)
                .criterion("has_item", conditionsFromItem(Items.GRAY_DYE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "diy_workbench_right"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GENERAL_CONSOLE, 1)
                .pattern(" ##")
                .pattern("ABA")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.GRAY_DYE)
                .input('B', Items.REDSTONE)
                .criterion("has_item", conditionsFromItem(Items.REDSTONE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "general_console"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NOTE_BOARD_IN_CABIN, 1)
                .pattern("###")
                .pattern("A A")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.PAPER)
                .criterion("has_item", conditionsFromItem(Items.PAPER))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "note_board_in_cabin"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BAR_CEILING, 1)
                .pattern("###")
                .pattern("#A#")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.TORCH)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "bar_ceiling"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BARSTOOL_WITH_CURVED_LEGS, 1)
                .pattern("A")
                .pattern("A")
                .pattern("B")
                .input('A', Items.IRON_INGOT)
                .input('B', ItemTags.PLANKS)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "barstool_with_curved_legs"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BEVERAGE_CABINET_COFFEE1, 1)
                .pattern("###")
                .pattern("A A")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.COCOA_BEANS)
                .criterion("has_item", conditionsFromItem(Items.COCOA_BEANS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "beverage_cabinet_coffee1"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BEVERAGE_CABINET_COFFEE2, 1)
                .pattern("###")
                .pattern("A A")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.COCOA_BEANS)
                .criterion("has_item", conditionsFromItem(Items.COCOA_BEANS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "beverage_cabinet_coffee2"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BEVERAGE_CABINET_DC, 1)
                .pattern("###")
                .pattern("A A")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.GLASS_BOTTLE)
                .criterion("has_item", conditionsFromItem(Items.GLASS_BOTTLE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "beverage_cabinet_dc"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BEVERAGE_CABINET_DRINK, 1)
                .pattern("###")
                .pattern("A A")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.GLASS_BOTTLE)
                .criterion("has_item", conditionsFromItem(Items.GLASS_BOTTLE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "beverage_cabinet_drink"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BEVERAGE_CABINET_EMPTY, 1)
                .pattern("###")
                .pattern("   ")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "beverage_cabinet_empty"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BEVERAGE_MENU, 1)
                .pattern("## ")
                .pattern(" ##")
                .input('#', Items.PAPER)
                .criterion("has_item", conditionsFromItem(Items.PAPER))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "beverage_menu"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BOLIVARIAN_COFFEE_BEAN, 1)
                .pattern("## ")
                .pattern("## ")
                .input('#', Items.COCOA_BEANS)
                .criterion("has_item", conditionsFromItem(Items.COCOA_BEANS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "bolivarian_coffee_bean"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_BOOKCASE1, 1)
                .pattern("AAA")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.BOOK)
                .criterion("has_item", conditionsFromItem(Items.BOOK))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "brown_bookcase1"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_BOOKCASE2, 1)
                .pattern("###")
                .pattern("ABA")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.BOOK)
                .input('B', Items.ORANGE_DYE)
                .criterion("has_item", conditionsFromItem(Items.BOOK))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "brown_bookcase2"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_BOOKCASE3, 1)
                .pattern("###")
                .pattern("ABA")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.BOOK)
                .input('B', Items.ORANGE_DYE)
                .criterion("has_item", conditionsFromItem(Items.BOOK))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "brown_bookcase3"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COLUMBIAN_STREET_VIEW_PHOTO, 1)
                .pattern("#  ")
                .pattern(" # ")
                .pattern("  #")
                .input('#', Items.PAPER)
                .criterion("has_item", conditionsFromItem(Items.PAPER))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "columbian_street_view_photo"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DINING_CHAIR, 1)
                .pattern("A")
                .pattern("B")
                .input('A', ItemTags.PLANKS)
                .input('B', Items.STICK)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "dining_chair"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PEDESTAL_COFFEE_TABLE, 1)
                .pattern("AAA")
                .pattern(" B ")
                .pattern(" B ")
                .input('A', ItemTags.PLANKS)
                .input('B', Items.IRON_INGOT)
                .criterion("has_item", conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "pedestal_coffee_table"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PENDANT_LIGHT, 1)
                .pattern("A")
                .pattern("B")
                .input('A', Items.IRON_INGOT)
                .input('B', Items.GLOWSTONE_DUST)
                .criterion("has_item", conditionsFromItem(Items.GLOWSTONE_DUST))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "pendant_light"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POTTED_LONG_LEAF_PLANT, 1)
                .pattern("A")
                .pattern("B")
                .input('A', Items.FLOWER_POT)
                .input('B', ItemTags.SAPLINGS)
                .criterion("has_item", conditionsFromTag(ItemTags.SAPLINGS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "potted_long_leaf_plant"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_BRICK_CAFE_BAR, 1)
                .pattern("###")
                .pattern("###")
                .input('#', Items.BRICK)
                .criterion("has_item", conditionsFromItem(Items.BRICK))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "red_brick_cafe_bar"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_BROWN_CABINET, 1)
                .pattern("###")
                .pattern("A A")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.BROWN_DYE)
                .criterion("has_item", conditionsFromItem(Items.BROWN_DYE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "red_brown_cabinet"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOFT_CEILING_LIGHT, 1)
                .pattern("AAA")
                .pattern(" B ")
                .input('A', Items.IRON_INGOT)
                .input('B', Items.GLOWSTONE_DUST)
                .criterion("has_item", conditionsFromItem(Items.GLOWSTONE_DUST))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "soft_ceiling_light"));


        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_PEDESTAL_TABLE, 1)
                .pattern("AAA")
                .pattern(" # ")
                .pattern(" B ")
                .input('A', ItemTags.PLANKS)
                .input('B', Items.IRON_INGOT)
                .input('#', Items.BLACK_DYE)
                .criterion("has_item", conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "black_pedestal_table"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_VINTAGE_CHAIR, 1)
                .pattern("A")
                .pattern("B")
                .input('A', Items.BLACK_WOOL)
                .input('B', Items.STICK)
                .criterion("has_item", conditionsFromItem(Items.BLACK_WOOL))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "black_vintage_chair"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_VINTAGE_STOOL, 1)
                .pattern("A")
                .pattern("B")
                .input('A', Items.BLACK_WOOL)
                .input('B', Items.IRON_INGOT)
                .criterion("has_item", conditionsFromItem(Items.BLACK_WOOL))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "black_vintage_stool"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BRIGHT_WALL_LIGHT, 1)
                .pattern("A")
                .pattern("B")
                .pattern("#")
                .input('A', Items.IRON_INGOT)
                .input('B', Items.GLOWSTONE_DUST)
                .input('#', Items.BLACK_DYE)
                .criterion("has_item", conditionsFromItem(Items.GLOWSTONE_DUST))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "bright_wall_light"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DUPLEX_WOODEN_FENCE, 1)
                .pattern("AA")
                .pattern("AA")
                .input('A', ItemTags.PLANKS)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "duplex_wooden_fence"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LOW_SANDALWOOD_MEETING_TABLE, 1)
                .pattern("AAA")
                .pattern("B B")
                .input('A', ItemTags.PLANKS)
                .input('B', Items.IRON_INGOT)
                .criterion("has_item", conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "low_sandalwood_meeting_table"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDALWOOD_BED, 1)
                .pattern("###")
                .pattern("AAA")
                .input('#', ItemTags.WOOL)
                .input('A', ItemTags.PLANKS)
                .criterion("has_item", conditionsFromTag(ItemTags.WOOL))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "sandalwood_bed"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDALWOOD_MEETING_BOARD, 1)
                .pattern("###")
                .pattern("ABA")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.PAPER)
                .input('B', Items.IRON_INGOT)
                .criterion("has_item", conditionsFromItem(Items.PAPER))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "sandalwood_meeting_board"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SIMPLE_BLACK_LOUNGE_CHAIR, 1)
                .pattern("A")
                .pattern("B")
                .input('A', Items.BLACK_WOOL)
                .input('B', Items.IRON_INGOT)
                .criterion("has_item", conditionsFromItem(Items.BLACK_WOOL))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "simple_black_lounge_chair"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMALL_SANDALWOOD_NIGHTSTAND, 1)
                .pattern("##")
                .pattern("##")
                .input('#', ItemTags.PLANKS)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "small_sandalwood_nightstand"));


        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DUPLEX_BRONZE_FENCE, 1)
                .pattern("AA")
                .pattern("AA")
                .input('A', Items.IRON_INGOT)
                .criterion("has_item", conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "duplex_bronze_fence"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LOW_TEAK_MEETING_TABLE, 1)
                .pattern("AAA")
                .pattern("B B")
                .input('A', ItemTags.PLANKS)
                .input('B', Items.IRON_INGOT)
                .criterion("has_item", conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "low_teak_meeting_table"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PIANO_BLACK_VINTAGE_CHAIR, 1)
                .pattern("A")
                .pattern("B")
                .input('A', Items.BLACK_WOOL)
                .input('B', Items.STICK)
                .criterion("has_item", conditionsFromItem(Items.BLACK_WOOL))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "piano_black_vintage_chair"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PIANO_BLACK_VINTAGE_STOOL, 1)
                .pattern("A")
                .pattern("B")
                .input('A', Items.BLACK_WOOL)
                .input('B', Items.IRON_INGOT)
                .criterion("has_item", conditionsFromItem(Items.BLACK_WOOL))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "piano_black_vintage_stool"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SIMPLE_GRAY_LOUNGE_CHAIR, 1)
                .pattern("A")
                .pattern("B")
                .input('A', Items.GRAY_WOOL)
                .input('B', Items.IRON_INGOT)
                .criterion("has_item", conditionsFromItem(Items.GRAY_WOOL))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "simple_gray_lounge_chair"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMALL_TEAK_NIGHTSTAND, 1)
                .pattern("##")
                .pattern("##")
                .input('#', ItemTags.PLANKS)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "small_teak_nightstand"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TEAK_BED, 1)
                .pattern("###")
                .pattern("AAA")
                .input('#', ItemTags.WOOL)
                .input('A', ItemTags.PLANKS)
                .criterion("has_item", conditionsFromTag(ItemTags.WOOL))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "teak_bed"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TEAK_ATTENDANCE_BOARD, 1)
                .pattern("###")
                .pattern("ABA")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.PAPER)
                .input('B', Items.IRON_INGOT)
                .criterion("has_item", conditionsFromItem(Items.PAPER))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "teak_attendance_board"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_PEDESTAL_TABLE, 1)
                .pattern("AAA")
                .pattern(" # ")
                .pattern(" B ")
                .input('A', ItemTags.PLANKS)
                .input('B', Items.IRON_INGOT)
                .input('#', Items.WHITE_DYE)
                .criterion("has_item", conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "white_pedestal_table"));


        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CREATURES_REMAINS, 1)
                .pattern("###")
                .pattern("ABA")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.BONE)
                .input('B', Items.IRON_INGOT)
                .criterion("has_item", conditionsFromItem(Items.BONE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "creatures_remains"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FUTON_BUNK_BED_BOTTOM, 1)
                .pattern("###")
                .pattern("AAA")
                .input('#', ItemTags.WOOL)
                .input('A', ItemTags.PLANKS)
                .criterion("has_item", conditionsFromTag(ItemTags.WOOL))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "futon_bunk_bed_bottom"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FUTON_BUNK_BED_TOP, 1)
                .pattern("###")
                .pattern("AAA")
                .input('#', ItemTags.WOOL)
                .input('A', ItemTags.PLANKS)
                .criterion("has_item", conditionsFromTag(ItemTags.WOOL))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "futon_bunk_bed_top"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.HANDMADE_WOOD_BASKET, 1)
                .pattern("###")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "handmade_wood_basket"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LOG_BEAM, 1)
                .pattern("###")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "log_beam"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LOG_CABINET_BOTTOM, 1)
                .pattern("###")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "log_cabinet_bottom"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LOG_CABINET_TOP1, 1)
                .pattern("###")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "log_cabinet_top1"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LOG_CABINET_TOP2, 1)
                .pattern("###")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "log_cabinet_top2"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LOG_DINING_CHAIR, 1)
                .pattern("A")
                .pattern("B")
                .input('A', ItemTags.PLANKS)
                .input('B', Items.STICK)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "log_dining_chair"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LOG_DINING_TABLE, 1)
                .pattern("AAA")
                .pattern(" B ")
                .pattern(" B ")
                .input('A', ItemTags.PLANKS)
                .input('B', Items.IRON_INGOT)
                .criterion("has_item", conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "log_dining_table"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ROCKING_CHAIR_WITH_CUSHION, 1)
                .pattern("A")
                .pattern("B")
                .input('A', Items.RED_WOOL)
                .input('B', Items.STICK)
                .criterion("has_item", conditionsFromItem(Items.RED_WOOL))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "rocking_chair_with_cushion"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRUCE_WOOD_VIOLIN, 1)
                .pattern("A")
                .pattern("B")
                .input('A', Items.SPRUCE_PLANKS)
                .input('B', Items.STRING)
                .criterion("has_item", conditionsFromItem(Items.SPRUCE_PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "spruce_wood_violin"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.VINTAGE_CEILING_FAN, 1)
                .pattern("A")
                .pattern("B")
                .pattern("C")
                .input('A', Items.IRON_INGOT)
                .input('B', Items.REDSTONE)
                .input('C', Items.BLACK_DYE)
                .criterion("has_item", conditionsFromItem(Items.REDSTONE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "vintage_ceiling_fan"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.VINTAGE_CEILING_LIGHT, 1)
                .pattern("A")
                .pattern("B")
                .pattern("C")
                .input('A', Items.IRON_INGOT)
                .input('B', Items.GLOWSTONE_DUST)
                .input('C', Items.BLACK_DYE)
                .criterion("has_item", conditionsFromItem(Items.GLOWSTONE_DUST))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "vintage_ceiling_light"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DINING_PLATE, 1)
                .pattern("AA")
                .input('A', Items.IRON_INGOT)
                .criterion("has_item", conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "dining_plate"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PIZZA_BOWL, 1)
                .pattern("AA")
                .input('A', Items.BRICK)
                .criterion("has_item", conditionsFromItem(Items.BRICK))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "pizza_bowl"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PIZZA_BOX, 1)
                .pattern("A  ")
                .pattern(" AA")
                .input('A', ModItems.CARDBOARD)
                .criterion("has_item", conditionsFromItem(ModItems.CARDBOARD))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "pizza_box"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PIZZA_MENU1, 1)
                .pattern("#AB")
                .input('A', Items.PAPER)
                .input('#', Items.BLACK_WOOL)
                .input('B', Items.IRON_BLOCK)
                .criterion("has_item", conditionsFromItem(Items.PAPER))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "pizza_menu1"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PIZZA_MENU2, 1)
                .pattern("#AB")
                .input('A', Items.PAPER)
                .input('#', Items.BLACK_WOOL)
                .input('B', Items.IRON_BLOCK)
                .criterion("has_item", conditionsFromItem(Items.PAPER))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "pizza_menu2"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PIZZERIA_BLACK_COUNTER, 1)
                .pattern("#A#")
                .input('#', Items.BLACK_DYE)
                .input('A', Items.IRON_INGOT)
                .criterion("has_item", conditionsFromItem(Items.BLACK_DYE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "pizzeria_black_counter"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PIZZERIA_CUPBOARD, 1)
                .pattern("###")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "pizzeria_cupboard"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PIZZERIA_DINING_CHAIR, 1)
                .pattern("A")
                .pattern("B")
                .input('A', ItemTags.PLANKS)
                .input('B', Items.STICK)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "pizzeria_dining_chair"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PIZZERIA_EXIT_SIGN, 1)
                .pattern("#A#")
                .input('#', Items.IRON_INGOT)
                .input('A', Items.GREEN_DYE)
                .criterion("has_item", conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "pizzeria_exit_sign"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PIZZERIA_HIGH_STOOL, 1)
                .pattern("A")
                .pattern("B")
                .input('A', ItemTags.PLANKS)
                .input('B', Items.IRON_INGOT)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "pizzeria_high_stool"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PIZZERIA_MOVEABLE_TABLE, 1)
                .pattern("AAA")
                .pattern("B B")
                .input('A', ItemTags.PLANKS)
                .input('B', Items.IRON_INGOT)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "pizzeria_moveable_table"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PIZZERIA_PLATE_RACK, 1)
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "pizzeria_plate_rack"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PIZZERIA_POSTER_COLUMN, 1)
                .pattern("###")
                .pattern("#A#")
                .input('#', Items.PAPER)
                .input('A', Items.BLACK_DYE)
                .criterion("has_item", conditionsFromItem(Items.PAPER))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "pizzeria_poster_column"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PIZZERIA_POSTER_STAND, 1)
                .pattern("#A#")
                .pattern("# #")
                .input('A', Items.PAPER)
                .input('#', ItemTags.PLANKS)
                .criterion("has_item", conditionsFromItem(Items.PAPER))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "pizzeria_poster_stand"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PIZZERIA_SOFT_CEILING_LIGHT, 1)
                .pattern("ABA")
                .input('A', Items.IRON_INGOT)
                .input('B', Items.GLOWSTONE_DUST)
                .criterion("has_item", conditionsFromItem(Items.GLOWSTONE_DUST))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "pizzeria_soft_ceiling_light"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BARSTOOL, 1)
                .pattern("A")
                .pattern("B")
                .input('A', Items.IRON_INGOT)
                .input('B', Items.STICK)
                .criterion("has_item", conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "barstool"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BILLBOARD_JUKEBOX, 1)
                .pattern("###")
                .pattern("A A")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.REDSTONE)
                .criterion("has_item", conditionsFromItem(Items.REDSTONE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "billboard_jukebox"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_AND_GOLDEN_FREEZER, 1)
                .pattern("###")
                .pattern("ABA")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.IRON_INGOT)
                .input('B', Items.GOLD_INGOT)
                .criterion("has_item", conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "black_and_golden_freezer"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MODERN_HOTEL_CEILING_LIGHT, 1)
                .pattern("ABA")
                .input('A', Items.IRON_INGOT)
                .input('B', Items.GLOWSTONE_DUST)
                .criterion("has_item", conditionsFromItem(Items.GLOWSTONE_DUST))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "modern_hotel_ceiling_light"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MODERN_HOTEL_CHANDELIER, 1)
                .pattern("A A")
                .pattern(" B ")
                .input('A', Items.IRON_INGOT)
                .input('B', Items.GLOWSTONE_DUST)
                .criterion("has_item", conditionsFromItem(Items.GLOWSTONE_DUST))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "modern_hotel_chandelier"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MODERN_HOTEL_FLOOR_LAMP, 1)
                .pattern("A")
                .pattern("B")
                .input('A', Items.IRON_INGOT)
                .input('B', Items.GLOWSTONE_DUST)
                .criterion("has_item", conditionsFromItem(Items.GLOWSTONE_DUST))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "modern_hotel_floor_lamp"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MODERN_HOTEL_SOFA, 1)
                .pattern("A#A")
                .pattern("BBB")
                .input('A', ItemTags.WOOL)
                .input('B', ItemTags.PLANKS)
                .input('#', Items.RED_DYE)
                .criterion("has_item", conditionsFromTag(ItemTags.WOOL))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "modern_hotel_sofa"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MODERN_HOTEL_TABLE, 1)
                .pattern("AAA")
                .pattern("B B")
                .input('A', ItemTags.PLANKS)
                .input('B', Items.IRON_INGOT)
                .criterion("has_item", conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "modern_hotel_table"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MODERN_HOTEL_WALL_LAMP, 1)
                .pattern("A")
                .pattern("B")
                .input('A', Items.IRON_INGOT)
                .input('B', Items.GLOWSTONE_DUST)
                .criterion("has_item", conditionsFromItem(Items.GLOWSTONE_DUST))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "modern_hotel_wall_lamp"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MODERN_WALL_DECORATION, 1)
                .pattern("###")
                .pattern("ABA")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.IRON_INGOT)
                .input('B', Items.GLOWSTONE_DUST)
                .criterion("has_item", conditionsFromItem(Items.GLOWSTONE_DUST))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "modern_wall_decoration"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOUNTED_BAR_CEILING1, 1)
                .pattern("# #")
                .pattern("AAA")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.IRON_INGOT)
                .criterion("has_item", conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "mounted_bar_ceiling1"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOUNTED_BAR_CEILING2, 1)
                .pattern("AA")
                .pattern("##")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.IRON_INGOT)
                .criterion("has_item", conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "mounted_bar_ceiling2"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERSATILE_BAR_STAND, 1)
                .pattern("###")
                .pattern("ABA")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.IRON_INGOT)
                .input('B', Items.BLACK_DYE)
                .criterion("has_item", conditionsFromItem(Items.BLACK_DYE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "versatile_bar_stand"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WILLIAMS_GRAND_PIANO_SET, 1)
                .pattern("## ")
                .pattern("ABA")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.IRON_INGOT)
                .input('B', Items.GLOWSTONE_DUST)
                .criterion("has_item", conditionsFromItem(Items.GLOWSTONE_DUST))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "williams_grand_piano_set"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHENS_CERTIFICATE_OF_HONOR, 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', Items.PAPER)
                .criterion("has_item", conditionsFromItem(Items.PAPER))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "chens_certificate_of_honor"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHENS_CHAIR, 1)
                .pattern("A")
                .pattern("B")
                .input('A', Items.BLACK_WOOL)
                .input('B', Items.IRON_INGOT)
                .criterion("has_item", conditionsFromItem(Items.BLACK_WOOL))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "chens_chair"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHENS_DESK, 1)
                .pattern("AAA")
                .pattern("B B")
                .input('A', ItemTags.PLANKS)
                .input('B', Items.IRON_INGOT)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "chens_desk"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHENS_WEAPON_RACK, 1)
                .pattern("###")
                .pattern("ABA")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.IRON_INGOT)
                .input('B', Items.GOLD_INGOT)
                .criterion("has_item", conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "chens_weapon_rack"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FILE1, 1)
                .pattern("##")
                .pattern("##")
                .input('#', Items.PAPER)
                .criterion("has_item", conditionsFromItem(Items.PAPER))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "file1"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FILE2, 1)
                .pattern("##")
                .pattern("##")
                .input('#', Items.PAPER)
                .criterion("has_item", conditionsFromItem(Items.PAPER))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "file2"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LGD_BOOKCASE, 1)
                .pattern("###")
                .pattern("# #")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "lgd_bookcase"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LGD_DAYLIGHT_LIGHT, 1)
                .pattern("ABA")
                .input('A', Items.IRON_INGOT)
                .input('B', Items.GLOWSTONE_DUST)
                .criterion("has_item", conditionsFromItem(Items.GLOWSTONE_DUST))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "lgd_daylight_light"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LGD_FLUORESCENT_LIGHT, 1)
                .pattern("ABA")
                .input('A', Items.IRON_INGOT)
                .input('B', Items.GLOWSTONE_DUST)
                .criterion("has_item", conditionsFromItem(Items.GLOWSTONE_DUST))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "lgd_fluorescent_light"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LGD_SPECIAL_DUMMY, 1)
                .pattern(" # ")
                .pattern("ABA")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.IRON_INGOT)
                .input('B', Items.BLACK_DYE)
                .criterion("has_item", conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "lgd_special_dummy"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LGD_SPOTLIGHT, 1)
                .pattern("ABA")
                .input('A', Items.IRON_INGOT)
                .input('B', Items.GLOWSTONE_DUST)
                .criterion("has_item", conditionsFromItem(Items.GLOWSTONE_DUST))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "lgd_spotlight"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LGD_SUPINE_PLATE, 1)
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "lgd_supine_plate"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LGD_TRASH_CAN, 1)
                .pattern("A")
                .pattern("A")
                .input('A', Items.IRON_INGOT)
                .criterion("has_item", conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "lgd_trash_can"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OFFICE_CLUE_BOARD, 1)
                .pattern("###")
                .pattern("ABA")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.PAPER)
                .input('B', Items.IRON_INGOT)
                .criterion("has_item", conditionsFromItem(Items.PAPER))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "office_clue_board"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POTTED_CACTUS_PLANT, 1)
                .pattern("A")
                .pattern("B")
                .input('A', Items.CACTUS)
                .input('B', Items.FLOWER_POT)
                .criterion("has_item", conditionsFromItem(Items.FLOWER_POT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "potted_cactus_plant"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BEACH_HOUSE_FLOOR_LAMP, 1)
                .pattern("A")
                .pattern("B")
                .input('A', Items.IRON_INGOT)
                .input('B', Items.GLOWSTONE_DUST)
                .criterion("has_item", conditionsFromItem(Items.GLOWSTONE_DUST))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "beach_house_floor_lamp"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_AND_WHITE_CANVAS_CURTAINS_LEFT, 1)
                .pattern("AA")
                .pattern("B ")
                .input('A', Items.BLUE_WOOL)
                .input('B', Items.WHITE_WOOL)
                .criterion("has_item", conditionsFromItem(Items.BLUE_WOOL))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "blue_and_white_canvas_curtains_left"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_AND_WHITE_CANVAS_CURTAINS_RIGHT, 1)
                .pattern("AA")
                .pattern(" B")
                .input('A', Items.BLUE_WOOL)
                .input('B', Items.WHITE_WOOL)
                .criterion("has_item", conditionsFromItem(Items.BLUE_WOOL))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "blue_and_white_canvas_curtains_right"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LAZY_BENCH, 1)
                .pattern("A")
                .pattern("B")
                .input('A', Items.OAK_PLANKS)
                .input('B', Items.STICK)
                .criterion("has_item", conditionsFromItem(Items.OAK_PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "lazy_bench"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LAZY_COFFEE_TABLE, 1)
                .pattern("AAA")
                .pattern("B B")
                .input('A', Items.OAK_PLANKS)
                .input('B', Items.IRON_INGOT)
                .criterion("has_item", conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "lazy_coffee_table"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LAZY_HIGH_TEA_TABLE, 1)
                .pattern("AAA")
                .pattern(" B ")
                .input('A', Items.OAK_PLANKS)
                .input('B', Items.WOODEN_SHOVEL)
                .criterion("has_item", conditionsFromItem(Items.WOODEN_SHOVEL))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "lazy_high_tea_table"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LAZY_LOUNGE_CHAIR, 1)
                .pattern("A")
                .pattern("B")
                .input('A', ItemTags.PLANKS)
                .input('B', Items.STICK)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "lazy_lounge_chair"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RHODES_ISLAND_SUMMER_CALENDAR, 1)
                .pattern("###")
                .pattern("###")
                .input('#', Items.PAPER)
                .criterion("has_item", conditionsFromItem(Items.PAPER))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "rhodes_island_summer_calendar"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SIESTA_COAT_OF_ARMS_SOUVENIR, 1)
                .pattern(" # ")
                .pattern("###")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "siesta_coat_of_arms_souvenir"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SUMMER_BOAT_CABINET_BOTTOM, 1)
                .pattern("###")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "summer_boat_cabinet_bottom"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SUMMER_BOAT_CABINET_TOP, 1)
                .pattern("###")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "summer_boat_cabinet_top"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SUMMER_COLLECTION_SHELF, 1)
                .pattern("###")
                .pattern("# #")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "summer_collection_shelf"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SUMMER_COLLECTION_SHELF_CHAIR, 1)
                .pattern("A")
                .pattern("B")
                .input('A', ItemTags.PLANKS)
                .input('B', Items.STICK)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "summer_collection_shelf_chair"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SURFBOARD_STAND, 1)
                .pattern("###")
                .pattern("A A")
                .pattern("###")
                .input('#', Items.OAK_PLANKS)
                .input('A', Items.IRON_INGOT)
                .criterion("has_item", conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "surfboard_stand"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WOODEN_BEAM, 1)
                .pattern("###")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "wooden_beam"));

        registerGuitar(exporter, ModBlocks.AMBER);
        registerGuitar(exporter, ModBlocks.BIRCH);
        registerGuitar(exporter, ModBlocks.DARK_CLOUD);
        registerGuitar(exporter, ModBlocks.DARK_STEEL);
        registerGuitar(exporter, ModBlocks.DRIFTWOOD);
        registerGuitar(exporter, ModBlocks.FLAME);
        registerGuitar(exporter, ModBlocks.GRIT);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.HANGING_SCROLLING_DISPLAY, 1)
                .pattern("###")
                .pattern("###")
                .input('#', Items.PAPER)
                .criterion("has_item", conditionsFromItem(Items.PAPER))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "hanging_scrolling_display"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.REHEARSAL_ROOM_ACCESSORY_SHELF, 1)
                .pattern("###")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "rehearsal_room_accessory_shelf"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.REHEARSAL_ROOM_BELT_SHELF, 1)
                .pattern("###")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "rehearsal_room_belt_shelf"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.REHEARSAL_ROOM_BENCH, 1)
                .pattern("###")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "rehearsal_room_bench"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.REHEARSAL_ROOM_RECEPTION_DESK, 1)
                .pattern("###")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "rehearsal_room_reception_desk"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.REHEARSAL_ROOM_ROUND_BENCH, 1)
                .pattern("###")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "rehearsal_room_round_bench"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.REHEARSAL_ROOM_SPOTLIGHT, 1)
                .pattern("ABA")
                .input('A', Items.IRON_INGOT)
                .input('B', Items.GLOWSTONE_DUST)
                .criterion("has_item", conditionsFromItem(Items.GLOWSTONE_DUST))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "rehearsal_room_spotlight"));

        registerGuitar(exporter, ModBlocks.SHALLOW_SEA);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPOTLIGHT_CEILING, 1)
                .pattern("ABA")
                .input('A', Items.IRON_INGOT)
                .input('B', Items.GLOWSTONE_DUST)
                .criterion("has_item", conditionsFromItem(Items.GLOWSTONE_DUST))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "spotlight_ceiling"));

        registerGuitar(exporter, ModBlocks.STAGE);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TOUR_INSTRUMENT_COMBO, 1)
                .pattern("###")
                .pattern("###")
                .input('#', Items.OAK_PLANKS)
                .criterion("has_item", conditionsFromItem(Items.OAK_PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "tour_instrument_combo"));

        registerGuitar(exporter, ModBlocks.WHEAT);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YARMAHAN_DRUM_SET, 1)
                .pattern("# #")
                .pattern("###")
                .pattern("# #")
                .input('#', ItemTags.PLANKS)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "yarmahan_drum_set"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CLEANROOM_AIRDUCT, 1)
                .pattern("# #")
                .pattern("###")
                .input('#', Items.IRON_INGOT)
                .criterion("has_item", conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "cleanroom_airduct"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CLEANROOM_AIRFLOW_CONTROL_PIPE, 1)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("# #")
                .input('#', Items.IRON_INGOT)
                .input('A', Items.REDSTONE)
                .criterion("has_item", conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "cleanroom_airflow_control_pipe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CLEANROOM_ANTIMICROBIAL_LAMP, 1)
                .pattern("ABA")
                .input('A', Items.IRON_INGOT)
                .input('B', Items.GLOWSTONE_DUST)
                .criterion("has_item", conditionsFromItem(Items.GLOWSTONE_DUST))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "cleanroom_antimicrobial_lamp"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CLEANROOM_CEILING_LIGHT, 1)
                .pattern("ABA")
                .input('A', Items.IRON_INGOT)
                .input('B', Items.GLOWSTONE_DUST)
                .criterion("has_item", conditionsFromItem(Items.GLOWSTONE_DUST))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "cleanroom_ceiling_light"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CLEANROOM_DISINFECTING_QUARTERS, 1)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .input('#', Items.IRON_INGOT)
                .criterion("has_item", conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "cleanroom_disinfecting_quarters"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CLEANROOM_FLUORESCENT_LAMP, 1)
                .pattern("ABA")
                .input('A', Items.IRON_INGOT)
                .input('B', Items.GLOWSTONE_DUST)
                .criterion("has_item", conditionsFromItem(Items.GLOWSTONE_DUST))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "cleanroom_fluorescent_lamp"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CLEANROOM_LORRY, 1)
                .pattern("#  ")
                .pattern(" AA")
                .pattern("###")
                .input('#', Items.IRON_INGOT)
                .input('A', Items.REDSTONE)
                .criterion("has_item", conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "cleanroom_lorry"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CLEANROOM_MATERIALS_BOX, 1)
                .pattern("###")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "cleanroom_materials_box"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CLEANROOM_PIPE_VALVE, 1)
                .pattern("# #")
                .pattern("###")
                .input('#', Items.IRON_INGOT)
                .criterion("has_item", conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "cleanroom_pipe_valve"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.EMERGENCY_STRETCHER, 1)
                .pattern("#AA")
                .pattern(" ##")
                .input('#', ItemTags.PLANKS)
                .input('A', ItemTags.WOOL)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "emergency_stretcher"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MULTIFUNCTIONAL_STERILIZER, 1)
                .pattern("ABA")
                .input('A', Items.IRON_INGOT)
                .input('B', Items.GLOWSTONE_DUST)
                .criterion("has_item", conditionsFromItem(Items.GLOWSTONE_DUST))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "multifunctional_sterilizer"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MULTIFUNCTIONAL_ENGINEERING_SHOVEL, 1)
                .pattern("A")
                .pattern("B")
                .input('A', Items.IRON_INGOT)
                .input('B', Items.WOODEN_SHOVEL)
                .criterion("has_item", conditionsFromItem(Items.WOODEN_SHOVEL))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "multifunctional_engineering_shovel"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SUPPLY_TANKS, 1)
                .pattern("###")
                .pattern("###")
                .input('#', Items.IRON_INGOT)
                .criterion("has_item", conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "supply_tanks"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BANQUET_GUEST_SEAT, 1)
                .pattern("#  ")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "banquet_guest_seat"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BANQUET_HOST_SEAT, 1)
                .pattern("#  ")
                .pattern("#  ")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "banquet_host_seat"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BANQUET_TABLE, 1)
                .pattern("AAA")
                .pattern("B B")
                .input('A', ItemTags.PLANKS)
                .input('B', Items.IRON_INGOT)
                .criterion("has_item", conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "banquet_table"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CANDLE_CHANDELIER, 1)
                .pattern("A")
                .pattern("B")
                .input('A', Items.IRON_INGOT)
                .input('B', Items.GLOWSTONE_DUST)
                .criterion("has_item", conditionsFromItem(Items.GLOWSTONE_DUST))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "candle_chandelier"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CANLELIT_HEARTH, 1)
                .pattern("###")
                .pattern("ABA")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.IRON_INGOT)
                .input('B', ItemTags.CANDLES)
                .criterion("has_item", conditionsFromTag(ItemTags.CANDLES))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "candlelit_hearth"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DOUBLE_DECKER_CHANDELIER, 1)
                .pattern("AA")
                .pattern("BB")
                .input('A', Items.IRON_INGOT)
                .input('B', Items.GLOWSTONE_DUST)
                .criterion("has_item", conditionsFromItem(Items.GLOWSTONE_DUST))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "double_decker_chandelier"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LOCKED_CABINET, 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "locked_cabinet"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.IONIC_COLUMN_DOWN, 1)
                .pattern("B")
                .pattern("A")
                .input('A', Items.STONE)
                .input('B', Items.QUARTZ_BLOCK)
                .criterion("has_item", conditionsFromItem(Items.QUARTZ_BLOCK))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "lonic_column_down"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.IONIC_COLUMN_UP, 1)
                .pattern("A")
                .pattern("B")
                .input('A', Items.STONE)
                .input('B', Items.QUARTZ_BLOCK)
                .criterion("has_item", conditionsFromItem(Items.QUARTZ_BLOCK))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "lonic_column_up"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.IONIC_COLUMN_MIDDLE, 1)
                .pattern("A")
                .pattern("A")
                .input('A', Items.QUARTZ_BLOCK)
                .criterion("has_item", conditionsFromItem(Items.QUARTZ_BLOCK))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "lonic_column_middle"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.REIMSELAR_BRAZIER, 1)
                .pattern("A")
                .pattern("B")
                .input('A', Items.IRON_INGOT)
                .input('B', Items.FLINT_AND_STEEL)
                .criterion("has_item", conditionsFromItem(Items.FLINT_AND_STEEL))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "reimselar_brazier"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.REIMSELAR_GUARDS_BUST, 1)
                .pattern("###")
                .pattern("ABA")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.IRON_INGOT)
                .input('B', Items.GOLD_INGOT)
                .criterion("has_item", conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "reimselar_guards_bust"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.REIMSELAR_MAGIC_MIRROR, 1)
                .pattern("###")
                .pattern("AAA")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.GLASS_PANE)
                .criterion("has_item", conditionsFromItem(Items.GLASS_PANE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "reimselar_magic_mirror"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.REIMSELAR_STOOL, 1)
                .pattern("AAA")
                .pattern("B B")
                .input('A', ItemTags.PLANKS)
                .input('B', Items.STICK)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "reimselar_stool"));

        registerFurnParts(exporter, ModBlocks.BLACK_BED, 125);
        registerFurnParts(exporter, ModBlocks.BLACK_NIGHTSTAND, 48);
        registerFurnParts(exporter, ModBlocks.SIMPLE_BLACK_DESK_LEFT, 41);
        registerFurnParts(exporter, ModBlocks.SIMPLE_BLACK_DESK_RIGHT, 42);
        registerFurnParts(exporter, ModBlocks.BLACK_OFFICE_CHAIR, 55);
        registerFurnParts(exporter, ModBlocks.SIMPLE_BLACK_CABINET, 48);
        registerFurnParts(exporter, ModBlocks.CHECKERBOARD_BOOKCASE1, 33);
        registerFurnParts(exporter, ModBlocks.CHECKERBOARD_BOOKCASE2, 33);
        registerFurnParts(exporter, ModBlocks.CHECKERBOARD_BOOKCASE3, 33);
        registerFurnParts(exporter, ModBlocks.BLACK_HD_TV, 75);
        registerFurnParts(exporter, ModBlocks.BLACK_AND_WHITE_SQUARE_TABLE, 70);
        registerFurnParts(exporter, ModBlocks.LOW_BLACK_AND_WHITE_SOFA, 83);
        registerFurnParts(exporter, ModBlocks.SMALL_CALLBOARD, 43);
        registerFurnParts(exporter, ModBlocks.SIMPLE_BLACK_CLOCK, 20);
        registerFurnParts(exporter, ModBlocks.GRAYISH_WALL_LIGHT, 20);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.FURN_PARTS_ZIP1, 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.FURN_PARTS)
                .criterion("has_item", conditionsFromItem(ModItems.FURN_PARTS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "furn_part_zip1_from_parts"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.FURN_PARTS, 9)
                .input(ModItems.FURN_PARTS_ZIP1)
                .criterion("has_item", conditionsFromItem(ModItems.FURN_PARTS_ZIP1))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "furn_part_from_zip1"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.FURN_PARTS_ZIP2, 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.FURN_PARTS_ZIP1)
                .criterion("has_item", conditionsFromItem(ModItems.FURN_PARTS_ZIP1))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "furn_part_zip2_from_zip1"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.FURN_PARTS_ZIP1, 9)
                .input(ModItems.FURN_PARTS_ZIP2)
                .criterion("has_item", conditionsFromItem(ModItems.FURN_PARTS_ZIP2))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "furn_part_zip1_from_zip2"));
    }
    public static void registerFurnParts(Consumer<RecipeJsonProvider> exporter, Block block, int num) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.FURN_PARTS, num)
                .input(block)
                .criterion("has_item", conditionsFromItem(block))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, Registries.BLOCK.getId(block).getPath() + "_parts"));
    }
    public static void registerGuitar(Consumer<RecipeJsonProvider> exporter, Block block) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, block, 1)
                .pattern(" # ")
                .pattern("###")
                .pattern("###")
                .input('#', Items.IRON_INGOT)
                .criterion("has_item", conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, Registries.BLOCK.getId(block).getPath()));
    }
}
