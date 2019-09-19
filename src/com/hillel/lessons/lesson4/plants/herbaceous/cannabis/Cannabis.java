package com.hillel.lessons.lesson4.plants.herbaceous.cannabis;

import com.hillel.lessons.lesson4.plants.herbaceous.HerbaceousPlant;
import com.hillel.lessons.lesson4.room.people.gender.Gender;

import java.time.Month;

public class Cannabis extends HerbaceousPlant {
    private Gender gender;
    private int tHC;

    public Cannabis(String name, int age, Month germinationMonth, boolean isAnnual, Gender gender, int tHC, double height) {
        super(name, age, germinationMonth, isAnnual, height);
        this.gender = gender;
        this.tHC = tHC;
    }

    @Override
    public void makeOxygen() {

    }

    public void makePsychoactiveEffect(){
        System.out.println("Now you are watching at a colorful unicorn!");
    }

    @Override
    public void makeSmell() {

    }

    @Override
    public String toString() {
        return "Cannabis{" + super.toString() +
                "gender='" + gender + '\'' +
                ", tHC=" + tHC +
                '}';
    }
}
