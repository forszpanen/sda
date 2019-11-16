package javapoz20.patterns.prototype;

import java.util.UUID;

public class SampleObject {
    private String name;

    public SampleObject(String name) {
        this.name = name;
    }

    public void makeFun() {
        name = name + UUID.randomUUID();
    }

    public SampleObject clone() {
        return new SampleObject(name);
    }

    @Override
    public String toString() {
        return name;
    }
}
