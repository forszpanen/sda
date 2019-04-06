package com.sda.strategy;

import java.math.BigDecimal;

public class Calculator {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public BigDecimal doOperation(int a, int b) {
        if (strategy == null){
            throw new NullPointerException("Strategy has not been set.");
        }
        return strategy.performOperation(a, b);
    }

}
