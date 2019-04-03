package com.sda.chain;

public class ElementAHandler implements ElementHandler {
    private ElementHandler next;
    private Element handled;

    @Override
    public void setNext(ElementHandler elementHandler) {
        next = elementHandler;
    }

    @Override
    public void handle(Element element) {
        if (element.getName().equals("A")) {
            handled = element;
        }
        if (next != null) {
            next.handle(element);
        }
    }

    @Override
    public Element getLastHandled() {
        return handled;
    }
}
