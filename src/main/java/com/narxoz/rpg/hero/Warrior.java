package com.narxoz.rpg.hero;

public class Warrior implements Character {
    private String name;
    private int health = 150;
    private int strength = 80;

    public Warrior(String name) { this.name = name; }

    @Override public String getName() { return name; }
    @Override public int getHealth() { return health; }
    @Override public int getStrength() { return strength; }
    @Override public void displayStats() {
        System.out.println(name + " [Warrior] HP: " + health + " STR: " + strength);
    }
    @Override public void useSpecialAbility() { System.out.println(name + " uses BERSERKER RAGE!"); }
    @Override public void reduceHealth(int damage) { health -= damage; }
}