package com.sda.builder.classic;

import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;

public class BuilderTest {

    @Test
    public void shouldBuildConstruct() {
        final BuilderA builderA = new BuilderA();
        final BuilderB builderB = new BuilderB();
        final BuilderC builderC = new BuilderC();
        final Overseer overseer = new Overseer(builderA, builderB, builderC);

        final Product product = overseer.createProduct();

        assertNotNull(product);
        assertNotNull(product.getElementA());
        assertNotNull(product.getElementB());
        assertNotNull(product.getElementC());
    }
}
