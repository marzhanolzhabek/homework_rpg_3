package com.narxoz.rpg.hero;

public class Mage implements Character {
    private String name;
    private int health = 70;
    private int strength = 20;

    public Mage(String name) { this.name = name; }

    @Override public String getName() { return name; }
    @Override public int getHealth() { return health; }
    @Override public int getStrength() { return strength; }
    @Override public void displayStats() {
        System.out.println(name + " [Mage] HP: " + health + " STR: " + strength);
    }
    @Override public void useSpecialAbility() { System.out.println(name + " casts FIREBALL!"); }
    @Override public void reduceHealth(int damage) { health -= damage; }
}