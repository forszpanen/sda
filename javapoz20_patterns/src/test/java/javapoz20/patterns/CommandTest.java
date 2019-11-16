package javapoz20.patterns;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class CommandTest {
    private LightBulb bulb;

    @Test
    public void shouldTurnOnTheLight() {
        // Given
        bulb = new LightBulb();

        // When
        bulb.acceptCommand(new LightChange(true));

        // then
        assertTrue(bulb.getLight());
    }


    @Test
    public void shouldTurnOffTheLight() {
        // Given
        bulb = new LightBulb();

        // When
        bulb.acceptCommand(new LightChange(false));

        // then
        assertFalse(bulb.getLight());
    }


    @Test
    public void shouldChangeTheLight() {
        // Given
        bulb = new LightBulb();

        // When
        bulb.acceptCommand(new LightSwitch());

        // then
        assertTrue(bulb.getLight());
    }


    @Test
    public void shouldChangeTheLightComplex() {
        // Given
        bulb = new LightBulb();

        // When
        bulb.acceptCommand(new LightSwitch(),
                new LightChange(false),
                new LightChange(false),
                new LightSwitch());

        // then
        assertTrue(bulb.getLight());
    }

}
