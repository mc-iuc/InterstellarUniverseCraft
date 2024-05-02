package name.interstellar_universe_craft.item;

import name.interstellar_universe_craft.InterstellarUniverseCraft;
import name.interstellar_universe_craft.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.MagmaBlock;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import javax.naming.NamingEnumeration;

public class ModItemGroups {
    public static final String GROUPS_TAB_ELEMENT = "itemgroup.element";
    public static final String GROUPS_TAB_INTEGRATION = "itemgroup.integration";
    public static final ItemGroup ELEMENT = Registry.register(Registries.ITEM_GROUP,
            new Identifier(InterstellarUniverseCraft.MOD_ID,"element"),
            FabricItemGroup.builder().displayName(Text.translatable(GROUPS_TAB_ELEMENT))
                    .icon(()-> new ItemStack(ModItems.ELEMENT))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.TUNGSTEN_INGOT);
                        entries.add(ModItems.TUNGSTEN_NUGGET);
                        entries.add(ModItems.RAW_TUNGSTEN);
                        entries.add(ModBlocks.TUNGSTEN_BLOCK);
                        entries.add(ModBlocks.TUNGSTEN_ORE);
                        entries.add(ModBlocks.DEEPSLATE_TUNGSTEN_ORE);
                        entries.add(ModItems.TUNGSTEN_WIRE);

                        entries.add(ModItems.ALUMINIUM_INGOT);
                        entries.add(ModItems.ALUMINIUM_NUGGET);
                        entries.add(ModItems.RAW_ALUMINIUM);
                        entries.add(ModBlocks.ALUMINIUM_BLOCK);
                        entries.add(ModBlocks.ALUMINIUM_ORE);
                        entries.add(ModBlocks.DEEPSLATE_ALUMINIUM_ORE);

                        entries.add(ModItems.RAW_SILICON);
                        entries.add(ModItems.CARBON_SILICON_MIXTURE);

                        entries.add(ModItems.LAMP_BULB);
                        entries.add(ModBlocks.LAMP);

                        entries.add(ModBlocks.STAR_GAZING_TABLE);
                        entries.add(ModBlocks.STAR_STORAGE_TABLE);

                        entries.add(ModItems.DUST_OF_LEAF);
                        entries.add(ModItems.DAZZLING_STAR);
                        entries.add(ModItems.STAR_ENERGY_JAR);
                    }).build());
    public static final ItemGroup INTEGRATION = Registry.register(Registries.ITEM_GROUP,
            new Identifier(InterstellarUniverseCraft.MOD_ID,"integration"),
            FabricItemGroup.builder().displayName(Text.translatable(GROUPS_TAB_INTEGRATION))
                    .icon(()-> new ItemStack(ModItems.INTEGRATION))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.INTEGRATED_CARD_CARINA);
                        entries.add(ModItems.INTEGRATED_CARD_GEMINI);
                        entries.add(ModItems.INTEGRATED_CARD_SERPENT);
                        entries.add(ModItems.INTEGRATED_CARD_SCORPIO);
                        entries.add(ModItems.HOOK_BLADE_WHALE_LANDING);
                    }).build());


    public static void registerModItemGroup(){
        InterstellarUniverseCraft.LOGGER.debug("Registering mod item group for" + InterstellarUniverseCraft.MOD_ID);
    }
}
