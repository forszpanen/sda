package com.sda.decorator;

public class NameSurnameProvider implements ObjectInterface {
    private final NameProvider nameProvider;

    public NameSurnameProvider(NameProvider nameProvider) {
        this.nameProvider = nameProvider;
    }

    @Override
    public String getName() {
        return nameProvider.getName() + " Kozikowski";
    }
}
