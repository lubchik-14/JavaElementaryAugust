package com.hillel.lessons.lesson6.observers;

public class DelegatingTickGeneratorObserver implements ITickGeneratorObserver {
    private final ITickGeneratorObserver[] observers;

    public DelegatingTickGeneratorObserver(ITickGeneratorObserver[] observers) {
        this.observers = observers;
    }

    @Override
    public void onTick() {
        for (ITickGeneratorObserver observer : observers) {
            observer.onTick();
        }
    }
}
