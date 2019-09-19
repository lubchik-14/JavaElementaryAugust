package com.hillel.lessons.lesson4.room.people.employee;

import com.hillel.lessons.lesson4.room.people.person.Person;
import com.hillel.lessons.lesson4.room.people.gender.Gender;

public abstract class Employee extends Person {
    private String post;
    private double salary;

    public Employee(String name, int age, int weight, Gender gender, String post, double salary) {
        super(name, age, weight, gender);
        this.post = post;
        this.salary = salary;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
