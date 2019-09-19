package com.hillel.lessons.lesson4.room.furniture.tables.desk;

import com.hillel.lessons.lesson4.room.furniture.Furniture;

public class Desk extends Furniture {
    private int drawer;

    public Desk(String name, int weight, int drawer) {
        super(name, weight);
        this.drawer = drawer;
    }

    public int getDrawer() {
        return drawer;
    }

    public void setDrawer(int drawer) {
        this.drawer = drawer;
    }
}
