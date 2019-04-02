package com.sda.adapter.clazz;

public class Adapter implements OldInterface, NewInterface {

    @Override
    public double getDoubleValue() {
        return Double.valueOf(Float.toString(getFloatValue())) * 2.0;
    }

    @Override
    public float getFloatValue() {
        return 15.0f;
    }
}
