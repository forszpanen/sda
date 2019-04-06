package com.sda.proxy;

import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

public class ObjectImplementation implements ObjectInterface {
    @Override
    public String getName() {
        return "Trudne obliczenia";
    }

    @Override
    public BigDecimal getResult() {
        try {
            TimeUnit.SECONDS.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return BigDecimal.ONE;
    }
}
