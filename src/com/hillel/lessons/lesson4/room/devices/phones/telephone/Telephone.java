package com.hillel.lessons.lesson4.room.devices.phones.telephone;

import com.hillel.lessons.lesson4.room.devices.phones.Phone;

public class Telephone extends Phone {
    private double cordLength;
    private boolean hasAnsweringService;

    public Telephone(String name, String brand, String model, float diagonal, int[] networkFrequencies, double cordLength, boolean hasAnsweringService) {
        super(name, brand, model, diagonal, networkFrequencies);
        this.cordLength = cordLength;
        this.hasAnsweringService = hasAnsweringService;
    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

    public double getCordLength() {
        return cordLength;
    }

    public void setCordLength(double cordLength) {
        this.cordLength = cordLength;
    }

    public boolean isHasAnsweringService() {
        return hasAnsweringService;
    }

    public void setHasAnsweringService(boolean hasAnsweringService) {
        this.hasAnsweringService = hasAnsweringService;
    }
}
