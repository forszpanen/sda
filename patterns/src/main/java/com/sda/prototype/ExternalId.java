package com.sda.prototype;

public class ExternalId {
    private final String type;
    private final String id;

    public ExternalId(String type, String id) {
        this.type = type;
        this.id = id;
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
