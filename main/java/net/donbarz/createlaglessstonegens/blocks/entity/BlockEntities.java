package net.donbarz.createlaglessstonegens.blocks.entity;

import net.donbarz.createlaglessstonegens.CreateLaglessStoneGens;
import net.donbarz.createlaglessstonegens.blocks.Blocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BlockEntities {
    public static final BlockEntityType<CobbleGenEntity> COBBLE_GEN_ENTITY_BLOCK_ENTITY_TYPE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(CreateLaglessStoneGens.MOD_ID, "cobble_gen_be"),
                    FabricBlockEntityTypeBuilder.create(CobbleGenEntity::new, Blocks.STONE_GEN).build());
    public static void registerBlockEntities(){
        CreateLaglessStoneGens.LOGGER.info("Registering Stone Gen Block Entities...");
    }
}
