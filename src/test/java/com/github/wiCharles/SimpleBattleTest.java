package com.github.wiCharles;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.github.wiCharles.projectSandbox.character.enemy.Wolf;
import com.github.wiCharles.projectSandbox.character.player.Sword;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Unit test for simple App.
 */
public class SimpleBattleTest {

    private final Sword testCharacter = new Sword("HAL");
    private final Wolf wolf = new Wolf();

    private final PrintStream originalOutput = System.out;
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {

        testCharacter.getStats().setCurrentHp(testCharacter.getStats().getMaxHP());

        testCharacter.getStats().setDodgeChance(0);
        testCharacter.getStats().setParryChance(0);
        testCharacter.getStats().setCriticalChance(0);

        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(originalOutput);
    }

    @Test
    public void testBattleLoopPlayerWins() {
        //Assuming we have two characters
        //And the battle starts successfully.
        //We should verify both entities are alive.
        //And once the wolf dies, the battle loop should output a victory for the player.
    }

    @Test
    public void testBattleLoopPlayerLoses() {
        //Assuming we have two characters
        //And the battle starts successfully.
        //We should verify both entities are alive.
        //And once the player dies, the battle loop should output defeat for the player.
    }

    @Test
    public void testCharacterSelection() {
        //When the main class starts.
        //There should be a prompt that allows the player to choose a character.
        //And the correct character should be outputted to the terminal.
    }
}
