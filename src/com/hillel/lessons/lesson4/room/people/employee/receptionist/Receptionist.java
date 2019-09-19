package com.hillel.lessons.lesson4.room.people.employee.receptionist;

import com.hillel.lessons.lesson4.room.people.employee.Employee;
import com.hillel.lessons.lesson4.room.people.gender.Gender;

public class Receptionist extends Employee {
    private int typingSpeed;

    public Receptionist(String name, int age, int weight, Gender gender, String post, double salary, int typingSpeed) {
        super(name, age, weight, gender, post, salary);
        this.typingSpeed = typingSpeed;
    }

    public int getTypingSpeed() {
        return typingSpeed;
    }

    public void setTypingSpeed(int typingSpeed) {
        this.typingSpeed = typingSpeed;
    }
}