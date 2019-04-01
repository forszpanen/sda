package com.sda.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyIterator implements Iterator<Integer> {
    private final int[] elements;
    private int current = 0;

    public MyIterator(int... elements) {
        this.elements = elements;
    }

    @Override
    public boolean hasNext() {
        return current < elements.length;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return elements[current++];
    }
}
