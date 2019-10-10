package com.improving;

import org.springframework.stereotype.Component;

@Component
public class DanceCommand implements Command {
    private final ConsoleInputOutput io;

    public DanceCommand(ConsoleInputOutput io) {
        this.io = io;
    }

    @Override
    public boolean isValid(String input) {
        return input.equalsIgnoreCase("dance");
    }
    @Override
    public void execute(String input) {
        io.displayText("You dance crazy");
    }
}
