package name.interstellar_universe_craft.registry;

import name.interstellar_universe_craft.InterstellarUniverseCraft;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    //这里注册物品
    //钨
    public static final Item TUNGSTEN_INGOT = registerItem("tungsten_ingot",
            new Item(new FabricItemSettings()),
            ModItemGroup.ELEMENT);
    public static final Item RAW_TUNGSTEN = registerItem("raw_tungsten",
            new Item(new FabricItemSettings()),
            ModItemGroup.ELEMENT);
    public static final Item TUNGSTEN_NUGGET = registerItem("tungsten_nugget",
            new Item(new FabricItemSettings()),
            ModItemGroup.ELEMENT);
    public static final Item TUNGSTEN_WIRE = registerItem("tungsten_wire",
            new Item(new FabricItemSettings()),
            ModItemGroup.ELEMENT);
    //铝
    public static final Item ALUMINIUM_INGOT = registerItem("aluminium_ingot",
            new Item(new FabricItemSettings()),
            ModItemGroup.ELEMENT);
    public static final Item ROW_ALUMINIUM = registerItem("raw_aluminium",
            new Item(new FabricItemSettings()),
            ModItemGroup.ELEMENT);
    public static final Item ALUMINIUM_NUGGET = registerItem("aluminium_nugget",
            new Item(new FabricItemSettings ()),
            ModItemGroup.ELEMENT);
    //铌
    public static final Item NIOBIUM_INGOT = registerItem("niobium_ingot",
            new Item(new FabricItemSettings()),
            ModItemGroup.ELEMENT);
    public static final Item ROW_NIOBIUM = registerItem("raw_niobium",
            new Item(new FabricItemSettings()),
            ModItemGroup.ELEMENT);
    public static final Item NIOBIUM_NUGGET = registerItem("niobium_nugget",
            new Item(new FabricItemSettings()),
            ModItemGroup.ELEMENT);
    //元素应用
    public static final Item TAMP_BULB = registerItem("lamp_bulb",
            new Item(new FabricItemSettings()),
            ModItemGroup.ELEMENT);
    //物品栏
    public static final Item ELEMENT = registerItem("element",
            new Item(new FabricItemSettings()));
    //以上为物品注册
    public static Item registerItem(String name, Item item, ItemGroup... ItemGroups) {
        Item registeredItem = Registry.register(Registries.ITEM, new Identifier(InterstellarUniverseCraft.MOD_ID, name), item);
        for (ItemGroup itemGroup: ItemGroups) {
            ItemGroupEvents.modifyEntriesEvent(itemGroup).register(entries -> entries.add(registeredItem));
        }
        return registeredItem;
    }
    public static void registerModItems() {
        InterstellarUniverseCraft.LOGGER.debug("Registering mod items for" + InterstellarUniverseCraft.MOD_ID);
    }
}
