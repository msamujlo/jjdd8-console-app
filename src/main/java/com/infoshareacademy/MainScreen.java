package com.infoshareacademy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainScreen implements ConsoleScreen {

    private static final Logger logger = LoggerFactory.getLogger("CONSOLE_OUT");

    @Override
    public ConsoleScreen next(String userInput) {
        logger.info("userInput:" + userInput);
        if (userInput.equals("2")) {
            return new SubScreen();
        }

        ConsoleScreen screen = new MainScreen();
        return screen;
    }

    @Override
    public void draw() {
        logger.info("\033[H\033[2J");
        logger.info("------------\n");
        logger.info("-  MAIN    -\n");
        logger.info("-  1: main -\n");
        logger.info("-  2: sub  -\n");
        logger.info("-  q: quit -\n");
        logger.info("------------\n");
        logger.info("\n");
        logger.info("select: ");
    }


    public void action() {
        logger.info("com.infoshareacademy.MainScreen::action");
    }
}
