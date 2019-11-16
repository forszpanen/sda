package javapoz20.patterns.adapter.clazz;

import java.util.Random;

public class Implementation implements OldInterface, NewInterface {
    private float result = new Random().nextFloat();

    @Override
    public float getResultInFloat() {
        return result;
    }

    @Override
    public double getResultInDouble() {
        return (double) result;
    }
}
