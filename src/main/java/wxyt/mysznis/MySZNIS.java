package wxyt.mysznis;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import wxyt.mysznis.initmain.MySZNISBlockLoader;
import wxyt.mysznis.initmain.MySZNISItemGroupLoader;
import wxyt.mysznis.initmain.MySZNISItemLoader;

public class MySZNIS implements ModInitializer {
	public static final String MOD_ID = "my-sznis";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
        MySZNISBlockLoader.registerBlocks();
        MySZNISItemGroupLoader.registerItemGroups();
        MySZNISItemLoader.registerItems();


		LOGGER.info("Hello Fabric world!");
	}

}
