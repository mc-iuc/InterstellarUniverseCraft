package name.interstellar_universe_craft.item;

import java.util.Random;

public class HookBlade{

    private double damage;
    private double freezeChance;
    private double cooldown;
    private boolean onCooldown;

    public HookBlade(HookBlade instance) {
        this.damage = 0.5;
        this.freezeChance = 0.2;
        this.cooldown = 0.5;
        this.onCooldown = false;
    }

    public void attackEnemy() {
        if (!onCooldown) {
            Random rand = new Random();
            double randomValue = rand.nextDouble();

            if (randomValue <= freezeChance) {
                System.out.println("Enemy frozen for 1 second!");
            }

            System.out.println("Dealing " + damage + " damage to the enemy");

            onCooldown = true;

            // Start cooldown timer
            new Thread(() -> {
                try {
                    Thread.sleep((long) (cooldown * 1000));
                    onCooldown = false;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        } else {
            System.out.println("Weapon on cooldown. Cannot attack yet.");
        }
    }
}
