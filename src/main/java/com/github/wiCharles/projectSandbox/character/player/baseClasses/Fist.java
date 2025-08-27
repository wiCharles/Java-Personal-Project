package com.github.wiCharles.projectSandbox.character.player.baseClasses;

import com.github.wiCharles.projectSandbox.Statistics;
import com.github.wiCharles.projectSandbox.character.Character;

public class Fist extends Character {

    public Fist(String name) {
        super(name, fistStats());
    }

    private static Statistics fistStats() {
        return new Statistics(
                75,
                50,

                8,

                10,
                15,
                5,

                0.05,
                1.5,

                10,
                5,
                0,

                0.15,
                0.05
        );
    }
    @Override
    protected int getPrimaryAttack() {
        return this.getStats().getDexterityAttack();
    }
}
