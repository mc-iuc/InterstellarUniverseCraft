package name.interstellar_universe_craft.gen;

import name.interstellar_universe_craft.block.ModBlocks;
import name.interstellar_universe_craft.effects.ModEffects;
import name.interstellar_universe_craft.item.ModItemGroups;
import name.interstellar_universe_craft.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class ModLangGenerator extends FabricLanguageProvider {
    public ModLangGenerator(FabricDataOutput dataOutput) {
        super(dataOutput,"en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.TUNGSTEN_INGOT,"Tungsten Ingot");
        translationBuilder.add(ModItems.TUNGSTEN_NUGGET,"Tungsten Nugget");
        translationBuilder.add(ModItems.RAW_TUNGSTEN,"Raw Tungsten");
        translationBuilder.add(ModBlocks.TUNGSTEN_BLOCK,"Tungsten Block");
        translationBuilder.add(ModBlocks.TUNGSTEN_ORE,"Tungsten Ore");
        translationBuilder.add(ModBlocks.DEEPSLATE_TUNGSTEN_ORE,"Deepslate Tungsten Ore");
        translationBuilder.add(ModItems.TUNGSTEN_WIRE,"Tungsten Wire");

        translationBuilder.add(ModItems.ALUMINIUM_INGOT,"Aluminium Ingot");
        translationBuilder.add(ModItems.ALUMINIUM_NUGGET,"Aluminium Nugget");
        translationBuilder.add(ModItems.RAW_ALUMINIUM,"Raw Aluminium");
        translationBuilder.add(ModBlocks.ALUMINIUM_BLOCK,"Aluminium Block");
        translationBuilder.add(ModBlocks.ALUMINIUM_ORE,"Aluminium Ore");
        translationBuilder.add(ModBlocks.DEEPSLATE_ALUMINIUM_ORE,"Deepslate Aluminium Ore");

        translationBuilder.add(ModItems.RAW_SILICON,"Raw Silicon");
        translationBuilder.add(ModItems.CARBON_SILICON_MIXTURE,"Carbon Silicon Mixture");

        translationBuilder.add(ModItems.LAMP_BULB,"Lamp Bulb");
        translationBuilder.add(ModBlocks.LAMP,"Lamp");

        translationBuilder.add(ModItems.ELEMENT,"Element");
        translationBuilder.add(ModItems.INTEGRATION,"Integration");

        translationBuilder.add(ModItems.DUST_OF_LEAF,"Dust Of Leaf");

        translationBuilder.add(ModItems.INTEGRATED_CARD_CARINA,"Integrated Card Carina");
        translationBuilder.add(ModItems.INTEGRATED_CARD_SCORPIO,"Integrated Card Scorpio");
        translationBuilder.add(ModItems.INTEGRATED_CARD_SERPENT,"Integrated Card Serpent");
        translationBuilder.add(ModItems.INTEGRATED_CARD_GEMINI,"Integrated Card Gemini");

        translationBuilder.add(ModBlocks.STAR_GAZING_TABLE,"Star Gazing Table");
        translationBuilder.add(ModBlocks.STAR_STORAGE_TABLE,"Star Storage Table");

        translationBuilder.add(ModItems.DAZZLING_STAR,"Dazzling Star");
        translationBuilder.add(ModItems.PHANTOM_STAR,"Phantom Star");
        translationBuilder.add(ModItems.STAR_ENERGY_JAR,"Star Energy Jar");

        translationBuilder.add(ModItems.HOOK_BLADE_WHALE_LANDING,"Hook Blade Whale Landing");
        translationBuilder.add(ModItems.TRIPLE_CLAW_KNIFE_BLAZING_DOG,"Triple Claw Blazing Dog");

        translationBuilder.add(ModItemGroups.GROUPS_TAB_ELEMENT,"Element");
        translationBuilder.add(ModItemGroups.GROUPS_TAB_INTEGRATION,"Integration");

        translationBuilder.add(ModEffects.GOLD_BURST_EFFECT,"Gold Burst Effect");

        translationBuilder.add("entity.minecraft.villager.star_hunter","Star Hunter");
    }
}
