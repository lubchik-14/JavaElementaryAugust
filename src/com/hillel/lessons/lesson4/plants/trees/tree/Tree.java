package com.hillel.lessons.lesson4.plants.trees.tree;

import com.hillel.lessons.lesson4.plants.plant.Plant;

public abstract class Tree extends Plant {
    private double crownSpread;

    public Tree(String name, int age, double crownSpread, double height) {
        super(name, age, height);
        this.crownSpread = crownSpread;
    }

    public double getCrownSpread() {
        return crownSpread;
    }

    @Override
    public String toString() {
        return "Tree{" + super.toString() +
                "crownSpread=" + crownSpread +
                '}';
    }
}
