package javapoz20.patterns.visitor;

import java.util.stream.Stream;

public class VisitorPresentation {
    public static void main(String[] args) {
        Drzewo drzewo = new Drzewo();
        Stream.generate(Galaz::new)
                .peek(g -> g.add(new Lisc()))
                .limit(10)
                .forEach(drzewo::add);
        Visitor visitor = new MyVisitor();
        drzewo.accept(visitor);
    }

    private static class MyVisitor implements Visitor {
        @Override
        public void visit(Drzewo d) {
            System.out.println("D");
        }

        @Override
        public void visit(Galaz g) {
            System.out.println("G");
        }

        @Override
        public void visit(Lisc l) {
            System.out.println("L");
        }

        @Override
        public void visit(Owoc o) {
            System.out.println("O");
        }
    }
}
