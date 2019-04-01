package com.sda.decorator;

public class Decorator implements SomeObject {
    private final SomeObject object;

    public Decorator(SomeObject object) {
        this.object = object;
    }

    @Override
    public String presentYourself() {
        return "Hello " + object.presentYourself();
    }
}
