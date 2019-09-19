package com.hillel.lessons.lesson4.room.devices.laptops;

import com.hillel.lessons.lesson4.room.devices.device.Device;

public class Laptop extends Device {
    private int batteryCapacity;

    public Laptop(String name, String brand, String model, float diagonal, int batteryCapacity) {
        super(name, brand, model, diagonal);
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }
}
