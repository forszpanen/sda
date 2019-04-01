package com.sda.command;

public class Light {
    private boolean state;

    public Light(boolean state) {
        this.state = state;
    }

    public boolean isOn() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
