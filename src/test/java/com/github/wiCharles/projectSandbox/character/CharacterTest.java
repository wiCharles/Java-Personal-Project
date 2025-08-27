package com.github.wiCharles.projectSandbox.character;

import com.github.wiCharles.projectSandbox.character.player.baseClasses.HeavyWeapon;
import com.github.wiCharles.projectSandbox.character.player.baseClasses.Sword;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharacterTest {
    private final Sword testCharacter = new Sword("HAL");
    private final HeavyWeapon heavyCharacter = new HeavyWeapon("Dummy");

    private final PrintStream originalOutput = System.out;
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {

        testCharacter.getStats().setCurrentHp(testCharacter.getStats().getMaxHP());
        heavyCharacter.getStats().setCurrentHp(heavyCharacter.getStats().getMaxHP());

        testCharacter.getStats().setDodgeChance(0);
        testCharacter.getStats().setParryChance(0);
        testCharacter.getStats().setCriticalChance(0);

        heavyCharacter.getStats().setDodgeChance(0);
        heavyCharacter.getStats().setParryChance(0);
        heavyCharacter.getStats().setCriticalChance(0);

        heavyCharacter.getStats().setDefenseValue(0);

        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(originalOutput);
    }

    @Test
    public void testAttacksAgainstCharacters() {
        // Assuming we have two characters, Sword and HeavyWeapon
        // And both are full health

        assertThat(testCharacter.getStats().getCurrentHp())
                .isEqualTo(150);
        assertThat(heavyCharacter.getStats().getCurrentHp())
                .isEqualTo(200);
        // When one character attacks another, the defender loses HP, and is printed to the terminal accordingly
        testCharacter.attack(heavyCharacter);
        assertEquals("Dummy takes 10 damage!", outputStream.toString().trim());
        assertThat(heavyCharacter.getStats().getCurrentHp())
                .isEqualTo(190);
    }

    @Test
    public void testDodgeAgainstCharacters() {
        //Assuming we have two characters
        //And both are full health
        assertThat(testCharacter.getStats().getCurrentHp())
                .isEqualTo(150);
        assertThat(heavyCharacter.getStats().getCurrentHp())
                .isEqualTo(200);
        //When one character attacks another
        heavyCharacter.getStats().setDodgeChance(1.0);
        testCharacter.attack(heavyCharacter);
        //The defender should dodge, printing to the terminal
        assertEquals("Dummy has dodged the attack!", outputStream.toString().trim());
        //And the defender should NOT take damage
        assertThat(heavyCharacter.getStats().getCurrentHp())
                .isEqualTo(200);
    }

    @Test
    public void testParryAgainstCharacters() {
        //Assuming we have two characters
        //And both are full health
        assertThat(testCharacter.getStats().getCurrentHp())
                .isEqualTo(150);
        assertThat(heavyCharacter.getStats().getCurrentHp())
                .isEqualTo(200);
        //When one character attacks another
        testCharacter.getStats().setPhysicalAttack(50);
        heavyCharacter.getStats().setParryChance(1.0);
        testCharacter.attack(heavyCharacter);
        //The defender should parry, printing to the terminal
        assertEquals("Dummy has parried the attack!\n" +
                "Dummy takes 12 damage!", outputStream.toString().trim());
        //And the defender should take damage, but be reduced by 25%
        testCharacter.getStats().setPhysicalAttack(10);
    }

    @Test
    public void testCriticalAgainstCharacters() {
        //Assuming we have two characters
        //And both are full health
        assertThat(testCharacter.getStats().getCurrentHp())
                .isEqualTo(150);
        assertThat(heavyCharacter.getStats().getCurrentHp())
                .isEqualTo(200);
        //When one character attacks another
        testCharacter.getStats().setPhysicalAttack(50);
        testCharacter.getStats().setCriticalChance(1);
        testCharacter.getStats().setCriticalDamage(2);
        testCharacter.attack(heavyCharacter);
        //The defender should endure a critical, printing it to the terminal
        //And the defender should take extra damage, depending on normal damage * critical multiplier.
        assertEquals("HAL has landed a critical!\n" +
                "Dummy takes 100 damage!", outputStream.toString().trim());
        assertThat(heavyCharacter.getStats().getCurrentHp())
                .isEqualTo(100);
    }
}
