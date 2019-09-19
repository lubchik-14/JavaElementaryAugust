package com.hillel.lessons.lesson4.room.people.employee.teacher;

import com.hillel.lessons.lesson4.room.people.employee.Employee;
import com.hillel.lessons.lesson4.room.people.gender.Gender;

public class Teacher extends Employee {
    private String education;
    private int degree;

    public Teacher(String name, int age, int weight, Gender gender, String post, double salary, String education, int degree) {
        super(name, age, weight, gender, post, salary);
        this.education = education;
        this.degree = degree;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }
}
