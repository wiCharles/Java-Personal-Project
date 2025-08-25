package com.github.wiCharles.projectSandbox.character.player;

import com.github.wiCharles.projectSandbox.Statistics;
import com.github.wiCharles.projectSandbox.character.Character;

public class Dagger extends Character {

    public Dagger (String name) {
        super(name, 1, daggerStats());
    }

    private static Statistics daggerStats() {
        return new Statistics(
                100,
                25,

                10,
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
