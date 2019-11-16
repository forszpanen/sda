package javapoz20.patterns;

public class LightSwitch implements Command {
    @Override
    public boolean changeLight(boolean currentLight) {
        return !currentLight;
    }
}
