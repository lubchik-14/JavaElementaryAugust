package com.hillel.lessons.lesson6.generators;

import com.hillel.lessons.lesson6.observers.ITickGeneratorObserver;
import com.hillel.lessons.lesson6.sleepers.ISleeper;

public class SecondGenerator implements ITickGenerator {
    private final ISleeper sleeper;
    private final ITickGeneratorObserver observer;
    private boolean shouldStop = false;

    public SecondGenerator(ISleeper sleeper, ITickGeneratorObserver observer) {
        this.sleeper = sleeper;
        this.observer = observer;
    }


    @Override
    public void start() {
        while (!shouldStop) {
            sleeper.sleep(1000);
            observer.onTick();
            //TODO some work
        }
    }

    @Override
    public void stop() {
        shouldStop = true;
    }
}
