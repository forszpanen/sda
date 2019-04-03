package com.sda.visitor;

import org.junit.Test;
import org.mockito.Mockito;

public class VisitorTest {

    @Test
    public void shouldVisitSingleElementA() {
        final Element element = new ElementA();
        final Visitor visitor = Mockito.mock(Visitor.class);

        element.accept(visitor);

        Mockito.verify(visitor).visitAElement(Mockito.any(ElementA.class));
    }

    @Test
    public void shouldVisitSingleElementB() {
        final Element element = new ElementB();
        final Visitor visitor = Mockito.mock(Visitor.class);

        element.accept(visitor);

        Mockito.verify(visitor).visitBElement(Mockito.any(ElementB.class));
    }

    @Test
    public void shouldVisitCollection() {
        final ElementCollection element = new ElementCollection();
        element.add(new ElementA());
        element.add(new ElementA());
        element.add(new ElementB());
        final Visitor visitor = Mockito.mock(Visitor.class);

        element.accept(visitor);

        Mockito.verify(visitor).visitCollection(Mockito.any(ElementCollection.class));
        Mockito.verify(visitor, Mockito.times(2)).visitAElement(Mockito.any(ElementA.class));
        Mockito.verify(visitor).visitBElement(Mockito.any(ElementB.class));
    }
}
