package com.hillel.lessons.lesson4.room.furniture.chairs.paddedstool;

import com.hillel.lessons.lesson4.room.furniture.Furniture;

public class PaddedStool extends Furniture {
    private double capacity;

    public PaddedStool(String name, int weight, double capacity) {
        super(name, weight);
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }
}