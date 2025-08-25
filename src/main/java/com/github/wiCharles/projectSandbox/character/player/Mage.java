package com.github.wiCharles.projectSandbox.character.player;

import com.github.wiCharles.projectSandbox.Statistics;
import com.github.wiCharles.projectSandbox.character.Character;

public class Mage extends Character {

    public Mage(String name) {
        super(name, 1, mageStats());
    }

    private static Statistics mageStats() {
        return new Statistics(
                50,
                200,

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
