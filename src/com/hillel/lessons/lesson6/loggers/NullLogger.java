package com.hillel.lessons.lesson6.loggers;

public class NullLogger implements ILogger {
    @Override
    public void log(String message) {
        //NOTE: intentionally does nothing
    }
}
