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

        // region WAREHOUSE
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CARDBOARD)
                .input(Items.PAPER)
                .input(Items.PAPER)
                .criterion("has_item", conditionsFromItem(Items.PAPER))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "cardboard"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.AIR_MATTRESS)
                .pattern("###")
                .input('#', Items.BLACK_WOOL)
                .criterion("has_item", conditionsFromItem(Items.BLACK_WOOL))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "air_mattress"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ATTENDANCE_BOARD)
                .pattern("###")
                .pattern("AAA")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.PAPER)
                .criterion(hasItem(Items.PAPER), conditionsFromItem(Items.PAPER))
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "attendance_board"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CARGO_TROLLEY)
                .pattern("#")
                .pattern("A")
                .input('#', ModItems.CARDBOARD)
                .input('A', Items.MINECART)
                .criterion(hasItem(ModItems.CARDBOARD), conditionsFromItem(ModItems.CARDBOARD))
                .criterion("has_item", conditionsFromItem(Items.MINECART))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "cargo_trolley"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CARTON)
                .pattern("###")
                .pattern("# #")
                .pattern("###")
                .input('#', ModItems.CARDBOARD)
                .criterion("has_item", conditionsFromItem(ModItems.CARDBOARD))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "carton"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CARTON_STOOL)
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.CARDBOARD)
                .criterion("has_item", conditionsFromItem(ModItems.CARDBOARD))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "carton_stool"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LARGE_SHELF1)
                .pattern("A#A")
                .pattern("ABA")
                .input('#', ModBlocks.CARTON)
                .input('A', Items.IRON_INGOT)
                .input('B', Items.BLACK_DYE)
                .criterion(hasItem(ModBlocks.CARTON), conditionsFromItem(ModBlocks.CARTON))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion("has_item", conditionsFromItem(Items.BLACK_DYE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "large_shelf"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LARGE_SHELF_EMPTY)
                .pattern("A A")
                .pattern("ABA")
                .input('A', Items.IRON_INGOT)
                .input('B', Items.BLACK_DYE)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion("has_item", conditionsFromItem(Items.BLACK_DYE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "large_shelf_empty"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LARGE_SHELF1)
                .input(ModBlocks.LARGE_SHELF_EMPTY)
                .input(ModBlocks.CARTON)
                .criterion(hasItem(ModBlocks.LARGE_SHELF_EMPTY), conditionsFromItem(ModBlocks.LARGE_SHELF_EMPTY))
                .criterion("has_item", conditionsFromItem(ModBlocks.CARTON))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "large_shelf_from_empty"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALLET)
                .pattern("###")
                .input('#', ModItems.CARDBOARD)
                .criterion("has_item", conditionsFromItem(ModItems.CARDBOARD))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "pallet"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PILE_OF_CARTONS)
                .pattern(" # ")
                .pattern("# #")
                .input('#', ModBlocks.CARTON)
                .criterion("has_item", conditionsFromItem(ModBlocks.CARTON))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "pile_of_cartons"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PORTABLE_CALCULATOR)
                .pattern("#")
                .pattern("A")
                .input('#', Items.LEVER)
                .input('A', ModBlocks.CARTON)
                .criterion(hasItem(Items.LEVER), conditionsFromItem(Items.LEVER))
                .criterion("has_item", conditionsFromItem(ModBlocks.CARTON))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "portable_calculator"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POST_IT_NOTE)
                .pattern("# #")
                .pattern(" # ")
                .input('#', Items.PAPER)
                .criterion("has_item", conditionsFromItem(Items.PAPER))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "post_it_note"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CEILING_ROW_LIGHT)
                .pattern("###")
                .input('#', Items.GLOWSTONE_DUST)
                .criterion("has_item", conditionsFromItem(Items.GLOWSTONE_DUST))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "ceiling_row_light"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONCRETE_WALL)
                .pattern("##")
                .pattern("##")
                .input('#', Items.BLACK_CONCRETE)
                .criterion("has_item", conditionsFromItem(Items.BLACK_CONCRETE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "concrete_wall"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.REINFORCED_CONCRETE_WALLS)
                .pattern("A#")
                .pattern("##")
                .input('#', Items.BLACK_CONCRETE)
                .input('A', Items.IRON_INGOT)
                .criterion(hasItem(Items.BLACK_CONCRETE), conditionsFromItem(Items.BLACK_CONCRETE))
                .criterion("has_item", conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "reinforced_concrete_walls"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DORMITORY_DOOR_FRAMES)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .input('#', Items.IRON_INGOT)
                .criterion("has_item", conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "dormitory_door_frames"));


        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAFFITI)
                .pattern(" ##")
                .pattern("###")
                .pattern(" # ")
                .input('#', Items.BLACK_DYE)
                .criterion("has_item", conditionsFromItem(Items.BLACK_DYE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "graffiti"));
        // endregion

        // region SIDELINE
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAYISH_WALL_LIGHT)
                .pattern("A")
                .pattern("B")
                .input('A', Items.QUARTZ)
                .input('B', Items.GLOWSTONE_DUST)
                .criterion(hasItem(Items.GLOWSTONE_DUST), conditionsFromItem(Items.GLOWSTONE_DUST))
                .criterion("has_item", conditionsFromItem(Items.QUARTZ))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "grayish_wall_light"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SIMPLE_BLACK_CLOCK)
                .pattern("#A")
                .input('#', Items.BLACK_DYE)
                .input('A', Items.CLOCK)
                .criterion(hasItem(Items.CLOCK), conditionsFromItem(Items.CLOCK))
                .criterion("has_item", conditionsFromItem(Items.BLACK_DYE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "simple_black_clock"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_HD_TV)
                .pattern("#BA")
                .pattern(" # ")
                .input('#', Items.IRON_INGOT)
                .input('A', Items.BLACK_WOOL)
                .input('B', Items.GLASS_PANE)
                .criterion(hasItem(Items.BLACK_WOOL), conditionsFromItem(Items.BLACK_WOOL))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion("has_item", conditionsFromItem(Items.GLASS_PANE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "black_hd_tv"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_NIGHTSTAND)
                .pattern("##A")
                .pattern("## ")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.BLACK_DYE)
                .criterion(hasItem(Items.BLACK_DYE), conditionsFromItem(Items.BLACK_DYE))
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "black_nightstand"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_BED)
                .pattern("##")
                .pattern("AA")
                .input('#', Items.BLACK_WOOL)
                .input('A', ItemTags.PLANKS)
                .criterion(hasItem(Items.BLACK_WOOL), conditionsFromItem(Items.BLACK_WOOL))
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "black_bed"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMALL_CALLBOARD)
                .pattern("###")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "small_callboard"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_AND_WHITE_SQUARE_TABLE)
                .pattern("AAA")
                .pattern("ABA")
                .input('A', ItemTags.PLANKS)
                .input('B', Items.BLACK_DYE)
                .criterion(hasItem(Items.BLACK_DYE), conditionsFromItem(Items.BLACK_DYE))
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "black_and_white_square_table"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LOW_BLACK_AND_WHITE_SOFA)
                .pattern("A A")
                .pattern("BBB")
                .input('A', Items.BLACK_WOOL)
                .input('B', Items.WHITE_WOOL)
                .criterion(hasItem(Items.BLACK_WOOL), conditionsFromItem(Items.BLACK_WOOL))
                .criterion("has_item", conditionsFromItem(Items.WHITE_WOOL))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "low_black_and_white_sofa"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_OFFICE_CHAIR)
                .pattern("A A")
                .pattern("ABA")
                .pattern(" A ")
                .input('A', Items.BLACK_WOOL)
                .input('B', Items.IRON_INGOT)
                .criterion(hasItem(Items.BLACK_WOOL), conditionsFromItem(Items.BLACK_WOOL))
                .criterion("has_item", conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "black_office_chair"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SIMPLE_BLACK_DESK_LBL)
                .pattern("###")
                .pattern("A A")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.BLACK_DYE)
                .criterion(hasItem(Items.BLACK_DYE), conditionsFromItem(Items.BLACK_DYE))
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "simple_black_desk"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHECKERBOARD_BOOKCASE_BBL)
                .pattern("###")
                .pattern("ABA")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.BLACK_DYE)
                .input('B', Items.BOOK)
                .criterion(hasItem(Items.BLACK_DYE), conditionsFromItem(Items.BLACK_DYE))
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .criterion(hasItem(Items.BOOK), conditionsFromItem(Items.BOOK))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "checkerboard_bookcase"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SIMPLE_BLACK_CABINET)
                .pattern("###")
                .pattern("A A")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.BLACK_DYE)
                .criterion(hasItem(Items.BLACK_DYE), conditionsFromItem(Items.BLACK_DYE))
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "simple_black_cabinet"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_FIBER_CARPET)
                .pattern("##")
                .pattern("##")
                .input('#', Items.GRAY_CARPET)
                .criterion("has_item", conditionsFromItem(Items.GRAY_CARPET))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "gray_fiber_carpet"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAYISH_WALL_BBL)
                .pattern("## ")
                .pattern("## ")
                .input('#', Items.GRAY_CONCRETE)
                .criterion("has_item", conditionsFromItem(Items.GRAY_CONCRETE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "grayish_wall"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAYISH_WALL_TBL)
                .pattern(" ##")
                .pattern(" ##")
                .input('#', Items.GRAY_CONCRETE)
                .criterion("has_item", conditionsFromItem(Items.GRAY_CONCRETE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "grayish_wall_t"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMALL_CEILING_LIGHT)
                .input(Items.GLOWSTONE_DUST)
                .input(Items.IRON_INGOT)
                .criterion("has_item", conditionsFromItem(Items.GLOWSTONE_DUST))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "small_ceiling_light"));


        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_WALL_LIGHT)
                .pattern("A#")
                .pattern("B ")
                .input('A', Items.QUARTZ)
                .input('B', Items.GLOWSTONE_DUST)
                .input('#', Items.ORANGE_DYE)
                .criterion(hasItem(Items.GLOWSTONE_DUST), conditionsFromItem(Items.GLOWSTONE_DUST))
                .criterion(hasItem(Items.QUARTZ), conditionsFromItem(Items.QUARTZ))
                .criterion("has_item", conditionsFromItem(Items.ORANGE_DYE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "orange_wall_light"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SIMPLE_ORANGE_CLOCK)
                .pattern("#A")
                .input('#', Items.ORANGE_DYE)
                .input('A', Items.CLOCK)
                .criterion(hasItem(Items.CLOCK), conditionsFromItem(Items.CLOCK))
                .criterion("has_item", conditionsFromItem(Items.ORANGE_DYE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "simple_orange_clock"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_HD_TV)
                .pattern("#BA")
                .pattern(" # ")
                .input('#', Items.IRON_INGOT)
                .input('A', Items.ORANGE_DYE)
                .input('B', Items.GLASS_PANE)
                .criterion(hasItem(Items.ORANGE_DYE), conditionsFromItem(Items.ORANGE_DYE))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion("has_item", conditionsFromItem(Items.GLASS_PANE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "orange_hd_tv"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_NIGHTSTAND)
                .pattern("##A")
                .pattern("## ")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.ORANGE_DYE)
                .criterion("has_item", conditionsFromItem(Items.ORANGE_DYE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "orange_nightstand"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_BED)
                .pattern("##")
                .pattern("AA")
                .input('#', Items.ORANGE_WOOL)
                .input('A', ItemTags.PLANKS)
                .criterion(hasItem(Items.ORANGE_WOOL), conditionsFromItem(Items.ORANGE_WOOL))
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "orange_bed"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMALL_NOTICEBOARD)
                .pattern("#A#")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.PAPER)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .criterion(hasItem(Items.PAPER), conditionsFromItem(Items.PAPER))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "small_noticeboard"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_SQUARE_TABLE)
                .pattern("AAA")
                .pattern("ABA")
                .input('A', ItemTags.PLANKS)
                .input('B', Items.ORANGE_DYE)
                .criterion(hasItem(Items.ORANGE_DYE), conditionsFromItem(Items.ORANGE_DYE))
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "orange_square_table"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LOW_ORANGE_SOFA)
                .pattern("A A")
                .pattern("BBB")
                .input('A', Items.BLACK_WOOL)
                .input('B', Items.ORANGE_DYE)
                .criterion(hasItem(Items.ORANGE_DYE), conditionsFromItem(Items.ORANGE_DYE))
                .criterion("has_item", conditionsFromItem(Items.BLACK_WOOL))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "low_orange_sofa"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CHECKERBOARD_BOOKCASE_BBL)
                .pattern("###")
                .pattern("ABA")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.ORANGE_DYE)
                .input('B', Items.BOOK)
                .criterion(hasItem(Items.ORANGE_DYE), conditionsFromItem(Items.ORANGE_DYE))
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .criterion(hasItem(Items.BOOK), conditionsFromItem(Items.BOOK))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "orange_checkerboard_bookcase"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_SWIVEL_CHAIR)
                .pattern("A A")
                .pattern("ABA")
                .pattern(" A ")
                .input('A', Items.ORANGE_WOOL)
                .input('B', Items.IRON_INGOT)
                .criterion(hasItem(Items.ORANGE_WOOL), conditionsFromItem(Items.ORANGE_WOOL))
                .criterion("has_item", conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "orange_swivel_chair"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SIMPLE_ORANGE_CABINET)
                .pattern("###")
                .pattern("A A")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.ORANGE_DYE)
                .criterion(hasItem(Items.ORANGE_DYE), conditionsFromItem(Items.ORANGE_DYE))
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "simple_orange_cabinet"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SIMPLE_ORANGE_DESK_LBL)
                .pattern("###")
                .pattern("A A")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.ORANGE_DYE)
                .criterion(hasItem(Items.ORANGE_DYE), conditionsFromItem(Items.ORANGE_DYE))
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "simple_orange_desk"));
        // endregion

        // region FANTASY
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_BEAN_BAG_SOFA)
                .pattern("A A")
                .pattern("AAA")
                .input('A', Items.BROWN_WOOL)
                .criterion("has_item", conditionsFromItem(Items.BROWN_WOOL))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "brown_bean_bag_sofa"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECO_EXHIBITION_CABINET_BASE)
                .pattern("###")
                .pattern("ABA")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.GLASS_PANE)
                .input('B', Items.IRON_INGOT)
                .criterion(hasItem(Items.GLASS_PANE), conditionsFromItem(Items.GLASS_PANE))
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "eco_exhibition_cabinet"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FLUSH_MOUNT_RECTANGLE_CEILING_LIGHT)
                .pattern("#A#")
                .pattern("#A#")
                .pattern("#A#")
                .input('#', Items.IRON_INGOT)
                .input('A', Items.GLOWSTONE_DUST)
                .criterion(hasItem(Items.GLOWSTONE_DUST), conditionsFromItem(Items.GLOWSTONE_DUST))
                .criterion("has_item", conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "flush_mount_rectangle_ceiling_light"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FLUSH_MOUNT_SQUARE_CEILING_LIGHT)
                .pattern("#A")
                .pattern("#A")
                .input('#', Items.IRON_INGOT)
                .input('A', Items.GLOWSTONE_DUST)
                .criterion(hasItem(Items.GLOWSTONE_DUST), conditionsFromItem(Items.GLOWSTONE_DUST))
                .criterion("has_item", conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "flush_mount_square_ceiling_light"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.METALLIC_BED)
                .pattern("###")
                .pattern("AAA")
                .input('#', ItemTags.WOOL)
                .input('A', Items.IRON_INGOT)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion("has_item", conditionsFromTag(ItemTags.WOOL))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "metallic_bed"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POTTED_BROADLEAF_PLANT)
                .input(Items.FLOWER_POT)
                .input(Items.OAK_LEAVES)
                .criterion(hasItem(Items.OAK_LEAVES), conditionsFromItem(Items.OAK_LEAVES))
                .criterion("has_item", conditionsFromItem(Items.FLOWER_POT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "potted_broadleaf_plant"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POTTED_CONIFER_PLANT)
                .input(Items.FLOWER_POT)
                .input(Items.SPRUCE_LEAVES)
                .criterion(hasItem(Items.SPRUCE_LEAVES), conditionsFromItem(Items.SPRUCE_LEAVES))
                .criterion("has_item", conditionsFromItem(Items.FLOWER_POT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "potted_conifer_plant"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POTTED_SUCCULENT_PLANT)
                .input(Items.FLOWER_POT)
                .input(Items.CACTUS)
                .criterion(hasItem(Items.CACTUS), conditionsFromItem(Items.CACTUS))
                .criterion("has_item", conditionsFromItem(Items.FLOWER_POT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "potted_succulent_plant"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMALL_SQUARE_NIGHTSTAND)
                .pattern(" A ")
                .pattern("###")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.FLOWER_POT)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .criterion(hasItem(Items.FLOWER_POT), conditionsFromItem(Items.FLOWER_POT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "small_square_nightstand"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPECIMEN_DATA_BOARD)
                .pattern("###")
                .pattern("#A#")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.PAPER)
                .criterion(hasItem(Items.PAPER), conditionsFromItem(Items.PAPER))
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "specimen_data_board"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WIRE_SIDE_TABLE)
                .pattern("###")
                .pattern("AAA")
                .pattern("###")
                .input('A', Items.IRON_INGOT)
                .input('#', ItemTags.PLANKS)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "wire_side_table"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COPPER_FLOOR_FRONT)
                .input(ItemTags.PLANKS)
                .input(ItemTags.PLANKS)
                .input(ItemTags.PLANKS)
                .input(ItemTags.PLANKS)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "copper_floor"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.METALLIC_WALLPAPER_BOTTOM)
                .pattern("#A")
                .pattern("##")
                .input('#', Items.IRON_INGOT)
                .input('A', Items.GRAY_DYE)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion("has_item", conditionsFromItem(Items.GRAY_DYE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "metallic_wallpaper_bottom"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.METALLIC_WALLPAPER_LB)
                .pattern("#AA")
                .pattern("###")
                .input('#', Items.IRON_INGOT)
                .input('A', Items.GRAY_DYE)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion("has_item", conditionsFromItem(Items.GRAY_DYE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "metallic_wallpaper_lb"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.UNKNOWN_SPECIMENS)
                .pattern("#A")
                .input('#', Items.ITEM_FRAME)
                .input('A', Items.ENDER_EYE)
                .criterion(hasItem(Items.ITEM_FRAME), conditionsFromItem(Items.ITEM_FRAME))
                .criterion("has_item", conditionsFromItem(Items.ENDER_EYE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "unknown_specimens"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.UNKNOWN_BONES)
                .pattern("#A")
                .input('#', Items.ITEM_FRAME)
                .input('A', Items.BONE)
                .criterion(hasItem(Items.ITEM_FRAME), conditionsFromItem(Items.ITEM_FRAME))
                .criterion("has_item", conditionsFromItem(Items.BONE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "unknown_bones"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WIDE_GRAY_CARPET_LEFT)
                .pattern("###")
                .pattern("###")
                .input('#', Items.GRAY_CARPET)
                .criterion("has_item", conditionsFromItem(Items.GRAY_CARPET))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "wide_gray_carpet"));
        // endregion

        // region LIFECYCLE
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANTI_EXPLOSION_TRASH_CAN)
                .pattern("# #")
                .pattern("# #")
                .pattern("AAA")
                .input('#', Items.IRON_INGOT)
                .input('A', Items.BLACK_DYE)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion("has_item", conditionsFromItem(Items.BLACK_DYE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "anti_explosion_trash_can"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_FIBER_CARPET)
                .pattern("##")
                .pattern("##")
                .input('#', Items.BLACK_CARPET)
                .criterion("has_item", conditionsFromItem(Items.BLACK_CARPET))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "black_fiber_carpet"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_HANGING_BASKET)
                .pattern("###")
                .pattern(" A ")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.BLACK_DYE)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .criterion(hasItem(Items.BLACK_DYE), conditionsFromItem(Items.BLACK_DYE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "black_hanging_basket"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BUILT_IN_FILE_CABINET1)
                .pattern("###")
                .pattern("AAA")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.PAPER)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .criterion(hasItem(Items.PAPER), conditionsFromItem(Items.PAPER))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "built_in_file_cabinet1"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BUILT_IN_FILE_CABINET2)
                .pattern("###")
                .pattern("A A")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.PAPER)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .criterion(hasItem(Items.PAPER), conditionsFromItem(Items.PAPER))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "built_in_file_cabinet2"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BUNK_BED_IN_CABIN_BOTTOM)
                .pattern("AA#")
                .pattern("###")
                .input('#', Items.IRON_INGOT)
                .input('A', ItemTags.WOOL)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromTag(ItemTags.WOOL))
                .criterion("has_item", conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "bunk_bed_in_cabin_bottom"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BUNK_BED_IN_CABIN_TOP)
                .pattern("###")
                .pattern("AA#")
                .pattern("###")
                .input('#', Items.IRON_INGOT)
                .input('A', ItemTags.WOOL)
                .criterion("has_item", conditionsFromTag(ItemTags.WOOL))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "bunk_bed_in_cabin_top"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CABIN_FIRE_EXTINGUISHER_KIT)
                .pattern("AA")
                .pattern("BB")
                .pattern("AA")
                .input('A', Items.IRON_INGOT)
                .input('B', Items.WATER_BUCKET)
                .criterion("has_item", conditionsFromItem(Items.WATER_BUCKET))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "cabin_fire_extinguisher_kit"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CABIN_FLUSH_MOUNT_PIPE_LEFT)
                .pattern("A  ")
                .pattern("AAA")
                .input('A', Items.IRON_INGOT)
                .criterion("has_item", conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "cabin_flush_mount_pipe_left"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CABIN_FLUSH_MOUNT_PIPE_RIGHT)
                .pattern("  A")
                .pattern("AAA")
                .input('A', Items.IRON_INGOT)
                .criterion("has_item", conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "cabin_flush_mount_pipe_right"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CONTROL_DISPLAY)
                .pattern("###")
                .pattern("ABA")
                .pattern("###")
                .input('#', Items.IRON_INGOT)
                .input('A', Items.BLACK_DYE)
                .input('B', Items.LEVER)
                .criterion(hasItem(Items.LEVER), conditionsFromItem(Items.LEVER))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion("has_item", conditionsFromItem(Items.BLACK_DYE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "control_display"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIY_SWIVEL_CHAIR)
                .pattern("A A")
                .pattern("ABA")
                .pattern(" A ")
                .input('A', Items.BLACK_WOOL)
                .input('B', Items.IRON_INGOT)
                .criterion(hasItem(Items.BLACK_WOOL), conditionsFromItem(Items.BLACK_WOOL))
                .criterion("has_item", conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "diy_swivel_chair"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIY_WORKBENCH_LEFT)
                .pattern("###")
                .pattern("A  ")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.GRAY_DYE)
                .criterion("has_item", conditionsFromItem(Items.GRAY_DYE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "diy_workbench_left"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIY_WORKBENCH_RIGHT)
                .pattern("###")
                .pattern("  A")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.GRAY_DYE)
                .criterion("has_item", conditionsFromItem(Items.GRAY_DYE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "diy_workbench_right"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GREEN_WALLPAPER)
                .input(Items.BRICKS)
                .input(Items.LIME_DYE)
                .criterion(hasItem(Items.BRICKS), conditionsFromItem(Items.BRICKS))
                .criterion("has_item", conditionsFromItem(Items.LIME_DYE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "light_green_wallpaper"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GREEN_WALLPAPER_FLOOR_MIDDLE)
                .pattern("##A")
                .pattern("##A")
                .input('#', Items.BRICKS)
                .input('A', Items.LIME_DYE)
                .criterion(hasItem(Items.BRICKS), conditionsFromItem(Items.BRICKS))
                .criterion("has_item", conditionsFromItem(Items.LIME_DYE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "light_green_wallpaper_floor_middle"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GREEN_WALLPAPER_FLOOR_RIGHT)
                .pattern("A##")
                .pattern("A##")
                .input('#', Items.BRICKS)
                .input('A', Items.LIME_DYE)
                .criterion(hasItem(Items.BRICKS), conditionsFromItem(Items.BRICKS))
                .criterion("has_item", conditionsFromItem(Items.LIME_DYE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "light_green_wallpaper_floor_right"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GREEN_WALLPAPER_REFUGE)
                .input(Items.BRICKS)
                .input(Items.LIME_DYE)
                .input(Items.BLACK_DYE)
                .criterion(hasItem(Items.BRICKS), conditionsFromItem(Items.BRICKS))
                .criterion(hasItem(Items.LIME_DYE), conditionsFromItem(Items.LIME_DYE))
                .criterion("has_item", conditionsFromItem(Items.BLACK_DYE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "light_green_wallpaper_refuge"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GREEN_WALLPAPER_REFUGE2)
                .input(Items.BRICKS)
                .input(Items.LIME_DYE)
                .input(Items.BLACK_DYE)
                .input(Items.BLACK_DYE)
                .criterion(hasItem(Items.BRICKS), conditionsFromItem(Items.BRICKS))
                .criterion(hasItem(Items.LIME_DYE), conditionsFromItem(Items.LIME_DYE))
                .criterion("has_item", conditionsFromItem(Items.BLACK_DYE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "light_green_wallpaper_refuge2"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NOTE_BOARD_IN_CABIN_DISPLAY)
                .input(ItemTags.SIGNS)
                .input(ItemTags.SIGNS)
                .criterion("has_item", conditionsFromTag(ItemTags.SIGNS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "note_board_in_cabin_display"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NOTE_BOARD_IN_CABIN_SIGN)
                .input(ItemTags.SIGNS)
                .input(ItemTags.SIGNS)
                .input(ItemTags.SIGNS)
                .criterion("has_item", conditionsFromTag(ItemTags.SIGNS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "note_board_in_cabin_sign"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GENERAL_CONSOLE)
                .pattern(" ##")
                .pattern("ABA")
                .pattern("###")
                .input('#', Items.IRON_INGOT)
                .input('A', Items.GRAY_DYE)
                .input('B', Items.REDSTONE)
                .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion("has_item", conditionsFromItem(Items.GRAY_DYE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "general_console"));
        // endregion

        // region CAFE
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BAR_CEILING)
                .pattern("###")
                .pattern("AAA")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.GLOWSTONE_DUST)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .criterion(hasItem(Items.GLOWSTONE_DUST), conditionsFromItem(Items.GLOWSTONE_DUST))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "bar_ceiling"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BARSTOOL_WITH_CURVED_LEGS)
                .pattern("AAA")
                .pattern(" A ")
                .pattern("A A")
                .input('A', ItemTags.PLANKS)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "barstool_with_curved_legs"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BEVERAGE_CABINET_EMPTY)
                .pattern("###")
                .pattern("# #")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "beverage_cabinet_empty"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BEVERAGE_CABINET_COFFEE)
                .pattern("###")
                .pattern("#A#")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.COCOA_BEANS)
                .criterion(hasItem(Items.COCOA_BEANS), conditionsFromItem(Items.COCOA_BEANS))
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "beverage_cabinet_coffee"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BEVERAGE_MENU)
                .pattern("## ")
                .pattern(" ##")
                .input('#', Items.PAPER)
                .criterion("has_item", conditionsFromItem(Items.PAPER))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "beverage_menu"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BOLIVARIAN_COFFEE_BEAN)
                .pattern("A#A")
                .pattern("A#A")
                .input('#', Items.COCOA_BEANS)
                .input('A', ItemTags.PLANKS)
                .criterion(hasItem(Items.COCOA_BEANS), conditionsFromItem(Items.COCOA_BEANS))
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "bolivarian_coffee_bean"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_BOOKCASE_LB)
                .pattern("###")
                .pattern(" # ")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "brown_bookcase"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BRICK_PATTERN_WALLPAPER)
                .input(Items.BRICKS)
                .input(Items.GRAY_DYE)
                .criterion(hasItem(Items.BRICKS), conditionsFromItem(Items.BRICKS))
                .criterion("has_item", conditionsFromItem(Items.GRAY_DYE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "brick_pattern_wallpaper"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BRICK_PATTERN_WALLPAPER_FLOOR)
                .input(Items.BRICKS)
                .input(Items.GRAY_DYE)
                .input(Items.BROWN_DYE)
                .criterion(hasItem(Items.BRICKS), conditionsFromItem(Items.BRICKS))
                .criterion(hasItem(Items.GRAY_DYE), conditionsFromItem(Items.GRAY_DYE))
                .criterion("has_item", conditionsFromItem(Items.BROWN_DYE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "brick_pattern_wallpaper_floor"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COFFEE_BEAN_CAN)
                .input(Items.COCOA_BEANS)
                .input(Items.GLASS_BOTTLE)
                .criterion(hasItem(Items.COCOA_BEANS), conditionsFromItem(Items.COCOA_BEANS))
                .criterion("has_item", conditionsFromItem(Items.GLASS_BOTTLE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "coffee_bean_can"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COFFEE_BEAN_DISPLAY)
                .input(Items.COCOA_BEANS)
                .input(Items.GLASS_BOTTLE)
                .input(Items.GLASS_BOTTLE)
                .criterion(hasItem(Items.COCOA_BEANS), conditionsFromItem(Items.COCOA_BEANS))
                .criterion("has_item", conditionsFromItem(Items.GLASS_BOTTLE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "coffee_bean_display"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COFFEE_MENU)
                .pattern(" # ")
                .pattern("# #")
                .input('#', Items.PAPER)
                .criterion("has_item", conditionsFromItem(Items.PAPER))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "coffee_menu"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COLUMBIAN_STREET_VIEW_PHOTO)
                .pattern("#  ")
                .pattern(" # ")
                .pattern("  #")
                .input('#', Items.PAPER)
                .criterion("has_item", conditionsFromItem(Items.PAPER))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "columbian_street_view_photo"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DINING_CHAIR)
                .pattern("A")
                .pattern("B")
                .input('A', ItemTags.SLABS)
                .input('B', Items.STICK)
                .criterion("has_item", conditionsFromTag(ItemTags.SLABS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "dining_chair"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PEDESTAL_COFFEE_TABLE)
                .pattern("AAA")
                .pattern(" B ")
                .pattern(" B ")
                .input('A', ItemTags.PLANKS)
                .input('B', Items.IRON_INGOT)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "pedestal_coffee_table"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PENDANT_LIGHT)
                .pattern("A")
                .pattern("A")
                .pattern("B")
                .input('A', Items.IRON_INGOT)
                .input('B', Items.GLOWSTONE_DUST)
                .criterion("has_item", conditionsFromItem(Items.GLOWSTONE_DUST))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "pendant_light"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POTTED_LONG_LEAF_PLANT)
                .pattern("A")
                .pattern("B")
                .input('A', Items.FLOWER_POT)
                .input('B', ItemTags.SAPLINGS)
                .criterion("has_item", conditionsFromTag(ItemTags.SAPLINGS))
                .criterion(hasItem(Items.FLOWER_POT), conditionsFromItem(Items.FLOWER_POT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "potted_long_leaf_plant"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_BRICK_CAFE_BAR)
                .pattern("A")
                .pattern("#")
                .input('A', ItemTags.SLABS)
                .input('#', Items.BRICKS)
                .criterion(hasItem(Items.BRICKS), conditionsFromItem(Items.BRICKS))
                .criterion("has_item", conditionsFromTag(ItemTags.SLABS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "red_brick_cafe_bar"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_BROWN_CABINET)
                .pattern("###")
                .pattern("A#A")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.BROWN_DYE)
                .criterion(hasItem(Items.BROWN_DYE), conditionsFromItem(Items.BROWN_DYE))
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "red_brown_cabinet"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOFT_CEILING_LIGHT)
                .pattern("AAA")
                .pattern(" B ")
                .input('A', Items.IRON_INGOT)
                .input('B', Items.GLOWSTONE_DUST)
                .criterion("has_item", conditionsFromItem(Items.GLOWSTONE_DUST))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "soft_ceiling_light"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WOOD_ORNAMENT)
                .input(Items.STICK)
                .input(Items.STICK)
                .input(Items.STICK)
                .criterion("has_item", conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "wood_ornament"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CAFE_FLOOR, 3)
                .pattern("###")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "cafe_floor"));
        // endregion

        // region LDG
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_PEDESTAL_TABLE)
                .pattern("AAA")
                .pattern(" # ")
                .pattern(" B ")
                .input('A', ItemTags.SLABS)
                .input('B', Items.IRON_INGOT)
                .input('#', Items.BLACK_DYE)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.BLACK_DYE), conditionsFromItem(Items.BLACK_DYE))
                .criterion("has_item", conditionsFromTag(ItemTags.SLABS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "black_pedestal_table"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_VINTAGE_CHAIR)
                .pattern("AAA")
                .pattern("B B")
                .input('A', Items.BLACK_WOOL)
                .input('B', Items.STICK)
                .criterion("has_item", conditionsFromItem(Items.BLACK_WOOL))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "black_vintage_chair"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_VINTAGE_STOOL)
                .pattern("AAA")
                .pattern(" B ")
                .input('A', Items.BLACK_WOOL)
                .input('B', Items.IRON_INGOT)
                .criterion("has_item", conditionsFromItem(Items.BLACK_WOOL))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "black_vintage_stool"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BRIGHT_WALL_LIGHT)
                .pattern("AB#")
                .input('A', Items.IRON_INGOT)
                .input('B', Items.GLOWSTONE_DUST)
                .input('#', Items.BLACK_DYE)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.GLOWSTONE_DUST), conditionsFromItem(Items.GLOWSTONE_DUST))
                .criterion("has_item", conditionsFromItem(Items.BLACK_DYE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "bright_wall_light"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DUPLEX_WOODEN_FENCE_TOP)
                .pattern("A  ")
                .pattern("AAA")
                .pattern("  A")
                .input('A', ItemTags.PLANKS)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "duplex_wooden_fence"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DUPLEX_WOODEN_FENCE_BOTTOM)
                .pattern("  A")
                .pattern("AAA")
                .pattern("A  ")
                .input('A', ItemTags.PLANKS)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "duplex_wooden_fence_bottom"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DUPLEX_WOODEN_FENCE_BOTTOM_LIGHT)
                .pattern("A#A")
                .pattern("AAA")
                .input('A', ItemTags.PLANKS)
                .input('#', Items.GLOWSTONE_DUST)
                .criterion(hasItem(Items.GLOWSTONE_DUST), conditionsFromItem(Items.GLOWSTONE_DUST))
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "duplex_wooden_fence_bottom_light"));


        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LOW_SANDALWOOD_MEETING_TABLE)
                .pattern("AAA")
                .pattern("B B")
                .input('A', ItemTags.SLABS)
                .input('B', Items.IRON_INGOT)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion("has_item", conditionsFromTag(ItemTags.SLABS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "low_sandalwood_meeting_table"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDALWOOD_BED)
                .pattern("##A")
                .pattern("AAA")
                .input('#', ItemTags.WOOL)
                .input('A', ItemTags.PLANKS)
                .criterion(hasItem(Items.WHITE_WOOL), conditionsFromItem(Items.WHITE_WOOL))
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "sandalwood_bed"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDALWOOD_MEETING_BOARD)
                .pattern("# #")
                .pattern("ABA")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.PAPER)
                .input('B', Items.IRON_INGOT)
                .criterion(hasItem(Items.PAPER), conditionsFromItem(Items.PAPER))
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "sandalwood_meeting_board"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SIMPLE_BLACK_LOUNGE_CHAIR)
                .pattern("AB")
                .pattern("BA")
                .input('A', Items.BLACK_WOOL)
                .input('B', Items.IRON_INGOT)
                .criterion("has_item", conditionsFromItem(Items.BLACK_WOOL))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "simple_black_lounge_chair"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMALL_SANDALWOOD_NIGHTSTAND)
                .pattern("###")
                .pattern("## ")
                .pattern("## ")
                .input('#', ItemTags.PLANKS)
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "small_sandalwood_nightstand"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_WOOL_CARPET_LEFT)
                .pattern("###")
                .pattern("###")
                .input('#', Items.GRAY_CARPET)
                .criterion("has_item", conditionsFromItem(Items.GRAY_CARPET))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "gray_wool_carpet"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PAINTING_WITH_SANDALWOOD_FRAME)
                .pattern("###")
                .pattern("#A#")
                .pattern("###")
                .input('#', ItemTags.PLANKS)
                .input('A', Items.PAINTING)
                .criterion(hasItem(Items.PAINTING), conditionsFromItem(Items.PAINTING))
                .criterion("has_item", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "painting_with_sandalwood_frame"));
        // endregion
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
