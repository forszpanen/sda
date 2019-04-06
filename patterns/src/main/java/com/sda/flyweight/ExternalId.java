package com.sda.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ExternalId {
    private static final Map<String, ExternalId> PESEL_CACHE = new HashMap<>();
    private final String type;
    private final String id;

    private ExternalId(String type, String id) {
        this.type = type;
        this.id = id;
    }

    public static ExternalId createPesel(String id) {
        if (PESEL_CACHE.containsKey(id)) {
            return PESEL_CACHE.get(id);
        }
        ExternalId pesel = new ExternalId("PESEL", id);
        PESEL_CACHE.put(id, pesel);
        return pesel;
    }

    public static ExternalId createNip(String id) {
        return new ExternalId("NIP", id);
    }

    public static ExternalId createRegon(String id) {
        return new ExternalId("REGON", id);
    }


    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ExternalId{" +
                "type='" + type + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public ExternalId clone(String id) {
        return new ExternalId(getType(), id);
    }
}
