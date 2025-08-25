package com.github.wiCharles.projectSandbox.character.player;

import com.github.wiCharles.projectSandbox.Statistics;
import com.github.wiCharles.projectSandbox.character.Character;

public class Ranger extends Character {

    public Ranger (String name) {
        super(name, rangerStats());
    }

    private static Statistics rangerStats() {
        return new Statistics(
                100,
                50,

                6,

                10,
                25,
                5,

                0.05,
                2.0,

                5,
                5,
                0,

                0.15,
                0.0
        );
    }
}
