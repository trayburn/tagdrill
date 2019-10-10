package com.improving;

import org.springframework.stereotype.Component;

import javax.naming.OperationNotSupportedException;

@Component
public class ExitCommand implements Command {
    @Override
    public boolean isValid(String input) {
        return input.equalsIgnoreCase("exit");
    }

    @Override
    public void execute(String input) {
        throw new RuntimeException();
    }
}
