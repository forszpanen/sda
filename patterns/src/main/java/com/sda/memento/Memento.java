package com.sda.memento;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Memento {
    private Set<Integer> state;

    public Memento(Set<Integer> state) {
        this.state = Collections.unmodifiableSet(new HashSet<>(state));
    }

    public Set<Integer> getState() {
        return state;
    }
}
