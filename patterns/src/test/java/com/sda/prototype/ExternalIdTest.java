package com.sda.prototype;

import org.junit.Test;

public class ExternalIdTest {

    @Test
    public void shouldCreate() {
        final ExternalId id = new ExternalId("PESEL", "12309322344");

        ExternalId pesel1 = id.clone("23480923923");
        ExternalId pesel2 = id.clone("123432589435");
    }
}