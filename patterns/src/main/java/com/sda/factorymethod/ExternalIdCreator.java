package com.sda.factorymethod;

import java.util.UUID;

public class ExternalIdCreator {
    public static ExternalId createXId(int number) {
        return new ExternalId(Supplier.X, Integer.toString(number));
    }

    public static ExternalId createYId(UUID id) {
        if (id == null) {
            throw new NullPointerException("Id is null");
        }
        return new ExternalId(Supplier.Y, id.toString());
    }
}
