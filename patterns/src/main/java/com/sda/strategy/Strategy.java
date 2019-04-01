package com.sda.strategy;

import java.math.BigDecimal;
import java.util.List;

public interface Strategy {
    BigDecimal perform(List<Integer> numbers);
}
