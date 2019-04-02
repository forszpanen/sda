package com.sda.builder.classic;

public class BuilderC {
    public BuilderC.ObjectC create() {
        return new BuilderC.ObjectC();
    }

    public final static class ObjectC {
        private ObjectC() {

        }
    }

}
