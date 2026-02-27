package com.narxoz.rpg;

import com.narxoz.rpg.hero.*;
import com.narxoz.rpg.enemy.*;
import com.narxoz.rpg.adapter.*;
import com.narxoz.rpg.battle.BattleEngine;
import java.util.List;
import java.util.ArrayList;
import com.narxoz.rpg.hero.Character;

public class Main {
    public static void main(String[] args) {

        Character w = new Warrior("Arthur");
        Character m = new Mage("Merlin");
        Character a = new Archer("Robin");

        List<Combatant> heroes = new ArrayList<>();
        heroes.add(new HeroCombatantAdapter(w));
        heroes.add(new HeroCombatantAdapter(m));
        heroes.add(new HeroCombatantAdapter(a));


        Enemy gob = new Goblin("Gobbo", 50, 15);
        Enemy dragon = new DragonBoss("Smaug", 200, 40, 2);

        List<Combatant> enemies = new ArrayList<>();
        enemies.add(new EnemyCombatantAdapter(gob));
        enemies.add(new EnemyCombatantAdapter(dragon));


        BattleEngine engine = BattleEngine.getInstance();
        engine.runEncounter(heroes, enemies);
    }
}