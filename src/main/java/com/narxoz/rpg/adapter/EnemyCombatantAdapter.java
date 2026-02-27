package com.narxoz.rpg.adapter;

import com.narxoz.rpg.enemy.Enemy;

public class EnemyCombatantAdapter implements Combatant {
    private Enemy enemy;

    public EnemyCombatantAdapter(Enemy enemy) { this.enemy = enemy; }

    @Override public String getName() { return enemy.getName(); }
    @Override public int getAttackPower() { return enemy.getDamage(); }
    @Override public void takeDamage(int damage) { enemy.takeDamage(damage); }
    @Override public boolean isAlive() { return enemy.getHealth() > 0; }
}