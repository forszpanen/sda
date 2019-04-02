package com.sda.factorymethod;

import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.assertEquals;

public class FactoryMethodTest {

    @Test
    public void shouldCreateXSupplierId() {
        final ExternalId id = ExternalIdCreator.createXId(1235);

        assertEquals(Supplier.X, id.getSupplier());
        assertEquals("1235", id.getId());
    }

    @Test
    public void shouldCreateYSupplierId() {
        final ExternalId id = ExternalIdCreator.createYId(UUID.fromString("38400000-8cf0-11bd-b23e-10b96e4ef00d"));

        assertEquals(Supplier.Y, id.getSupplier());
        assertEquals("38400000-8cf0-11bd-b23e-10b96e4ef00d", id.getId());
    }
}
