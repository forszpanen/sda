package javapoz20.patterns.coffemachine;

import java.math.BigDecimal;

public class MilkCarton {

    public void addMilk(Coffee coffee) {
        coffee.getIngredientList().add(new Ingredient("milk", new BigDecimal("10")));
    }
}
