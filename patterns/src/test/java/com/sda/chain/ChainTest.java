package com.sda.chain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChainTest {

    @Test
    public void shouldHandleElementA() {
        final Element element = new Element("A");
        final ElementHandler elementHandler = new ElementAHandler();

        elementHandler.handle(element);

        assertEquals(element, elementHandler.getLastHandled());
    }

    @Test
    public void sholdHandleElementB() {
        final Element element = new Element("B");
        final ElementHandler elementHandler = new ElementBHandler();

        elementHandler.handle(element);

        assertEquals(element, elementHandler.getLastHandled());
    }

    @Test
    public void shouldHandleAllElements() {

        final Element element = new Element("CC");
        final ElementHandler elementHandler = new DefaultElementHandler();

        elementHandler.handle(element);

        assertEquals(element, elementHandler.getLastHandled());

        final Element element2 = new Element("CCZZZ");

        elementHandler.handle(element2);

        assertEquals(element2, elementHandler.getLastHandled());

    }

    @Test
    public void shouldHandleInComposedChain() {
        final ElementHandler a = new ElementAHandler();
        final ElementHandler b = new ElementBHandler();
        final ElementHandler def = new DefaultElementHandler();

        a.setNext(b);
        b.setNext(def);

        final Element element1 = new Element("A");
        final Element element2 = new Element("B");
        final Element element3 = new Element("DD");

        a.handle(element1);
        a.handle(element2);
        a.handle(element3);

        assertEquals(element1, a.getLastHandled());
        assertEquals(element2, b.getLastHandled());
        assertEquals(element3, def.getLastHandled());
    }
}
