package net.gartersnake.easyendaccess;

import net.fabricmc.api.ModInitializer;
import net.gartersnake.easyendaccess.portals.ModPortals;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EasyEndAccess implements ModInitializer {
	public static final String MOD_ID = "easyendaccess";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModPortals.registerModPortals();
	}
}
