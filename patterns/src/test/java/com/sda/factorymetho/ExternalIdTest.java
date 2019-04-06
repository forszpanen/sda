package com.sda.factorymetho;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExternalIdTest {

    @Test
    public void shouldCreatePesel() {
        ExternalId pesel = ExternalId.createPesel("245809830934");

        assertEquals("PESEL", pesel.getType());
    }
}