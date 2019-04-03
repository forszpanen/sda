package com.sda.state;

import org.junit.Test;
import org.mockito.internal.util.collections.Sets;

import static org.junit.Assert.assertEquals;

public class StateTest {

    @Test
    public void shouldAllowNewObjectsInWorkingState() {
        final Container container = Container.createOpenContainer();

        container.add(1);
        container.add(2);

        assertEquals(State.WORKING, container.getState());
        assertEquals(Sets.newSet(1, 2), container.getElements());
    }

    @Test
    public void shouldAllowLocking() {
        final Container container = Container.createOpenContainer();

        container.add(1);
        container.add(2);
        container.lock();
        assertEquals(State.LOCKED, container.getState());
        assertEquals(Sets.newSet(1, 2), container.getElements());

    }

    @Test(expected = IllegalStateException.class)
    public void shouldNotAllowNewObjectsInLockedState() {
        final Container container = Container.createLockedContainer();

        assertEquals(State.LOCKED, container.getState());
        assertEquals(Sets.newSet(), container.getElements());

        container.add(1);
    }
}
