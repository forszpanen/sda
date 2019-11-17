package javapoz20.patterns.chain;

import javapoz20.patterns.visitor.Drzewo;
import javapoz20.patterns.visitor.Lisc;
import javapoz20.patterns.visitor.Owoc;

public class ChainPresentation {
    public static void main(String[] args) {
        final ChainElement drzewo = new HandlerDrzewa();
        final ChainElement galaz = new HandlerGalaz();
        final ChainElement lisc = new HandlerLisc();
        lisc.setNext(drzewo);
        drzewo.setNext(galaz);
        galaz.setNext(lisc);

        drzewo.handle(new Drzewo());
        drzewo.handle(new Lisc());
        drzewo.handle(new Owoc());
    }
}
