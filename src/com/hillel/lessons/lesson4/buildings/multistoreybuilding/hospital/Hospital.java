package com.hillel.lessons.lesson4.buildings.multistoreybuilding.hospital;

import com.hillel.lessons.lesson4.buildings.multistoreybuilding.MultistoreyBuilding;

public class Hospital extends MultistoreyBuilding {
    private float morgueArea;
    private int emergencyDoorQuantity;

    public Hospital(int area, int floorQuantity, int elevatorQuantity, int fireEscapeQuantity, float morgueArea, int emergencyDoorQuantity) {
        super(area, floorQuantity, elevatorQuantity, fireEscapeQuantity);
        this.morgueArea = morgueArea;
        this.emergencyDoorQuantity = emergencyDoorQuantity;
    }

    public float getMorgueArea() {
        return morgueArea;
    }

    public void setMorgueArea(float morgueArea) {
        this.morgueArea = morgueArea;
    }

    public int getEmergencyDoorQuantity() {
        return emergencyDoorQuantity;
    }

    public void setEmergencyDoorQuantity(int emergencyDoorQuantity) {
        this.emergencyDoorQuantity = emergencyDoorQuantity;
    }

    @Override
    public String toString() {
        return "Hospital{" + super.toString() +
                ", morgueArea=" + morgueArea +
                ", emergencyDoorQuantity=" + emergencyDoorQuantity +
                '}';
    }
}
