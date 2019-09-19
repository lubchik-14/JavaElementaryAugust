package com.hillel.lessons.lesson4.room.furniture.tables.coffeetable;

import com.hillel.lessons.lesson4.room.furniture.Furniture;

public class CoffeeTable extends Furniture {
    private int wheel;

    public CoffeeTable(String name, int weight, int wheel) {
        super(name, weight);
        this.wheel = wheel;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }
}
