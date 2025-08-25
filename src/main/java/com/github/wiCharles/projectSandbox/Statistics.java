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
    private int maxHP;
    private int currentHp;
    private int maxMP;
    private int currentMp;

    // Speed value

    private int speed;

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

    public Statistics(int maxHp, int maxMp, int speed, int physicalAttack, int dexterityAttack, int magicalAttack, double criticalChance, double criticalDamage, int defenseValue, int wardingValue, int fortitudeValue, double dodgeChance, double parryChance) {
        this.maxHP = maxHp;
        this.maxMP = maxMp;
        this.currentHp = maxHp;
        this.currentMp = maxMp;

        this.speed = speed;

        this.physicalAttack = physicalAttack;
        this.dexterityAttack = dexterityAttack;
        this.magicalAttack = magicalAttack;

        this.criticalChance = criticalChance;
        this.criticalDamage = criticalDamage;

        this.defenseValue = defenseValue;
        this.wardingValue = wardingValue;
        this.fortitudeValue = fortitudeValue;

        this.dodgeChance = dodgeChance;
        this.parryChance = parryChance;
    }

    public Statistics() {

    }

    // Physical calculation
    // The lowest amount of damage you can take is 1.
    public int physicalDamageCalculate(int rawDamage) {
        int damageAfterDefense = rawDamage - this.defenseValue;
        return Math.max(1, damageAfterDefense);
    }

    // Dexterity calculation
    // The lowest amount of damage you can take is 1.
    public int dexterityDamageCalculate(int rawDamage) {
        int damageAfterDefense = rawDamage - this.defenseValue;
        return Math.max(1, damageAfterDefense);
    }

    // Magical calculation
    // The lowest amount of damage you can take is 1.
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
        this.currentHp = Math.min(this.maxHP, this.currentHp + amount);
    }
}
