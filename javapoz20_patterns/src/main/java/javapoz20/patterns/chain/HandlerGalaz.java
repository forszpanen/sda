package javapoz20.patterns.chain;

import javapoz20.patterns.visitor.Drzewo;
import javapoz20.patterns.visitor.Galaz;

public class HandlerGalaz implements ChainElement {
    private ChainElement next;

    @Override
    public void setNext(ChainElement element) {
        next = element;
    }

    @Override
    public void handle(Object object) {
        if (object instanceof Galaz) {
            System.out.println("dostałem galezia");
        } else if (next != null) {
            next.handle(object);
        }
    }
}
