package javapoz20.patterns.coffemachine;

import java.util.List;
import java.util.Objects;

public class Coffee {
    private List<Ingredient> ingredientList;

    public Coffee(List<Ingredient> ingredientList) {
        this.ingredientList = ingredientList;
    }

    public List<Ingredient> getIngredientList() {
        return ingredientList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coffee coffee = (Coffee) o;
        return Objects.equals(ingredientList, coffee.ingredientList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ingredientList);
    }
}
