package com.sda.state;

import java.util.HashSet;
import java.util.Set;

public class Container {
    private State state;
    private final Set<Integer> elements = new HashSet<>();

    public static Container createOpenContainer() {
        Container container = new Container();
        container.state = State.WORKING;
        return container;
    }

    public static Container createLockedContainer() {
        Container container = new Container();
        container.state = State.LOCKED;
        return container;
    }

    public void add(int element) {
        if (state == State.LOCKED) {
            throw new IllegalStateException("Locked container.");
        }
        elements.add(element);
    }

    public Set<Integer> getElements() {
        return elements;
    }

    public void lock() {
        state = State.LOCKED;
    }

    public void unlock() {
        state = State.WORKING;
    }

    public State getState() {
        return state;
    }
}
