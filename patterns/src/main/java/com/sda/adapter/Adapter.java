package com.sda.adapter;

public class Adapter implements NewSystemPerson {
    public Adapter(OldSystemPerson oldSystemPerson) {
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
