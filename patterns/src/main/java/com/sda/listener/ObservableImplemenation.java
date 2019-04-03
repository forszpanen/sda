package com.sda.listener;

import java.util.HashSet;
import java.util.Set;

public class ObservableImplemenation implements Observable {
    private final Set<Observer> observers = new HashSet<>();

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Observer[] observersArray = observers.toArray(new Observer[0]);
        for (Observer observer : observersArray) {
            observer.somethingHappened();
        }
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }
}
