package net.pixel.natureplus.registries;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ShortPlantBlock;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import static net.pixel.natureplus.PixelsBetterNature.MOD_ID;

public class ModBlocks {

    public static final Block EXAMPLE_BLOCK = register(
            new ShortPlantBlock(
                    AbstractBlock.Settings.create()
                        .replaceable()
                        .noCollision()
                        .breakInstantly()
                        .sounds(BlockSoundGroup.GRASS)
                        .offset(AbstractBlock.OffsetType.XZ)
                        .burnable()
                        .pistonBehavior(PistonBehavior.DESTROY)
            ), "example_block",
            false
    );

    public static Block register(Block block, String name, boolean shouldRegisterItem) {
        Identifier id = Identifier.of(MOD_ID, name);

        if (shouldRegisterItem) {
            BlockItem blockItem = new BlockItem(block, new Item.Settings());
            Registry.register(Registries.ITEM, id, blockItem);
        }

        return Registry.register(Registries.BLOCK, id, block);
    }

    public static void initialise() {
    }
}
