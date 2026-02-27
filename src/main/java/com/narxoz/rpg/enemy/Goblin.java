package com.narxoz.rpg.enemy;

public class Goblin extends Enemy {
    public Goblin(String name, int health, int damage) { super(name, health, damage); }

    @Override public Enemy clone() { return new Goblin(name, health, damage); }
}