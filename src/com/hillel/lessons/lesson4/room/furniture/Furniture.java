package com.hillel.lessons.lesson4.room.furniture;

public abstract class Furniture {
    private String name;
    private int weight;

    public Furniture(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public void move(){}
    public void crash(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
