package com.github.wiCharles.projectSandbox.character;

import com.github.wiCharles.projectSandbox.Statistics;
import lombok.Getter;

@Getter
public abstract class Character {

    private String name;
    private Statistics stats;

    public Character(String name, Statistics stats) {
        this.name = name;
        this.stats = stats;
    }

    protected int getPrimaryAttack() {
        return this.getPrimaryAttack();
    }

    public void attack(Character defender) {

        if (defender.stats.checkForDodge()) {
            System.out.println(defender.name + " has dodged the attack!");

        } else if (defender.stats.checkForParry()) {
            System.out.println(defender.name + " has parried the attack!");
            int parriedDmg = getPrimaryAttack() / 100 * 25;
            defender.takeDamage(parriedDmg);

        } else if (this.stats.checkForCriticalHit()) {
            int criticalDmg = (int) stats.getCriticalDamage()*getPrimaryAttack();
            System.out.println(name + "has landed a critical!");
            defender.takeDamage(criticalDmg);

        } else {
            defender.takeDamage(stats.physicalDamageCalculate(stats.getPhysicalAttack()));
        }

        System.out.println("The primary attack is: "+getPrimaryAttack());
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
