package com.sda.flyweight;


import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

public class FlyweightTest {

    @Test
    public void shouldProduceExternalId() {
        final ExternalId externalId = ExternalId.create("1234");

        assertNotNull(externalId);
    }

    @Test
    public void shouldNotProduceSameExternalIdTwice() {
        final ExternalId externalId1 = ExternalId.create("1234");
        final ExternalId externalId2 = ExternalId.create("1234");

        assertSame(externalId1, externalId2);
    }
}
