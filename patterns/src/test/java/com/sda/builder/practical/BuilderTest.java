package com.sda.builder.practical;

import org.junit.Test;

import java.math.BigDecimal;

import static junit.framework.TestCase.*;

public class BuilderTest {

    @Test
    public void shouldCreateObject() {
        final Product product = Product
                .builder()
                .withParam(true)
                .withConfigurationString("ConfigurationString")
                .withNumber(100)
                .withAnotherObject(new BigDecimal("1000.2"))
                .createProduct();

        assertTrue(product.isParam());
        assertNotNull(product.getConfigurationString());
        assertEquals(100, product.getNumber());
        assertNotNull(product.getAnotherObject());
    }
}
