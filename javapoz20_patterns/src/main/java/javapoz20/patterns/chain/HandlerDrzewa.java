package javapoz20.patterns.chain;

import javapoz20.patterns.visitor.Drzewo;

public class HandlerDrzewa implements ChainElement {
    private ChainElement next;

    @Override
    public void setNext(ChainElement element) {
        next = element;
    }

    @Override
    public void handle(Object object) {
        if (object instanceof Drzewo) {
            System.out.println("dostałem drzewem");
        } else if (next != null) {
            next.handle(object);
        }
    }
}
