package com.hillel.lessons.lesson6.observers;

public class Chart implements ITickGeneratorObserver {
    @Override
    public void onTick() {
        renderChart();
    }

    private void renderChart() {
        System.out.println("Render chart");
        //TODO render chart
    }
}
