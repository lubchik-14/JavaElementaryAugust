package com.hillel.lessons.lesson4.plants.trees.deciduous;

import com.hillel.lessons.lesson4.plants.trees.tree.Tree;

public abstract class DeciduousTree extends Tree {

    public DeciduousTree(String name, int age, double crownSpread, double height) {
        super(name, age, crownSpread, height);
    }

    public abstract void shedLeaves();
}
