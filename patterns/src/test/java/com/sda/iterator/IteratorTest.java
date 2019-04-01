package com.sda.iterator;

import org.junit.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IteratorTest {

    @Test
    public void shouldCreateIterator() {
        final Iterator<Integer> iterator = new MyIterator(12, 3, 4, 5, 234);
    }

    @Test
    public void shouldIterateOverElements() {
        final Iterator<Integer> iterator = new MyIterator(12, 3, 4, 5, 234);

        while (iterator.hasNext()) {
            Integer next = iterator.next();
            assertTrue(next != null);
        }
        assertFalse(iterator.hasNext());
    }

    @Test(expected = NoSuchElementException.class)
    public void shouldIterateOverElementsAndthrowException() {
        final Iterator<Integer> iterator = new MyIterator(12, 3, 4, 5, 234);

        while (iterator.hasNext()) {
            iterator.next();
        }
        iterator.next();
    }
}
