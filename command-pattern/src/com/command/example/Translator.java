package com.command.example;

import java.util.ArrayList;
import java.util.List;

//Invoker
public class Translator {
    private final List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void executeCommands() {
        for (Command command : commands) {
            command.execute();
        }
        commands.clear();
    }

}
