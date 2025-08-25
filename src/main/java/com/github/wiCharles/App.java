package com.github.wiCharles;

import com.github.wiCharles.projectSandbox.Statistics;
import com.github.wiCharles.projectSandbox.character.Character;


public class App {
    public static void main(String[] args) {
        Character character = new Character("HAL",1,new Statistics());
        character.displayStats();
    }
}
