package com.hillel.lessons.lesson3.unuversity_structure.cathedra;

import com.hillel.lessons.lesson3.building_structure.auditory.Auditorium;
import com.hillel.lessons.lesson3.persons.teacher.Teacher;
import com.hillel.lessons.lesson3.unuversity_structure.specialization.Specialization;

import java.util.Arrays;

public class Cathedra {
    private String name;
    private Auditorium[] auditoriums = {};
    private Teacher[] teachers = {};
    private Specialization[] specializations;


    public Cathedra(String name, Specialization[] specializations) {
        this.name = name;
        this.specializations = specializations;
    }

    public void addAuditoriums(Auditorium ... auditoriums) {
        this.auditoriums = Arrays.copyOf(this.auditoriums, this.auditoriums.length + auditoriums.length);
        System.arraycopy(auditoriums, 0, this.auditoriums, this.auditoriums.length - auditoriums.length, auditoriums.length);
    }

    public Auditorium delAuditorium(Auditorium auditorium) {
        Auditorium del = null;
        if (this.auditoriums.length > 0) {
            Auditorium[] newAuditoriums = new Auditorium[this.auditoriums.length - 1];
            int i = 0;
            for (Auditorium audit : auditoriums) {
                if (audit == auditorium) {
                    del = audit;
                    continue;
                }
                newAuditoriums[i] = audit;
                i++;
            }
            this.auditoriums = newAuditoriums;
        }
        return del;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Auditorium[] getAuditoriums() {
        return auditoriums;
    }

    public Specialization[] getSpecializations() {
        return specializations;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void addTeachers(Teacher[] teachers){
        this.teachers = Arrays.copyOf(this.teachers, this.teachers.length + teachers.length);
        System.arraycopy(teachers, 0, this.teachers, this.teachers.length - teachers.length, teachers.length);
    }

    @Override
    public String toString() {
        return "Cathedra{" +
                "name='" + name + '\'' +
                ", auditoriums=" + Arrays.toString(auditoriums) +
                ", teachers=" + Arrays.toString(teachers) +
                ", specializations=" + Arrays.toString(specializations) +
                '}';
    }
}
