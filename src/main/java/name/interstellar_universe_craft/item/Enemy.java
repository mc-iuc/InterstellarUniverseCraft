package name.interstellar_universe_craft.item;

public class Enemy {
    private int health;

    public Enemy() {
        health = 100;
    }

    public void freeze(int seconds) {
        System.out.println("敌人被冻结" + seconds + "秒！");
        // 实现敌人被冻结的逻辑
    }

    public void takeDamage(double damage) {
        health -= damage;
        System.out.println("敌人受到" + damage + "点伤害！");
        // 实现敌人受到伤害的逻辑
    }
}