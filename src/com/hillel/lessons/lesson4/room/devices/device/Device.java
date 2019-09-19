package com.hillel.lessons.lesson4.room.devices.device;

public abstract class Device {
    private String name;
    private String brand;
    private String model;
    private float diagonal;

    public Device(String name, String brand, String model, float diagonal) {
        this.name = name;
        this.brand = brand;
        this.model = model;
        this.diagonal = diagonal;
    }

    public abstract void turnOn();
    public abstract void turnOff();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(float diagonal) {
        this.diagonal = diagonal;
    }
}
