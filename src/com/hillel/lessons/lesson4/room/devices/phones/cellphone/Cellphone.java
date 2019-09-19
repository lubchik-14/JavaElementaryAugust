package com.hillel.lessons.lesson4.room.devices.phones.cellphone;

import com.hillel.lessons.lesson4.room.devices.phones.Phone;

public class Cellphone extends Phone {
    private boolean hasStylus;

    public Cellphone(String name, String brand, String model, float diagonal, int[] networkFrequencies, boolean hasStylus) {
        super(name, brand, model, diagonal, networkFrequencies);
        this.hasStylus = hasStylus;
    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

    public boolean isHasStylus() {
        return hasStylus;
    }

    public void setHasStylus(boolean hasStylus) {
        this.hasStylus = hasStylus;
    }
}
