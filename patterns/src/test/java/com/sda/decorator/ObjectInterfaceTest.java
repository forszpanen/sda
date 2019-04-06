package com.sda.decorator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ObjectInterfaceTest {

    @Test
    public void shouldReturnName() {
        final ObjectInterface objectInterface = new NameProvider();

        assertEquals("Kazimierz", objectInterface.getName());
    }

    @Test
    public void shouldReturnNameSurname() {
        final ObjectInterface objectInterface = new NameSurnameProvider(new NameProvider());

        assertEquals("Kazimierz Kozikowski", objectInterface.getName());
    }
}