package com.github.wiCharles;

import com.github.wiCharles.projectSandbox.character.player.Sword;


public class App {
    public static void main(String[] args) {
        Sword character = new Sword("HAL");
        Sword character2 = new Sword("Dummy");
        character.displayStats();

        character.takeDamage(10);
        character.heal(10);

    }
}
