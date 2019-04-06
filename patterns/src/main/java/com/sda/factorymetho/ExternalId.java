package com.sda.factorymetho;

public class ExternalId {
    private final String type;
    private final String id;

    private ExternalId(String type, String id) {
        this.type = type;
        this.id = id;
    }

    public static ExternalId createPesel(String id) {
        return new ExternalId("PESEL", id);
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
