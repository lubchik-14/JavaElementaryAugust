package com.hillel.lessons.lesson6.services;

import com.hillel.lessons.lesson6.loggers.ILogger;

public class AuthenticationService {
    private final ILogger logger;

    public AuthenticationService(ILogger logger) {
        this.logger = logger;
    }

    public void authenticate(String username, String password){
        logger.log("User " + username + " with password " + password + " is trying to authenticate");

        //TODO send command to web server
    }
}
