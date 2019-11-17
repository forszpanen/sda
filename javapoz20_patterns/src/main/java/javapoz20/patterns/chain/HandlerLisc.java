package javapoz20.patterns.chain;

import javapoz20.patterns.visitor.Drzewo;
import javapoz20.patterns.visitor.Lisc;

public class HandlerLisc implements ChainElement {
    private ChainElement next;

    @Override
    public void setNext(ChainElement element) {
        next = element;
    }

    @Override
    public void handle(Object object) {
        if (object instanceof Lisc) {
            System.out.println("dostałem lisc");
        } else if (next != null) {
            next.handle(object);
        }
    }
}
