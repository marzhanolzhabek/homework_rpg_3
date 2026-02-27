package com.narxoz.rpg.adapter;

import com.narxoz.rpg.hero.Character;

public class HeroCombatantAdapter implements Combatant {
    private Character hero;

    public HeroCombatantAdapter(Character hero) { this.hero = hero; }

    @Override public String getName() { return hero.getName(); }
    @Override public int getAttackPower() { return hero.getStrength(); }
    @Override public void takeDamage(int damage) { hero.reduceHealth(damage); }
    @Override public boolean isAlive() { return hero.getHealth() > 0; }
}