package javapoz20.patterns.coffemachine;

import java.math.BigDecimal;
import java.util.Objects;

public class Ingredient {
    private String name;
    private BigDecimal quantity;

    public Ingredient(String name, BigDecimal quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingredient that = (Ingredient) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(quantity, that.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, quantity);
    }
}
