package com.sda.factory;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class FactoryTest {

    private void testFactory(Factory factory) {
        assertNotNull(factory.createInputController());
        assertNotNull(factory.createMemoryManager());
    }

    @Test
    public void shouldCreateObjectsFactoryAndroid() {
        testFactory(new AndroidFactory());
    }

    @Test
    public void shouldCreateObjectsFactoryIOS() {
        testFactory(new IOSFactory());
    }
}
