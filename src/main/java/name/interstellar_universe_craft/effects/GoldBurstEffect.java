package name.interstellar_universe_craft.effects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;

public class GoldBurstEffect extends StatusEffect {
    public GoldBurstEffect() {
        super(StatusEffectCategory.HARMFUL, 0xFFD700);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity instanceof PlayerEntity player) {
            player.getStatusEffect(StatusEffects.INSTANT_HEALTH);
            float health = player.getHealth() / 2;
            player.setHealth(health);
        }
        super.applyUpdateEffect(entity, amplifier);
    }
}
