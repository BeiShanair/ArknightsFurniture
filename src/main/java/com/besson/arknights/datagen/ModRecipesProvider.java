package com.besson.arknights.datagen;

import com.besson.arknights.ArknightsFurniture;
import com.besson.arknights.block.ModBlocks;
import com.besson.arknights.item.ModItems;
import com.besson.arknights.tag.ModItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
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
                .input('#', ItemTags.SIGNS)
                .criterion("has_item", conditionsFromTag(ItemTags.SIGNS))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "attendance_board"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAFFITI, 1)
                .pattern("###")
                .pattern("# #")
                .pattern("###")
                .input('#', Items.BLACK_DYE)
                .criterion("has_item", conditionsFromItem(Items.BLACK_DYE))
                .offerTo(exporter, new Identifier(ArknightsFurniture.MOD_ID, "graffiti"));
    }
}
