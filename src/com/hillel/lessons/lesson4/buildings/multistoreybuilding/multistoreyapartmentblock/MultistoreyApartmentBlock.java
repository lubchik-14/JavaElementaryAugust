package com.hillel.lessons.lesson4.buildings.multistoreybuilding.multistoreyapartmentblock;

import com.hillel.lessons.lesson4.buildings.multistoreybuilding.MultistoreyBuilding;

public class MultistoreyApartmentBlock extends MultistoreyBuilding {
    private int bathroomByApartment;

    public MultistoreyApartmentBlock(int area, int floorQuantity, int elevatorQuantity, int fireEscapeQuantity, int bathroomByApartment) {
        super(area, floorQuantity, elevatorQuantity, fireEscapeQuantity);
        this.bathroomByApartment = bathroomByApartment;
    }

    public int getBathroomByApartment() {
        return bathroomByApartment;
    }

    public void setBathroomByApartment(int bathroomByApartment) {
        this.bathroomByApartment = bathroomByApartment;
    }

    @Override
    public String toString() {
        return "MultistoreyApartmentBlock{" + super.toString() +
                "bathroomByApartment=" + bathroomByApartment +
                '}';
    }
}
