package javapoz20.patterns;

public class LightBulb {
    private boolean light = false;

    public void acceptCommand(Command... commands) {
        for (Command comm : commands) {
            light = comm.changeLight(light);
        }
    }

    public boolean getLight() {
        return light;
    }

}
