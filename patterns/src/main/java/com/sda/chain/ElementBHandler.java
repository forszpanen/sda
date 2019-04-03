package com.sda.chain;

public class ElementBHandler implements ElementHandler {
    private ElementHandler next;
    private Element handled;

    @Override
    public void setNext(ElementHandler elementHandler) {
        next = elementHandler;
    }

    @Override
    public void handle(Element element) {
        if (element.getName().equals("B")) {
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
