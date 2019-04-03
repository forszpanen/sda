package com.sda.listener;

import org.junit.Test;
import org.mockito.Mockito;

public class ObserverTest {

    @Test
    public void shouldNotifyRegisteredObserver() {
        final Observer observer = Mockito.mock(Observer.class);
        final Observable observable = new ObservableImplemenation();

        observable.register(observer);
        observable.notifyObservers();

        Mockito.verify(observer).somethingHappened();
    }

    @Test
    public void shouldNotNotifyUnregisteredObserver() {

        final Observer observer = Mockito.mock(Observer.class);
        final Observable observable = new ObservableImplemenation();

        observable.register(observer);
        observable.unregister(observer);
        observable.notifyObservers();

        Mockito.verify(observer, Mockito.never()).somethingHappened();
    }
}
