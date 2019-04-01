package com.sda.decorator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecoratorTest {

    @Test
    public void shouldReturnString() {
        final SomeObject someObject = new SampleImplementation();

        assertEquals("World", someObject.presentYourself());
    }

    @Test
    public void shouldReturnDecoratedString() {
        final SomeObject someObject = new Decorator(new SampleImplementation());

        assertEquals("Hello World", someObject.presentYourself());
    }
}
