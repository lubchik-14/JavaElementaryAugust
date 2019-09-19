package com.hillel.lessons.lesson4.plants.flowering.rose;

import com.hillel.lessons.lesson4.plants.flowering.FloweringPlant;

public class Rose extends FloweringPlant {
    private boolean hasThorn;

    public Rose(String name, int age, String color, boolean hasThorn, double height, int numberOfFlower) {
        super(name, age, color, height, numberOfFlower);
        this.hasThorn = hasThorn;
    }

    public void breakSkin(){
        if (hasThorn) {
            System.out.println("Your skin is broke. Ha ha");
        }
    }

    @Override
    public void bloom() {
        System.out.println("Roses blooming is so beautiful");
    }

    @Override
    public void makeFruit() {
        System.out.println("You can make sour tea use these fruits");
    }

    @Override
    public void makeOxygen() {

    }

    @Override
    public String toString() {
        return "Rose{" + super.toString() +
                "hasThorn=" + hasThorn +
                '}';
    }
}
