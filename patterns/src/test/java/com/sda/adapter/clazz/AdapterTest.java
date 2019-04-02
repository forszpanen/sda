package com.sda.adapter.clazz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdapterTest {

    @Test
    public void shouldWrapObjectInNewInterface() {
        final Adapter adapter = new Adapter();
        final OldInterface oldInterface = adapter;
        final NewInterface newInterface = adapter;

        assertEquals(15.0f, oldInterface.getFloatValue(), 0.0f);
        assertEquals(30.0, newInterface.getDoubleValue(), 0.0);

    }
}
