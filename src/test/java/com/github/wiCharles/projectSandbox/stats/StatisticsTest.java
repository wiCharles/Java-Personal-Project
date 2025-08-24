package com.github.wiCharles.projectSandbox.stats;

import com.github.wiCharles.projectSandbox.Statistics;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class StatisticsTest {

    private Statistics stats;

    @BeforeEach
    void setUp() {
        stats = new Statistics();
        // Arrange the common state for our tests
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

    @Test
    void takePhysicalDamageReducesHP() {

        stats.takeDamage(15);

        assertThat(stats.getCurrentHp()).isEqualTo(85);
    }

    @Test
    void cannotHealBeyondMaxHp() {

        stats.heal(30);

        assertThat(stats.getCurrentHp()).isEqualTo(100);
    }

    @Test
    void physicalDamageDefenseReducesDamage() {
        Statistics stats = new Statistics();
        stats.setDefenseValue(8);
        int result = stats.physicalDamageCalculate(15);
        assertThat(result).isEqualTo(7);
    }

    @Test
    void physicalDamageAlwaysReturnsAtLeastOne() {
        Statistics stats = new Statistics();
        stats.setDefenseValue(20);
        int result = stats.physicalDamageCalculate(15);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void magicalDamageWardingReducesDamage() {
        Statistics stats = new Statistics();
        stats.setWardingValue(8);
        int result = stats.magicalDamageCalculate(15);
        assertThat(result).isEqualTo(7);
    }

    @Test
    void magicalDamageWardingAlwaysReturnsAtLeastOne() {
        Statistics stats = new Statistics();
        stats.setWardingValue(20);
        int result = stats.magicalDamageCalculate(15);
        assertThat(result).isEqualTo(1);
    }
}
