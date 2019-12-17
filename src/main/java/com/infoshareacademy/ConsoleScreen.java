package com.infoshareacademy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface ConsoleScreen {

    Logger logger = LoggerFactory.getLogger("CONSOLE_OUT");

    ConsoleScreen next(String userInput);
    void action();
    void draw();
}
