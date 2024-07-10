package net.pixel.natureplus.init;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.pixel.natureplus.PixelsBetterNature;

public class ModItems {

    public static final Item FUNNY_STICK = register("funny_stick", new Item(new Item.Settings()));

    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registries.ITEM, PixelsBetterNature.id(name), item);
    }

    public static void init() {}
}
