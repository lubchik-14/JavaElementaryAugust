package com.hillel.lessons.lesson4.buildings.multistoreybuilding;

import com.hillel.lessons.lesson4.buildings.building.Building;

public abstract class MultistoreyBuilding extends Building {
    private int floorQuantity;
    private int elevatorQuantity;
    private int FireEscapeQuantity;

    public MultistoreyBuilding(int area, int floorQuantity, int elevatorQuantity, int fireEscapeQuantity) {
        super(area);
        this.floorQuantity = floorQuantity;
        this.elevatorQuantity = elevatorQuantity;
        FireEscapeQuantity = fireEscapeQuantity;
    }

    public int getFloorQuantity() {
        return floorQuantity;
    }

    public void setFloorQuantity(int floorQuantity) {
        this.floorQuantity = floorQuantity;
    }

    public int getElevatorQuantity() {
        return elevatorQuantity;
    }

    public void setElevatorQuantity(int elevatorQuantity) {
        this.elevatorQuantity = elevatorQuantity;
    }

    public int getFireEscapeQuantity() {
        return FireEscapeQuantity;
    }

    public void setFireEscapeQuantity(int fireEscapeQuantity) {
        FireEscapeQuantity = fireEscapeQuantity;
    }

    @Override
    public String toString() {
        return "MultistoreyBuilding{" + super.toString() +
                "floorQuantity=" + floorQuantity +
                ", elevatorQuantity=" + elevatorQuantity +
                ", FireEscapeQuantity=" + FireEscapeQuantity +
                '}';
    }
}
