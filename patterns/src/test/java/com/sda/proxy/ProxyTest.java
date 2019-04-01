package com.sda.proxy;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.function.Supplier;

import static org.junit.Assert.assertTrue;

public class ProxyTest {

    @Test
    public void shouldCreateObject() {
        Supplier<ObjectInterface> supplier = Mockito.spy(new SpySupplier());
        ObjectInterface object = new Proxy(supplier);

        assertTrue(object != null);
        Mockito.verify(supplier, Mockito.never()).get();
    }

    @Test
    public void shouldCreateObjectAsLogicIsCalled() {
        Supplier<ObjectInterface> supplier = Mockito.spy(new SpySupplier());
        ObjectInterface object = new Proxy(supplier);

        object.someHeavyLogic();

        assertTrue(object != null);
        Mockito.verify(supplier).get();
    }

    private class SpySupplier implements Supplier<ObjectInterface> {

        @Override
        public ObjectInterface get() {
            return new RealObject();
        }
    }
}
