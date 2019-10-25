package com.hillel.lessons.lesson13;

import java.io.Serializable;

public class Contact implements Serializable {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private int birthYear;

    public Contact(String firstName, String lastName, String phoneNumber, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getBirthYear() {
        return birthYear;
    }
}
