package com.hillel.lessons.lesson4.plants.trees.pinophyta;

import com.hillel.lessons.lesson4.plants.trees.tree.Tree;

public abstract class Pinophyta extends Tree {
    private double diameterOfCone;

    public Pinophyta(String name, int age, double crownSpread, double height, double diameterOfCone) {
        super(name, age, crownSpread, height);
        this.diameterOfCone = diameterOfCone;
    }

    public double getDiameterOfCone() {
        return diameterOfCone;
    }

    @Override
    public String toString() {
        return "Pinophyta{" + super.toString() +
                "diameterOfCone=" + diameterOfCone +
                '}';
    }
}
