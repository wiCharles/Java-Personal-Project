package com.github.wiCharles.projectSandbox.character;

import com.github.wiCharles.projectSandbox.Statistics;

public class Character {

    private String name;
    private int level;
    private Statistics stats;

    public Character(String name, int level, Statistics stats) {
        this.name = name;
        this.level = level;
        this.stats = stats;
    }

    // Display stats
    public void displayStats() {
        System.out.println(
                "-----------------------------------------------\n"+
                "|Name: "+name+"\n"+
                "|Level: "+level+"\n"+
                "|Class: "+"N/A"+"\n\n"+
                "|HP: "+stats.getCurrentHp()+"/"+stats.getMaxHp()+"\n"+
                "|MP: "+stats.getCurrentMp()+"/"+stats.getMaxMp()+"\n\n"+

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
