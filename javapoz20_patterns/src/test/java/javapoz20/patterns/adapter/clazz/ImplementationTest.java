package javapoz20.patterns.adapter.clazz;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class ImplementationTest {

    @Test
    public void getResultInFloat() {
        OldInterface implementation = new Implementation();
        float result = implementation.getResultInFloat();

        assertTrue(result > 0);
    }

    @Test
    public void getResultInDouble() {
        NewInterface implementation = new Implementation();
        double result = implementation.getResultInDouble();

        assertTrue(result > 0);

    }
}