package com.github.wiCharles.projectSandbox.character;

import com.github.wiCharles.projectSandbox.Statistics;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CharacterTest {
    private final Statistics stats = new Statistics();
    private final Character testCharacter = new Character("HAL",1,stats);

    @BeforeEach
    void setUp() {
        stats.setMaxHp(100);
        stats.setCurrentHp(100);
        stats.setMaxMp(50);
        stats.setCurrentMp(50);
        }

    @AfterEach
    void reset() {
        stats.setMaxHp(100);
        stats.setCurrentHp(100);
        stats.setMaxMp(50);
        stats.setCurrentMp(50);
    }
}
