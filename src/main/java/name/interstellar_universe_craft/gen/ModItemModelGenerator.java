package name.interstellar_universe_craft.gen;

import name.interstellar_universe_craft.InterstellarUniverseCraft;
import name.interstellar_universe_craft.block.ModBlocks;
import name.interstellar_universe_craft.item.ModItemGroups;
import name.interstellar_universe_craft.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.TextifiedException;

import java.util.Optional;

public class ModItemModelGenerator extends FabricModelProvider {
    public ModItemModelGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TUNGSTEN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TUNGSTEN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_TUNGSTEN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ALUMINIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ALUMINIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_ALUMINIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LAMP);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.TUNGSTEN_INGOT,Models.GENERATED);
        itemModelGenerator.register(ModItems.TUNGSTEN_NUGGET,Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_TUNGSTEN,Models.GENERATED);
        itemModelGenerator.register(ModItems.TUNGSTEN_WIRE,Models.GENERATED);

        itemModelGenerator.register(ModItems.ALUMINIUM_INGOT,Models.GENERATED);
        itemModelGenerator.register(ModItems.ALUMINIUM_NUGGET,Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_ALUMINIUM,Models.GENERATED);

        itemModelGenerator.register(ModItems.RAW_SILICON,Models.GENERATED);
        itemModelGenerator.register(ModItems.CARBON_SILICON_MIXTURE,Models.GENERATED);

        itemModelGenerator.register(ModItems.LAMP_BULB,Models.GENERATED);

        itemModelGenerator.register(ModItems.ELEMENT,Models.GENERATED);
        itemModelGenerator.register(ModItems.INTEGRATION,Models.GENERATED);

        itemModelGenerator.register(ModItems.DUST_OF_LEAF,Models.GENERATED);
        itemModelGenerator.register(ModItems.DAZZLING_STAR,Models.GENERATED);
        itemModelGenerator.register(ModItems.PHANTOM_STAR,Models.GENERATED);
        itemModelGenerator.register(ModItems.STAR_ENERGY_JAR,Models.GENERATED);

        itemModelGenerator.register(ModItems.INTEGRATED_CARD_CARINA,Models.GENERATED);
        itemModelGenerator.register(ModItems.INTEGRATED_CARD_SCORPIO,Models.GENERATED);
        itemModelGenerator.register(ModItems.INTEGRATED_CARD_SERPENT,Models.GENERATED);
        itemModelGenerator.register(ModItems.INTEGRATED_CARD_GEMINI,Models.GENERATED);

        itemModelGenerator.register(ModBlocks.TUNGSTEN_BLOCK.asItem(),registerItemBlock(ModBlocks.TUNGSTEN_BLOCK));
        itemModelGenerator.register(ModBlocks.TUNGSTEN_ORE.asItem(),registerItemBlock(ModBlocks.TUNGSTEN_ORE));
        itemModelGenerator.register(ModBlocks.DEEPSLATE_TUNGSTEN_ORE.asItem(),registerItemBlock(ModBlocks.DEEPSLATE_TUNGSTEN_ORE));

        itemModelGenerator.register(ModBlocks.ALUMINIUM_BLOCK.asItem(),registerItemBlock(ModBlocks.ALUMINIUM_BLOCK));
        itemModelGenerator.register(ModBlocks.ALUMINIUM_ORE.asItem(),registerItemBlock(ModBlocks.ALUMINIUM_ORE));
        itemModelGenerator.register(ModBlocks.DEEPSLATE_ALUMINIUM_ORE.asItem(),registerItemBlock(ModBlocks.DEEPSLATE_ALUMINIUM_ORE));

        itemModelGenerator.register(ModBlocks.LAMP.asItem(),registerItemBlock(ModBlocks.LAMP));
    }
    private static Model registerItemBlock(Block block, TextureKey... requiredTextureKeys) {
        String name = ModelIds.getBlockModelId(block).getPath();
        return new Model(Optional.of(new Identifier(InterstellarUniverseCraft.MOD_ID,name)),Optional.empty(), requiredTextureKeys);
    }
}
