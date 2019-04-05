package com.sda.bridge;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BridgeTest {

    @Test
    public void shouldPerformOperationBridge1() {
        final Implementor1 implementor = new Implementor1();
        final BridgeObject bridge = new BridgeObject(implementor);

        bridge.callOperation1();
        bridge.callOperation2();

        assertTrue(implementor.wasOperation1Called());
        assertTrue(implementor.wasOperation2Called());
    }

    @Test
    public void shouldPerformOperationBridge2() {
        final Implementor2 implementor = new Implementor2();
        final BridgeObject bridge = new BridgeObject(implementor);

        bridge.callOperation1();
        bridge.callOperation2();

        assertTrue(implementor.wasOperation1Called());
        assertTrue(implementor.wasOperation2Called());
    }
}
