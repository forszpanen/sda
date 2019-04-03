package com.sda.chain;

public class DefaultElementHandler implements ElementHandler {
    private Element handled;

    @Override
    public void setNext(ElementHandler elementHandler) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void handle(Element element) {
        handled = element;
    }

    @Override
    public Element getLastHandled() {
        return handled;
    }
}
