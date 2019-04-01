package com.sda.facade;

import org.junit.Test;
import org.mockito.Mockito;

public class FacadeTest {

    @Test
    public void testFacadeObject1() {
        final Object1 object1 = Mockito.spy(new Object1());
        final Object2 object2 = Mockito.spy(new Object2());
        final Object3 object3 = Mockito.spy(new Object3());
        final Facade facade = new Facade(object1, object2, object3);

        facade.callObject1();

        Mockito.verify(object1).call();
    }

    @Test
    public void testFacadeObject2() {
        final Object1 object1 = Mockito.spy(new Object1());
        final Object2 object2 = Mockito.spy(new Object2());
        final Object3 object3 = Mockito.spy(new Object3());
        final Facade facade = new Facade(object1, object2, object3);

        facade.callObject2();

        Mockito.verify(object2).call();
    }


    @Test
    public void testFacadeObject3() {
        final Object1 object1 = Mockito.spy(new Object1());
        final Object2 object2 = Mockito.spy(new Object2());
        final Object3 object3 = Mockito.spy(new Object3());
        final Facade facade = new Facade(object1, object2, object3);

        facade.callObject3();

        Mockito.verify(object3).call();
    }

    @Test
    public void testFacadeInternalOperation() {
        final Object1 object1 = Mockito.spy(new Object1());
        final Object2 object2 = Mockito.spy(new Object2());
        final Object3 object3 = Mockito.spy(new Object3());
        final Facade facade = new Facade(object1, object2, object3);

        facade.passRottenApple();

        Mockito.verify(object1).createRottenApple();
        Mockito.verify(object2).eat(Mockito.any());
    }
}
