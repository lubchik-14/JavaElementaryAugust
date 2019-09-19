package com.hillel.lessons.lesson4.plants.herbaceous.garlic;

import com.hillel.lessons.lesson4.plants.herbaceous.HerbaceousPlant;

import java.time.Month;

public class Garlic extends HerbaceousPlant {

    private int numberOfCloves;

    public Garlic(String name, int age, Month germinationMonth, boolean isAnnual, double height, int numberOfCloves) {
        super(name, age, germinationMonth, isAnnual, height);
        this.numberOfCloves = numberOfCloves;
    }

    @Override
    public void makeOxygen() {

    }

    @Override
    public void makeSmell() {

    }

    public int getNumberOfCloves() {
        return numberOfCloves;
    }

    @Override
    public String toString() {
        return "Garlic{" + super.toString() +
                "numberOfCloves=" + numberOfCloves +
                '}';
    }
}
