package javapoz20.patterns;

public class LightChange implements Command {


    private boolean status;

    public LightChange(boolean status) {
        this.status = status;
    }

    @Override
    public boolean changeLight(boolean currentLight) {
        if (status) {
            return true;
        }
        return false;
    }
}
