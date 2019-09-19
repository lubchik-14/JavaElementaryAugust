package com.hillel.lessons.lesson4.plants.plant;

public abstract class Plant {
    private String name;
    private int age;
    private double height;

    public Plant(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract void makeOxygen();

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
