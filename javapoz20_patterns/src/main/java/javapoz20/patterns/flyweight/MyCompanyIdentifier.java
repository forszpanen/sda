package javapoz20.patterns.flyweight;

import javapoz20.patterns.factoryMethod.Identifier;

public class MyCompanyIdentifier {

    private static Identifier nip = Identifier.createNip("7811804718");

    public static Identifier myCompanyId() {
        return nip;
    }
}
