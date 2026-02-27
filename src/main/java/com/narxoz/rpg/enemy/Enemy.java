package com.narxoz.rpg.enemy;

public abstract class Enemy {
    protected String name;
    protected int health;
    protected int damage;

    public Enemy(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public abstract Enemy clone();

    public String getName() { return name; }
    public int getDamage() { return damage; }
    public int getHealth() { return health; }

    public void takeDamage(int dmg) { health -= dmg; }
}