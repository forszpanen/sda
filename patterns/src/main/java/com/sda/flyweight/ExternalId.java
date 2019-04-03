package com.sda.flyweight;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public class ExternalId {
    private final static Map<String, ExternalId> ID_MAP = new ConcurrentHashMap<>();
    private final String id;

    private ExternalId(String id) {
        this.id = id;
    }

    public static ExternalId create(String element) {
        return ID_MAP.computeIfAbsent(element, ExternalId::new);
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExternalId that = (ExternalId) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ExternalId{");
        sb.append("id='").append(id).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
