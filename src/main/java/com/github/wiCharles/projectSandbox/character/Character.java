package com.github.wiCharles.projectSandbox.character;

import com.github.wiCharles.projectSandbox.Statistics;
import lombok.Getter;

import java.util.Objects;


public abstract class Character {

    private String name;

    @Getter
    private Statistics stats;

    public Character(String name, Statistics stats) {
        this.name = name;
        this.stats = stats;
    }

    public void returnPrimaryAttack() {
    }

    public void attack(Character attacker, Character defender) {

        if (defender.getStats().checkForDodge()) {
            System.out.println(defender.name + " has dodged the attack!");

        } else if (defender.getStats().checkForParry()) {
            System.out.println(defender.name + " has parried the attack!");
            int parriedDmg = stats.getPhysicalAttack() / 100 * 25;
            defender.takeDamage(parriedDmg);

        } else if (this.getStats().checkForCriticalHit()) {
            System.out.println(name + "has landed a critical!");

        } else {
            defender.takeDamage(stats.physicalDamageCalculate(stats.getPhysicalAttack()));
            System.out.println();
        }
    }

    public void takeDamage(int amount) {
        this.stats.takeDamage(amount);
        System.out.println(name+" takes "+amount+" damage!");

        if (!stats.isConscious()) {
            System.out.println(name+ " has fallen!");
        }
    }

    public void heal(int amount) {
        this.stats.heal(amount);
        System.out.println(name+ " heals "+amount+ " HP!");

        if (!stats.isConscious()) {
            System.out.println(name+ " has been brought back!");
        }
    }

    // Display stats
    public void displayStats() {
        System.out.println(
                "-----------------------------------------------\n"+
                "|Name: "+name+"\n"+
                "|Class: "+"N/A"+"\n\n"+
                "|HP: "+stats.getCurrentHp()+"/"+stats.getMaxHP()+"\n"+
                "|MP: "+stats.getCurrentMp()+"/"+stats.getMaxMP()+"\n\n"+

                "|Speed: "+stats.getSpeed()+"\n\n"+

                "|Physical Attack: "+stats.getPhysicalAttack()+"\n"+
                "|Dexterity Attack: "+stats.getDexterityAttack()+"\n"+
                "|Magical Attack: "+stats.getMagicalAttack()+"\n\n"+

                "|Critical Chance: "+stats.getCriticalChance()+"\n"+
                "|Critical Damage: "+stats.getCriticalDamage()+"\n\n"+

                "|Defense: "+stats.getDefenseValue()+"\n"+
                "|Warding: "+stats.getWardingValue()+"\n"+
                "|Fortitude: "+stats.getFortitudeValue()+"\n\n"+

                "|Dodge Chance: "+stats.getDodgeChance()+"\n"+
                "|Parry Chance: "+stats.getParryChance()+"\n\n"+
                "-----------------------------------------------\n"
        );
    }
}
