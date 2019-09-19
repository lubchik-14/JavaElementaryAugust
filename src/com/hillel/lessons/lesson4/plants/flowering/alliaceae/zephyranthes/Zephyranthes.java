package com.hillel.lessons.lesson4.plants.flowering.alliaceae.zephyranthes;

import com.hillel.lessons.lesson4.plants.flowering.alliaceae.AlliaceaePlant;

public class Zephyranthes extends AlliaceaePlant {

    public Zephyranthes(String name, int age, String color, double averageBulbDiameter, double height, int numberOfFlower) {
        super(name, age, color, averageBulbDiameter, height, numberOfFlower);
    }
    public void repeatBlooming(){
        bloom();
    }

    @Override
    public void bloom() {

    }

    @Override
    public void makeFruit() {

    }

    @Override
    public void makeOxygen() {

    }
}
