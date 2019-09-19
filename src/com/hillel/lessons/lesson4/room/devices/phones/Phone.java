package com.hillel.lessons.lesson4.room.devices.phones;

import com.hillel.lessons.lesson4.room.devices.device.Device;

public abstract class Phone extends Device {
    private int[] networkFrequencies;


    public Phone(String name, String brand, String model, float diagonal, int[] networkFrequencies) {
        super(name, brand, model, diagonal);
        this.networkFrequencies = networkFrequencies;
    }

    public int[] getNetworkFrequencies() {
        return networkFrequencies;
    }

    public void setNetworkFrequencies(int[] networkFrequencies) {
        this.networkFrequencies = networkFrequencies;
    }
}
