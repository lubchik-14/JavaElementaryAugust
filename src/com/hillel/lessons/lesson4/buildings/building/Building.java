package com.hillel.lessons.lesson4.buildings.building;

public abstract class Building {
    private int area;

    public Building(int area) {
        this.area = area;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Building{" +
                "area=" + area +
                '}';
    }
}
