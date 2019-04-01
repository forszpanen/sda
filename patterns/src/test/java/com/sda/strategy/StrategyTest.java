package com.sda.strategy;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class StrategyTest {

    @Test
    public void shouldPerformAdding() {
        final Context context = new Context();
        context.fill(1, 2, 3, 4);
        context.setStrategy(new AddingStrategy());

        final BigDecimal result = context.getResult();

        assertEquals(new BigDecimal("10"), result);
    }

    @Test
    public void shouldPerformMultiplying() {
        final Context context = new Context();
        context.fill(1, 2, 3, 4);
        context.setStrategy(new MultiplyStrategy());

        final BigDecimal result = context.getResult();

        assertEquals(new BigDecimal("24"), result);
    }
}
