package com.sda.builder.classic;

public class BuilderA {
    public ObjectA create() {
        return new ObjectA();
    }

    public final static class ObjectA {
        private ObjectA() {

        }
    }
}
