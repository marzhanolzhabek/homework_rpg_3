package com.narxoz.rpg.hero;

public class Archer implements Character {
    private String name;
    private int health = 100;
    private int strength = 50;

    public Archer(String name) { this.name = name; }

    @Override public String getName() { return name; }
    @Override public int getHealth() { return health; }
    @Override public int getStrength() { return strength; }
    @Override public void displayStats() {
        System.out.println(name + " [Archer] HP: " + health + " STR: " + strength);
    }
    @Override public void useSpecialAbility() { System.out.println(name + " uses RAIN OF ARROWS!"); }
    @Override public void reduceHealth(int damage) { health -= damage; }
}
