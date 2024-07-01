package name.interstellar_universe_craft.item;

import name.interstellar_universe_craft.InterstellarUniverseCraft;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    //这里注册物品
    //钨
    public static final Item TUNGSTEN_INGOT = registerItem("tungsten_ingot",
            new Item(new FabricItemSettings()));
    public static final Item RAW_TUNGSTEN = registerItem("raw_tungsten",
            new Item(new FabricItemSettings()));
    public static final Item TUNGSTEN_NUGGET = registerItem("tungsten_nugget",
            new Item(new FabricItemSettings()));
    public static final Item TUNGSTEN_WIRE = registerItem("tungsten_wire",
            new Item(new FabricItemSettings()));
    //硅
    public static final Item RAW_SILICON = registerItem("raw_silicon",
            new Item(new FabricItemSettings()));
    public static final Item CARBON_SILICON_MIXTURE = registerItem("carbon_silicon_mixture",
            new Item(new FabricItemSettings()));
    //铝
    public static final Item ALUMINIUM_INGOT = registerItem("aluminium_ingot",
            new Item(new FabricItemSettings()));
    public static final Item RAW_ALUMINIUM = registerItem("raw_aluminium",
            new Item(new FabricItemSettings()));
    public static final Item ALUMINIUM_NUGGET = registerItem("aluminium_nugget",
            new Item(new FabricItemSettings ()));
    //铌
    public static final Item NIOBIUM_INGOT = registerItem("niobium_ingot",
            new Item(new FabricItemSettings()));
    public static final Item RAW_NIOBIUM = registerItem("raw_niobium",
            new Item(new FabricItemSettings()));
    public static final Item NIOBIUM_NUGGET = registerItem("niobium_nugget",
            new Item(new FabricItemSettings()));
    //元素应用
    public static final Item LAMP_BULB = registerItem("lamp_bulb",
            new Item(new FabricItemSettings()));
    public static final Item MINERAL_DETECTOR = registerItem("mineral_detector",
            new Item(new FabricItemSettings().maxDamage(200)));

    //元素相关
    public static final Item DUST_OF_LEAF = registerItem("dust_of_leaf",
            new Item(new FabricItemSettings().maxCount(16)));

    //货币
    public static final Item DAZZLING_STAR = registerItem("dazzling_star",
            new Item(new FabricItemSettings()));
    public static final Item PHANTOM_STAR = registerItem("phantom-star",
            new Item(new FabricItemSettings()));

    //星能
    public static final Item STAR_ENERGY_JAR = registerItem("star_energy_jar",
            new Item(new FabricItemSettings().maxCount(1)));

    //集成卡
    public static final Item INTEGRATED_CARD_GEMINI = registerItem("integrated_card_gemini",
            new Item(new FabricItemSettings()));
    public static final Item INTEGRATED_CARD_SCORPIO = registerItem("integrated_card_scorpio",
            new Item(new FabricItemSettings()));
    public static final Item INTEGRATED_CARD_SERPENT = registerItem("integrated_card_serpent",
            new Item(new FabricItemSettings()));
    public static final Item INTEGRATED_CARD_CARINA = registerItem("integrated_card_carina",
            new Item(new FabricItemSettings()));

    //集成器
    public static final Item HOOK_BLADE_WHALE_LANDING = registerItem("hook_blade_whale_landing",
            new Item(new FabricItemSettings()));
    public static final TripleClawKnife TRIPLE_CLAW_KNIFE_BLAZING_DOG = (TripleClawKnife) registerItem("triple_claw_knife_blazing_dog",
            new TripleClawKnife(10, 0.2, 2000, 0.1, 200));

    //物品栏
    public static final Item ELEMENT = registerItem("element",
            new Item(new FabricItemSettings()));
    public static final Item INTEGRATION = registerItem("integration",
            new Item(new FabricItemSettings()));



    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM,new Identifier(InterstellarUniverseCraft.MOD_ID,name),item);
    }

    public static void registerModItems() {
        InterstellarUniverseCraft.LOGGER.debug("Registering mod items for" + InterstellarUniverseCraft.MOD_ID);
    }
}
