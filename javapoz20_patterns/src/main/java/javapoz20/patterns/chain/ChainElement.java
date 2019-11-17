package javapoz20.patterns.chain;

public interface ChainElement {
    void setNext(ChainElement element);

    void handle(Object object);
}
