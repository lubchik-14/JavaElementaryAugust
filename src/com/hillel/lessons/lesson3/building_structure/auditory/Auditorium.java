package com.hillel.lessons.lesson3.building_structure.auditory;

public class Auditorium {
    private int number;

    public Auditorium(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Auditorium{" +
                "number=" + number +
                '}';
    }
}
