package com.sda.adapter.object;

public class Adapter implements NewInterface {
    private OldInterface oldInterface;

    public Adapter(OldInterface oldInterface) {
        this.oldInterface = oldInterface;
    }

    @Override
    public double getValue() {
        return Double.valueOf(Float.toString(oldInterface.getValue())) * 2.0;
    }
}
