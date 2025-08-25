package com.github.wiCharles.projectSandbox.character.player;

import com.github.wiCharles.projectSandbox.Statistics;
import com.github.wiCharles.projectSandbox.character.Character;

public class Mage extends Character {

    public Mage(String name) {
        super(name, mageStats());
    }

    private static Statistics mageStats() {
        return new Statistics(
                50,
                200,

                4,

                5,
                0,
                25,

                0.05,
                1.5,

                0,
                25,
                0,

                0.05,
                0.10
        );
    }
}
