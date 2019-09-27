package com.hillel.lessons.lesson6.sleepers;

public class Sleeper implements ISleeper {
    @Override
    public void sleep(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
