package com.sda.singleton;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SingletonTest {

    @Test
    public void shouldReturnObject() {
        Singleton instance = Singleton.getInstance();

        assertTrue(instance != null);
    }

    @Test
    public void shouldReturnSingleObject() {

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        assertTrue(instance1 == instance2);
    }
}
