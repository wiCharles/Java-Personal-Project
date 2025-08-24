package com.github.wiCharles.projectSandbox;

import lombok.Getter;
import lombok.Setter;

import java.util.Random;
import java.util.random.*;

@Getter
@Setter
public class Statistics {

    private static final Random RANDOM = new Random();

    // Resource Values
    private int maxHp;
    private int currentHp;
    private int maxMp;
    private int currentMp;

    // Attack Scaling
    private int physicalAttack;
    private int dexterityAttack;
    private int magicalAttack;

    private double criticalChance;
    private double criticalDamage;

    // Defensive Values
    private int defenseValue;
    private int wardingValue;
    private int fortitudeValue;

    private double dodgeChance;
    private double parryChance;



    // Physical/Dexterity calculation
    public int physicalDamageCalculate(int rawDamage) {
        int damageAfterDefense = rawDamage - this.defenseValue;
        return Math.max(1, damageAfterDefense); // Always do at least 1 damage
    }

    // Magical calculation
    public int magicalDamageCalculate(int rawDamage) {
        int damageAfterWarding = rawDamage - this.wardingValue;
        return Math.max(1, damageAfterWarding);
    }

    // Chance calculations.
    public boolean checkForCriticalHit() {
        return rollForChance(this.criticalChance);
    }
    public boolean checkForDodge() {
        return rollForChance(this.dodgeChance);
    }
    public boolean checkForParry() {
        return rollForChance(this.parryChance);
    }

    // Roller
    private boolean rollForChance(double chance) {

        if (chance >= 1.0 || RANDOM.nextDouble() <= chance) {
            return true;
        }
        return false;
    }


    public void takeDamage(int amount) {
        this.currentHp -= amount;
        if (this.currentHp < 0) {
            this.currentHp = 0;
        }
    }

    public boolean isConscious() {
        return currentHp > 0;
    }

    public void heal(int amount) {
        this.currentHp = Math.min(this.maxHp, this.currentHp + amount);
    }
}
