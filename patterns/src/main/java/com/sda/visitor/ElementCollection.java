package com.sda.visitor;

import java.util.HashSet;
import java.util.Set;

public class ElementCollection implements Element {
    private final Set<Element> elements = new HashSet<>();

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCollection(this);
        elements.forEach(element -> element.accept(visitor));
    }

    public void add(Element element) {
        elements.add(element);
    }
}
