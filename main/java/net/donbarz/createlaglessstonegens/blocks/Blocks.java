package net.donbarz.createlaglessstonegens.blocks;

import net.donbarz.createlaglessstonegens.CreateLaglessStoneGens;
import net.donbarz.createlaglessstonegens.blocks.custom.CobbleGen;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.Instrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class Blocks {

    public static final Block STONE_GEN = registerBlock("stone_gen",new CobbleGen(FabricBlockSettings.create()
            .mapColor(MapColor.IRON_GRAY)
            .instrument(Instrument.IRON_XYLOPHONE)
            .strength(1.0F, 6.0F)
            .sounds(BlockSoundGroup.WOOD)));

    private static Block registerBlock(String name, Block block){
        registerBlockItems(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(CreateLaglessStoneGens.MOD_ID, name),block);
    }

    private static Item registerBlockItems(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(CreateLaglessStoneGens.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerBlocks(){
        CreateLaglessStoneGens.LOGGER.info("Registering Stone Gen Blocks...");
    }
}
