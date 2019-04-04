package com.sda.mediator;

public class ConcretePerson extends Person {
    private boolean received = false;

    public ConcretePerson(Mediator m) {
        super(m);
    }

    public void receive(String message) {
        received = true;
    }

    @Override
    public boolean hasReceived() {
        return received;
    }
}