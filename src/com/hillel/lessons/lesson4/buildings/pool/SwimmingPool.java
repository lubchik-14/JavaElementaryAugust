package com.hillel.lessons.lesson4.buildings.pool;

import com.hillel.lessons.lesson4.buildings.building.Building;

public class SwimmingPool extends Building {
    private int platformQuantity;
    private double poolDeep;

    public SwimmingPool(int area, int platformQuantity, double poolDeep) {
        super(area);
        this.platformQuantity = platformQuantity;
        this.poolDeep = poolDeep;
    }

    public int getPlatformQuantity() {
        return platformQuantity;
    }

    public void setPlatformQuantity(int platformQuantity) {
        this.platformQuantity = platformQuantity;
    }

    public double getPoolDeep() {
        return poolDeep;
    }

    public void setPoolDeep(double poolDeep) {
        this.poolDeep = poolDeep;
    }

    @Override
    public String toString() {
        return "SwimmingPool{" + super.toString() +
                "platformQuantity=" + platformQuantity +
                ", poolDeep=" + poolDeep +
                '}';
    }
}
