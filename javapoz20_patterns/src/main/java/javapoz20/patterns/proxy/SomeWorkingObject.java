package javapoz20.patterns.proxy;

import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SomeWorkingObject implements ObjectInterface {


    private String veryLong;

    public void init() {
        veryLong = Stream
                .generate(() -> UUID.randomUUID().toString())
                .limit(100000)
                .collect(Collectors.joining());
    }

    @Override
    public String quickMethod() {
        return "someString";
    }

    @Override
    public String longMethod() {
        return veryLong;
    }
}
