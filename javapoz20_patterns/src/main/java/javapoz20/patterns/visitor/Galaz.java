package javapoz20.patterns.visitor;

import java.util.ArrayList;
import java.util.List;

public class Galaz implements VisitorAcceptor {
    private final List<VisitorAcceptor> galezie = new ArrayList<>();

    public void add(VisitorAcceptor acceptor) {
        galezie.add(acceptor);
    }

    public void remove(VisitorAcceptor acceptor) {
        galezie.remove(acceptor);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (VisitorAcceptor acceptor : galezie) {
            acceptor.accept(visitor);
        }
    }
}
