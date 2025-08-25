package com.github.wiCharles.projectSandbox.character.player;

import com.github.wiCharles.projectSandbox.Statistics;
import com.github.wiCharles.projectSandbox.character.Character;

public class Ranger extends Character {

    public Ranger (String name) {
        super(name, 1, rangerStats());
    }

    private static Statistics rangerStats() {
        return new Statistics(
                100,
                25,

                5,

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
