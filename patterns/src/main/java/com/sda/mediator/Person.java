package com.sda.mediator;


public abstract class Person {
    private Mediator mediator;

    public Person(Mediator m) {
        mediator = m;
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public Mediator getMediator() {
        return mediator;
    }

    public abstract void receive(String message);

    public abstract boolean hasReceived();
}
