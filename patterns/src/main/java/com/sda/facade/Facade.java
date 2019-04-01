package com.sda.facade;

public class Facade {
    private Object1 object1;
    private Object2 object2;
    private Object3 object3;

    public Facade(Object1 object1, Object2 object2, Object3 object3) {
        this.object1 = object1;
        this.object2 = object2;
        this.object3 = object3;
    }

    public void callObject1() {
        object1.call();
    }

    public void callObject2() {
        object2.call();
    }

    public void callObject3() {
        object3.call();
    }

    public void passRottenApple() {
        final Object object = object1.createRottenApple();
        object2.eat(object);
    }
}
