package com.sda.strategy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Context {
    private final List<Integer> numbers = new ArrayList<Integer>();
    private Strategy strategy;

    public void fill(int... numbers) {
        IntStream.of(numbers).boxed().forEach(this.numbers::add);
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public BigDecimal getResult() {
        if (strategy != null){
            return strategy.perform(numbers);
        }
        return null;
    }
}
