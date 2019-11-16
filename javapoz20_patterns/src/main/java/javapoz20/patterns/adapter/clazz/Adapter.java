package javapoz20.patterns.adapter.clazz;

public class Adapter implements NewInterface {
    private OldInterface oldInterface;

    public Adapter(OldInterface oldInterface) {
        this.oldInterface = oldInterface;
    }


    @Override
    public double getResultInDouble() {
        return (double) oldInterface.getResultInFloat();
    }
}
