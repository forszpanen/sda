package com.sda.factory;

public interface Factory {

    InputController createInputController();

    MemoryManager createMemoryManager();
}
