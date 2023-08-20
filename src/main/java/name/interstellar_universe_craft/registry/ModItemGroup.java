package name.interstellar_universe_craft.registry;

import name.interstellar_universe_craft.InterstellarUniverseCraft;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    //这里注册物品栏
    public static ItemGroup ELEMENT = FabricItemGroup.builder(new Identifier(InterstellarUniverseCraft.MOD_ID, "element"))
            .displayName(Text.translatable("itemgroup.interstellar-universe-craft.element"))
            .icon(()-> new ItemStack(ModItems.ELEMENT))
            .build();
    //以上为物品栏注册

    public static void registerModItemGroup(){
        InterstellarUniverseCraft.LOGGER.debug("Registering mod item group for" + InterstellarUniverseCraft.MOD_ID);
    }
}
