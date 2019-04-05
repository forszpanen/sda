package com.sda.bridge;

public class BridgeObject implements BridgeInterface
{
    private InternalOperations bridge;

    public BridgeObject(InternalOperations bridge)
    {
        this.bridge = bridge;
    }

    public void callOperation1()
    {
        this.bridge.operation1();
    }

    public void callOperation2()
    {
        this.bridge.operation2();
    }
}
