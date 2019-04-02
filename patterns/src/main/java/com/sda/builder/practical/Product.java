package com.sda.builder.practical;

import java.math.BigDecimal;
import java.util.Objects;

public final class Product {
    private final boolean param;
    private final String configurationString;
    private final int number;
    private final BigDecimal anotherObject;

    Product(boolean param, String configurationString, int number, BigDecimal anotherObject) {
        this.param = param;
        this.configurationString = configurationString;
        this.number = number;
        this.anotherObject = anotherObject;
    }

    public static ProductBuilder builder() {
        return new ProductBuilder();
    }

    public boolean isParam() {
        return param;
    }

    public String getConfigurationString() {
        return configurationString;
    }

    public int getNumber() {
        return number;
    }

    public BigDecimal getAnotherObject() {
        return anotherObject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return param == product.param &&
                number == product.number &&
                Objects.equals(configurationString, product.configurationString) &&
                Objects.equals(anotherObject, product.anotherObject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(param, configurationString, number, anotherObject);
    }

}
