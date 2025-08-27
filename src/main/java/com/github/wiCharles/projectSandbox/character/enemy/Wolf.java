package com.github.wiCharles.projectSandbox.character.enemy;

import com.github.wiCharles.projectSandbox.Statistics;
import com.github.wiCharles.projectSandbox.character.Character;

public class Wolf extends Character {

    public Wolf () {
        super("Wolf", wolfStats());
    }

    private static Statistics wolfStats() {
        return new Statistics(
                50,
                0,

                6,

                10,
                0,
                0,

                0.05,
                1.5,

                10,
                5,
                0,

                0.10,
                0.00
        );
    }

    @Override
    protected int getPrimaryAttack() {
        return this.getStats().getPhysicalAttack();
    }
}
