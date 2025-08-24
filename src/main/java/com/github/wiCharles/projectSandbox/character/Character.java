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

    public boolean isAlive() {
        return stats.getCurrentHp() > 0;
    }

    public void takeDamage(int damage) {
        stats.setCurrentHp(stats.getCurrentHp() - damage);
    }

    public void displayStats() {
        System.out.println();
    }
}
