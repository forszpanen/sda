package com.sda.command;

public class TurnOnLight implements Command {
    private Light light;

    public TurnOnLight(Light light) {
        this.light = light;
    }

    @Override
    public void perform() {
        if (light != null) {
            light.setState(true);
        }
    }
}
