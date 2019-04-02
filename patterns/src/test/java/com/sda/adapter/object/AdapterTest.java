package com.sda.adapter.object;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdapterTest {

    @Test
    public void shouldWrapObjectInNewInterface() {
        final OldInterface oldInterface = new OldObject();
        final NewInterface newInterface = new Adapter(oldInterface);

        assertEquals(15.0f, oldInterface.getValue(), 0.0f);
        assertEquals(30.0, newInterface.getValue(), 0.0);

    }
}
