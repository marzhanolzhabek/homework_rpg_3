package com.narxoz.rpg.battle;

import com.narxoz.rpg.adapter.Combatant;
import java.util.List;

public class BattleEngine {
    private static BattleEngine instance;

    private BattleEngine() {}

    public static BattleEngine getInstance() {
        if (instance == null) instance = new BattleEngine();
        return instance;
    }

    public void runEncounter(List<Combatant> teamA, List<Combatant> teamB) {
        int round = 1;
        while (!teamA.isEmpty() && !teamB.isEmpty()) {
            System.out.println("=== Round " + round + " ===");


            for (Combatant a : teamA) {
                if (!teamB.isEmpty()) {
                    Combatant target = teamB.get(0);
                    target.takeDamage(a.getAttackPower());
                    System.out.println(a.getName() + " hits " + target.getName() + " for " + a.getAttackPower());
                    if (!target.isAlive()) {
                        System.out.println(target.getName() + " dies!");
                        teamB.remove(target);
                    }
                }
            }


            for (Combatant b : teamB) {
                if (!teamA.isEmpty()) {
                    Combatant target = teamA.get(0);
                    target.takeDamage(b.getAttackPower());
                    System.out.println(b.getName() + " hits " + target.getName() + " for " + b.getAttackPower());
                    if (!target.isAlive()) {
                        System.out.println(target.getName() + " dies!");
                        teamA.remove(target);
                    }
                }
            }
            round++;
        }

        String winner = teamA.isEmpty() ? "Team B wins!" : "Team A wins!";
        System.out.println("=== Battle End === " + winner);
    }
}