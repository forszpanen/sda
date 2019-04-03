package com.sda.visitor;

public interface Visitor {
    void visitAElement(ElementA element);

    void visitBElement(ElementB element);

    void visitCollection(ElementCollection elementCollection);
}
