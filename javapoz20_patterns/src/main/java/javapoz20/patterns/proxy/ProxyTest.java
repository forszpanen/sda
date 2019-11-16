package javapoz20.patterns.proxy;

public class ProxyTest {
    public static void main(String[] args) {
        SomeWorkingObject workingObject = new SomeWorkingObject();
        Proxy proxy = new Proxy(workingObject);


    }
}
