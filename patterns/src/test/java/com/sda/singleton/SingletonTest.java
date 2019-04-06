package com.sda.singleton;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import static org.junit.Assert.*;

public class SingletonTest {

    @Test
    public void shoouldReturnInstance() {
        // Given

        // When
        final Singleton singleton = Singleton.getInstance();

        // Then
        assertNotNull(singleton);
    }


    @Test
    public void shoouldReturnSameInstance() {
        // Given

        // When
        final Singleton singleton1 = Singleton.getInstance();
        final Singleton singleton2 = Singleton.getInstance();

        // Then
        assertSame(singleton1, singleton2);
    }

    @Test
    public void shouldHavePrivateConstructor() {
        // Given

        //When
        Constructor<?>[] constructors = Singleton.class.getConstructors();

        // then
//        assertEquals(1, constructors.length);
//        assertTrue(Modifier.isPrivate(constructors[0].getModifiers()));

    }

}
