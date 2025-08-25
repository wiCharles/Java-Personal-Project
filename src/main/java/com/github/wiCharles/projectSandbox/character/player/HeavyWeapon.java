package com.github.wiCharles.projectSandbox.character.player;

import com.github.wiCharles.projectSandbox.Statistics;
import com.github.wiCharles.projectSandbox.character.Character;

public class HeavyWeapon extends Character {

    public HeavyWeapon(String name) {
        super(name, 1, heavyStats());
    }

    private static Statistics heavyStats() {
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
