package com.sda.proxy;

import java.util.function.Supplier;

public class Proxy implements ObjectInterface {
    private final Supplier<ObjectInterface> supplier;
    private ObjectInterface internal;

    public Proxy(Supplier<ObjectInterface> supplier) {
        this.supplier = supplier;
    }

    @Override
    public void someHeavyLogic() {
        if (internal == null) {
            internal = supplier.get();
        }
        internal.someHeavyLogic();
    }
}
