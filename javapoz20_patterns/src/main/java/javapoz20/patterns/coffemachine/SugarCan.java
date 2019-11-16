package javapoz20.patterns.coffemachine;

import java.math.BigDecimal;

public class SugarCan {
    public void addSugar(Coffee coffee) {
        coffee.getIngredientList().add(new Ingredient("sugar", BigDecimal.ONE));
    }
}
