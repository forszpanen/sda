package com.sda.command;

public class TurnOffLight implements Command {
    private Light light;

    public TurnOffLight(Light light) {
        this.light = light;
    }

    @Override
    public void perform() {
        if (light != null) {
            light.setState(false);
        }

    }
}
