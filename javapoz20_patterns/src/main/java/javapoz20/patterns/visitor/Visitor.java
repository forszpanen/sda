package javapoz20.patterns.visitor;

public interface Visitor {
    void visit(Drzewo d);
    void visit(Galaz g);
    void visit(Lisc l);
    void visit(Owoc o);
}
