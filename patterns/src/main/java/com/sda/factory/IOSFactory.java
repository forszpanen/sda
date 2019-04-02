package com.sda.factory;

public class IOSFactory implements Factory {
    @Override
    public InputController createInputController() {
        return new IphoneInputController();
    }

    @Override
    public MemoryManager createMemoryManager() {
        return new NoMemoryManager();
    }

    private class IphoneInputController implements InputController {
    }

    private class NoMemoryManager implements MemoryManager {
    }
}
