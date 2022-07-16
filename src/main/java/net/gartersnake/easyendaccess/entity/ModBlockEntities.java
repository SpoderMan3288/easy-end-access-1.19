package net.gartersnake.easyendaccess.entity;


import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.gartersnake.easyendaccess.EasyEndAccess;
import net.gartersnake.easyendaccess.block.ModBlocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlockEntities {
    public static BlockEntityType<VerticalEndPortalBlockEntity> VERTICAL_END_PORTAL;

    public static void registerModBlockEntities() {
        EasyEndAccess.LOGGER.debug("Registering Mod Block Entities for " + EasyEndAccess.MOD_ID);

        VERTICAL_END_PORTAL = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier(EasyEndAccess.MOD_ID, "v"), FabricBlockEntityTypeBuilder.create(VerticalEndPortalBlockEntity::new,
                        ModBlocks.VERTICAL_END_PORTAL).build());
    }
}
