package com.sda.memento;

import java.util.HashSet;
import java.util.Set;

public class Originator {
    private final Set<Integer> state = new HashSet<>();

    public void provideStateElement(int i) {
        state.add(i);
    }

    public Memento createMemento() {
        return new Memento(state);
    }

    public void restore(Memento memento) {
        state.clear();
        state.addAll(memento.getState());
    }
}
