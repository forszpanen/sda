package com.sda.builder.other;

import com.sda.builder.Statistics;
import org.junit.Test;

public class StatisticsTest {

    @Test
    public void shouldCreate() {
        final Statistics stats =
                Statistics.builder()
                        .setAgility(1)
                        .setAttacks(2)
                        .setFellowship(2)
                        .setBallisticsSkill(2)
                        .createStatistics();

    }
}