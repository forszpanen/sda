package com.sda.mediator;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MediatorTest {

    @Test
    public void shouldSendMessages() {
        ApplicationMediator mediator = new ApplicationMediator();
        Person desktop = new ConcretePerson(mediator);
        Person mobile = new MobilePerson(mediator);
        mediator.addColleague(desktop);
        mediator.addColleague(mobile);
        desktop.send("Hello World");
        mobile.send("Hello");

        assertTrue(desktop.hasReceived());
        assertTrue(mobile.hasReceived());
    }
}
