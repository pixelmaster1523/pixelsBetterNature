package net.pixel.natureplus.registries;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public final class ModItems {
    private ModItems() {}

    public static final Item CUSTOM_ITEM = register(new Item(new Item.Settings()), "custom_item");

    public static Item register(Item instance, String path) {
        return Registry.register(Registries.ITEM, Identifier.of("pixelsbetternature", path), instance);
    }

    public static void initialize() {
    }
}