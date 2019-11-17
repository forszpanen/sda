package javapoz20.patterns.visitor;

public class Owoc implements VisitorAcceptor {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
