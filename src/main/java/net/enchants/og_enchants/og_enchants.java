package net.enchants.og_enchants;

import net.enchants.og_enchants.enchantments.ModEnchantments;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class og_enchants implements ModInitializer {
	public static final String MOD_ID = "og_enchants";

	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	@Override
	public void onInitialize() {
		ModEnchantments.registerModEnchanments();
		LOGGER.info("This Is From Extra Enchantments Reworked");
	}
}
