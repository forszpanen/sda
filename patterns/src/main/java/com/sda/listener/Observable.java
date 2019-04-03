package com.sda.listener;

public interface Observable {
    void register(Observer observer);

    void notifyObservers();

    void unregister(Observer observer);
}
