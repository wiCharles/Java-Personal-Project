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

public class CharacterTest {
    private final Sword testCharacter = new Sword("HAL");
    private final HeavyWeapon heavyCharacter = new HeavyWeapon("Dummy");



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
    }

    @Test
    public void testAttacksAgainstCharacters() throws IOException {
        // Assuming we have two characters, Sword and HeavyWeapon
        // And both are full health

        assertThat(testCharacter.getStats().getCurrentHp())
                .isEqualTo(150);
        assertThat(heavyCharacter.getStats().getCurrentHp())
                .isEqualTo(200);
        // When one character attacks another, the defender loses HP, and is printed to the terminal accordingly
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
        //The defender should dodge, printing to the terminal
        //And the defender should NOT take damage
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
        //The defender should parry, printing to the terminal
        //And the defender should take damage, but be reduced by 25%
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
        //The defender should endure a critical, printing it to the terminal
        //And the defender should take extra damage, depending on normal damage * critical multiplier.
    }




}
