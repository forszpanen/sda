package javapoz20.patterns.visitor;

public class Lisc implements VisitorAcceptor {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
