package com.narxoz.rpg.hero;

public interface Character {
    String getName();
    int getHealth();
    int getStrength();
    void displayStats();
    void useSpecialAbility();
    void reduceHealth(int damage);
}