package com.sda.factorymethod;

import java.util.Objects;

public final class ExternalId {
    private final Supplier supplier;
    private final String id;

    ExternalId(Supplier supplier, String id) {
        this.supplier = supplier;
        this.id = id;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExternalId that = (ExternalId) o;
        return supplier == that.supplier &&
                id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(supplier, id);
    }

    @Override
    public String toString() {
        return "ExternalId{" +
                "supplier=" + supplier +
                ", id='" + id + '\'' +
                '}';
    }
}
