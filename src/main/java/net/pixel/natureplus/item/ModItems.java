package net.pixel.natureplus.item;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.pixel.natureplus.PixelsBetterNature;
import org.intellij.lang.annotations.Identifier;

public class ModItems {

    public static final Item FUNNY_STICK = registerItem("funny_stick", new Item(new FabricItem.Settings()));\

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(FUNNY_STICK);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(PixelsBetterNature.MOD_ID, name), item);
    }

    public static void registerModItems(){
        PixelsBetterNature.LOGGER.info("Registering Mod Items for " + PixelsBetterNature.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
