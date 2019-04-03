package com.sda.visitor;

public class ElementA implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitAElement(this);
    }
}
