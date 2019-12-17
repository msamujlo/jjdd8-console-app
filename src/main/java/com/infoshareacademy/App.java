package com.infoshareacademy;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = "";

        // przygotuj startowy ekran
        ConsoleScreen currentScreen = new MainScreen();
        while (!line.equals("q") && !line.equals("quit")) {
            // narysuj ekran
            currentScreen.draw();
            line = scanner.nextLine();
            // na podstawie wejścia użytkownika przygotuj następny ekran
            currentScreen = currentScreen.next(line);
            // wykonaj akcję następnego ekranu n.p. wyszukaj listę książęk
            currentScreen.action();
        }
    }
}
