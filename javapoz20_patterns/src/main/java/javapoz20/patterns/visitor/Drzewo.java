package javapoz20.patterns.visitor;

import java.util.ArrayList;
import java.util.List;

public class Drzewo implements VisitorAcceptor {
    private final List<Galaz> galezie = new ArrayList<>();

    public void add(Galaz galaz) {
        galezie.add(galaz);
    }

    public void remove(Galaz galaz) {
        galezie.remove(galaz);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (VisitorAcceptor acceptor : galezie) {
            acceptor.accept(visitor);
        }
    }
}
