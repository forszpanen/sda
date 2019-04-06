package com.sda.adapter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdapterTest {

    @Test
    public void shouldAdapt() {
        final OldSystemPerson oldSystemPerson = new OldSystemPerson("Adam kowalski");
        final NewSystemPerson newSystemPerson = new Adapter(oldSystemPerson);

        assertEquals("Adam", newSystemPerson.getFirstName());
        assertEquals("Kowalski", newSystemPerson.getLastName());
    }

    @Test
    public void shouldAdapt2() {
        final OldSystemPerson oldSystemPerson = new OldSystemPerson("Adam kowalski");
        final NewSystemPerson newSystemPerson = oldSystemPerson;

        assertEquals("Adam", newSystemPerson.getFirstName());
        assertEquals("Kowalski", newSystemPerson.getLastName());
    }
}
