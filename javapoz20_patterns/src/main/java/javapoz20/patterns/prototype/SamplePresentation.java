package javapoz20.patterns.prototype;

public class SamplePresentation {
    public static void main(String[] args) {
        SampleObject object = new SampleObject("Konrad");
        object.makeFun();
        System.out.println("Prototype: " + object);
        SampleObject clone = object.clone();
        System.out.println("Clone: " + clone);

        object.makeFun();
        clone.makeFun();
        System.out.println("Prototype: " + object);
        System.out.println("Clone: " + clone);

    }
}
