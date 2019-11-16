package javapoz20.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Shape implements Composite {
    private final List<Composite> elements = new ArrayList<>();

    public void add(Composite composite) {
        elements.add(composite);
    }

    public void remove(Composite composite) {
        elements.remove(composite);
    }

    @Override
    public void draw() {
        elements.forEach(Composite::draw);
    }
}
