package net.pixel.natureplus.init;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.pixel.natureplus.PixelsBetterNature;

public class ModItems {

//    Couldn't tell you what this does, just wrote it cos tutorial told me to.
    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registries.ITEM, PixelsBetterNature.id(name), item);
    }

//    Item Registration
    public static final Item FUNNY_STICK = register("funny_stick", new Item(new Item.Settings()));

//    Block Item Registration
    public static final BlockItem EXAMPLE_BLOCK = register("example_block", new BlockItem(ModBlocks.EXAMPLE_BLOCK, new Item.Settings()));

    public static void init() {}
}
