package com.hillel.lessons.lesson4.buildings.multistoreybuilding.skyscraper;

import com.hillel.lessons.lesson4.buildings.multistoreybuilding.MultistoreyBuilding;

public class Skyscraper extends MultistoreyBuilding {
    private int officeQuantity;

    public Skyscraper(int area, int floorQuantity, int elevatorQuantity, int fireEscapeQuantity, int officeQuantity) {
        super(area, floorQuantity, elevatorQuantity, fireEscapeQuantity);
        this.officeQuantity = officeQuantity;
    }

    public int getOfficeQuantity() {
        return officeQuantity;
    }

    public void setOfficeQuantity(int officeQuantity) {
        this.officeQuantity = officeQuantity;
    }

    @Override
    public String toString() {
        return "Skyscraper{" + super.toString() +
                "officeQuantity=" + officeQuantity +
                '}';
    }
}
