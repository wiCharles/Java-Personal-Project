package com.github.wiCharles.projectSandbox.stats;

import com.github.wiCharles.projectSandbox.Statistics;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class StatisticsTest {

    @Test
    void takeDamageReducesHP() {
        Statistics stats = new Statistics();
        stats.setMaxHp(100);
        stats.setCurrentHp(100);

        stats.takeDamage(15);

        assertThat(stats.getCurrentHp()).isEqualTo(85);
    }

    @Test
    void cannotHealBeyondMaxHp() {
        Statistics stats = new Statistics();
        stats.setMaxHp(100);
        stats.setCurrentHp(80);

        stats.heal(30);

        assertThat(stats.getCurrentHp()).isEqualTo(100);
    }
}
