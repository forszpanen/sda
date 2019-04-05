package com.sda.bridge;

import java.util.function.BooleanSupplier;

public abstract class AbstractAccount {

    private boolean lastOperation;

    // the logging part is delegated to the Logger implementation
    protected void operate(String message, BooleanSupplier action) {
        lastOperation = action.getAsBoolean();
    }

    public boolean hasLastOperationSuccedded() {
        return lastOperation;
    }
}
