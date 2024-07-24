package net.pixel.natureplus;

import net.fabricmc.api.ModInitializer;
import net.pixel.natureplus.registries.ModBlocks;
import net.pixel.natureplus.registries.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PixelsBetterNature implements ModInitializer {
	public static final String MOD_ID = "pixelsbetternature";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("I left this here to tell you, you smell :D");
		ModItems.initialize();
		ModBlocks.initialise();
	}
}