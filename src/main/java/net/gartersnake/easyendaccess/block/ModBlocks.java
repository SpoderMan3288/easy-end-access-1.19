package net.gartersnake.easyendaccess.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.gartersnake.easyendaccess.EasyEndAccess;
import net.kyrptonaught.customportalapi.CustomPortalBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final VerticalEndPortal VERTICAL_END_PORTAL = (VerticalEndPortal) registerBlock("vertical_end_portal",
            new VerticalEndPortal(FabricBlockSettings.of(Material.PORTAL).noCollision().strength(100f, 100f)), ItemGroup.MISC);

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(EasyEndAccess.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(EasyEndAccess.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }
    public static void registerModBlocks() {
        EasyEndAccess.LOGGER.debug("Registering Mod Blocks for " + EasyEndAccess.MOD_ID);
    }
}
