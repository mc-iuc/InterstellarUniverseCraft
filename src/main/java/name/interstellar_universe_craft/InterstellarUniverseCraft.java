package name.interstellar_universe_craft;

import name.interstellar_universe_craft.registry.ModBlocks;
import name.interstellar_universe_craft.registry.ModItemGroup;
import name.interstellar_universe_craft.registry.ModItems;
import net.fabricmc.api.ModInitializer;

import net.minecraft.item.Items;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InterstellarUniverseCraft implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "interstellar-universe-craft";
    public static final Logger LOGGER = LoggerFactory.getLogger("interstellar-universe-craft");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hoshino Is The Best!");
		ModItemGroup.registerModItemGroup();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}