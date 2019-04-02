package com.sda.factory;

public class AndroidFactory implements Factory {
    @Override
    public InputController createInputController() {
        return new AndroidInputController();
    }

    @Override
    public MemoryManager createMemoryManager() {
        return new AndroidMemoryManager();
    }

    private class AndroidInputController implements InputController {
    }

    private class AndroidMemoryManager implements MemoryManager {
    }
}
