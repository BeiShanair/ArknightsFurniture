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
}
