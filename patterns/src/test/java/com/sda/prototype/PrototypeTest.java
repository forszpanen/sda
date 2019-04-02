package com.sda.prototype;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PrototypeTest {

    @Test
    public void shouldCreatePrototype() {
        final SimpleObject object = new SimpleObject("name", 123455);
        final SimpleObject another = object.createFrom();

        assertTrue(object.equals(another));
        assertFalse(object == another);

        another.setMagicNumber(100);

        assertFalse(object.equals(another));
        assertFalse(object == another);
    }

    @Test
    public void shouldCreatePrototypeComplex() {
        Set<Integer> set = new HashSet<>();
        set.add(1235);
        final ComplexObject object = new ComplexObject("name", set);
        final ComplexObject another = object.createFrom();

        assertTrue(object.equals(another));
        assertFalse(object == another);

        another.addMagicNumber(100);

        assertFalse(object.equals(another));
        assertFalse(object == another);
    }
}
