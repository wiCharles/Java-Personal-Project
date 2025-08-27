package com.github.wiCharles;

import com.github.wiCharles.projectSandbox.character.Character;
import com.github.wiCharles.projectSandbox.character.player.baseClasses.*;

import java.util.ArrayList;
import java.util.Comparator;


public class App {

    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>();

        Sword character = new Sword("HAL");
        Spear character2 = new Spear("Dummy");
        HeavyWeapon character3 = new HeavyWeapon("Dummy");
        Ranger character4 = new Ranger("Dummy");
        Dagger character5 = new Dagger("Dummy");
        Fist character6 = new Fist("Dummy");
        Mage character7 = new Mage("Dummy");

        list.add(character);
        list.add(character2);
        list.add(character3);
        list.add(character4);
        list.add(character5);
        list.add(character6);
        list.add(character7);

        list.sort(Comparator.comparing(c -> c.getStats().getSpeed()));

        for (Character charac : list) {
            System.out.println(charac);
        }

        character.attack(character3);

//        character.displayStats();
//
//        character.takeDamage(10);
//        character.heal(10);

    }
}
