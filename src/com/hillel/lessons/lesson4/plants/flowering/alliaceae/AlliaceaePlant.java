package com.hillel.lessons.lesson4.plants.flowering.alliaceae;

import com.hillel.lessons.lesson4.plants.flowering.FloweringPlant;

public abstract class AlliaceaePlant extends FloweringPlant {
    private double averageBulbDiameter;

    public AlliaceaePlant(String name, int age, String color, double averageBulbDiameter, double height, int numberOfFlower) {
        super(name, age, color, height, numberOfFlower);
        this.averageBulbDiameter = averageBulbDiameter;
    }

    public double getAverageBulbDiameter() {
        return averageBulbDiameter;
    }

    @Override
    public String toString() {
        return "AlliaceaePlant{" + super.toString() +
                "averageBulbDiameter=" + averageBulbDiameter +
                '}';
    }
}
