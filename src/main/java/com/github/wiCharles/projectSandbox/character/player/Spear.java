package com.github.wiCharles.projectSandbox.character.player;

import com.github.wiCharles.projectSandbox.Statistics;
import com.github.wiCharles.projectSandbox.character.Character;

public class Spear extends Character {

    public Spear(String name) {
        super(name, spearStats());
    }

    private static Statistics spearStats() {
        return new Statistics(
                125,
                50,

                6,

                10,
                10,
                10,

                0.05,
                1.75,

                10,
                5,
                0,

                0.10,
                0.0
        );
    }
}
