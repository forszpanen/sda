package javapoz20.patterns.flyweight;

import javapoz20.patterns.factoryMethod.Identifier;

public class Raport {
    private final Identifier subject;
    private final String data;

    public Raport(Identifier subject, String data) {
        this.subject = subject;
        this.data = data;
    }

    public Identifier getSubject() {
        return subject;
    }

    public String getData() {
        return data;
    }
}
