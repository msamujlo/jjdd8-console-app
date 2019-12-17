package com.infoshareacademy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SubScreen implements ConsoleScreen {

    private static final Logger logger = LoggerFactory.getLogger("CONSOLE_OUT");

    @Override
    public ConsoleScreen next(String input) {
        MainScreen mainScreen = new MainScreen();
        return mainScreen;
    }

    @Override
    public void action() {
        logger.info("com.infoshareacademy.SubScreen::action");
    }

    @Override
    public void draw() {
        logger.info("\033[H\033[2J");
        logger.info("------------\n");
        logger.info("-  SUBMENU -\n");
        logger.info("-  1: main -\n");
        logger.info("-  2: sub  -\n");
        logger.info("-  q: quit -\n");
        logger.info("------------\n");
        logger.info("\n");
        logger.info("select: ");
    }


}
