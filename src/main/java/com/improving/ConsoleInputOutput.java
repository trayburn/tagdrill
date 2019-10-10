package com.improving;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ConsoleInputOutput {
    private Scanner scanner = new Scanner(System.in);

    public String readInput() {
        return scanner.nextLine();
    }
    public void displayPrompt() {
        System.out.print("> ");
    }
    public void displayText(String text) {
        System.out.println(text);
    }
}
