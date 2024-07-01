package name.interstellar_universe_craft.effects;

import name.interstellar_universe_craft.InterstellarUniverseCraft;
import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEffects {
    // 注册金爆效果
    public static final StatusEffect GOLD_BURST_EFFECT = registerEffects("gold_burst_effect",
            new GoldBurstEffect());

    // 注册效果
    public static StatusEffect registerEffects(String name, StatusEffect effect) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(InterstellarUniverseCraft.MOD_ID,name), effect);
    }
    // 注册mod效果
    public static void registerModEffects() {
        InterstellarUniverseCraft.LOGGER.info("Registering mod effects for " + InterstellarUniverseCraft.MOD_ID);
    }
}