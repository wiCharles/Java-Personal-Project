package com.github.wiCharles.projectSandbox.character.player;

import com.github.wiCharles.projectSandbox.Statistics;
import com.github.wiCharles.projectSandbox.character.Character;

public class Spear extends Character {

    public Spear(String name) {
        super(name, 1, spearStats());
    }

    private static Statistics spearStats() {
        return new Statistics(
                100,
                25,

                7,

                7,
                5,
                2,

                0.05,
                1.5,

                10,
                5,
                0,

                0.05,
                0.10
        );
    }
}
