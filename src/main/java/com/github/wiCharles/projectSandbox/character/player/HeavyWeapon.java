package com.github.wiCharles.projectSandbox.character.player;

import com.github.wiCharles.projectSandbox.Statistics;
import com.github.wiCharles.projectSandbox.character.Character;

public class HeavyWeapon extends Character {

    public HeavyWeapon(String name) {
        super(name, heavyStats());
    }

    private static Statistics heavyStats() {
        return new Statistics(
                100,
                25,

                2,

                25,
                0,
                0,

                0.0,
                2,

                25,
                20,
                15,

                0.05,
                0.10
        );
    }
}
