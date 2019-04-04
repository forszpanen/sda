package com.sda.mediator;

public class MobilePerson extends Person {
    private boolean received = false;

    public MobilePerson(Mediator m) {
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