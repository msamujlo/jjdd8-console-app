package com.infoshareacademy;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = "";
        ConsoleScreen currentScreen = new MainScreen();
        while (!line.equals("q") && !line.equals("quit")) {
            currentScreen.draw();
            line = scanner.nextLine();
            currentScreen = currentScreen.next(line);
            currentScreen.action();
        }
    }
}
