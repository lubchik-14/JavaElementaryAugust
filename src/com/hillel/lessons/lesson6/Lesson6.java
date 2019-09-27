package com.hillel.lessons.lesson6;

import com.hillel.lessons.lesson6.generators.*;
import com.hillel.lessons.lesson6.loggers.*;
import com.hillel.lessons.lesson6.observers.Chart;
import com.hillel.lessons.lesson6.observers.Clock;
import com.hillel.lessons.lesson6.observers.DelegatingTickGeneratorObserver;
import com.hillel.lessons.lesson6.observers.ITickGeneratorObserver;
import com.hillel.lessons.lesson6.services.AuthenticationService;
import com.hillel.lessons.lesson6.sleepers.Sleeper;

public class Lesson6 {
    public static void main(String[] args) {
        ILogger logger1 = new ConsoleLogger();
        ILogger logger2 = new FileLogger();
        ILogger logger3 = new MysqlDirectLogger();
        ILogger logger4 = new NullLogger();
        ILogger logger = new DelegationLogger();

        AuthenticationService authenticationService = new AuthenticationService(logger);
        authenticationService.authenticate("Luba", "123456");

        Clock clock = new Clock();
        Chart chart = new Chart();
        ITickGeneratorObserver observer = new DelegatingTickGeneratorObserver(new ITickGeneratorObserver[]{chart, clock});

        ITickGenerator generator = new SecondGenerator(new Sleeper(), observer);
        generator.start();
    }

}
