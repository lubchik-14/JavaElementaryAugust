package com.hillel.lessons.lesson6.loggers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class DelegationLogger implements ILogger {
    private Collection<ILogger> loggers = new ArrayList<>();

    @Override
    public void log(String message) {
        for (ILogger logger : loggers) {
            logger.log(message);
        }
    }

    public void addLogger(ILogger logger) {
        this.loggers.add(logger);
    }

    public void removeLogger(ILogger logger) {
        this.loggers.remove(logger);
    }

    public void replaceLoggers (ILogger[] loggers) {
        this.loggers.clear();
        this.loggers.addAll(Arrays.asList(loggers));
    }
}
