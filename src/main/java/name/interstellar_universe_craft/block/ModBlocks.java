package name.interstellar_universe_craft.block;

import name.interstellar_universe_craft.InterstellarUniverseCraft;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {


    //这里注册方块
    //钨
    public static final Block TUNGSTEN_BLOCK = registerBlock("tungsten_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block TUNGSTEN_ORE = registerBlock("tungsten_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3,5), FabricBlockSettings.copyOf(Blocks.IRON_ORE).sounds(BlockSoundGroup.STONE).strength(30.0f,1000.0f).requiresTool()));
    public static final Block DEEPSLATE_TUNGSTEN_ORE = registerBlock("deepslate_tungsten_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3,5), FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE).sounds(BlockSoundGroup.STONE).strength(32.0f,1000.0f).requiresTool()));
    //铝
    public static final Block ALUMINIUM_BLOCK = registerBlock("aluminium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.METAL).strength(11.0f,1000.0f).requiresTool()));
    public static final Block ALUMINIUM_ORE = registerBlock("aluminium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2,4), FabricBlockSettings.copyOf(Blocks.IRON_ORE).sounds(BlockSoundGroup.STONE).strength(8.0f,1000.0f).requiresTool()));
    public static final Block DEEPSLATE_ALUMINIUM_ORE = registerBlock("deepslate_aluminium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2,4), FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE).sounds(BlockSoundGroup.STONE).strength(10.0f,1000.0f).requiresTool()));

    //树
    public static final Block NORMALLY_BURNING_LOG = registerBlock("normal_burning_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(6.0f).requiresTool()));
    public static final Block NORMALLY_BURNING_WOOD = registerBlock("normal_burning_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(6.0f).requiresTool()));
    public static final Block STRIPPED_NORMALLY_BURNING_LOG = registerBlock("stripped_normal_burning_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(6.0f).requiresTool()));
    public static final Block STRIPPED_NORMALLY_BURNING_WOOD = registerBlock("stripped_normal_burning_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(6.0f).requiresTool()));

    public static final Block NORMALLY_BURNING_PLANKS = registerBlock("normal_burning_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(6.0f).requiresTool()));
    public static final Block NORMALLY_BURNING_LEAVES = registerBlock("normal_burning_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(3.0f).requiresTool()));

    //public static final Block RED_MAPLE_SAPLING = registerBlock("red_maple_sapling",
    //        new SaplingBlock(new NormallyBurningSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING).strength(4.0f).requiresTool()));

    //其他
    public static final Block LAMP = registerBlock("lamp",
            new Block(FabricBlockSettings.copyOf(Blocks.GLASS).sounds(BlockSoundGroup.GLASS).ticksRandomly().strength(0.3f, 0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().requiresTool().luminance(state -> 15)));
    //gui
    public static final Block STAR_STORAGE_TABLE = registerBlock("star_storage_table",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));
    public static final Block STAR_GAZING_TABLE = registerBlock("star_gazing_table",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));
    //以下为配置
    private static Block registerBlock(String name,Block block){
        registerBlockItem(name,block);
        return Registry.register(Registries.BLOCK,new Identifier(InterstellarUniverseCraft.MOD_ID,name),block);
    }
    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM,new Identifier(InterstellarUniverseCraft.MOD_ID,name),new BlockItem(block,new FabricItemSettings()));
    }
    public static void registerModBlocks(){
        InterstellarUniverseCraft.LOGGER.info("Registering modBlocks for " + InterstellarUniverseCraft.MOD_ID);
    }
}
