package com.sda.bridge;

public class Implementor1 implements InternalOperations {
    private boolean op1 = false;
    private boolean op2 = false;

    public void operation1() {
        op1 = true;
    }

    public void operation2() {
        op2 = true;
    }

    public boolean wasOperation1Called() {
        return op1;
    }

    public boolean wasOperation2Called() {
        return op2;
    }
}

