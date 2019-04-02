package com.sda.builder.classic;

public class BuilderB {
    public BuilderB.ObjectB create() {
        return new BuilderB.ObjectB();
    }

    public final static class ObjectB {
        private ObjectB() {

        }
    }
}
