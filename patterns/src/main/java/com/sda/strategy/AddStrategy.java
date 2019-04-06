package com.sda.strategy;

import java.math.BigDecimal;

public class AddStrategy implements Strategy {
    public BigDecimal performOperation(int a, int b) {
        BigDecimal aBd = new BigDecimal(a);
        BigDecimal bBd = new BigDecimal(b);
        return aBd.add(bBd);
    }
}
