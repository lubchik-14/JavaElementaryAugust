package com.hillel.lessons.lesson4.plants;

import com.hillel.lessons.lesson4.plants.flowering.alliaceae.tulip.Tulip;
import com.hillel.lessons.lesson4.plants.flowering.alliaceae.zephyranthes.Zephyranthes;
import com.hillel.lessons.lesson4.plants.flowering.rose.Rose;
import com.hillel.lessons.lesson4.plants.herbaceous.cannabis.Cannabis;
import com.hillel.lessons.lesson4.plants.herbaceous.garlic.Garlic;
import com.hillel.lessons.lesson4.plants.plant.Plant;
import com.hillel.lessons.lesson4.plants.trees.deciduous.maple.Maple;
import com.hillel.lessons.lesson4.plants.trees.pinophyta.blackpine.Pine;
import com.hillel.lessons.lesson4.room.people.gender.Gender;

import java.time.Month;

public class PlantHierarchy {
    public static void main(String[] args) {
        Plant[] plants = new Plant[]{
                new Maple("Sugar maple", 200, 25, 30),
                new Pine("Black Pine", 50, 10, 80, 12),
                new Cannabis("AK-47", 0, Month.APRIL, true, Gender.FEMALE, 20, 1.5),
                new Garlic("Italian garlic", 1, Month.MARCH, true, 5, 4),
                new Rose("Rosa banksiae", 10, "white", true, 6, 250),
                new Zephyranthes("Zephyranthes carinata", 3, "pink", 1.5, 15, 1),
                new Tulip("Tulipa orphanidea", 2, "red", 2, 20, 1)
        };

        for (Plant plant : plants) {
            System.out.println(plant);
        }

    }
}
