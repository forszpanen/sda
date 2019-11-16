package javapoz20.patterns.coffemachine;

import java.math.BigDecimal;

public class ItalianExpress {

    public void createEspresso(Coffee coffee) {
        coffee.getIngredientList().add(new Ingredient("espresso", new BigDecimal(10)));
    }
}
