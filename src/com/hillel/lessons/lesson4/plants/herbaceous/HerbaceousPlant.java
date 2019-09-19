package com.hillel.lessons.lesson4.plants.herbaceous;

import com.hillel.lessons.lesson4.plants.plant.Plant;

import java.time.Month;

public abstract class HerbaceousPlant extends Plant {
   private Month germinationMonth;

   private boolean isAnnual;

    public HerbaceousPlant(String name, int age, Month germinationMonth, boolean isAnnual, double height) {
        super(name, age, height);
        this.germinationMonth = germinationMonth;
        this.isAnnual = isAnnual;
    }

    public abstract void makeSmell();

    public Month germinationMonth() {
        return germinationMonth;
    }

    public boolean isAnnual() {
        return isAnnual;
    }

    @Override
    public String toString() {
        return "HerbaceousPlant{" + super.toString() +
                "germinationDate=" + germinationMonth +
                ", isAnnual=" + isAnnual +
                '}';
    }
}
