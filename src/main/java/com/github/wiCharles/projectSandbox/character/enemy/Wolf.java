package com.github.wiCharles.projectSandbox.character.enemy;

import com.github.wiCharles.projectSandbox.Statistics;
import com.github.wiCharles.projectSandbox.character.Character;

public class Wolf extends Character {

    public Wolf (String name) {
        super(name, wolfStats());
    }

    private static Statistics wolfStats() {
        return new Statistics(
                100,
                25,

                6,

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
