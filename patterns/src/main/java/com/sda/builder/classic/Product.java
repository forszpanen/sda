package com.sda.builder.classic;

public class Product {
    private BuilderA.ObjectA objecta;
    private BuilderB.ObjectB objectb;
    private BuilderC.ObjectC objectc;

    public Product(BuilderA.ObjectA objecta, BuilderB.ObjectB objectb, BuilderC.ObjectC objectc) {
        this.objecta = objecta;
        this.objectb = objectb;
        this.objectc = objectc;
    }


    public BuilderA.ObjectA getElementA() {
        return objecta;
    }

    public BuilderB.ObjectB getElementB() {
        return objectb;
    }

    public BuilderC.ObjectC getElementC() {
        return objectc;
    }
}
