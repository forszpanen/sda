package com.sda.command;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CommandTest {

    @Test
    public void shouldTurnOnLight() {
        final Light light = new Light(false);
        final Command command = new TurnOnLight(light);

        command.perform();

        assertTrue(light.isOn());
    }

    @Test
    public void shouldTurnOffLight() {
        final Light light = new Light(true);
        final Command command = new TurnOffLight(light);

        command.perform();

        assertFalse(light.isOn());
    }

    @Test
    public void shouldPerformSequence() {
        final Light light = new Light(false);
        final CommandSequence sequence = new CommandSequence();
        sequence.add(new TurnOnLight(light));
        sequence.add(new TurnOnLight(light));
        sequence.add(new TurnOffLight(light));

        sequence.perform();

        assertFalse(light.isOn());
    }

    @Test
    public void shouldPerformSequence2() {
        final Light light = new Light(false);
        final CommandSequence sequence = new CommandSequence();
        sequence.add(new TurnOnLight(light));
        sequence.add(new TurnOnLight(light));
        sequence.add(new TurnOnLight(light));

        sequence.perform();

        assertTrue(light.isOn());
    }
}
