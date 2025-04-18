package com.besson.arknights;

import com.besson.arknights.block.ModBlockEntities;
import com.besson.arknights.block.ModBlocks;
import com.besson.arknights.item.ModItemGroups;
import com.besson.arknights.item.ModItems;
import com.besson.arknights.painting.ModPaintingVariants;
import com.besson.arknights.screen.ModScreenHandlers;
import com.besson.arknights.tag.ModBlockTags;
import com.besson.arknights.tag.ModItemTags;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArknightsFurniture implements ModInitializer {
	public static final String MOD_ID = "arknights-furniture";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModItems.registerItems();
		ModBlocks.registerBlocks();
		ModItemGroups.registerItemGroups();
		ModPaintingVariants.registerPaintings();
		ModBlockEntities.registerModBlockEntities();
		ModItemTags.registerModBlockTags();
		ModBlockTags.registerModBlockTags();
		ModScreenHandlers.registerScreenHandlers();

		LOGGER.info("Hello Fabric world!");
	}
}