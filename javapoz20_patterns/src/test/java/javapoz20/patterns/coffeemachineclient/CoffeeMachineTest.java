package javapoz20.patterns.coffeemachineclient;

import javapoz20.patterns.coffemachine.Coffee;
import javapoz20.patterns.coffemachine.CoffeeMachine;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class CoffeeMachineTest {

    @Test
    public void shouldCreateEspresso() {
        CoffeeMachine coffeeMachine = CoffeeMachine.createCoffeeMachine();

        Coffee espresso = coffeeMachine.createEspresso();

        assertNotNull(espresso);
    }
}
