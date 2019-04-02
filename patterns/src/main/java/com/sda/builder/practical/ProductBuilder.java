package com.sda.builder.practical;

import java.math.BigDecimal;

public class ProductBuilder {
    private boolean param;
    private String configurationString;
    private int number;
    private BigDecimal anotherObject;

    public ProductBuilder withParam(boolean param) {
        this.param = param;
        return this;
    }

    public ProductBuilder withConfigurationString(String configurationString) {
        this.configurationString = configurationString;
        return this;
    }

    public ProductBuilder withNumber(int number) {
        this.number = number;
        return this;
    }

    public ProductBuilder withAnotherObject(BigDecimal anotherObject) {
        this.anotherObject = anotherObject;
        return this;
    }

    public Product createProduct() {
        return new Product(param, configurationString, number, anotherObject);
    }
}