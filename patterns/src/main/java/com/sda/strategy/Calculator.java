package com.sda.strategy;

import java.math.BigDecimal;

public class Calculator {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public BigDecimal doOperation(int a, int b) {
        return strategy.performOperation(a, b);
    }
}
