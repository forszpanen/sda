package com.sda.chain;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ChainTest {
    private final Zadanie zadanie1 = new Zadanie("1");
    private final Zadanie zadanie2 = new Zadanie("2");
    private final Zadanie zadanie3 = new Zadanie("3");
    private final Zadanie zadanieGw = new Zadanie("*");

    @Test
    public void shouldAnswerToTask() {
        final AbstractChainElement element = new Bench("1", "2");

        Optional<Result> result = element.solve(zadanie1);

        assertTrue(result.isPresent());
    }

    @Test
    public void shouldNotAnswerToTask() {
        final AbstractChainElement element = new Bench("1", "2");

        Optional<Result> result = element.solve(zadanieGw);

        assertFalse(result.isPresent());
    }
}
