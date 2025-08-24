package com.github.wiCharles.projectSandbox;

import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
public class Statistics {

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

    public boolean isConscious() {
        return currentHp > 0;
    }

    public void takeDamage(int amount) {
        this.currentHp = Math.max(0, this.currentHp - amount);
    }

    public void heal(int amount) {
        this.currentHp = Math.min(this.maxHp, this.currentHp + amount);
    }
}
