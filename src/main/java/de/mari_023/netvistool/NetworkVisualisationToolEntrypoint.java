package de.mari_023.netvistool;

import appeng.api.IAEAddonEntrypoint;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class NetworkVisualisationToolEntrypoint implements IAEAddonEntrypoint {
    public static String MOD_NAME = "netvistool";
    public static Item NETWORK_VISUALIZATION_TOOL = new Item(new Item.Properties());

    @Override
    public void onAe2Initialized() {
        Registry.register(BuiltInRegistries.ITEM, makeResourceLocation(MOD_NAME), NETWORK_VISUALIZATION_TOOL);
    }

    public static ResourceLocation makeResourceLocation(String path) {
        return new ResourceLocation(MOD_NAME, path);
    }
}
