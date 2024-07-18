package net.pixel.natureplus.init;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.pixel.natureplus.PixelsBetterNature;

public class ModBlocks {

    public static <T extends Block> T register(String name, T block) {
        return Registry.register(Registries.BLOCK, PixelsBetterNature.id(name), block);
    }

//    register blocks
    public static final Block EXAMPLE_BLOCK = register("example_block", new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool().luminance(state -> 15)));
}
