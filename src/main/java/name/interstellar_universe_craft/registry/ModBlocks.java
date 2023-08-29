package name.interstellar_universe_craft.registry;

import name.interstellar_universe_craft.InterstellarUniverseCraft;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    //这里注册方块
    //钨
    public static final Block TUNGSTEN_BLOCK = registerBlock("tungsten_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(35.0f,1000.0f).requiresTool()),
            ModItemGroup.ELEMENT);
    public static final Block TUNGSTEN_ORE = registerBlock("tungsten_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(30.0f,1000.0f).requiresTool(), UniformIntProvider.create(3,5)),
            ModItemGroup.ELEMENT);
    public static final Block DEEPSLATE_TUNGSTEN_ORE = registerBlock("deepslate_tungsten_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(32.0f,1000.0f).requiresTool(), UniformIntProvider.create(3,5)),
            ModItemGroup.ELEMENT);
    //铝
    public static final Block ALUMINIUM_BLOCK = registerBlock("aluminium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(11.0f,1000.0f).requiresTool()),
            ModItemGroup.ELEMENT);
    public static final Block ALUMINIUM_ORE = registerBlock("aluminium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(8.0f,1000.0f).requiresTool(), UniformIntProvider.create(3,5)),
            ModItemGroup.ELEMENT);
    public static final Block DEEPSLATE_ALUMINIUM_ORE = registerBlock("deepslate_aluminium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(10.0f,1000.0f).requiresTool(), UniformIntProvider.create(3,5)),
            ModItemGroup.ELEMENT);
    public static Block registerBlock(String name, Block block, ItemGroup... itemGroups){
        ModItems.registerItem(name, new BlockItem(block, new FabricItemSettings()), itemGroups);
        return Registry.register(Registries.BLOCK, new Identifier(InterstellarUniverseCraft.MOD_ID, name), block);
    }

    public static void registerModBlocks() {
        InterstellarUniverseCraft.LOGGER.debug("Registering mod blocks for" + InterstellarUniverseCraft.MOD_ID);
    }
}
