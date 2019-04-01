package com.sda.composite;

import java.util.ArrayList;
import java.util.List;

public class Picture implements Element {
    private List<Element> elements = new ArrayList<>();

    public void add(Element element) {
        elements.add(element);
    }

    public void remove(Element element) {
        elements.remove(element);
    }

    @Override
    public void draw() {
        elements.forEach(Element::draw);
    }
}
