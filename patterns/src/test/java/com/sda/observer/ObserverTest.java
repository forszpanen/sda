package com.sda.observer;

import org.junit.Test;
import org.mockito.Mockito;

public class ObserverTest {

    @Test
    public void shouldInform() {
        final Publisher publisher = new PublisherImplementation();
        final Observer observer1 = Mockito.mock(Observer.class);
        final Observer observer2 = Mockito.mock(Observer.class);

        publisher.register(observer1);
        publisher.register(observer2);
        publisher.notifyObservers();

        Mockito.verify(observer1).informed(Mockito.anyString());
        Mockito.verify(observer2).informed(Mockito.anyString());
    }
}
