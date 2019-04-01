package com.sda.strategy;

import java.math.BigDecimal;
import java.util.List;

public class AddingStrategy implements Strategy {
    @Override
    public BigDecimal perform(List<Integer> numbers) {
        return numbers.stream().map(BigDecimal::new).reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
