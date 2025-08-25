package com.github.wiCharles.projectSandbox.character.player;

import com.github.wiCharles.projectSandbox.Statistics;
import com.github.wiCharles.projectSandbox.character.Character;

public class Dagger extends Character {

    public Dagger (String name) {
        super(name, daggerStats());
    }

    private static Statistics daggerStats() {
        return new Statistics(
                50,
                50,

                10,

                10,
                15,
                5,

                0.05,
                1.5,

                5,
                5,
                0,

                0.20,
                0.0
        );
    }
}
