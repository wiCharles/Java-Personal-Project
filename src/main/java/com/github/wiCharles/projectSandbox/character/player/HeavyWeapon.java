package com.github.wiCharles.projectSandbox.character.player;

import com.github.wiCharles.projectSandbox.Statistics;
import com.github.wiCharles.projectSandbox.character.Character;

public class HeavyWeapon extends Character {

    public HeavyWeapon(String name) {
        super(name, heavyStats());
    }

    private static Statistics heavyStats() {
        return new Statistics(
                200,
                50,

                2,

                25,
                0,
                0,

                0.0,
                2.0,

                25,
                20,
                15,

                0.00,
                0.20
        );
    }

    @Override
    protected int getPrimaryAttack() {
        return this.getStats().getPhysicalAttack();
    }
}
