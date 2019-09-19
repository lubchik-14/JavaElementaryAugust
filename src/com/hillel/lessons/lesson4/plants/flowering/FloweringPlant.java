package com.hillel.lessons.lesson4.plants.flowering;

import com.hillel.lessons.lesson4.plants.plant.Plant;

public abstract class FloweringPlant extends Plant {
    private String color;
    private int numberOfFlower;

    public FloweringPlant(String name, int age, String color, double height, int numberOfFlower) {
        super(name, age, height);
        this.color = color;
        this.numberOfFlower = numberOfFlower;
    }

    public abstract void bloom();

    public abstract void makeFruit();

    public String getColor() {
        return color;
    }

    public int getNumberOfFlower() {
        return numberOfFlower;
    }

    @Override
    public String toString() {
        return "FloweringPlant{" + super.toString() +
                "color='" + color + '\'' +
                '}';
    }
}
