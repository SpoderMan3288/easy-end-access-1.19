package net.gartersnake.easyendaccess.portals;

import net.gartersnake.easyendaccess.EasyEndAccess;
import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class ModPortals {
    public static void registerModPortals() {
        EasyEndAccess.LOGGER.debug("Registering Mod Portals for " + EasyEndAccess.MOD_ID);

        CustomPortalBuilder.beginPortal()
                .frameBlock(Blocks.END_STONE_BRICKS)
                .lightWithItem(Items.ENDER_EYE)
                .destDimID(new Identifier("the_end"))
                .tintColor(45,65,101)
                .onlyLightInOverworld()
                .registerPortal();
    }
}
