package javapoz20.patterns.proxy;

public class Proxy implements ObjectInterface {
    private SomeWorkingObject workingObject;

    public Proxy(SomeWorkingObject workingObject) {
        this.workingObject = workingObject;
    }

    @Override
    public String quickMethod() {
        return workingObject.quickMethod();
    }

    @Override
    public String longMethod() {
        workingObject.init();
        return workingObject.longMethod();
    }
}
