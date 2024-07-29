package net.donbarz.createlaglessstonegens;

import net.donbarz.createlaglessstonegens.blocks.Blocks;
import net.donbarz.createlaglessstonegens.blocks.entity.BlockEntities;
import net.donbarz.createlaglessstonegens.item.Items;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateLaglessStoneGens implements ModInitializer {
	public static final String MOD_ID = "createlaglessstonegens";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		Items.registerItems();
		Blocks.registerBlocks();
		BlockEntities.registerBlockEntities();

	}
}