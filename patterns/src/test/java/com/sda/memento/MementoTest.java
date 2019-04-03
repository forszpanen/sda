package com.sda.memento;

import org.junit.Test;
import org.mockito.internal.util.collections.Sets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MementoTest {
    @Test
    public void shouldCreateMemento() {
        final Originator originator = new Originator();
        originator.provideStateElement(1);
        originator.provideStateElement(2);

        final Memento memento = originator.createMemento();

        assertNotNull(memento);
        assertEquals(memento.getState(), Sets.newSet(1, 2));
    }

    @Test
    public void shouldCreateMemento2() {
        final Originator originator = new Originator();
        originator.provideStateElement(1);
        originator.provideStateElement(2);

        final Memento memento = originator.createMemento();
        originator.provideStateElement(3);

        assertNotNull(memento);
        assertEquals(memento.getState(), Sets.newSet(1, 2));
    }

    @Test
    public void shouldRestoreState() {
        final Originator originator = new Originator();
        originator.provideStateElement(1);
        originator.provideStateElement(2);

        final Memento memento = originator.createMemento();

        originator.provideStateElement(3);

        originator.restore(memento);

        assertNotNull(memento);
        assertEquals(memento.getState(), Sets.newSet(1, 2));
    }
}
