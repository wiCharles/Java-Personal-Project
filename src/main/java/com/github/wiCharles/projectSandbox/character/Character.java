package com.github.wiCharles.projectSandbox.character;

import com.github.wiCharles.projectSandbox.stats.Statistics;

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
}
