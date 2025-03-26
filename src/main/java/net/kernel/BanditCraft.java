package net.kernel;

import net.fabricmc.api.ModInitializer;

import net.kernel.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BanditCraft implements ModInitializer {
	public static final String MOD_ID = "bandit-craft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}