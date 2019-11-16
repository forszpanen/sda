package javapoz20.patterns.flyweight;

public class FlyweightSample {
    public static void main(String[] args) {
        Raport raport = new Raport(MyCompanyIdentifier.myCompanyId(), "Raport1");
        Raport raport2 = new Raport(MyCompanyIdentifier.myCompanyId(), "Raport2");

        System.out.println(raport.getSubject() == raport2.getSubject());
    }
}
