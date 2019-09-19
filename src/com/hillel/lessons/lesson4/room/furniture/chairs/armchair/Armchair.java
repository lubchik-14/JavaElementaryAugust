package com.hillel.lessons.lesson4.room.furniture.chairs.armchair;

import com.hillel.lessons.lesson4.room.furniture.Furniture;

public class Armchair extends Furniture {
    private boolean hasLift;
    private boolean hasTilt;

    public Armchair(String name, int weight, boolean hasLift, boolean hasTilt) {
        super(name, weight);
        this.hasLift = hasLift;
        this.hasTilt = hasTilt;
    }

    public boolean isHasLift() {
        return hasLift;
    }

    public void setHasLift(boolean hasLift) {
        this.hasLift = hasLift;
    }

    public boolean isHasTilt() {
        return hasTilt;
    }

    public void setHasTilt(boolean hasTilt) {
        this.hasTilt = hasTilt;
    }
}
