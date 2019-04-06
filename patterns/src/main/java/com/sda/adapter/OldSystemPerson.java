package com.sda.adapter;

public class OldSystemPerson implements NewSystemPerson {
    private final String name;

    public OldSystemPerson(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getFirstName() {
        return null;
    }

    @Override
    public String getLastName() {
        return null;
    }
}
