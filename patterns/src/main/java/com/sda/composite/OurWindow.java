package com.sda.composite;

import java.util.ArrayList;
import java.util.List;

public class OurWindow implements OurComposite {
    private List<OurComponent> components = new ArrayList<>();

    @Override
    public void add(OurComponent component) {
        components.add(component);
    }

    @Override
    public void remove(OurComponent component) {
        components.remove(component);
    }

    @Override
    public OurComponent getChild(int attr) {
        return components.get(attr);
    }

    @Override
    public void draw() {
        components.forEach(OurComponent::draw);
    }
}
