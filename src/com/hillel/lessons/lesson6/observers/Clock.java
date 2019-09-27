package com.hillel.lessons.lesson6.observers;

public class Clock implements ITickGeneratorObserver {
    @Override
    public void onTick() {
        renderClock();
    }

    private void renderClock() {
        System.out.println("Render clock");
        //TODO render clock
    }
}
