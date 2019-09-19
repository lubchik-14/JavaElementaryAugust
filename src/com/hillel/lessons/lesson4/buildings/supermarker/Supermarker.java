package com.hillel.lessons.lesson4.buildings.supermarker;

import com.hillel.lessons.lesson4.buildings.building.Building;

public class Supermarker extends Building {
    private int airConditioner;

    public Supermarker(int area, int airConditioner) {
        super(area);
        this.airConditioner = airConditioner;
    }

    public int getAirConditioner() {
        return airConditioner;
    }

    public void setAirConditioner(int airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public String toString() {
        return "Supermarker{" + super.toString() +
                "airConditioner=" + airConditioner +
                '}';
    }
}
