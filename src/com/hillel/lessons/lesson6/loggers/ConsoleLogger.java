package com.hillel.lessons.lesson6.loggers;

/**
 * Logs a message about program execution.
 */
public class ConsoleLogger implements ILogger {
    @Override
    public void log(String message) {
        System.out.println(message);
    }
}
