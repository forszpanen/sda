package com.sda.chain;

public interface ElementHandler {

    void setNext(ElementHandler elementHandler);

    void handle(Element element);

    Element getLastHandled();
}
