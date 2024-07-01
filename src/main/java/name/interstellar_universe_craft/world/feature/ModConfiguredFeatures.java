package name.interstellar_universe_craft.world.feature;

import name.interstellar_universe_craft.InterstellarUniverseCraft;
import name.interstellar_universe_craft.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;

public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?,?>> TUNGSTEN_ORE_KEY = registerKey("tungsten_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> NORMALLY_BURNING_KEY = registerKey("normal_burning");

    public static void bootstrap(Registerable<ConfiguredFeature<?,?>> context){

        register(context,NORMALLY_BURNING_KEY,Feature.TREE,new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.NORMALLY_BURNING_LOG), // 树干方块
                new StraightTrunkPlacer(10,8,5),//基础高度，第一次随机高度，第二次随机高度。
                BlockStateProvider.of(ModBlocks.NORMALLY_BURNING_LEAVES), // 树叶方块
                new BlobFoliagePlacer(ConstantIntProvider.create(2),ConstantIntProvider.create(0),4),//树叶的半径，偏差，和高度
                new TwoLayersFeatureSize(1,0,2)).build());//限制高度 最大把逆境和最小半径。

        RuleTest stoneReplaceables=  new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreFeatureConfig.Target> overworldTungstenOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.TUNGSTEN_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables,ModBlocks.DEEPSLATE_TUNGSTEN_ORE.getDefaultState()));

        // 矿脉的多少
        register(context,TUNGSTEN_ORE_KEY,Feature.ORE,new OreFeatureConfig(overworldTungstenOres,8));
    }

    public static RegistryKey<ConfiguredFeature<?,?>> registerKey(String name){
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE,new Identifier(InterstellarUniverseCraft.MOD_ID,name));
    }

    private static <FC extends FeatureConfig,F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?,?>> context,
                                                                                  RegistryKey<ConfiguredFeature<?,?>> key, F feature, FC cofiguration){
        context.register(key,new ConfiguredFeature<>(feature,cofiguration));
    }
}
