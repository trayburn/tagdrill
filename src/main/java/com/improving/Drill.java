package com.improving;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Drill {
    private final ConsoleInputOutput io;
    private final List<Command> commands;

    public Drill(ConsoleInputOutput io, List<Command> commands) {
        this.io = io;
        this.commands = commands;
    }

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        var drill = context.getBean(Drill.class);
        drill.run();
    }

    public void run() {
        while (true) {
            var foundCommand = false;
            io.displayPrompt();
            var input = io.readInput();
            try {
                for (var cmd : commands) {
                    if (cmd.isValid(input)) {
                        foundCommand = true;
                        cmd.execute(input);
                    }
                }
            } catch (RuntimeException e) {
                io.displayText("Goodbye");
                return;
            }
            if (foundCommand == false) {
                io.displayText(input);
            }
        }
    }
}
