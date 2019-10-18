package com.hillel.lessons.lesson9;

import java.util.Objects;

/**
 * Contact class describes a contact.
 */
public class Contact {
    /**
     * String field for get and set a name of the contact
     */
    private String name;
    /**
     * String field for get and set a phone number of the contact
     */
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact)) return false;
        Contact contact = (Contact) o;
        return Objects.equals(getName(), contact.getName()) &&
                Objects.equals(getPhoneNumber(), contact.getPhoneNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPhoneNumber());
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
