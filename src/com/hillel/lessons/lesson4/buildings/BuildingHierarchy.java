package com.hillel.lessons.lesson4.buildings;

import com.hillel.lessons.lesson4.buildings.building.Building;
import com.hillel.lessons.lesson4.buildings.multistoreybuilding.hospital.Hospital;
import com.hillel.lessons.lesson4.buildings.multistoreybuilding.multistoreyapartmentblock.MultistoreyApartmentBlock;
import com.hillel.lessons.lesson4.buildings.pool.SwimmingPool;

public class BuildingHierarchy {
    public static void main(String[] args) {
        Building regionalHospital = new Hospital(1000, 5, 10, 50, 20, 100);
        Building sparrowsMountings = new MultistoreyApartmentBlock(5000, 15, 1, 2, 10);
        SwimmingPool safari = new SwimmingPool(200, 5, 25);
        System.out.println(regionalHospital);
        System.out.println(sparrowsMountings);
        System.out.println(safari);
    }
}
