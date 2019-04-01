package com.sda.command;

import java.util.ArrayList;
import java.util.List;

public class CommandSequence {
    private final List<Command> commands = new ArrayList<>();

    public void add(Command command) {
        commands.add(command);
    }

    public void perform() {
        commands.forEach(Command::perform);
    }
}
