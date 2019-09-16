package com.hillel.lessons.lesson3.unuversity_structure.faculty;

import com.hillel.lessons.lesson3.unuversity_structure.cathedra.Cathedra;

import java.util.Arrays;

public class Faculty {
    private String name;
    private Cathedra[] cathedras;

    public Faculty(String name, Cathedra[] cathedras) {
        this.name = name;
        this.cathedras = cathedras;
    }

    public Cathedra[] getCathedras() {
        return cathedras;
    }

    public void addCathedra(Cathedra cathedra) {
        this.cathedras = Arrays.copyOf(this.cathedras, this.cathedras.length + 1);
        this.cathedras[cathedras.length - 1] = cathedra;
    }

    public void delCathedra(Cathedra cathedra) {
        if (this.cathedras.length > 1) {
            Cathedra[] newCasedras = new Cathedra[this.cathedras.length - 1];
            int i = 0;
            for (Cathedra cath : cathedras) {
                if (cath != cathedra) {
                    newCasedras[i] = cath;
                    i++;
                }
            }
            this.cathedras = newCasedras;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + name + '\'' +
                ", cathedras=" + Arrays.toString(cathedras) +
                '}';
    }
}
