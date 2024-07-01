package name.interstellar_universe_craft.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class TripleClawKnife extends Item {

    private int damage;
    private double burnChance;
    private int cooldown;
    private boolean onCooldown;
    private double frenzyChance;
    private int frenzyDuration;

    public TripleClawKnife(int damage, double burnChance, int cooldown, double frenzyChance, int frenzyDuration) {
        super(new Settings());
        this.damage = damage;
        this.burnChance = burnChance;
        this.cooldown = cooldown;
        this.frenzyChance = frenzyChance;
        this.frenzyDuration = frenzyDuration;
        this.onCooldown = false;
    }

    public void attack(LivingEntity target) {
        if (!onCooldown) {
            Random rand = new Random();
            if (rand.nextDouble() < burnChance) {
                target.setOnFireFor(5);
            }
            onCooldown = true;
            new Timer().schedule(
                    new TimerTask() {
                        @Override
                        public void run() {
                            onCooldown = false;
                        }
                    },
                    cooldown
            );
            if (rand.nextDouble() < frenzyChance) {
                target.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, frenzyDuration, 1));
                target.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, frenzyDuration, 1));
            }
        }
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setBurnChance(double burnChance) {
        this.burnChance = burnChance;
    }

    public void setCooldown(int cooldown) {
        this.cooldown = cooldown;
    }

    public void setFrenzyChance(double frenzyChance) {
        this.frenzyChance = frenzyChance;
    }

    public void setFrenzyDuration(int frenzyDuration) {
        this.frenzyDuration = frenzyDuration;
    }

}
