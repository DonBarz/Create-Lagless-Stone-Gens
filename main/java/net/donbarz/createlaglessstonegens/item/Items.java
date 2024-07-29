package net.donbarz.createlaglessstonegens.item;

import net.donbarz.createlaglessstonegens.CreateLaglessStoneGens;
import net.donbarz.createlaglessstonegens.blocks.Blocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Items {

    //public static final Item STONEGEN = registerItem("stonegen",new Item(new FabricItemSettings()));

    private static void addItemsToItemGroup(FabricItemGroupEntries entries){
        //entries.add(STONEGEN);
        entries.add(Blocks.STONE_GEN);
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(CreateLaglessStoneGens.MOD_ID, name), item);
    }

    public static void registerItems(){
        CreateLaglessStoneGens.LOGGER.info("Registering Lagless Stone Gens...");
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(Items::addItemsToItemGroup);
    }
}
