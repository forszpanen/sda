package com.sda.proxy;

import java.math.BigDecimal;

public class Proxy implements ObjectInterface {
    private final ObjectInterface object;

    public Proxy(ObjectInterface object) {
        this.object = object;
    }

    @Override
    public String getName() {
        return object.getName();
    }

    @Override
    public BigDecimal getResult() {
        return object.getResult();
    }
}
