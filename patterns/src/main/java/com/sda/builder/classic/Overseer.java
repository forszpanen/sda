package com.sda.builder.classic;

public class Overseer {
    private final BuilderA builderA;
    private final BuilderB builderB;
    private final BuilderC builderC;

    public Overseer(BuilderA builderA, BuilderB builderB, BuilderC builderC) {

        this.builderA = builderA;
        this.builderB = builderB;
        this.builderC = builderC;
    }

    public Product createProduct() {
        return new Product(builderA.create(), builderB.create(), builderC.create());
    }
}
