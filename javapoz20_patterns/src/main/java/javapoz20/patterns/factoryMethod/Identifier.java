package javapoz20.patterns.factoryMethod;

public final class Identifier {
    private final String id;
    private final String type;

    private Identifier(String id, String type) {
        this.id = id;
        this.type = type;
    }

    public static Identifier createPesel(String pesel) {
        return new Identifier(pesel, "PESEL");
    }

    public static Identifier createRegon(String regon) {
        return new Identifier(regon, "REGON");
    }


    public static Identifier createNip(String nip) {
        return new Identifier(nip, "NIP");
    }
}
