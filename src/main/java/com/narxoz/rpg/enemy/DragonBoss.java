package com.narxoz.rpg.enemy;

public class DragonBoss extends Enemy {
    private int phaseCount;

    public DragonBoss(String name, int health, int damage, int phaseCount) {
        super(name, health, damage);
        this.phaseCount = phaseCount;
    }

    @Override public Enemy clone() { return new DragonBoss(name, health, damage, phaseCount); }
}