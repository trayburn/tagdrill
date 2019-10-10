package com.improving;

public interface Command {
    boolean isValid(String input);

    void execute(String input);
}
