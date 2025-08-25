package com.github.wiCharles.projectSandbox.character.player;

import com.github.wiCharles.projectSandbox.Statistics;
import com.github.wiCharles.projectSandbox.character.Character;

public class Fist extends Character {

    public Fist(String name) {
        super(name, 1, fistStats());
    }

    private static Statistics fistStats() {
        return new Statistics(
                100,
                25,

                8,

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
