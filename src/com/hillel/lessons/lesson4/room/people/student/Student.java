package com.hillel.lessons.lesson4.room.people.student;

import com.hillel.lessons.lesson4.room.people.person.Person;
import com.hillel.lessons.lesson4.room.people.gender.Gender;

public class Student extends Person {
    String course;

    public Student(String name, int age, int weight, Gender gender, String course) {
        super(name, age, weight, gender);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
